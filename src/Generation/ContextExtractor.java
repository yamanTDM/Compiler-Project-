package Generation;

import AST_Python.Body;
import AST_Python.Expression;
import AST_Python.Program;
import AST_Python.SimpleStatement;
import AST_Python.Statement;
import AST_Python.compound_statements.DecoratedFunction;
import AST_Python.compound_statements.ElseIfStatement;
import AST_Python.compound_statements.FunctionStatement;
import AST_Python.compound_statements.IfStatement;
import AST_Python.compound_statements.WithStatement;
import AST_Python.expressions.AccessAttributeExpression;
import AST_Python.expressions.AccessFunctionExpression;
import AST_Python.expressions.AccessSubscriptExpression;
import AST_Python.expressions.Addition;
import AST_Python.expressions.AndExpression;
import AST_Python.expressions.AssignExpression;
import AST_Python.expressions.CompareExpression;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.DictionaryEntry;
import AST_Python.expressions.Division;
import AST_Python.expressions.Multiplication;
import AST_Python.expressions.NotExpression;
import AST_Python.expressions.NumbericExpression;
import AST_Python.expressions.OrExpression;
import AST_Python.expressions.Subtraction;
import AST_Python.expressions.atoms.DictionaryAtom;
import AST_Python.expressions.atoms.FalseAtom;
import AST_Python.expressions.atoms.FloatAtom;
import AST_Python.expressions.atoms.GroupingAtom;
import AST_Python.expressions.atoms.IntegerAtom;
import AST_Python.expressions.atoms.ListAtom;
import AST_Python.expressions.atoms.ListComprehensionAtom;
import AST_Python.expressions.atoms.NameAtom;
import AST_Python.expressions.atoms.NoneAtom;
import AST_Python.expressions.atoms.StringAtom;
import AST_Python.expressions.atoms.TrueAtom;
import AST_Python.expressions.compare.CompareEqual;
import AST_Python.expressions.compare.CompareGreaterThan;
import AST_Python.expressions.compare.CompareGreaterThanEqual;
import AST_Python.expressions.compare.CompareIn;
import AST_Python.expressions.compare.CompareLessThan;
import AST_Python.expressions.compare.CompareLessThanEqual;
import AST_Python.expressions.compare.CompareNotEqual;
import AST_Python.expressions.compare.CompareNotIn;
import AST_Python.small_statements.AssignStatement;
import AST_Python.small_statements.ReturnStatement;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ContextExtractor {

    private static final Object UNRESOLVED = Unresolved.VALUE;

    /** module-level variable name -> resolved value (or UNRESOLVED) */
    public final Map<String, Object> moduleContext = new LinkedHashMap<>();

    /** human-readable trace of every resolution decision, for generation_log.txt */
    public final List<String> log = new ArrayList<>();

    private final Map<String, FunctionStatement> functions = new LinkedHashMap<>();
    private final String baseDir;

    public ContextExtractor(String baseDir) {
        this.baseDir = baseDir;
    }

    public void extract(Program program) {
        collectFunctions(program.getStatements());
        for (Statement st : program.getStatements()) {
            processTopLevel(st);
        }
    }

    // -----------------------------------------------------------------
    // Module-level pass
    // -----------------------------------------------------------------

    private void collectFunctions(List<Statement> stmts) {
        for (Statement st : stmts) {
            if (st instanceof FunctionStatement fs) {
                functions.put(fs.getName(), fs);
            } else if (st instanceof DecoratedFunction df) {
                functions.put(df.getFunctionStatement().getName(), df.getFunctionStatement());
            }
        }
    }

    private void processTopLevel(Statement st) {
        if (!(st instanceof SimpleStatement ss)) return;
        if (!(ss.getStatement() instanceof AssignStatement as)) return;
        if (!(as.getLeftExpression() instanceof NameAtom target)) return;

        Object value = evalExpr(as.getRightExpression(), new HashMap<>());
        moduleContext.put(target.getName(), value);

        if (value == UNRESOLVED) {
            log.add("UNRESOLVED  " + target.getName() + " (line " + as.getLine()
                    + "): right-hand side is not a literal and could not be reduced "
                    + "by the whitelisted-builtin resolver.");
        } else {
            log.add("RESOLVED    " + target.getName() + " = " + shortRepr(value)
                    + " (line " + as.getLine() + ")");
        }
    }

    // -----------------------------------------------------------------
    // Whitelisted zero-arg user function inlining
    // -----------------------------------------------------------------

    private Object inlineZeroArgFunction(String name) {
        FunctionStatement fn = functions.get(name);
        if (fn == null) return UNRESOLVED;

        Map<String, Object> scope = new HashMap<>();
        ExecResult r = exec(fn.getBody(), scope);
        if (r.gaveUp) {
            log.add("  -> could not statically resolve function '" + name + "': " + r.reason);
            return UNRESOLVED;
        }
        return r.returned ? r.value : null; // implicit Python "return None"
    }

    private static final class ExecResult {
        boolean returned;
        Object value;
        boolean gaveUp;
        String reason;

        static ExecResult none() { return new ExecResult(); }
        static ExecResult ret(Object v) { ExecResult r = new ExecResult(); r.returned = true; r.value = v; return r; }
        static ExecResult giveUp(String why) { ExecResult r = new ExecResult(); r.gaveUp = true; r.reason = why; return r; }
    }

    private ExecResult exec(Body body, Map<String, Object> scope) {
        if (body == null) return ExecResult.none();
        for (Statement st : body.getStatements()) {
            if (st instanceof SimpleStatement ss) {
                if (ss.getStatement() instanceof ReturnStatement r) {
                    Object v = r.getExpression() == null ? null : evalExpr(r.getExpression(), scope);
                    if (v == UNRESOLVED) return ExecResult.giveUp("return expression at line " + r.getLine() + " is not resolvable");
                    return ExecResult.ret(v);
                }
                if (ss.getStatement() instanceof AssignStatement as) {
                    if (as.getLeftExpression() instanceof NameAtom target) {
                        scope.put(target.getName(), evalExpr(as.getRightExpression(), scope));
                    }
                }
                // other small statements (imports, plain expression calls like os.makedirs(...),
                // global statements, augmented assigns) are intentionally no-ops: they don't
                // affect the value being resolved and are outside the safe-evaluation whitelist.
            } else if (st instanceof IfStatement ifs) {
                Object cond = evalExpr(ifs.getCondition(), scope);
                if (cond == UNRESOLVED) return ExecResult.giveUp("if-condition at line " + ifs.getLine() + " is not resolvable");
                if (toBoolean(cond)) {
                    ExecResult r = exec(ifs.getIfBody(), scope);
                    if (r.returned || r.gaveUp) return r;
                } else {
                    boolean handled = false;
                    for (ElseIfStatement eif : ifs.getElseIfStatements()) {
                        Object c2 = evalExpr(eif.getCondition(), scope);
                        if (c2 == UNRESOLVED) return ExecResult.giveUp("elif-condition is not resolvable");
                        if (toBoolean(c2)) {
                            handled = true;
                            ExecResult r = exec(eif.getBody(), scope);
                            if (r.returned || r.gaveUp) return r;
                            break;
                        }
                    }
                    if (!handled && ifs.getElseBody() != null) {
                        ExecResult r = exec(ifs.getElseBody(), scope);
                        if (r.returned || r.gaveUp) return r;
                    }
                }
            } else if (st instanceof WithStatement ws) {
                Object handle = evalExpr(ws.getExpression(), scope);
                if (handle == UNRESOLVED) return ExecResult.giveUp("with-expression at line " + ws.getLine() + " is not resolvable");
                if (ws.getName() != null) scope.put(ws.getName(), handle);
                ExecResult r = exec(ws.getBody(), scope);
                if (r.returned || r.gaveUp) return r;
            }
            // nested function/class defs and other compound statements: not needed for
            // the whitelisted patterns this resolver targets, safely ignored.
        }
        return ExecResult.none();
    }

    // -----------------------------------------------------------------
    // Expression evaluator
    // -----------------------------------------------------------------

    Object evalExpr(Expression e, Map<String, Object> scope) {
        if (e == null) return null;

        if (e instanceof IntegerAtom a) return a.getValue();
        if (e instanceof FloatAtom a) return a.getValue();
        if (e instanceof StringAtom a) return a.getValue();
        if (e instanceof TrueAtom) return Boolean.TRUE;
        if (e instanceof FalseAtom) return Boolean.FALSE;
        if (e instanceof NoneAtom) return null;
        if (e instanceof GroupingAtom g) return evalExpr(g.getExpression(), scope);

        if (e instanceof NameAtom n) {
            if (scope.containsKey(n.getName())) return scope.get(n.getName());
            if (moduleContext.containsKey(n.getName())) return moduleContext.get(n.getName());
            return UNRESOLVED;
        }

        if (e instanceof ListAtom la) {
            List<Object> out = new ArrayList<>();
            for (Expression item : la.getItems()) {
                Object v = evalExpr(item, scope);
                if (v == UNRESOLVED) return UNRESOLVED;
                out.add(v);
            }
            return out;
        }

        if (e instanceof DictionaryAtom da) {
            Map<String, Object> out = new LinkedHashMap<>();
            for (DictionaryEntry entry : da.getEntries()) {
                Object k = evalExpr(entry.getKey(), scope);
                Object v = evalExpr(entry.getValue(), scope);
                if (k == UNRESOLVED || v == UNRESOLVED) return UNRESOLVED;
                out.put(String.valueOf(k), v);
            }
            return out;
        }

        if (e instanceof ListComprehensionAtom lc) {
            Object src = evalExpr(lc.getList(), scope);
            if (!(src instanceof List<?> list)) return UNRESOLVED;
            List<Object> out = new ArrayList<>();
            for (Object item : list) {
                Map<String, Object> inner = new HashMap<>(scope);
                inner.put(lc.getName(), item);
                if (lc.getCondition() != null) {
                    Object c = evalExpr(lc.getCondition(), inner);
                    if (c == UNRESOLVED) return UNRESOLVED;
                    if (!toBoolean(c)) continue;
                }
                Object v = evalExpr(lc.getOutput(), inner);
                if (v == UNRESOLVED) return UNRESOLVED;
                out.add(v);
            }
            return out;
        }

        if (e instanceof AccessSubscriptExpression sub) {
            Object obj = evalExpr(sub.getObject(), scope);
            Object idx = evalExpr(sub.getIndex(), scope);
            if (obj == UNRESOLVED || idx == UNRESOLVED) return UNRESOLVED;
            if (obj instanceof Map<?, ?> m) return m.get(String.valueOf(idx));
            if (obj instanceof List<?> l && idx instanceof Number n) {
                int i = n.intValue();
                return (i >= 0 && i < l.size()) ? l.get(i) : UNRESOLVED;
            }
            return UNRESOLVED;
        }

        if (e instanceof AccessAttributeExpression attr) {
            Object obj = evalExpr(attr.getObject(), scope);
            if (obj instanceof Map<?, ?> m) return m.get(attr.getName());
            return UNRESOLVED;
        }

        if (e instanceof AccessFunctionExpression call) return evalCall(call, scope);

        if (e instanceof Addition a) return numericBinOp(a.getLeftExpression(), a.getRightExpression(), scope, '+');
        if (e instanceof Subtraction s) return numericBinOp(s.getLeftExpression(), s.getRightExpression(), scope, '-');
        if (e instanceof Multiplication m) return numericBinOp(m.getLeftExpression(), m.getRightExpression(), scope, '*');
        if (e instanceof Division d) return numericBinOp(d.getLeftExpression(), d.getRightExpression(), scope, '/');

        if (e instanceof AssignExpression ae) return evalExpr(ae.getValue(), scope);

        if (e instanceof AndExpression andE) {
            Object last = Boolean.TRUE;
            for (Expression part : andE.getExpressions()) {
                Object v = evalExpr(part, scope);
                if (v == UNRESOLVED) return UNRESOLVED;
                if (!toBoolean(v)) return v;
                last = v;
            }
            return last;
        }
        if (e instanceof OrExpression orE) {
            for (Expression part : orE.getExpressions()) {
                Object v = evalExpr(part, scope);
                if (v == UNRESOLVED) return UNRESOLVED;
                if (toBoolean(v)) return v;
            }
            return Boolean.FALSE;
        }
        if (e instanceof NotExpression notE) {
            Object v = evalExpr(notE.getExpression(), scope);
            if (v == UNRESOLVED) return UNRESOLVED;
            return !toBoolean(v);
        }

        if (e instanceof CompareExpression ce) {
            boolean result = true;
            for (Comparision c : ce.getComparisons()) {
                Object l = evalExpr((Expression) c.getLeftExpression(), scope);
                Object r = evalExpr((Expression) c.getRightExpression(), scope);
                if (l == UNRESOLVED || r == UNRESOLVED) return UNRESOLVED;
                result &= compare(c, l, r);
            }
            return result;
        }

        // NumbericExpression base, DottedName, TargetExpression, etc: outside the
        // resolver's supported subset.
        return UNRESOLVED;
    }

    private Object evalCall(AccessFunctionExpression call, Map<String, Object> scope) {
        String callee = dottedName(call.getObject());
        List<Expression> args = call.getArguments();

        if (callee == null) return UNRESOLVED;

        switch (callee) {
            case "os.path.exists": {
                if (args.isEmpty()) return UNRESOLVED;
                Object p = evalExpr(args.get(0), scope);
                if (p == UNRESOLVED) return UNRESOLVED;
                return new File(resolvePath(String.valueOf(p))).exists();
            }
            case "open": {
                if (args.isEmpty()) return UNRESOLVED;
                Object p = evalExpr(args.get(0), scope);
                if (p == UNRESOLVED) return UNRESOLVED;
                String mode = args.size() > 1 ? String.valueOf(evalExpr(args.get(1), scope)) : "r";
                return new OpenedFile(String.valueOf(p), mode);
            }
            case "json.load": {
                if (args.isEmpty()) return UNRESOLVED;
                Object f = evalExpr(args.get(0), scope);
                if (!(f instanceof OpenedFile of)) return UNRESOLVED;
                try {
                    String text = Files.readString(Path.of(resolvePath(of.path)), StandardCharsets.UTF_8);
                    return MiniJson.parse(text);
                } catch (IOException ex) {
                    log.add("  -> json.load could not read '" + of.path + "': " + ex.getMessage());
                    return UNRESOLVED;
                }
            }
            case "max": {
                if (args.isEmpty()) return UNRESOLVED;
                Object iterableVal = evalExpr(args.get(0), scope);
                Double defaultVal = null;
                boolean hasDefault = false;
                for (int i = 1; i < args.size(); i++) {
                    if (args.get(i) instanceof AssignExpression kw && "default".equals(kw.getName())) {
                        Object dv = evalExpr(kw.getValue(), scope);
                        if (dv instanceof Number num) { defaultVal = num.doubleValue(); hasDefault = true; }
                    }
                }
                if (!(iterableVal instanceof List<?> list)) return UNRESOLVED;
                if (list.isEmpty()) return hasDefault ? normalizeNumber(defaultVal) : UNRESOLVED;
                double best = Double.NEGATIVE_INFINITY;
                for (Object o : list) {
                    if (!(o instanceof Number num)) return UNRESOLVED;
                    best = Math.max(best, num.doubleValue());
                }
                return normalizeNumber(best);
            }
            case "len": {
                if (args.isEmpty()) return UNRESOLVED;
                Object v = evalExpr(args.get(0), scope);
                if (v instanceof List<?> l) return l.size();
                if (v instanceof String s) return s.length();
                return UNRESOLVED;
            }
            default: {
                if (args.isEmpty() && functions.containsKey(callee)) {
                    return inlineZeroArgFunction(callee);
                }
                log.add("  -> call to '" + callee + "(...)' is outside the resolver's whitelist; treated as unresolved.");
                return UNRESOLVED;
            }
        }
    }

    /** Builds a dotted name like "os.path.exists" out of nested attribute access. */
    private String dottedName(NumbericExpression object) {
        if (object instanceof NameAtom n) return n.getName();
        if (object instanceof AccessAttributeExpression a) {
            String base = dottedName(a.getObject());
            return base == null ? a.getName() : base + "." + a.getName();
        }
        return null;
    }

    private Object numericBinOp(NumbericExpression leftExpr, NumbericExpression rightExpr,
                                 Map<String, Object> scope, char op) {
        Object l = evalExpr(leftExpr, scope);
        Object r = evalExpr(rightExpr, scope);
        if (op == '+' && l instanceof String ls && r instanceof String rs) return ls + rs;
        if (!(l instanceof Number ln) || !(r instanceof Number rn)) return UNRESOLVED;
        double result = switch (op) {
            case '+' -> ln.doubleValue() + rn.doubleValue();
            case '-' -> ln.doubleValue() - rn.doubleValue();
            case '*' -> ln.doubleValue() * rn.doubleValue();
            case '/' -> ln.doubleValue() / rn.doubleValue();
            default -> Double.NaN;
        };
        return normalizeNumber(result);
    }

    private boolean compare(Comparision c, Object l, Object r) {
        if (c instanceof CompareEqual) return java.util.Objects.equals(l, r);
        if (c instanceof CompareNotEqual) return !java.util.Objects.equals(l, r);
        if (l instanceof Number ln && r instanceof Number rn) {
            int cmp = Double.compare(ln.doubleValue(), rn.doubleValue());
            if (c instanceof CompareGreaterThan) return cmp > 0;
            if (c instanceof CompareGreaterThanEqual) return cmp >= 0;
            if (c instanceof CompareLessThan) return cmp < 0;
            if (c instanceof CompareLessThanEqual) return cmp <= 0;
        }
        if (c instanceof CompareIn) return (r instanceof List<?> list) && list.contains(l);
        if (c instanceof CompareNotIn) return (r instanceof List<?> list) && !list.contains(l);
        return false;
    }

    private static Object normalizeNumber(double d) {
        if (d == Math.rint(d) && !Double.isInfinite(d)) return (int) d;
        return d;
    }

    private String resolvePath(String p) {
        File f = new File(p);
        if (f.isAbsolute()) return p;
        return new File(baseDir, p).getPath();
    }

    static boolean toBoolean(Object v) {
        if (v == null) return false;
        if (v instanceof Boolean b) return b;
        if (v instanceof Number n) return n.doubleValue() != 0;
        if (v instanceof String s) return !s.isEmpty();
        if (v instanceof List<?> l) return !l.isEmpty();
        if (v instanceof Map<?, ?> m) return !m.isEmpty();
        return true;
    }

    static String shortRepr(Object v) {
        if (v == null) return "None";
        String s = String.valueOf(v);
        return s.length() > 80 ? s.substring(0, 77) + "..." : s;
    }

    /** Marker returned by open(); real file access happens at json.load(). */
    private static final class OpenedFile {
        final String path;
        final String mode;
        OpenedFile(String path, String mode) { this.path = path; this.mode = mode; }
    }
}

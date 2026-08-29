package Visitor;

import AST_Python.*;
import AST_Python.compound_statements.*;
import AST_Python.expressions.*;
import AST_Python.expressions.atoms.*;
import AST_Python.expressions.compare.*;
import AST_Python.small_statements.*;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolKind;
import SymbolTable.SymbolTable;

import java.util.*;

public class SemanticChecker implements ASTVisitor<String> {

    private static final Set<String> BUILTINS = Set.of(
            "print", "len", "str", "int", "float", "bool", "list", "dict", "set", "tuple",
            "range", "render_template", "enumerate", "zip", "sorted", "sum",
            "min", "max", "abs", "input", "open", "isinstance", "type", "next", "iter",
            "map", "filter", "any", "all", "getattr", "setattr", "hasattr", "super",
            "staticmethod", "classmethod", "round", "divmod", "pow", "repr", "format",
            "id", "hash", "vars", "dir", "globals", "locals", "callable", "frozenset",
            "bytes", "bytearray", "object", "property", "slice", "reversed", "exec", "eval"
    );

    private static final Set<String> PREDEFINED_NAMES = Set.of(
            "__name__", "__file__", "__doc__", "__package__", "__loader__", "__spec__", "__builtins__"
    );

    
    private static final Set<String> KNOWN_NON_CALLABLE_TYPES = Set.of(
            "int", "float", "string", "bool", "dict", "list", "None"
    );

    private final SymbolTable symbolTable;
    private final List<String> errors = new ArrayList<>();

    private final Deque<Scope> scopeStack = new ArrayDeque<>();
    private final Map<Scope, Integer> childCursor = new HashMap<>();
    private int functionDepth = 0;

    public SemanticChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        scopeStack.push(symbolTable.getGlobalScope());
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        System.out.println(GREEN);
        if (errors.isEmpty()) {
            System.out.println("Semantic check: no errors found.");
            System.out.println(RESET);
            return;
        }
        System.out.print(RED);
        System.out.println("Semantic check found " + errors.size() + " error(s):");
        for (String e : errors) {
            System.out.println("  " + e);
        }
        System.out.println(RESET);
    }


    private void enterFunctionScope(String name) {
        Scope parent = scopeStack.peek();
        List<Scope> children = parent.getChildren();
        int start = childCursor.getOrDefault(parent, 0);

        Scope target = null;
        for (int i = start; i < children.size(); i++) {
            if (children.get(i).getName().equals(name)) {
                target = children.get(i);
                childCursor.put(parent, i + 1);
                break;
            }
        }
        if (target == null) {
            target = new Scope(name, parent);
        }
        scopeStack.push(target);
    }

    private void exitScope() {
        scopeStack.pop();
    }

    private Symbol lookup(String name) {
        Symbol latest = null;
        for (Scope s : scopeStack) {
            for (Symbol sym : s.getSymbols()) {
                if (sym.getName().equals(name)) {
                    if (latest == null || latest.getLine() < sym.getLine()) {
                        latest = sym;
                    }
                }
            }
        }
        return latest;
    }

    private void error(int line, String message) {
        errors.add("Line " + line + ": " + message);
    }

    private static final class ScopedSymbol {
        final Symbol symbol;
        final Scope scope;
        ScopedSymbol(Symbol symbol, Scope scope) {
            this.symbol = symbol;
            this.scope = scope;
        }
    }


    private ScopedSymbol findAnywhere(String name) {
        for (Scope scope : symbolTable.getAllScopes()) {
            for (Symbol sym : scope.getSymbols()) {
                if (sym.getName().equals(name)) {
                    return new ScopedSymbol(sym, scope);
                }
            }
        }
        return null;
    }

    private void reportUnresolved(int line, String kindLabel, String name) {
        ScopedSymbol found = findAnywhere(name);
        if (found != null) {
            error(line, kindLabel + " '" + name + "' is defined in scope '" + found.scope.getName()
                    + "' (line " + found.symbol.getLine() + ") but is out of scope here");
        } else {
            error(line, kindLabel + " '" + name + "' is used but never defined.");
        }
    }


    @Override
    public String visit(Program node) {
        for (Statement statement : node.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Body node) {
        for (Statement statement : node.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public String visit(FunctionStatement node) {
        enterFunctionScope(node.getName());
        functionDepth++;
        node.getBody().accept(this);
        functionDepth--;
        exitScope();
        return null;
    }

    @Override
    public String visit(DecoratedFunction node) {
        FunctionStatement func = node.getFunctionStatement();
        for (Decorator decorator : node.getDecorators()) {
            decorator.accept(this);
        }
        enterFunctionScope(func.getName());
        functionDepth++;
        func.getBody().accept(this);
        functionDepth--;
        exitScope();
        return null;
    }

    @Override
    public String visit(Decorator node) {
        for (Expression argument : node.getArguments()) {
            argument.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Parameter node) {
        return null;
    }

    @Override
    public String visit(IfStatement node) {
        node.getCondition().accept(this);
        node.getIfBody().accept(this);
        for (ElseIfStatement elseIf : node.getElseIfStatements()) {
            elseIf.accept(this);
        }
        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public String visit(ElseIfStatement node) {
        node.getCondition().accept(this);
        node.getBody().accept(this);
        return null;
    }

    @Override
    public String visit(WithStatement node) {
        node.getExpression().accept(this);
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        return null;
    }

    @Override
    public String visit(SimpleStatement node) {
        node.getStatement().accept(this);
        return null;
    }


    @Override
    public String visit(AssignStatement node) {
        Expression lhs = node.getLeftExpression();
        Expression rhs = node.getRightExpression();

        String rhsType = rhs.accept(this);

        if (!(lhs instanceof NameAtom)) {
            lhs.accept(this);
        }
        return rhsType;
    }

    @Override
    public String visit(GlobalStatement node) {
        return null;
    }

    private String checkAugmented(Expression lhs, Expression rhs, int line, String opSymbol) {
        String rhsType = rhs.accept(this);
        String lhsType = null;

        if (lhs instanceof NameAtom nameAtom) {
            Symbol sym = lookup(nameAtom.getName());
            if (sym == null) {
                reportUnresolved(line, "Variable", nameAtom.getName());
            } else {
                lhsType = sym.getType();
            }
        } else {
            lhsType = lhs.accept(this);
        }

        checkArithmeticTypes(opSymbol, lhsType, rhsType, line);
        return lhsType;
    }

    @Override
    public String visit(AugmentedPlus node) {
        return checkAugmented(node.getLeftExpression(), node.getRightExpression(), node.getLine(), "+");
    }

    @Override
    public String visit(AugmentedMinus node) {
        return checkAugmented(node.getLeftExpression(), node.getRightExpression(), node.getLine(), "-");
    }

    @Override
    public String visit(ReturnStatement node) {
        if (functionDepth == 0) {
            error(node.getLine(), "'return' used outside of a function.");
        }
        if (node.getExpression() != null) {
            return node.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public String visit(ExpressionStatement node) {
        return node.getExpression().accept(this);
    }


    @Override
    public String visit(FromImport node) {
        return null;
    }

    @Override
    public String visit(PlainImport node) {
        return null;
    }

    @Override
    public String visit(ImportStatement node) {
        return null;
    }

    // ── names / literals ─────────────────────────────────────────────────

    @Override
    public String visit(NameAtom node) {
        if (PREDEFINED_NAMES.contains(node.getName())) {
            return null;
        }
        Symbol sym = lookup(node.getName());
        if (sym == null) {
            reportUnresolved(node.getLine(), "Variable", node.getName());
            return null;
        }
        return sym.getType();
    }

    @Override
    public String visit(IntegerAtom node) {
        return "int";
    }

    @Override
    public String visit(FloatAtom node) {
        return "float";
    }

    @Override
    public String visit(StringAtom node) {
        return "string";
    }

    @Override
    public String visit(FalseAtom node) {
        return "bool";
    }

    @Override
    public String visit(TrueAtom node) {
        return "bool";
    }

    @Override
    public String visit(NoneAtom node) {
        return "None";
    }

    @Override
    public String visit(GroupingAtom node) {
        return node.getExpression().accept(this);
    }

    @Override
    public String visit(ListAtom node) {
        for (Expression item : node.getItems()) {
            item.accept(this);
        }
        return "list";
    }

    @Override
    public String visit(ListComprehensionAtom node) {
        checkComprehension(node.getList(), node.getName(), node.getOutput(), node.getCondition());
        return "list";
    }

    @Override
    public String visit(GeneratorAtom node) {
        checkComprehension(node.getList(), node.getName(), node.getOutput(), node.getCondition());
        return null;
    }

    private void checkComprehension(Expression list, String loopVarName, Expression output, Expression condition) {
        if (list != null) {
            list.accept(this);
        }

    }

    @Override
    public String visit(DictionaryAtom node) {
        for (DictionaryEntry entry : node.getEntries()) {
            entry.accept(this);
        }
        return "dict";
    }

    @Override
    public String visit(DictionaryEntry node) {
        node.getKey().accept(this);
        node.getValue().accept(this);
        return null;
    }

    @Override
    public String visit(DottedName node) {
        return null;
    }


    private boolean isNumeric(String t) {
        return "int".equals(t) || "float".equals(t);
    }

    private void checkArithmeticTypes(String op, String leftType, String rightType, int line) {
        if (leftType == null || rightType == null) return; // unknown, can't be sure

        if (isNumeric(leftType) && isNumeric(rightType)) return;
        if (op.equals("+") && "string".equals(leftType) && "string".equals(rightType)) return;
        if (op.equals("+") && "list".equals(leftType) && "list".equals(rightType)) return;
        if (op.equals("*") &&
                ((("string".equals(leftType) || "list".equals(leftType)) && isNumeric(rightType))
                        || (isNumeric(leftType) && ("string".equals(rightType) || "list".equals(rightType))))) {
            return;
        }

        errors.add("Line " + line + ": Type mismatch - cannot apply '" + op + "' to '"
                + leftType + "' and '" + rightType + "'.");
    }

    private String checkBinaryArithmetic(String op, NumbericExpression left, NumbericExpression right, int line) {
        String leftType = left.accept(this);
        String rightType = right.accept(this);
        checkArithmeticTypes(op, leftType, rightType, line);
        if (isNumeric(leftType) && isNumeric(rightType)) {
            return ("float".equals(leftType) || "float".equals(rightType)) ? "float" : "int";
        }
        return null;
    }

    @Override
    public String visit(Addition node) {
        return checkBinaryArithmetic("+", node.getLeftExpression(), node.getRightExpression(), node.getLine());
    }

    @Override
    public String visit(Subtraction node) {
        return checkBinaryArithmetic("-", node.getLeftExpression(), node.getRightExpression(), node.getLine());
    }

    @Override
    public String visit(Multiplication node) {
        return checkBinaryArithmetic("*", node.getLeftExpression(), node.getRightExpression(), node.getLine());
    }

    @Override
    public String visit(Division node) {
        Expression right = node.getRightExpression();
        if ((right instanceof IntegerAtom ia && ia.getValue() == 0)
                || (right instanceof FloatAtom fa && fa.getValue() == 0.0f)) {
            error(node.getLine(), "Division by literal zero.");
        }
        return checkBinaryArithmetic("/", node.getLeftExpression(), node.getRightExpression(), node.getLine());
    }

    @Override
    public String visit(NumbericExpression node) {
        return null;
    }


    @Override
    public String visit(NotExpression node) {
        node.getExpression().accept(this);
        return "bool";
    }

    @Override
    public String visit(AndExpression node) {
        for (Expression e : node.getExpressions()) {
            e.accept(this);
        }
        return "bool";
    }

    @Override
    public String visit(OrExpression node) {
        for (Expression e : node.getExpressions()) {
            e.accept(this);
        }
        return "bool";
    }

    private String visitComparison(Comparision node) {
        node.getLeftExpression().accept(this);
        node.getRightExpression().accept(this);
        return "bool";
    }

    @Override public String visit(CompareEqual node)            { return visitComparison(node); }
    @Override public String visit(CompareGreaterThan node)      { return visitComparison(node); }
    @Override public String visit(CompareGreaterThanEqual node) { return visitComparison(node); }
    @Override public String visit(CompareIn node)                { return visitComparison(node); }
    @Override public String visit(CompareLessThan node)          { return visitComparison(node); }
    @Override public String visit(CompareLessThanEqual node)     { return visitComparison(node); }
    @Override public String visit(CompareNotEqual node)          { return visitComparison(node); }
    @Override public String visit(CompareNotIn node)              { return visitComparison(node); }

    @Override
    public String visit(CompareExpression node) {
        for (Comparision c : node.getComparisons()) {
            c.accept(this);
        }
        return "bool";
    }

    @Override
    public String visit(Comparision node) {
        return visitComparison(node);
    }


    @Override
    public String visit(AccessAttributeExpression node) {
        node.getObject().accept(this);
        return null;
    }

    @Override
    public String visit(AccessSubscriptExpression node) {
        node.getObject().accept(this);
        node.getIndex().accept(this);
        return null;
    }

    @Override
    public String visit(AccessFunctionExpression node) {
        for (Expression arg : node.getArguments()) {
            arg.accept(this);
        }

        if (node.getObject() instanceof NameAtom nameAtom) {
            String fname = nameAtom.getName();
            if (BUILTINS.contains(fname)) {
                return null;
            }

            Symbol sym = lookup(fname);
            if (sym == null) {
                reportUnresolved(node.getLine(), "Function", fname);
                return null;
            }


            if (sym.getKind() == SymbolKind.VARIABLE
                    && sym.getType() != null
                    && KNOWN_NON_CALLABLE_TYPES.contains(sym.getType())) {
                error(node.getLine(), "'" + fname + "' is not a function but is being called.");
                return null;
            }

            if (sym.getKind() == SymbolKind.FUNCTION) {
                long positionalArgs = node.getArguments().stream()
                        .filter(a -> !(a instanceof AssignExpression))
                        .count();
                int expectedParams = sym.getParameters().size();
                if (positionalArgs < expectedParams) {
                    error(node.getLine(), "Function '" + fname + "' called with "
                            + positionalArgs + " argument(s) but requires "
                            + expectedParams + ".");
                }
                if (expectedParams > 0 && positionalArgs > expectedParams) {
                    error(node.getLine(), "Function '" + fname + "' called with " + positionalArgs
                            + " positional argument(s) but only accepts " + expectedParams + ".");
                }
            }
        } else {
            node.getObject().accept(this);
        }
        return null;
    }

    @Override
    public String visit(AssignExpression node) {
        return node.getValue().accept(this);
    }


    @Override public String visit(CompoundStatement node) { return null; }
    @Override public String visit(Expression node)        { return null; }
    @Override public String visit(Node node)              { return null; }
    @Override public String visit(SmallStatement node)    { return null; }
    @Override public String visit(Statement node)         { return null; }
    @Override public String visit(TargetExpression node)  { return null; }
    @Override public String visit(ValueExpression node)   { return null; }
    @Override public String visit(Atom node)              { return null; }
}

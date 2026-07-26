package Visitor;

import AST.*;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolKind;
import SymbolTable.SymbolTable;

import java.util.*;

/**
 * Walks a resolved Jinja/HTML template AST *after* {@link JinjaSymbolTableBuilder}
 * has already built its {@link SymbolTable} (which itself is seeded with the
 * variables bound from Python via {@code render_template(name=value, ...)} -
 * see {@code Main.processTemplate} / {@code SymbolTableBuilder.getBridge()}).
 *
 * Reports:
 *  - use of a template variable that is neither a loop variable, a `{% set %}`
 *    variable, NOR one of the variables passed in from Python. The error
 *    message explicitly calls out the Python side, since that's the most
 *    common real-world cause ("you forgot to pass this into render_template").
 *  - a variable that IS defined, but only in another scope (e.g. inside a
 *    different `{% for %}` loop) - reported as "out of scope" rather than
 *    "undefined", same distinction as the Python checker.
 *
 * Like {@link SemanticChecker}, this class does not mutate the SymbolTable;
 * it re-uses the Scope tree JinjaSymbolTableBuilder already built.
 */
public class JinjaSemanticChecker implements ASTVisitorJinja<Void> {

    // Common built-in Jinja filters/tests - used as function/filter names,
    // never as variables, so `{{ name|upper }}` shouldn't try to resolve
    // "upper" as a variable.
    private static final Set<String> JINJA_BUILTIN_FILTERS = Set.of(
            "length", "upper", "lower", "capitalize", "title", "trim", "default",
            "join", "first", "last", "count", "round", "safe", "escape", "int",
            "float", "string", "list", "dictsort", "format", "replace", "truncate",
            "wordcount", "slice", "sort", "sum", "min", "max", "unique", "urlencode",
            "tojson", "striptags", "indent", "center", "batch", "groupby", "map",
            "select", "reject", "selectattr", "rejectattr", "attr", "abs", "e",
            "items", "reverse", "pprint", "random", "wordwrap", "xmlattr"
    );

    private final SymbolTable symbolTable;
    private final List<String> errors = new ArrayList<>();

    private final Deque<Scope> scopeStack = new ArrayDeque<>();

    public JinjaSemanticChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        scopeStack.push(symbolTable.getGlobalScope());
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors(String templateName) {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        System.out.println(GREEN);
        if (errors.isEmpty()) {
            System.out.println("Semantic check for " + templateName + ": no errors found.");
            System.out.println(RESET);
            return;
        }
        System.out.print(RED);
        System.out.println("Semantic check for " + templateName + " found " + errors.size() + " error(s):");
        for (String e : errors) {
            System.out.println("  " + e);
        }
        System.out.println(RESET);
    }


    private void enterLoopScope(String name) {
        Scope parent = scopeStack.peek();
        for (Scope child : parent.getChildren()) {
            if (child.getName().equals(name)) {
                scopeStack.push(child);
                return;
            }
        }
        scopeStack.push(new Scope(name, parent));
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

    /** Checks a base variable name (the first segment of a dotted path). */
    private void checkVariableUse(String baseName, int line) {
        if (baseName == null || baseName.isEmpty()) return;

        Symbol sym = lookup(baseName);
        if (sym != null) return;

        ScopedSymbol elsewhere = findAnywhere(baseName);
        if (elsewhere != null) {
            error(line, "Template variable '" + baseName + "' is defined in scope '"
                    + elsewhere.scope.getName() + "' (line " + elsewhere.symbol.getLine()
                    + ") but is out of scope here.");
            return;
        }

        error(line, "Template variable '" + baseName + "' is not defined - it wasn't passed in from "
                + "the Python side (render_template(...)) and isn't a loop variable or {% set %} variable "
                + "in this template.");
    }

    // ── program structure ───────────────────────────────────────────────────

    @Override
    public Void visit(Program node) {
        for (BodyNode bodyNode : node.getBodyNodes()) {
            bodyNode.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(HTMLElement node) {
        for (Attribute attribute : node.getAttributes()) {
            attribute.accept(this);
        }
        for (BodyNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(HTMLSingleElement node) {
        for (Attribute attribute : node.getAttributes()) {
            attribute.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Attribute node) {
        // NOTE: AttributeValue (e.g. AttributeJinja) isn't exposed via a
        // getter on Attribute in the current AST, so a Jinja expression used
        // inside an HTML attribute (e.g. `id="{{ x }}"`) can't be reached
        // from here yet. Nothing to check until that's exposed.
        return null;
    }

    @Override
    public Void visit(AttributeJinja node) {
        node.getText().accept(this);
        return null;
    }

    @Override
    public Void visit(AttributeString node) {
        return null;
    }

    @Override
    public Void visit(AttributeValue node) {
        return null;
    }

    @Override
    public Void visit(JinjaExpression node) {
        for (JinjaExpr expr : node.getText()) {
            expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaFunction node) {
        // node.getName() is the filter/function name (e.g. `upper` in
        // `name|upper`), not a variable reference - don't check it as one,
        // just note if it's an unrecognized filter (best-effort, since
        // user-defined macros are legitimate and unknowable here).
        String fname = node.getName().getFullName();
        if (!JINJA_BUILTIN_FILTERS.contains(fname)) {
            Symbol sym = lookup(fname);
            if (sym == null) {
                // Soft signal only - could be a legitimate custom macro/filter,
                // so we don't hard-error, just skip. Kept here as a hook point
                // if stricter checking is wanted later.
            }
        }
        for (JinjaExpr argument : node.getArguments()) {
            argument.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaAssign node) {
        node.getValue().accept(this);
        // node.getName() is the definition target, not a use - don't check it.
        return null;
    }

    @Override
    public Void visit(JinjaCombine node) {
        for (JinjaExpr part : node.getParts()) {
            part.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaStatement node) {
        for (JinjaExpr part : node.getText()) {
            part.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaId node) {
        checkVariableUse(node.getFirst(), node.getLine());
        return null;
    }

    @Override
    public Void visit(JinjaText node) {
        return null; // leaf, literal string - not a variable
    }

    @Override
    public Void visit(Text node) {
        return null; // leaf, literal HTML text
    }

    @Override
    public Void visit(JinjaSuperBlock node) {
        return null;
    }

    @Override
    public Void visit(JinjaBlock node) {
        for (BodyNode body : node.getBodys()) {
            body.accept(this);
        }
        if (node.getSuperBlock() != null) {
            node.getSuperBlock().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaInheritance node) {
        for (BodyNode body : node.getBodys()) {
            body.accept(this);
        }
        for (JinjaBlock block : node.getBlocks()) {
            block.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaIf node) {
        node.getCondition().accept(this);
        if (node.getIfBody() != null) {
            node.getIfBody().accept(this);
        }
        for (JinjaElif elif : node.getElifs()) {
            elif.accept(this);
        }
        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaElif node) {
        node.getCondition().accept(this);
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        return null;
    }

    // ── conditions ──────────────────────────────────────────────────────
    // CompareCondition/VariableCondition store their operands as raw Strings
    // rather than JinjaId nodes, so we apply a small heuristic: treat a
    // token as a variable reference unless it's clearly a literal (quoted
    // string, number, true/false/none).

    private static boolean looksLikeLiteral(String token) {
        if (token == null || token.isEmpty()) return true;
        if (token.startsWith("\"") || token.startsWith("'")) return true;
        if (token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false") || token.equalsIgnoreCase("none")) {
            return true;
        }
        return token.chars().allMatch(c -> Character.isDigit(c) || c == '.' || c == '-');
    }

    private void checkPossibleVariableToken(String token, int line) {
        if (token == null || looksLikeLiteral(token)) return;
        String base = token.contains(".") ? token.substring(0, token.indexOf('.')) : token;
        checkVariableUse(base, line);
    }

    @Override
    public Void visit(Condition node) {
        return null;
    }

    @Override
    public Void visit(CompareCondition node) {
        checkPossibleVariableToken(node.getLeftValue(), node.getLine());
        checkPossibleVariableToken(node.getRightValue(), node.getLine());
        return null;
    }

    @Override
    public Void visit(LogicCondition node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        return null;
    }

    @Override
    public Void visit(NotCondition node) {
        node.getCondition().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableCondition node) {
        checkPossibleVariableToken(node.getVariable(), node.getLine());
        return null;
    }

    @Override
    public Void visit(JinjaFor node) {
        node.getCollectionName().accept(this); // the iterable must be defined
        if (node.getFilterCondition() != null) {
            node.getFilterCondition().accept(this);
        }

        enterLoopScope("for@" + node.getLine());
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        exitScope();

        // getItemName() is the loop variable being *defined*, not used - skip it.

        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }

    // ── CSS: out of scope for variable-definition checks ────────────────

    @Override public Void visit(CSSAllSelector node)       { return null; }
    @Override public Void visit(CSSBody node)              { return null; }
    @Override public Void visit(CSSCalcFunction node)      { return null; }
    @Override public Void visit(CSSClassSelector node)     { return null; }
    @Override public Void visit(CSSDeclaration node)       { return null; }
    @Override public Void visit(CSSFunction node)          { return null; }
    @Override public Void visit(CSSHex node)               { return null; }
    @Override public Void visit(CSSHSLFunction node)       { return null; }
    @Override public Void visit(CSSIDSelector node)        { return null; }
    @Override public Void visit(CSSNode node)              { return null; }
    @Override public Void visit(CSSNormalSelector node)    { return null; }
    @Override public Void visit(CSSNumber node)            { return null; }
    @Override public Void visit(CSSRotateFunction node)    { return null; }
    @Override public Void visit(CSSRule node)              { return null; }
    @Override public Void visit(CSSScaleFunction node)     { return null; }
    @Override public Void visit(CSSSelector node)          { return null; }
    @Override public Void visit(CSSTerm node)              { return null; }
    @Override public Void visit(CSSText node)              { return null; }
    @Override public Void visit(CSSTranslateFunction node) { return null; }

    // ── generic / structural fall-throughs ──────────────────────────────

    @Override public Void visit(BodyNode node)  { return null; }
    @Override public Void visit(HTMLNode node)  { return null; }
    @Override public Void visit(JinjaExpr node) { return null; }
    @Override public Void visit(JinjaNode node) { return null; }
    @Override public Void visit(Node node)      { return null; }
}

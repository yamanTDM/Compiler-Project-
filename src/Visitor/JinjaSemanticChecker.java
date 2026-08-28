package Visitor;

import AST.*;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolKind;
import SymbolTable.SymbolTable;

import java.util.*;

public class JinjaSemanticChecker implements ASTVisitorJinja<Void> {

    private static final Set<String> JINJA_BUILTIN_FILTERS = Set.of(
            "length", "upper", "lower", "capitalize", "title", "trim", "default",
            "join", "first", "last", "count", "round", "safe", "escape", "int",
            "float", "string", "list", "dictsort", "format", "replace", "truncate",
            "wordcount", "slice", "sort", "sum", "min", "max", "unique", "urlencode",
            "tojson", "striptags", "indent", "center", "batch", "groupby", "map",
            "select", "reject", "selectattr", "rejectattr", "attr", "abs", "e",
            "items", "reverse", "pprint", "random", "wordwrap", "xmlattr", "url_for"
    );

    private final SymbolTable symbolTable;
    private final List<String> errors = new ArrayList<>();

    private final Deque<Scope> scopeStack = new ArrayDeque<>();
    private final Set<String> blockNames = new HashSet<>();
    private int inheritanceDepth = 0;

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


    @Override
    public Void visit(Program node) {
        for (BodyNode bodyNode : node.getBodyNodes()) {
            bodyNode.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(HTMLElement node) {
        if(!node.getTag().equals(node.getEndTag())){
            error(node.getLine(), "Start tag <" + node.getTag() +
                    "> does not match end tag </" + node.getEndTag() + ">");        }
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
        if (node.getValue() != null) {
            node.getValue().accept(this);
        }
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
        String fname = node.getName().getFullName();
        if (!JINJA_BUILTIN_FILTERS.contains(fname)) {
            Symbol sym = lookup(fname);
            if (sym == null) {
                error(node.getLine(), "Unsupported or undefined Jinja function/filter '"
                        + fname + "'.");
            }
        }
        if ("url_for".equals(fname) && node.getArguments().isEmpty()) {
            error(node.getLine(), "url_for() requires an endpoint name.");
        }
        for (JinjaExpr argument : node.getArguments()) {
            argument.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaAssign node) {
        node.getValue().accept(this);
        String target = node.getName().getFullName().toLowerCase(Locale.ROOT);
        if (Set.of("true", "false", "none", "loop", "url_for").contains(target)) {
            error(node.getLine(), "Cannot assign to reserved Jinja name '" + target + "'.");
        }
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
        return null;
    }

    @Override
    public Void visit(Text node) {
        return null;
    }

    @Override
    public Void visit(JinjaSuperBlock node) {
        if (inheritanceDepth == 0) {
            error(node.getLine(), "super() is only valid inside an inherited template block.");
        }
        return null;
    }

    @Override
    public Void visit(JinjaBlock node) {
        String blockName = node.getName().getFullName();
        if (!blockNames.add(blockName)) {
            error(node.getLine(), "Duplicate Jinja block name '" + blockName + "'.");
        }
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
        inheritanceDepth++;
        for (BodyNode body : node.getBodys()) {
            body.accept(this);
        }
        for (JinjaBlock block : node.getBlocks()) {
            block.accept(this);
        }
        inheritanceDepth--;
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
        node.getCollectionName().accept(this);
        if (node.getItemName().getFullName().equals(node.getCollectionName().getFirst())) {
            error(node.getLine(), "Loop variable must not shadow its collection '"
                    + node.getCollectionName().getFirst() + "'.");
        }
        if (node.getFilterCondition() != null) {
            node.getFilterCondition().accept(this);
        }

        enterLoopScope("for@" + node.getLine());
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        exitScope();


        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }


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


    @Override public Void visit(BodyNode node)  { return null; }
    @Override public Void visit(HTMLNode node)  { return null; }
    @Override public Void visit(JinjaExpr node) { return null; }
    @Override public Void visit(JinjaNode node) { return null; }
    @Override public Void visit(Node node)      { return null; }
}

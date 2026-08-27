package SymbolTable;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class SymbolTable {

    private final Scope globalScope;
    private final Deque<Scope> scopeStack = new ArrayDeque<>();
    private final List<Scope> allScopes = new ArrayList<>();
    private final List<Scope> exitedScopes = new ArrayList<>();

    public SymbolTable() {
        globalScope = new Scope("global", null);
        pushScope(globalScope);
    }

    private void pushScope(Scope scope) {
        scopeStack.push(scope);
        allScopes.add(scope);
    }

    public void enterScope(String name) {
        pushScope(new Scope(name, currentScope()));
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            exitedScopes.add(scopeStack.pop());
        }
    }

    public Scope currentScope() {
        return scopeStack.peek();
    }

    public Symbol define(
            String name,
            String type,
            String value,
            SymbolKind kind,
            int line,
            boolean isGlobal) {
        return currentScope().define(name, type, value, kind, line, isGlobal);
    }

    public Symbol defineInGlobal(
            String name,
            String type,
            String value,
            SymbolKind kind,
            int line,
            boolean isGlobal) {
        return globalScope.define(name, type, value, kind, line, isGlobal);
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public List<Scope> getAllScopes() {
        return Collections.unmodifiableList(allScopes);
    }

    public Symbol lookup(String name) {
        Symbol latest = null;
        for (Scope scope : scopeStack) {
            for (Symbol symbol : scope.getSymbols()) {
                if (symbol.getName().equals(name)
                        && (latest == null || latest.getLine() < symbol.getLine())) {
                    latest = symbol;
                }
            }
        }
        return latest;
    }

    public void addParameter(String name, String parameter) {
        for (Scope scope : scopeStack) {
            for (Symbol symbol : scope.getSymbols()) {
                if (symbol.getName().equals(name)) {
                    symbol.addParameter(parameter);
                }
            }
        }
    }

    public Symbol lookupGlobal(String name) {
        Symbol latest = null;
        for (Symbol symbol : globalScope.getSymbols()) {
            if (symbol.getName().equals(name)
                    && (latest == null || latest.getLine() < symbol.getLine())) {
                latest = symbol;
            }
        }
        return latest;
    }

    public void print(PrintStream out) {
        String border = "+"
                + "-".repeat(26) + "+"
                + "-".repeat(20) + "+"
                + "-".repeat(20) + "+"
                + "-".repeat(24) + "+"
                + "-".repeat(12) + "+"
                + "-".repeat(12) + "+";

        out.println(border);
        out.println("| SYMBOL TABLE"
                + " ".repeat(Math.max(0, border.length() - 15)) + "|");
        out.println(border);

        for (Scope scope : allScopes) {
            String parent = scope.getParent() == null
                    ? ""
                    : " (parent: " + scope.getParent().getName() + ")";
            out.println("Scope: " + scope.getName() + parent);
            out.println(border);
            out.println(row("NAME", "KIND", "TYPE", "VALUE", "LINE", "GLOBAL"));
            out.println(border);
            if (scope.getSymbols().isEmpty()) {
                out.println("| (empty)"
                        + " ".repeat(Math.max(0, border.length() - 11)) + "|");
            } else {
                for (Symbol symbol : scope.getSymbols()) {
                    out.println(row(
                            symbol.getName(),
                            symbol.getKind().name(),
                            symbol.getType(),
                            symbol.getValue(),
                            String.valueOf(symbol.getLine()),
                            String.valueOf(symbol.isGlobal())));
                }
            }
            out.println(border);
        }
    }

    private static String row(
            String name,
            String kind,
            String type,
            String value,
            String line,
            String global) {
        return String.format(
                "| %-24s | %-18s | %-18s | %-22s | %-10s | %-10s |",
                fit(name, 24),
                fit(kind, 18),
                fit(type, 18),
                fit(value, 22),
                fit(line, 10),
                fit(global, 10));
    }

    private static String fit(String value, int maximum) {
        if (value == null) return "";
        if (value.length() <= maximum) return value;
        return value.substring(0, Math.max(0, maximum - 3)) + "...";
    }
}

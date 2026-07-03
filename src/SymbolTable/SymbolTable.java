package SymbolTable;

import java.io.PrintStream;
import java.util.*;


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
        Scope newScope = new Scope(name, currentScope());
        pushScope(newScope);
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            exitedScopes.add(scopeStack.pop());
        }
    }

    public Scope currentScope() {
        return scopeStack.peek();
    }

    public Symbol define(String name,String type, String value, SymbolKind kind, int line, boolean isGlobal) {
        return currentScope().define(name,type,value, kind, line, isGlobal);
    }

    public Symbol defineInGlobal(String name,String type, String value, SymbolKind kind, int line, boolean isGlobal) {
        return globalScope.define(name, type,value,kind, line, isGlobal);
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
                if (symbol.getName().equals(name)) {
                    if (latest == null || latest.getLine() < symbol.getLine()) {
                        latest = symbol;
                    }
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
            if (symbol.getName().equals(name)) {
                if (latest == null || latest.getLine() < symbol.getLine()) {
                    latest = symbol;
                }
            }
        }
        return latest;
    }

    public void print(PrintStream out) {
        final int W = 123;   // Increased table width

        final String TOP = "╔" + "═".repeat(W + 2) + "╗";
        final String BOTTOM = "╚" + "═".repeat(W + 2) + "╝";
        final String DIV = "╠" + "═".repeat(W + 2) + "╣";
        final String BLANK = "║" + " ".repeat(W + 2) + "║";

        out.println(TOP);
        out.println(centre("SYMBOL TABLE", W));
        out.println(DIV);

        for (int i = 0; i < allScopes.size(); i++) {
            Scope scope = allScopes.get(i);

            String parentInfo = scope.getParent() != null
                    ? " (parent: " + scope.getParent().getName() + ")"
                    : "";

            out.println(left("  SCOPE: " + scope.getName() + parentInfo, W));

            Collection<Symbol> symbols = scope.getSymbols();

            if (symbols.isEmpty()) {
                out.println(left("    (empty scope)", W));
            } else {

                out.println(
                        "║  ┌──────────────────────────┬────────────────────┬────────────────────┬────────────────────────┬────────────┬────────────┐  ║");

                out.println(row(
                        "NAME",
                        "KIND",
                        "TYPE",
                        "VALUE",
                        "LINE",
                        "ISGLOBAL"));

                out.println(
                        "║  ├──────────────────────────┼────────────────────┼────────────────────┼────────────────────────┼────────────┼────────────┤  ║");

                for (Symbol sym : symbols) {
                    out.println(row(
                            sym.getName(),
                            sym.getKind().name(),
                            sym.getType(),
                            sym.getValue(),
                            String.valueOf(sym.getLine()),
                            String.valueOf(sym.isGlobal())
                    ));
                }

                out.println(
                        "║  └──────────────────────────┴────────────────────┴────────────────────┴────────────────────────┴────────────┴────────────┘  ║");
            }

            if (i < allScopes.size() - 1) {
                out.println(BLANK);
            }
        }

        out.println(BOTTOM);
    }

    private static String row(
            String name,
            String kind,
            String type,
            String value,
            String line,
            String isGlobal
    ) {
        return String.format(
                "║  │ %-24s │ %-18s │ %-18s │ %-22s │ %-10s │ %-10s │  ║",
                truncate(name, 24),
                truncate(kind, 18),
                truncate(type, 18),
                truncate(value, 22),
                truncate(line, 10),
                truncate(isGlobal, 10)
        );
    }

    private static String truncate(String s, int max) {
        if (s == null) return "";
        return s.length() > max ? s.substring(0, max - 3) + "..." : s;
    }

    private static String centre(String text, int W) {
        int pad = (W - text.length()) / 2;
        return "║" + String.format("%-" + W + "s",
                " ".repeat(Math.max(0, pad)) + text) + "  ║";
    }

    private static String left(String text, int W) {
        return "║" + String.format("%-" + W + "s", text) + "  ║";
    }
}
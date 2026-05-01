package SymbolTable;

import java.io.PrintStream;
import java.util.*;

/**
 * SymbolTable
 * <p>
 * Owns the scope stack and every mutation operation used during the tree walk.
 * The visitor holds exactly one SymbolTable and calls into it — it never
 * touches Scope or Symbol directly.
 * <p>
 * Lifecycle
 * ─────────
 * SymbolTableVisitor visitor = new SymbolTableVisitor();
 * visitor.visit(tree);                       // populates the table
 * SymbolTable table = visitor.getSymbolTable();
 * table.print(System.out);
 * <p>
 * Mutation API  (called by the visitor during the walk)
 * ──────────────────────────────────────────────────────
 * table.enterScope(name)             open a new child scope and push it
 * table.exitScope()                  pop the current scope
 * table.define(name, kind, line)     define in the current scope
 * table.defineInModule(name,kind,line) define directly in the module scope
 * table.defineVariable(name, line)   define VARIABLE, routing globals upward
 * table.markGlobal(name)             mark a name as 'global' in current scope
 * <p>
 * Query API  (called after the walk)
 * ────────────────────────────────────
 * table.getModuleScope()
 * table.getScope("add_product")
 * table.getAllScopes()
 * table.lookup(name, scope)          walk scope chain from the given scope
 * table.lookupGlobal(name)           module scope only
 * table.print(System.out)
 */
public class SymbolTable {

    // ── scope tree ────────────────────────────────────────────────────────────

    private final Scope globalScope;

    /**
     * Live scope stack — currentScope() is scopeStack.peek().
     */
    private final Deque<Scope> scopeStack = new ArrayDeque<>();

    /**
     * All scopes in opening order (module first, then each function).
     */
    private final List<Scope> allScopes = new ArrayList<>();

    /**
     * Fast lookup by scope name (function name, or "module").
     */

    // ── construction ──────────────────────────────────────────────────────────
    public SymbolTable() {
        globalScope = new Scope("global", Scope.Kind.GLOBAL, null);
        pushScope(globalScope);
    }

    /**
     * Register a scope: add to the flat list, the name map, and the stack.
     */
    private void pushScope(Scope scope) {
        scopeStack.push(scope);
        allScopes.add(scope);
    }

    // ── mutation API (called by the visitor) ──────────────────────────────────

    /**
     * Open a new FUNCTION child scope under the current scope and push it onto
     * the stack.
     */
    public void enterScope(String name) {
        Scope newScope = new Scope(name, Scope.Kind.FUNCTION, currentScope());
        pushScope(newScope);
    }

    /**
     * Close the current scope (pop the stack).
     * The module scope is never popped.
     */
    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }

    /**
     * The innermost currently-open scope.
     */
    public Scope currentScope() {
        return scopeStack.peek();
    }

    /**
     * Define {@code name} with {@code kind} at {@code line} in the current scope.
     * First definition wins — repeated assignments don't overwrite the entry.
     */
    public Symbol define(String name, SymbolKind kind, int line,boolean isGlobal) {
        return currentScope().define(name, kind,  line, isGlobal);
    }

    /**
     * Define {@code name} directly in the module scope, regardless of which
     * scope is currently on top of the stack.
     * Used for imports and global declarations.
     */
    public Symbol defineInGlobal(String name, SymbolKind kind, int line,boolean isGlobal) {
        return globalScope.define(name, kind, line, isGlobal);
    }

    /**
     * Define {@code name} as a VARIABLE in the current scope — unless the
     * current scope has declared it 'global', in which case the definition is
     * routed to the module scope (matches Python global-statement semantics).
     */

    /**
     * Mark {@code name} as 'global' in the current scope so that subsequent
     * calls to defineVariable() for that name are routed to the module scope.
     */


    // ── query API (called after the walk) ─────────────────────────────────────

    /**
     * The top-level module scope.
     */
    public Scope getGlobalScope() {
        return globalScope;
    }

    /**
     * All scopes in the order they were opened during the walk.
     */
    public List<Scope> getAllScopes() {
        return Collections.unmodifiableList(allScopes);
    }

    /**
     * Return the scope whose name matches {@code name}, or {@code null}.
     * Pass {@code "module"} for the module scope.
     */

    /**
     * Look up {@code name} starting from {@code startScope}, walking parent
     * scopes until the module scope.  Returns {@code null} if not found.
     */
    public Symbol lookup(String name) {
        Symbol latest = null;
        for (Scope scope : scopeStack) {
            for (Symbol symbol : scope.getSymbols()) {
                if (symbol.getName().equals(name)) {
                    if (latest == null || (latest.getLine() < symbol.getLine())) {
                        latest = symbol;
                    }
                }
            }
        }

        return latest;
    }
    public void addParameter(String name,String parameter) {
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
                if (latest == null || (latest.getLine() < symbol.getLine())) {
                    latest = symbol;
                }
            }
        }
        return latest;
    }


    // ── print ─────────────────────────────────────────────────────────────────

    /**
     * Print the complete symbol table to {@code out} using box-drawing characters.
     * <p>
     * ╔══════════════════════════════════════════════════════════════╗
     * ║                        SYMBOL TABLE                          ║
     * ╠══════════════════════════════════════════════════════════════╣
     * ║  SCOPE: module                                               ║
     * ║  ┌──────────────────────────────────────────────────────┐   ║
     * ║  │  NAME                KIND           LINE              │   ║
     * ║  ├──────────────────────────────────────────────────────┤   ║
     * ║  │  Flask               IMPORT         1                 │   ║
     * ║  │  products            GLOBAL_DECL    5                 │   ║
     * ║  │  index               FUNCTION       9                 │   ║
     * ║  └──────────────────────────────────────────────────────┘   ║
     * ║                                                              ║
     * ║  SCOPE: index  (parent: module)                             ║
     * ║  @app.route("/")                                             ║
     * ║  ┌──────────────────────────────────────────────────────┐   ║
     * ║  │  NAME                KIND           LINE              │   ║
     * ║  ├──────────────────────────────────────────────────────┤   ║
     * ║  │  products            GLOBAL_DECL    10                │   ║
     * ║  └──────────────────────────────────────────────────────┘   ║
     * ╚══════════════════════════════════════════════════════════════╝
     */
    public void print(PrintStream out) {
        final int W = 72;
        final String TOP = "╔" + "═".repeat(W + 2) + "╗";
        final String BOTTOM = "╚" + "═".repeat(W + 2) + "╝";
        final String DIV = "╠" + "═".repeat(W + 2) + "╣";
        final String BLANK = "║" + " ".repeat(W + 2) + "║";
        final String INNER = "─".repeat(W - 4);

        out.println(TOP);
        out.println(centre("SYMBOL TABLE", W));
        out.println(DIV);

        for (int i = 0; i < allScopes.size(); i++) {
            Scope scope = allScopes.get(i);

            // ── scope header ───────────────────────────────────────────────────
            String parentInfo = scope.getParent() != null
                    ? "  (parent: " + scope.getParent().getName() + ")" : "";
            out.println(left("  SCOPE: " + scope.getName() + parentInfo, W));

            // ── decorators — printed above the scope's symbol table ────────────
            // A FUNCTION symbol lives in the parent scope; its decorators belong
            // logically to the function body scope shown here.


            // ── symbol rows ────────────────────────────────────────────────────
            Collection<Symbol> symbols = scope.getSymbols();
            if (symbols.isEmpty()) {
                out.println(left("    (empty scope)", W));
            } else {
                out.println("║  ┌" + INNER + "┐  ║");
                out.println(row("NAME", "KIND", "LINE","ISGLOBAL", W));
                out.println("║  ├" + INNER + "┤  ║");
                for (Symbol sym : symbols) {
                    out.println(row(sym.getName(), sym.getKind().name(),
                            String.valueOf(sym.getLine()),String.valueOf(sym.isGlobal()), W));
                }
                out.println("║  └" + INNER + "┘  ║");
            }

            if (i < allScopes.size() - 1) out.println(BLANK);
        }

        out.println(BOTTOM);
    }

    // ── formatting helpers ────────────────────────────────────────────────────

    private static String row(String name, String kind, String line,String isGlobal, int W) {
        int innerW = W - 4;
        String cell = String.format("  %-20s %-20s %-10s %-20s", name, kind, line, isGlobal);
        if (cell.length() > innerW) cell = cell.substring(0, innerW);
        return "║  │" + String.format("%-" + innerW + "s", cell) + "│  ║";
    }

    private static String centre(String text, int W) {
        int pad = (W - text.length()) / 2;
        return "║" + String.format("%-" + W + "s",
                " ".repeat(Math.max(pad, 0)) + text) + "  ║";
    }

    private static String left(String text, int W) {
        return "║" + String.format("%-" + W + "s", text) + "  ║";
    }
}
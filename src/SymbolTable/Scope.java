package SymbolTable;

import java.util.*;

/**
 * A single lexical scope.
 *
 * The module (top-level) scope has {@code parent == null}.
 * Every function body creates a child scope whose parent is the enclosing scope.
 *
 * Symbols are stored in insertion order so that the printed table reads
 * top-to-bottom as the source does.
 */
public class Scope {


    private final String                        name;
    private final Scope                         parent;
    private final LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<>();
    private final List<Scope>                   children = new ArrayList<>();

    public Scope(String name, Scope parent) {
        this.name   = name;
        this.parent = parent;
        if (parent != null) parent.children.add(this);
    }
    public Symbol define(String name, SymbolKind kind, int line,boolean isGlobal) {
        if (!symbols.containsKey(name)) {
            symbols.put(name, new Symbol(name, kind, line,isGlobal));
        }
        return symbols.get(name);
    }

    // ── accessors ────────────────────────────────────────────────────────────

    public String        getName()     { return name; }
    public Scope         getParent()   { return parent; }
    public List<Scope>   getChildren() { return Collections.unmodifiableList(children); }
    public Collection<Symbol> getSymbols() { return Collections.unmodifiableCollection(symbols.values()); }


}
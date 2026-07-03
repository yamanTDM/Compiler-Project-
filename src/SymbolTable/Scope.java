package SymbolTable;

import java.util.*;

/**
 * A single lexical scope.
 */
public class Scope {

    private final String name;
    private final Scope parent;
    private final LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<>();
    private final List<Scope> children = new ArrayList<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        if (parent != null) parent.children.add(this);
    }

    public Symbol define(String name, String type, String value, SymbolKind kind, int line, boolean isGlobal) {
        Symbol existing = symbols.get(name);

        String finalType  = (type  != null) ? type  : (existing != null ? existing.getType()  : null);
        String finalValue = (value != null) ? value : (existing != null ? existing.getValue() : null);

        Symbol sym = new Symbol(name, finalType, finalValue, kind, line, isGlobal);
        symbols.put(name, sym);

        return sym;
    }


    public String getName() {
        return name;
    }

    public Scope getParent() {
        return parent;
    }

    public List<Scope> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Collection<Symbol> getSymbols() {
        return Collections.unmodifiableCollection(symbols.values());
    }
}
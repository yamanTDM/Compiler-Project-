package SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * One entry in the symbol table.
 * <p>
 * For FUNCTION symbols the {@code decorators} list holds every decorator
 * string (e.g. "@app.route(\"/\", methods=[\"GET\",\"POST\"])") in
 * declaration order.  For all other kinds the list is empty.
 */
public class Symbol {

    private final String name;
    private final SymbolKind kind;
    private final int line;
    private final List<String> parameters;
    private final boolean isGlobal;

    public Symbol(String name, SymbolKind kind, int line,boolean isGlobal) {
        this.name = name;
        this.kind = kind;
        this.line = line;
        this.parameters = new ArrayList<>();
        this.isGlobal = isGlobal;
    }

    // ── accessors ────────────────────────────────────────────────────────────

    public String getName() {
        return name;
    }

    public SymbolKind getKind() {
        return kind;
    }

    public int getLine() {
        return line;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public List<String> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    /**
     * Called by the visitor to attach a decorator string to a FUNCTION symbol.
     */
    public void addParameter(String parameter) {
        parameters.add(parameter);
    }

    // ── pretty-print ─────────────────────────────────────────────────────────

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %-12s line %d %-12s", name, kind, line,isGlobal));
        if (!parameters.isEmpty()) {
            sb.append("  parameters=").append(parameters);
        }
        return sb.toString();
    }
}
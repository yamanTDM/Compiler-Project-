package SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Symbol {

    private final String name;
    private final String type;
    private final String value;
    private final SymbolKind kind;
    private final int line;
    private final List<String> parameters;
    private final List<Symbol> attributes;
    private final boolean isGlobal;

    public Symbol(String name, String type, String value, SymbolKind kind, int line, boolean isGlobal) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.kind = kind;
        this.line = line;
        this.parameters = new ArrayList<>();
        this.isGlobal = isGlobal;
        this.attributes = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public SymbolKind getKind() {
        return kind;
    }
    public void addAttribute(Symbol attribute) {
        this.attributes.add(attribute);
    }
    public List<Symbol> getAttributes() {
        return attributes;
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

    public void addParameter(String parameter) {
        parameters.add(parameter);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %-14s %-12s %-15s line %-4d isGlobal=%-5s",
                name, kind, type, value, line, isGlobal));

        if (!parameters.isEmpty()) {
            sb.append("  parameters=").append(parameters);
        }

        if (!attributes.isEmpty()) {
            sb.append("  attributes=[");
            for (int i = 0; i < attributes.size(); i++) {
                sb.append(attributes.get(i).toString());
                if (i < attributes.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        }

        return sb.toString();
    }
}
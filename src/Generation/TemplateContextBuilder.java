package Generation;

import SymbolTable.Symbol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateContextBuilder {

    private static final Object UNRESOLVED = Unresolved.VALUE;

    /**
     * @param bindings      the Symbols the project's existing SymbolTableBuilder bridge
     *                      already computed for this template (from its render_template(...) call)
     * @param moduleContext the fully-resolved module-level Python values from ContextExtractor
     */
    public static Map<String, Object> build(List<Symbol> bindings, Map<String, Object> moduleContext) {
        Map<String, Object> context = new HashMap<>();
        if (bindings == null) return context;

        for (Symbol sym : bindings) {
            String key = sym.getName();
            if (moduleContext.containsKey(key)) {
                // Prefer the deeper, whitelist-resolved value (handles load_products()-style calls).
                context.put(key, moduleContext.get(key));
            } else {
                context.put(key, fromSymbol(sym));
            }
        }
        return context;
    }

    /** Best-effort conversion of the bridge's own literal-only value/type/attributes. */
    private static Object fromSymbol(Symbol sym) {
        if ("dict".equals(sym.getType()) && !sym.getAttributes().isEmpty()) {
            Map<String, Object> map = new HashMap<>();
            for (Symbol attr : sym.getAttributes()) {
                map.put(attr.getName(), fromSymbol(attr));
            }
            return map;
        }
        String raw = sym.getValue();
        if (raw == null) return UNRESOLVED;
        try {
            return Integer.parseInt(raw);
        } catch (NumberFormatException ignored) { /* not an int */ }
        try {
            return Double.parseDouble(raw);
        } catch (NumberFormatException ignored) { /* not a float */ }
        if ("True".equals(raw) || "False".equals(raw)) return Boolean.parseBoolean(raw);
        if ("None".equals(raw)) return null;
        if (raw.length() >= 2 && raw.startsWith("\"") && raw.endsWith("\"")) {
            return raw.substring(1, raw.length() - 1);
        }
        return raw;
    }
}

package Generation;

import AST_Python.Expression;
import AST_Python.Program;
import AST_Python.Statement;
import AST_Python.compound_statements.DecoratedFunction;
import AST_Python.compound_statements.Decorator;
import AST_Python.expressions.atoms.StringAtom;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Maps a Flask endpoint name (the route function's name, i.e. what
 * {@code url_for(...)} takes as its first argument) to its URL pattern,
 * e.g. "detail" -> "/product/<int:id>".
 */
public class RouteExtractor {

    private static final Pattern PLACEHOLDER = Pattern.compile("<(?:\\w+:)?(\\w+)>");

    public final Map<String, String> endpointToPattern = new LinkedHashMap<>();

    public void extract(Program program) {
        for (Statement st : program.getStatements()) {
            if (!(st instanceof DecoratedFunction df)) continue;

            String endpoint = df.getFunctionStatement().getName();
            for (Decorator dec : df.getDecorators()) {
                String decoratorName = dec.getName().fullName();
                if (!decoratorName.endsWith("route")) continue;

                List<Expression> args = dec.getArguments();
                if (!args.isEmpty() && args.get(0) instanceof StringAtom pattern) {
                    endpointToPattern.put(endpoint, pattern.getValue());
                }
            }
        }
    }

    /** Substitutes each &lt;type:name&gt; / &lt;name&gt; placeholder with a value from kwargs. */
    public String buildUrl(String endpoint, Map<String, String> kwargs) {
        if ("static".equals(endpoint)) {
            return "/static/" + kwargs.getOrDefault("filename", "");
        }
        String pattern = endpointToPattern.get(endpoint);
        if (pattern == null) return "#unknown-endpoint-" + endpoint;

        Matcher m = PLACEHOLDER.matcher(pattern);
        StringBuilder out = new StringBuilder();
        while (m.find()) {
            String paramName = m.group(1);
            String value = kwargs.getOrDefault(paramName, "");
            m.appendReplacement(out, Matcher.quoteReplacement(value));
        }
        m.appendTail(out);
        return out.toString();
    }
}

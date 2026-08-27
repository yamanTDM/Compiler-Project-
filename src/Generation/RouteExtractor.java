package Generation;

import AST_Python.Expression;
import AST_Python.Program;
import AST_Python.SimpleStatement;
import AST_Python.Statement;
import AST_Python.compound_statements.*;
import AST_Python.expressions.AccessAttributeExpression;
import AST_Python.expressions.AccessFunctionExpression;
import AST_Python.expressions.atoms.NameAtom;
import AST_Python.expressions.atoms.StringAtom;
import AST_Python.small_statements.ReturnStatement;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RouteExtractor {

    private static final Pattern PLACEHOLDER = Pattern.compile("<(?:\\w+:)?(\\w+)>");

    public final Map<String, String> endpointToPattern = new LinkedHashMap<>();
    private final Map<String, String> endpointToOutput = new LinkedHashMap<>();

    public void extract(Program program) {
        for (Statement st : program.getStatements()) {
            if (!(st instanceof DecoratedFunction df)) continue;

            String endpoint = df.getFunctionStatement().getName();
            for (Decorator dec : df.getDecorators()) {
                String decoratorName = dec.getName().fullName();
                if (!decoratorName.endsWith("route")) continue;

                List<Expression> args = dec.getArguments();
                if (!args.isEmpty() && args.getFirst() instanceof StringAtom pattern) {
                    endpointToPattern.put(endpoint, pattern.getValue());

                }
            }
            findRenderTemplate(
                    df.getFunctionStatement().getBody().getStatements(),
                    endpoint
            );
        }
    }

    private void findRenderTemplate(
            List<Statement> statements,
            String endpoint
    ) {
        for (Statement statement : statements) {


            if (statement instanceof SimpleStatement simpleStatement) {

                if (simpleStatement.getStatement()
                        instanceof ReturnStatement returnStatement) {

                    if (returnStatement.getExpression()
                            instanceof AccessFunctionExpression accessFunctionExpression) {

                        if (accessFunctionExpression.getObject()
                                instanceof NameAtom nameAtom) {

                            if (nameAtom.getName().equals("render_template")) {

                                List<Expression> arguments =
                                        accessFunctionExpression.getArguments();

                                if (!arguments.isEmpty()
                                        && arguments.getFirst()
                                        instanceof StringAtom template) {

                                    String templateName = template.getValue();

                                    endpointToOutput.put(
                                            endpoint,
                                            templateName.replace('\\', '/')
                                    );

                                    System.out.println(
                                            endpoint + " -> " + templateName
                                    );
                                }
                            }
                        }
                    }
                }
            }

            if (statement instanceof IfStatement ifStatement) {

                findRenderTemplate(
                        ifStatement.getIfBody().getStatements(),
                        endpoint
                );

                for (ElseIfStatement elseIfStatement : ifStatement.getElseIfStatements()) {
                    findRenderTemplate(
                            elseIfStatement.getBody().getStatements(),
                            endpoint
                    );

                }
                if (ifStatement.getElseBody() != null) {
                    findRenderTemplate(
                            ifStatement.getElseBody().getStatements(),
                            endpoint
                    );
                }
            }


            if (statement instanceof WithStatement withStatement) {

                findRenderTemplate(
                        withStatement.getBody().getStatements(),
                        endpoint
                );
            }


        }
    }


    public String endpointForOutput(String outputName) {
        String normalized = outputName.replace('\\', '/');
        for (Map.Entry<String, String> entry : endpointToOutput.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(normalized)) return entry.getKey();
        }
        return null;
    }

    public List<String> dynamicParameters(String endpoint) {
        String pattern = endpointToPattern.get(endpoint);
        if (pattern == null) return List.of();
        List<String> parameters = new ArrayList<>();
        Matcher matcher = PLACEHOLDER.matcher(pattern);
        while (matcher.find()) parameters.add(matcher.group(1));
        return parameters;
    }

    public String buildUrl(String endpoint, Map<String, String> kwargs) {
        if ("static".equals(endpoint)) {
            return "static/" + kwargs.getOrDefault("filename", "");
        }
        String output = endpointToOutput.get(endpoint);
        if (output == null) {
            return buildActionUrl(endpoint, kwargs);
        }

        List<String> parameters = dynamicParameters(endpoint);
        if (parameters.isEmpty()) return output;

        StringBuilder suffix = new StringBuilder();
        for (String parameter : parameters) {
            String value = kwargs.get(parameter);
            if (value == null || value.isBlank()) return output;
            suffix.append('_').append(safeFilePart(value));
        }
        int dot = output.toLowerCase(Locale.ROOT).lastIndexOf(".html");
        return dot >= 0 ? output.substring(0, dot) + suffix + output.substring(dot) : output + suffix + ".html";
    }

    private static String buildActionUrl(String endpoint, Map<String, String> kwargs) {
        StringBuilder url = new StringBuilder("/actions/").append(endpoint);
        if (kwargs != null && !kwargs.isEmpty()) {
            StringBuilder query = new StringBuilder();
            for (Map.Entry<String, String> entry : kwargs.entrySet()) {
                if (entry.getValue() == null) continue;
                if (query.length() > 0) query.append('&');
                query.append(urlEncode(entry.getKey())).append('=').append(urlEncode(entry.getValue()));
            }
            if (query.length() > 0) url.append('?').append(query);
        }
        return url.toString();
    }

    private static String urlEncode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static String safeFilePart(String value) {
        return value.replaceAll("[^A-Za-z0-9._-]", "_");
    }


}

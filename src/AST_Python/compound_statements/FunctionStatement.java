package AST_Python.compound_statements;

import AST_Python.Body;
import AST_Python.CompoundStatement;
import AST_Python.Parameter;

import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends CompoundStatement {
    private final String name;
    private final List<Parameter> parameters;
    private final Body body;

    public FunctionStatement(int line, String name, Body body) {
        super(line, "Function Statement");
        this.name = name;
        this.body = body;
        this.parameters = new ArrayList<>();
    }
    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }
    public String getName() {
        return name;
    }
    public List<Parameter> getParameters() {
        return parameters;
    }
    public Body getBody() {
        return body;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(indentation).append(name).append("\n");
        for (Parameter parameter : parameters) {
            sb.append(parameter.print(indentation)).append("\n");
        }
        sb.append(body.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
}

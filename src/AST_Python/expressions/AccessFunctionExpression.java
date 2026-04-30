package AST_Python.expressions;

import AST_Python.Expression;

import java.util.ArrayList;
import java.util.List;

public class AccessFunctionExpression extends NumbericExpression{
    private final NumbericExpression object;
    private final List<Expression> arguments;

    public AccessFunctionExpression(int line, NumbericExpression object) {
        super(line, "Access Function Expression");
        this.object = object;
        this.arguments = new ArrayList<>();
    }
    public void addArgument(Expression argument){
        this.arguments.add(argument);
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public NumbericExpression getObject() {
        return object;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(object.print(indentation)).append("\n");
        for (Expression argument : arguments) {
            sb.append(argument.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

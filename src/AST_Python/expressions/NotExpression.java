package AST_Python.expressions;

import AST_Python.Expression;

public class NotExpression extends Expression {
    private final Expression expression;

    public NotExpression(int line, Expression expression) {
        super(line, "Not Expression");
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(expression.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
}

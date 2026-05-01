package AST_Python.expressions;

import AST_Python.Node;

public abstract class Comparision extends Node {
    private final NumbericExpression leftExpression;
    private final NumbericExpression rightExpression;
    public Comparision(int line, String name, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, name);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public NumbericExpression getLeftExpression() {
        return leftExpression;
    }

    public NumbericExpression getRightExpression() {
        return rightExpression;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(leftExpression.print(indentation)).append("\n");
        sb.append(rightExpression.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();

    }
}

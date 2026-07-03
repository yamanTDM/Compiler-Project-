package AST_Python.expressions;

import Visitor.ASTVisitor;

public class Multiplication extends NumbericExpression {
    private final NumbericExpression leftExpression;
    private final NumbericExpression rightExpression;
    public Multiplication(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Multiplication");
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public NumbericExpression getRightExpression() {
        return rightExpression;
    }

    public NumbericExpression getLeftExpression() {
        return leftExpression;
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
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

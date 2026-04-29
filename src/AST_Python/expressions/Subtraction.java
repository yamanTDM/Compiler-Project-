package AST_Python.expressions;

public class Subtraction extends NumbericExpression {
    private final NumbericExpression leftExpression;
    private final NumbericExpression rightExpression;
    public Subtraction(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Subtraction");
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
}

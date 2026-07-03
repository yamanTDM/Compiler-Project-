package AST_Python.small_statements;

import AST_Python.Expression;
import AST_Python.SmallStatement;
import Visitor.ASTVisitor;

public class AssignStatement extends SmallStatement {
    private final Expression leftExpression;
    private final Expression rightExpression;
    public AssignStatement(int line,Expression leftExpression, Expression rightExpression) {
        super(line, "Assign Statement");
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }
    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(indentation).append("leftExpression: \n");
        sb.append(leftExpression.print(indentation)).append("\n");
        sb.append(indentation).append("rightExpression: \n");
        sb.append(rightExpression.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

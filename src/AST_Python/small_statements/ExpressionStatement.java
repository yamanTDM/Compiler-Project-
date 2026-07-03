package AST_Python.small_statements;


import AST_Python.Expression;
import AST_Python.SmallStatement;
import Visitor.ASTVisitor;

public class ExpressionStatement extends SmallStatement {
    private final Expression expression;

    public ExpressionStatement(int line, Expression expression) {
        super(line, "Expression Statement");
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
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

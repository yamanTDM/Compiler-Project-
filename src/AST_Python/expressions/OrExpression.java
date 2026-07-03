package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class OrExpression extends Expression {
    private final List<Expression> expressions;
    public OrExpression(int line) {
        super(line,"Or Expression");
        this.expressions = new ArrayList<>();
    }
    public void addExpression(Expression expression){
        expressions.add(expression);
    }
    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for (Expression expression : expressions) {
            sb.append(expression.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

package AST_Python.compound_statements;

import AST_Python.Body;
import AST_Python.CompoundStatement;
import AST_Python.Expression;
import Visitor.ASTVisitor;

import javax.print.DocFlavor;

public class WithStatement extends CompoundStatement {
    private final Expression expression;
    private final String name;
    private final Body body;

    public WithStatement(int line,Expression expression, String name, Body body) {
        super(line,"With Statement");
        this.expression = expression;
        this.name = name;
        this.body = body;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(expression.print(indentation)).append("\n");
        if (name != null) {
            sb.append(indentation).append("Name: ").append(name).append("\n");
        }
        sb.append(body.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

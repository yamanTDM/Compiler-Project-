package AST_Python.compound_statements;

import AST_Python.Body;
import AST_Python.Expression;
import AST_Python.Node;
import Visitor.ASTVisitor;

public class ElseIfStatement extends Node {
    private final Expression condition;
    private final Body body;

    public ElseIfStatement(int line,Expression condition, Body body) {
        super(line,"Else If Statement");
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(condition.print(indentation)).append("\n");
        sb.append(body.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

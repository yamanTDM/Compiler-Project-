package AST_Python.compound_statements;

import AST_Python.Body;
import AST_Python.CompoundStatement;
import AST_Python.Expression;
import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends CompoundStatement {
    private final Expression condition;
    private final Body ifBody;
    private final List<ElseIfStatement> elseIfStatements;
    private final Body elseBody;

    public IfStatement(int line, Expression condition, Body ifBody, Body elseBody) {
        super(line, "If Statement");
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        elseIfStatements = new ArrayList<>();
    }
    public void addElseIfStatement(ElseIfStatement elseIfStatement) {
        this.elseIfStatements.add(elseIfStatement);
    }
    public void removeElseIfStatement(ElseIfStatement elseIfStatement) {
        this.elseIfStatements.remove(elseIfStatement);
    }
    public Expression getCondition() {
        return condition;
    }

    public List<ElseIfStatement> getElseIfStatements() {
        return elseIfStatements;
    }

    public Body getIfBody() {
        return ifBody;
    }

    public Body getElseBody() {
        return elseBody;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(indent).append("If Condition:").append("\n");
        sb.append(condition.print(indentation)).append("\n");
        sb.append(indent).append("If Body:").append("\n");
        sb.append(ifBody.print(indentation)).append("\n");
        if (!elseIfStatements.isEmpty()) {
            sb.append(indent).append("Else if Statements:").append("\n");

        }
        for (ElseIfStatement elseIfStatement : elseIfStatements) {
            sb.append(elseIfStatement.print(indentation)).append("\n");
        }
        if (elseBody != null) {
            sb.append(elseBody.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();

    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

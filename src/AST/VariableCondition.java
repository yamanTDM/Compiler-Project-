package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class VariableCondition extends Condition {
    private final String variable;

    public VariableCondition(int line, String variable) {
        super(line, "Variable Condition");
        this.variable = variable;
    }
    public String getVariable() {
        return variable;
    }
    @Override
    public String toString() {
        return super.name  + "- " + variable + " ";
    }
    @Override
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

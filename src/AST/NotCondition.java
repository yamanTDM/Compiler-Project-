package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class NotCondition extends Condition {
    private final Condition condition;

    public NotCondition(int line, Condition condition) {
        super(line, "Not Condition");
        this.condition = condition;
    }
    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return super.name + "- not (" + condition.toString() + ")";
    }
    @Override
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

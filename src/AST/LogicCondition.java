package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class LogicCondition extends Condition {
    private final Condition left;
    private final String operator;
    private final Condition right;
    public LogicCondition(int line,Condition left, String operator, Condition right) {
        super(line, "Logic Condition");
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
    public Condition getLeft() {
        return left;
    }
    public String getOperator() {
        return operator;
    }
    public Condition getRight() {
        return right;
    }

    @Override
    public String toString() {
        return super.toString() + "- ("+left + ") " + operator + " (" + right + ")";
    }
    @Override
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

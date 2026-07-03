package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CompareCondition extends Condition {
    private final String leftValue;
    private final String operator;
    private final String rightValue;
    public CompareCondition(int line,String leftValue,String operator, String rightValue) {
        super(line,"Compare Condition");
        this.leftValue = leftValue;
        this.operator = operator;
        this.rightValue = rightValue;
    }
    public String getLeftValue() {
        return leftValue;
    }
    public String getOperator() {
        return operator;
    }
    public String getRightValue() {
        return rightValue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ");
        stringBuilder.append(leftValue).append(" ");
        stringBuilder.append(operator).append(" ");
        stringBuilder.append(rightValue).append(" ");
        return stringBuilder.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

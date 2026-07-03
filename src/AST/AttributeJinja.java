package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class AttributeJinja extends AttributeValue {
    private final JinjaExpression expression;

    public AttributeJinja(int line, JinjaExpression expression) {
        super(line, "Jinja Value");
        this.expression = expression;
    }
    public JinjaExpression getText() {
        return expression;
    }

    @Override
    public String toString() {
        return super.name + "- \"" + expression.toString() + "\"";
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

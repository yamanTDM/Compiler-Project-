package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSAllSelector extends CSSSelector {

    public CSSAllSelector(int line) {
        super(line, "All Selector");
    }

    @Override
    public String toString() {
        return super.name + "- *";
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

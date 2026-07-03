package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSIDSelector extends CSSSelector{
    private final String name;
    public CSSIDSelector(int line,String name) {
        super(line,"ID Selector");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + "- #" + name;
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

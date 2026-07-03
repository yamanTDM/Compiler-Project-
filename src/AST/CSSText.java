package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSText extends CSSTerm{
    private final String text;
    public CSSText (int line,String text) {
        super(line, "CSS text");
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return super.name + "- "+ text;
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

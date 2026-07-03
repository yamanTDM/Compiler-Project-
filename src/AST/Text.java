package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class Text extends BodyNode{
    private final String text;
    public Text(int line,String text) {
        super(line,"Text");
        this.text = text.replaceAll("^['\"]|['\"]$", "");

    }

    @Override
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }

    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        return indent +super.name+ "- " + text + "\n";
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

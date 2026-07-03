package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSHex extends CSSTerm{
    private final String num;
    public CSSHex(int line, String num) {
        super(line, "CSS HEX");
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    @Override
    public String toString() {
        return super.name + "- #" + num;
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

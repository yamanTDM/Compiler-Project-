package AST;

import Visitor.ASTVisitorJinja;

public abstract class CSSNode extends BodyNode{
    public CSSNode(int line,String name) {
        super(line, name);
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

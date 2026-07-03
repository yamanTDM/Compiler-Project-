package AST;

import Visitor.ASTVisitorJinja;

public abstract class HTMLNode extends BodyNode{
    public HTMLNode(int line,String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

package AST;

import Visitor.ASTVisitorJinja;

public abstract class JinjaNode extends BodyNode{
    public JinjaNode(int line,String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

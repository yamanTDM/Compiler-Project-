package AST;

import Visitor.ASTVisitorJinja;

public abstract class BodyNode extends Node {
    public BodyNode(int line,String name)
    {
        super(line,name);
    }
    public String print(String indent){

        return "";
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

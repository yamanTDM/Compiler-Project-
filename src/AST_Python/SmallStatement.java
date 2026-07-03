package AST_Python;


import Visitor.ASTVisitor;

public abstract class SmallStatement extends Node {

    public SmallStatement(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

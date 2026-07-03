package AST_Python;


import Visitor.ASTVisitor;

public abstract class Statement extends Node {
    public Statement(int line, String name){
        super(line, name);
    }

    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

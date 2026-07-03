package AST_Python;

import Visitor.ASTVisitor;

public abstract class Expression extends Node{
    public Expression(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

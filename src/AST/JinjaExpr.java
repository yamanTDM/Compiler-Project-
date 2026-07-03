package AST;

import Visitor.ASTVisitorJinja;

public abstract class JinjaExpr extends Node{
    public JinjaExpr(int line, String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

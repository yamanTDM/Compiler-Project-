package AST;

import Visitor.ASTVisitorJinja;

public abstract class CSSTerm extends Node{
    public CSSTerm(int line, String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

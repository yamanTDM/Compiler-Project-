package AST;

import Visitor.ASTVisitorJinja;

public abstract class CSSSelector extends Node{
    public CSSSelector(int line, String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

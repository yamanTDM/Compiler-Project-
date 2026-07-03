package AST;

import Visitor.ASTVisitorJinja;

public abstract class CSSFunction extends CSSTerm{
    public CSSFunction(int line, String name) {
        super(line, name);
    }
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

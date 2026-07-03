package AST_Python.expressions;

import Visitor.ASTVisitor;

public abstract class Atom extends NumbericExpression {
    public Atom(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

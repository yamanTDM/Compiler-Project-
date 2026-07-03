package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

public abstract class NumbericExpression extends Expression {

    public NumbericExpression(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

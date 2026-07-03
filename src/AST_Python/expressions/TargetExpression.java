package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

public abstract class TargetExpression extends Expression {
    TargetExpression(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

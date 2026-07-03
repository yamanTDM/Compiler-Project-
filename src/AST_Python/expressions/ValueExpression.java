package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

public class ValueExpression extends Expression {
    public ValueExpression(int line, String name) {
        super(line, name);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

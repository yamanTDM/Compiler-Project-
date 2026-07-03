package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;
import Visitor.ASTVisitor;

public class CompareLessThanEqual extends Comparision {
    public CompareLessThanEqual(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Less than Equal Statement",leftExpression,rightExpression);
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

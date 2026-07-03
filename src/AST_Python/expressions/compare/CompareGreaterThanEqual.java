package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;
import Visitor.ASTVisitor;

public class CompareGreaterThanEqual extends Comparision {
    public CompareGreaterThanEqual(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Greater than Equal Statement",leftExpression,rightExpression);
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

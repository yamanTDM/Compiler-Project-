package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;
import Visitor.ASTVisitor;

public class CompareIn extends Comparision {
    public CompareIn(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare In Statement",leftExpression,rightExpression);
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

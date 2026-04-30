package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;

public class CompareIn extends Comparision {
    public CompareIn(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare In Statement",leftExpression,rightExpression);
    }
}

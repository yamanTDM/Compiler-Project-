package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;

public class CompareGreaterThan extends Comparision {
    public CompareGreaterThan(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Greater than Statement",leftExpression,rightExpression);
    }
}

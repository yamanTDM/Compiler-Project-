package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;

public class CompareNotEqual extends Comparision {
    public CompareNotEqual(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Not Equal Statement",leftExpression,rightExpression);
    }
}

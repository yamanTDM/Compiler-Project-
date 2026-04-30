package AST_Python.expressions.compare;

import AST_Python.CompoundStatement;
import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;

public class CompareEqual extends Comparision {
    public CompareEqual(int line, NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Equal Statement",leftExpression,rightExpression);
    }
}

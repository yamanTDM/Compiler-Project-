package AST_Python.expressions.compare;


import AST_Python.expressions.Comparision;
import AST_Python.expressions.NumbericExpression;

public class CompareNotIn extends Comparision {
    public CompareNotIn(int line,NumbericExpression leftExpression, NumbericExpression rightExpression) {
        super(line, "Compare Not In Statement",leftExpression,rightExpression);
    }
}

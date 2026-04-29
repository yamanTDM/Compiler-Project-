package AST_Python.small_statements;

import AST_Python.Expression;
import AST_Python.SmallStatement;

public class ReturnStatement extends SmallStatement {
    private final Expression expression;

    public ReturnStatement(int line, Expression expression) {
        super(line, "Return Statement");
        this.expression = expression;
    }
    public Expression getExpression() {
        return expression;
    }
}

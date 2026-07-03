package AST_Python.expressions.atoms;

import AST_Python.Expression;
import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class GroupingAtom extends Atom {
    private final Expression expression;
    public GroupingAtom(int line,Expression expression) {
        super(line,"Grouping Atom");
        this.expression = expression;
    }
    public Expression getExpression() {
        return expression;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(expression.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

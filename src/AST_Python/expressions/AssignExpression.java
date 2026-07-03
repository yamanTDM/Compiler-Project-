package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

public class AssignExpression extends Expression {
    private final String name;
    private final Expression value;
    public AssignExpression(int line,String name, Expression  value) {
        super(line,"Assign Expression");
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(indentation).append("name: ").append(name).append("\n");
        sb.append(value.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

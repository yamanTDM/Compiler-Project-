package AST_Python.expressions;

import AST_Python.Expression;

public class AccessSubscriptExpression extends NumbericExpression{
    private final NumbericExpression object;
    private final Expression index;

    public AccessSubscriptExpression(int line, NumbericExpression object, Expression index) {
        super(line,"Access Subscript Expression");
        this.object = object;
        this.index = index;
    }
    public NumbericExpression getObject() {
        return object;
    }
    public Expression getIndex() {
        return index;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(object.print(indentation)).append("\n");
        sb.append(index.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();

    }
}

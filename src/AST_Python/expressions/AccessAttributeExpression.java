package AST_Python.expressions;


public class AccessAttributeExpression extends NumbericExpression {
    private final NumbericExpression object;
    private final String name;

    public AccessAttributeExpression(int line, NumbericExpression object, String name) {
        super(line, "Assign Attribute Expression");
        this.object = object;
        this.name = name;
    }
    public NumbericExpression getObject() {
        return object;
    }
    public String getName() {
        return name;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(object.print(indentation)).append("\n");
        sb.append(indentation).append("attribute :").append(name).append("\n");
        sb.append(indent).append("}");
        return sb.toString();

    }
}

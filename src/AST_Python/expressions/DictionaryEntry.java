package AST_Python.expressions;

import AST_Python.Expression;
import AST_Python.Node;
import Visitor.ASTVisitor;

public class DictionaryEntry extends Node {
    private final Expression key;
    private final Expression value;
    public DictionaryEntry(int line,Expression key,Expression value) {
        super(line,"Dictionary Entry");
        this.key = key;
        this.value = value;
    }
    public Expression getKey() {
        return key;
    }
    public Expression getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(key.print(indentation)).append("\n");
        sb.append(value.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

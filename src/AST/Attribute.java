package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class Attribute extends Node{
    private final String name;
    private final AttributeValue value;

    public Attribute(int line,String name) {
        super(line, "Attribute");
        this.name = name;
        this.value = null;
    }
    public Attribute(int line,String name, AttributeValue value) {
        super(line, "Attribute");
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ").append(name);
        if(value != null){
            stringBuilder.append(" : ").append(value);
        }
        return stringBuilder.toString();

    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }

}

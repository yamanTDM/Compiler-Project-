package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HTMLSingleElement extends HTMLNode{
    private final String tag;
    private final List<Attribute> attributes;

    public HTMLSingleElement(int line,String tag) {
        super(line,"HTML Single Element");
        this.tag = tag;
        attributes = new ArrayList<Attribute>();
    }
    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    public void removeAttribute(Attribute attribute){
        attributes.remove(attribute);
    }


    public String getTag() {
        return tag;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("{\n");
        stringBuilder.append(indent).append("tag: ").append(tag).append("\n");
        if (!attributes.isEmpty()) {
            stringBuilder.append(indent).append("attributes: ").append("\n");
        }

        for (Attribute attribute : attributes) {
            stringBuilder.append(indent).append("\t").append(attribute).append(" \n");
        }

        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");

        return stringBuilder.toString();

    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }

}

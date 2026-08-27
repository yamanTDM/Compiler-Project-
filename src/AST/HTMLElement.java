package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends HTMLNode{
    private final String tag;
    private final String endTag;
    private final List<Attribute> attributes;
    private final List<BodyNode> children;

    public HTMLElement(int line,String tag,String endTag) {
        super(line,"HTML Element");
        this.tag = tag;
        this.endTag = endTag;
        attributes = new ArrayList<Attribute>();
        children = new ArrayList<>();
    }

    @Override
    public List<Node> getChildrenSearch() {
        return new ArrayList<>(children);
    }

    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    public void removeAttribute(Attribute attribute){
        attributes.remove(attribute);
    }
    public void addChild(BodyNode body){
        children.add(body);
    }
    public void removeChild(BodyNode body){
        children.remove(body);
    }

    public String getTag() {
        return tag;
    }
    public String getEndTag() {
        return endTag;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<BodyNode> getChildren() {
        return children;
    }

    @Override
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
        if (!children.isEmpty()) {
            stringBuilder.append(indent).append("body: ").append("\n");
        }
        String indentaion = indent + "\t";
        for (BodyNode bodyNode : children) {
            stringBuilder.append(bodyNode.print(indentaion));
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");

        return stringBuilder.toString();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

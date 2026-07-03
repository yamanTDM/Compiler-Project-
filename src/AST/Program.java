package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node{
    private final List<BodyNode> bodyNodes;
    public Program(int line) {
        super(line, "Program");
        this.bodyNodes = new ArrayList<BodyNode>();
    }
    public void addBodyNode(BodyNode bodyNode){
        this.bodyNodes.add(bodyNode);
    }
    public void removeBodyNode(BodyNode bodyNode){
        this.bodyNodes.remove(bodyNode);
    }
    public List<BodyNode> getBodyNodes(){
        return this.bodyNodes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append("{\n");
        for (BodyNode bodyNode : bodyNodes){
            stringBuilder.append(bodyNode.print("\t")).append("\n");
        }
        stringBuilder.append("\n}\n");
        return stringBuilder.toString();
    }

    @Override
    public List<Node> getChildrenSearch() {
        return new ArrayList<>(bodyNodes);
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

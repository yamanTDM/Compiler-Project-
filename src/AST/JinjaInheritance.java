package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class JinjaInheritance extends JinjaNode{
    private final String inheritance;
    private final List<BodyNode>  bodies;
    private final List<JinjaBlock> blocks;

    public JinjaInheritance(int line, String inheritance) {
        super(line, "Inheritance Jinja");
        this.inheritance = inheritance;
        this.blocks = new ArrayList<>();
        this.bodies = new ArrayList<>();
    }
    public void addBlock(JinjaBlock block) {
        this.blocks.add(block);
    }
    public void removeBlock(JinjaBlock block) {
        this.blocks.remove(block);
    }
    public void addBody(BodyNode body) {this.bodies.add(body);}
    public void removeBody(BodyNode body) {this.bodies.remove(body);}
    public String getInheritance() {
        return inheritance;
    }
    public List<JinjaBlock> getBlocks() {
        return blocks;
    }
    public List<BodyNode> getBodys() {return bodies;}

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("inheriting from ").append(inheritance).append("{\n");
        if (!bodies.isEmpty()) {
            stringBuilder.append(indent).append("body: ").append("\n");
        }
        String indentaion = indent + "\t";
        for (BodyNode bodyNode : bodies) {
            stringBuilder.append(bodyNode.print(indentaion));
        }
        stringBuilder.append(indent).append("Blocks: ").append("\n");
        for (JinjaBlock block : blocks) {
            stringBuilder.append(block.print(indentaion));
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }
    @Override
    public List<Node> getChildrenSearch() {
        List<Node> children = new ArrayList<>();
        children.addAll(bodies);
        children.addAll(blocks);
        return children;
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }

}

package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class JinjaBlock extends JinjaNode{
    private final JinjaSuperBlock superBlock;
    private final JinjaId name;
    private final List<BodyNode> bodies;

    public JinjaBlock(int line, JinjaId name,JinjaSuperBlock superBlock) {
        super(line, "Jinja Block");
        this.name = name;
        this.bodies = new ArrayList<>() ;
        this.superBlock = superBlock;
    }
    public JinjaBlock(int line, JinjaId name) {
        super(line, "Jinja Block");
        this.name = name;
        this.bodies = new ArrayList<>();
        this.superBlock = null;
    }
    public void addBody(BodyNode body) {
        this.bodies.add(body);
    }
    public void removeBody(BodyNode body) {
        this.bodies.remove(body);
    }
    public JinjaId getName() {
        return name;
    }
    public List<BodyNode> getBodys() {
        return bodies;
    }
    public JinjaSuperBlock getSuperBlock() {
        return superBlock;
    }

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append(" name: ").append(name.getFullName()).append("{\n");
        if (superBlock != null) {
            stringBuilder.append(indent).append("super()").append("\n");
        }
        String indentaion = indent + "\t";
        if (!bodies.isEmpty()){
            stringBuilder.append(indent).append("body:").append("\n");
        }
        for (BodyNode body : bodies) {
            stringBuilder.append(body.print(indentaion));
        }
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }

    @Override
    public List<Node> getChildrenSearch() {
        return new ArrayList<>(bodies);
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

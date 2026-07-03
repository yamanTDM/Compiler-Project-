package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class JinjaIf extends JinjaNode{
    private final Condition condition;
    private final BodyNode ifBody;
    private final List<JinjaElif> elifs;
    private final BodyNode elseBody;
    public JinjaIf(int line,Condition condition, BodyNode ifBody, BodyNode elseBody) {
        super(line, "Jinja If Statement");
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.elifs = new ArrayList<>();
    }
    public void addElif(JinjaElif elif){
        this.elifs.add(elif);
    }
    public void removeElif(JinjaElif elif){
        this.elifs.remove(elif);
    }
    public List<JinjaElif> getElifs() {
        return elifs;
    }
    public Condition getCondition() {
        return condition;
    }
    public BodyNode getIfBody() {
        return ifBody;

    }
    public BodyNode getElseBody() {
        return elseBody;
    }

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("{\n");
        stringBuilder.append(indent).append("IF Condition: ").append(condition).append("\n");
        String indentation = indent + "\t";
        if(ifBody != null){
            stringBuilder.append(indent).append("IF Body: ").append("\n");
            stringBuilder.append(ifBody.print(indentation));
        }
        if (elifs != null && !elifs.isEmpty()) {
            for (JinjaElif elif : elifs) {
                stringBuilder.append(elif.print(indent)).append("\n");
            }
        }
        if(elseBody != null){
            stringBuilder.append(indent).append("Else Body: ").append("\n");
            stringBuilder.append(elseBody.print(indentation));
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }
    @Override
    public List<Node> getChildrenSearch() {
        List<Node> children = new ArrayList<>();
        if (ifBody != null) {
            children.add(ifBody);
        }
        children.addAll(elifs);
        if (elseBody != null) {
            children.add(elseBody);
        }
        return children;
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

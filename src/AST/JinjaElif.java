package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.List;

public class JinjaElif extends Node {
    private final Condition condition;
    private final BodyNode body;

    public JinjaElif(int line,Condition condition, BodyNode body ) {
        super(line, "Elif Statement");
        this.condition = condition;
        this.body = body;
    }
    public Condition getCondition() {
        return condition;
    }
    public BodyNode getBody() {
        return body;
    }


    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append("ElseIF Condition: ").append(condition).append("\n");
        String indentation = indent + "\t";
        if(body != null){
            stringBuilder.append(indent).append("ElseIF Body: ").append("\n");
            stringBuilder.append(body.print(indentation));
        }

        stringBuilder.append(indent).append("\n");
        return stringBuilder.toString();
    }

    @Override
    public List<Node> getChildrenSearch() {
        List<Node> children = new ArrayList<>();
        children.add(body);
        return children;
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

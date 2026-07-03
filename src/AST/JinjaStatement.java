package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JinjaStatement extends JinjaNode {
    private  final List<JinjaExpr> body;
    public JinjaStatement(int line) {
        super(line,"Jinja Statement");
        this.body = new ArrayList<JinjaExpr>();
    }
    public List<JinjaExpr> getText() {
        return body;
    }

    public void addText(JinjaExpr text) {
        this.body.add(text);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent + super.toString());
        for (JinjaExpr part : body) {
            sb.append(part.toString());
        }
        sb.append("\n");

        return sb.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

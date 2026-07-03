package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JinjaExpression extends JinjaNode{
    private final List<JinjaExpr> expressions;

    public JinjaExpression(int line) {
        super(line, "Jinja Expression");
        this.expressions = new ArrayList<>();
    }
    public List<JinjaExpr> getText() {
        return expressions;
    }
    public void addExpr(JinjaExpr expr){
        expressions.add(expr);
    }
    public void removeExpr(JinjaExpr expr){
        expressions.remove(expr);
    }

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("- ").append("{\n");
        if (!expressions.isEmpty()){
            stringBuilder.append(indent).append("expressions: ").append("\n");
        }
        String indentation = indent + "\t";
        for (JinjaExpr expr : expressions) {
            stringBuilder.append(indentation).append(expr.toString()).append("\n");
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ");

        for (JinjaExpr expr : expressions) {
            stringBuilder.append(expr.toString()).append(" ");
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

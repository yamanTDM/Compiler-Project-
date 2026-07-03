package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JinjaFunction extends JinjaExpr {
    private final JinjaId name;
    private final List<JinjaExpr> arguments;
    public JinjaFunction(int line,JinjaId name) {
        super(line,"Jinja Function");
        this.name = name;
        this.arguments = new ArrayList<>();
    }
    public void addArgument(JinjaExpr argument){
        this.arguments.add(argument);
    }
    public void removeArgument(JinjaExpr argument){
        this.arguments.remove(argument);
    }

    public JinjaId getName() {
        return name;
    }

    public List<JinjaExpr> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ");
        stringBuilder.append(name.getFullName()).append("(");
        for (JinjaExpr argument : arguments) {
            stringBuilder.append(argument.toString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

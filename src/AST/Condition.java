package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public abstract class Condition extends Node{
    public Condition(int line, String name) {
        super(line, name);
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

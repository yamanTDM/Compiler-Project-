package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class JinjaSuperBlock extends Node{
    public JinjaSuperBlock(int line) {
        super(line, "Jinja Super Block");
    }
    @Override
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

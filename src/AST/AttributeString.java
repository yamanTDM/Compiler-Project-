package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class AttributeString extends AttributeValue{
    private final String value;
    public AttributeString(int line, String value){
        super(line,"String Value");
        this.value = value.replaceAll("^['\"]|['\"]$", "");
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.name + "- \"" + value + "\"";
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSNumber extends CSSTerm {
    Double value;
    String unit;
    public CSSNumber(int line,Double value, String unit) {
        super(line,"CSS Number");
        this.value = value;
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return super.name + "- " + value + " " + (unit != null ? unit : "") + " ";
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

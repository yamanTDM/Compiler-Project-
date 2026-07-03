package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSRotateFunction extends CSSFunction {
    private final double angle;
    private final String unit;

    public CSSRotateFunction(int line, double angle, String unit) {
        super(line, "Rotate Function");
        this.angle = angle;
        this.unit = unit;
    }

    public double getAngle() { return angle; }
    public String getUnit() { return unit; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name + "- rotate( ");
        stringBuilder.append(angle);
        if (unit != null) {
            stringBuilder.append(unit);
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

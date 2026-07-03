package AST;

import Visitor.ASTVisitorJinja;

import java.util.Collections;
import java.util.List;

public class CSSScaleFunction extends CSSFunction {
    private final Double x, y;
    private final String unitX, unitY;

    private final boolean isFull;

    public CSSScaleFunction(int line, double value,String unit, boolean isX) {
        super(line, isX ? "ScaleX Function" : "ScaleY Function");
        if(isX) { this.x = value; this.unitX = unit; this.y = null; this.unitY = null; }
        else { this.y = value; this.unitY = unit; this.x = null; this.unitX = null; }
        this.isFull = false;
    }

    public CSSScaleFunction(int line, Double x, String unitX, Double y, String unitY) {
        super(line, "ScaleFull Function");
        this.x = x; this.unitX = unitX;
        this.y = y; this.unitY = unitY;
        this.isFull = true;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public boolean isFull() { return isFull; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- scale");
        if(x ==null) stringBuilder.append("X");
        if(y ==null) stringBuilder.append("Y");
        stringBuilder.append("( ");
        if (x != null) {
            stringBuilder.append(x);
            if(unitX != null) stringBuilder.append(unitX);
        }
        if (isFull)  stringBuilder.append(" , ");
        if (y != null) {
            stringBuilder.append(y);
            if(unitY != null) stringBuilder.append(unitY);
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

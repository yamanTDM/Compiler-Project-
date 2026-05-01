package AST;

public class CSSHSLFunction extends CSSFunction {
    private final double h, s, l;
    private final String unitH, unitS, unitL; // optional units

    public CSSHSLFunction(int line, double h, String unitH,
                           double s, String unitS,
                           double l, String unitL) {
        super(line, "HSL Function");
        this.h = h; this.unitH = unitH;
        this.s = s; this.unitS = unitS;
        this.l = l; this.unitL = unitL;
    }

    public double getH() { return h; }
    public double getS() { return s; }
    public double getL() { return l; }
    public String getUnitH() { return unitH; }
    public String getUnitS() { return unitS; }
    public String getUnitL() { return unitL; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- hsl");
        stringBuilder.append("(");
        stringBuilder.append(h);
        if (unitH != null) {
            stringBuilder.append(unitH);
        }
        stringBuilder.append(", ");
        stringBuilder.append(s);
        if (unitS != null) {
            stringBuilder.append(unitS);
        }
        stringBuilder.append(", ");
        stringBuilder.append(l);
        if (unitL != null) {
            stringBuilder.append(unitL);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();

    }
}

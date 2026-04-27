package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaCombine extends JinjaExpr {
    private final List<JinjaExpr> parts;

    public JinjaCombine(int line) {
        super(line, "Jinja Combine");
        this.parts = new ArrayList<JinjaExpr>();
    }

    public void addPart(JinjaExpr part) {
        parts.add(part);
    }

    public List<JinjaExpr> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.name).append("- ");
        for (int i = 0; i < parts.size(); i++) {
            sb.append(parts.get(i).toString());
            if (i < parts.size() - 1) sb.append(" ~ ");
        }
        return sb.toString();
    }
}
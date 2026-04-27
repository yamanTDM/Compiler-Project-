package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaId extends JinjaExpr {
    private final List<String> parts;

    public JinjaId(int line) {
        super(line, "Jinja ID");
        this.parts = new ArrayList<>();
    }

    public List<String> getParts() {
        return parts;
    }
    public void addPart(String part) {
        this.parts.add(part);
    }

    public String getFirst(){
        return parts.getFirst();
    }


    public String getFullName() {
        return String.join(".", parts);
    }

    @Override
    public String toString() {
        return super.name + "- " + getFullName() + " ";
    }
}
package AST;

public class JinjaAssign extends JinjaExpr{
    private final JinjaId name;
    private final JinjaExpr value;
    public JinjaAssign(int line, JinjaId name, JinjaExpr value) {
        super(line, "Jinja Assign");
        this.name = name;
        this.value = value;
    }

    public JinjaExpr getValue() {
        return value;
    }

    public JinjaId getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.name+ "- "+  name.toString()+" = "+value.toString() + " ";
    }
}

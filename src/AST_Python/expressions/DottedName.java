package AST_Python.expressions;

import AST2.Expr;
import AST_Python.Expression;

import java.util.ArrayList;
import java.util.List;

public class DottedName extends Expression {
    private final List<String> names;

    public DottedName(int line) {
        super(line, "Dotted Name");
        names = new ArrayList<>();
    }
    public void addName(String name) {
        names.add(name);
    }
    public void removeName(String name) {
        names.remove(name);
    }
    public List<String> getNames() {
        return names;
    }

}

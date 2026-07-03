package AST_Python.expressions;

import AST_Python.Expression;
import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
    public String fullName() {
        StringJoiner joiner = new StringJoiner(".");
        for (String name : names) {
            joiner.add(name);
        }
        return joiner.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

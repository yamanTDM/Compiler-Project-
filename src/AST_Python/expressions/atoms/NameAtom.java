package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class NameAtom extends Atom {
    private final String name;

    public NameAtom(int line, String name) {
        super(line, "Name Atom");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;

public class NameAtom extends Atom {
    private final String name;

    public NameAtom(int line, String name) {
        super(line, "String Atom");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

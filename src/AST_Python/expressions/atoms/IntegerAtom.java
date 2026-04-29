package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;

public class IntegerAtom extends Atom {
    private final int value;

    public IntegerAtom(int line,int value) {
        super(line,"Integer Atom");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;

public class StringAtom extends Atom {
    private final String value;
    public StringAtom(int line,String value) {
        super(line,"String Atom");
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}

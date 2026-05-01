package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;

public class NoneAtom extends Atom {
    public NoneAtom(int line) {
        super(line, "None Atom");
    }
}

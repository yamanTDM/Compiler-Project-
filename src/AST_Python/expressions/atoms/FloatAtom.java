package AST_Python.expressions.atoms;


import AST_Python.expressions.Atom;

public class FloatAtom extends Atom {
    private final float value;
    public FloatAtom(int line,float value) {
        super(line, "Float Atom");
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}

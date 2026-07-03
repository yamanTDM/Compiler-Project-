package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class IntegerAtom extends Atom {
    private final int value;

    public IntegerAtom(int line,int value) {
        super(line,"Integer Atom");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

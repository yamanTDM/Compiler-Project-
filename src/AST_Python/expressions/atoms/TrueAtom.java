package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class TrueAtom extends Atom {
    public TrueAtom(int line) {
        super(line, "True Atom");

    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

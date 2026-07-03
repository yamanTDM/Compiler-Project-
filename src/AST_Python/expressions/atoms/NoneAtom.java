package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class NoneAtom extends Atom {
    public NoneAtom(int line) {
        super(line, "None Atom");
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

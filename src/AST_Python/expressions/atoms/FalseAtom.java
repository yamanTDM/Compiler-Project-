package AST_Python.expressions.atoms;


import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class FalseAtom extends Atom {

    public FalseAtom(int line) {
        super(line, "False Atom");
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

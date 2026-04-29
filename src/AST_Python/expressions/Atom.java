package AST_Python.expressions;

public abstract class Atom extends NumbericExpression {
    public Atom(int line, String name) {
        super(line, name);
    }
}

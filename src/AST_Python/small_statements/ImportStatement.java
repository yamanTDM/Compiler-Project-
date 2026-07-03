package AST_Python.small_statements;

import AST_Python.SmallStatement;
import Visitor.ASTVisitor;

public abstract class ImportStatement extends SmallStatement {
    public ImportStatement(int line, String name) {
        super(line, name);
    }
    @Override
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

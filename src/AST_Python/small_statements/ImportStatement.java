package AST_Python.small_statements;

import AST_Python.SmallStatement;

public abstract class ImportStatement extends SmallStatement {
    public ImportStatement(int line, String name) {
        super(line, name);
    }
}

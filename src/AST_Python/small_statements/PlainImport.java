package AST_Python.small_statements;

import AST_Python.expressions.DottedName;
import Visitor.ASTVisitor;

public class PlainImport extends ImportStatement {
    private final DottedName module;


    public PlainImport(int line, DottedName module) {
        super(line, "Plain Import");
        this.module = module;
    }

    public DottedName getModule() {
        return module;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentaion = indent + "\t";
        sb.append(module.print(indentaion)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

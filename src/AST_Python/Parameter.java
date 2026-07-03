package AST_Python;

import Visitor.ASTVisitor;

public class Parameter extends Node{
    private final String parameter;

    public Parameter(int line, String parameter) {
        super(line, "Parameter");
        this.parameter = parameter;
    }
    public String getParameter() {
        return parameter;
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }

}

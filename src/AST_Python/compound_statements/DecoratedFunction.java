package AST_Python.compound_statements;

import AST_Python.CompoundStatement;
import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DecoratedFunction extends CompoundStatement {
    private final List<Decorator> decorators;
    private final FunctionStatement functionStatement;

    public DecoratedFunction(int line, FunctionStatement functionStatement) {
        super(line, "Decorated Function");
        this.decorators = new ArrayList<>();
        this.functionStatement = functionStatement;
    }
    public void addDecorator(Decorator decorator) {
        decorators.add(decorator);
    }
    public List<Decorator> getDecorators() {
        return decorators;
    }
    public FunctionStatement getFunctionStatement() {
        return functionStatement;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for (Decorator decorator : decorators) {
            sb.append(decorator.print(indentation)).append("\n");
        }
        sb.append(functionStatement.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

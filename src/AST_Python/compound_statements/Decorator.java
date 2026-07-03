package AST_Python.compound_statements;

import AST_Python.Expression;
import AST_Python.Node;
import AST_Python.expressions.DottedName;
import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Decorator extends Node {
    private final DottedName name;
    private final List<Expression> arguments;

    public Decorator(int line, DottedName name) {
        super(line, "Decorator");
        this.name = name;
        this.arguments = new ArrayList<>();
    }
    public void addArgument(Expression argument) {
        this.arguments.add(argument);
    }
    public void removeArgument(Expression argument) {
        this.arguments.remove(argument);
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public DottedName getName() {
        return name;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(name.print(indentation)).append("\n");
        for (Expression argument : arguments) {
            sb.append(argument.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }



}

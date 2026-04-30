package AST_Python;

import java.util.ArrayList;
import java.util.List;

public class Body extends Node{
    private final List<Statement> statements;

    public Body(int line) {
        super(line, "Body");
        this.statements = new ArrayList<>();
    }
    public void addStatement(Statement statement){
        statements.add(statement);
    }
    public void removeStatement(Statement statement){
        statements.remove(statement);
    }
    public List<Statement> getStatements(){
        return statements;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentaion = indent + "\t";
        for (Statement statement : statements) {
            sb.append(statement.print(indentaion)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

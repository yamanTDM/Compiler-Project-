package AST_Python;

import Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    List<Statement> statements;
    public Program(int line){
        super(line, "Program");
        this.statements = new ArrayList<>();
    }
    public void addStatement(Statement statement){
        this.statements.add(statement);
    }
    public void removeStatement(Statement statement){
        this.statements.remove(statement);
    }
    public List<Statement> getStatements(){
        return this.statements;
    }

    public String print(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for(Statement statement : this.statements){
            sb.append(statement.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}
package AST_Python;


import java.util.ArrayList;
import java.util.List;

public class SimpleStatement extends Statement {
    private final SmallStatement statement;

    public SimpleStatement(int line, SmallStatement statement) {
        super(line, "Simple Statement");
        this.statement = statement;
    }

    public SmallStatement getStatement() {
        return statement;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append(" {\n");
        String indentation = indent + "\t";
        sb.append(statement.print(indentation)).append("\n");
        sb.append(indent).append("}");
        return sb.toString();

    }
}
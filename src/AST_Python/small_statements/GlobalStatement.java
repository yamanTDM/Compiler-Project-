package AST_Python.small_statements;


import AST_Python.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class GlobalStatement extends SmallStatement {
    private final List<String> variables;

    public GlobalStatement(int line) {
        super(line, "Global Statement");
        variables = new ArrayList<>();
    }
    public void addVariable(String variable) {
        variables.add(variable);
    }
    public void removeVariable(String variable) {
        variables.remove(variable);
    }
    public List<String> getVariables() {
        return variables;
    }

}

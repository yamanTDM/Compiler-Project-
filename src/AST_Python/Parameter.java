package AST_Python;

public class Parameter extends Node{
    private final String parameter;

    public Parameter(int line, String parameter) {
        super(line, "Parameter");
        this.parameter = parameter;
    }
    public String getParameter() {
        return parameter;
    }
}

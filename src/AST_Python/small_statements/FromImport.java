package AST_Python.small_statements;

import AST_Python.expressions.DottedName;

import java.util.ArrayList;
import java.util.List;

public class FromImport extends ImportStatement{
    private final DottedName module;
    private final List<String> attribute;

    public FromImport(int line, DottedName module) {
        super(line, "From Import");
        this.module = module;
        this.attribute = new ArrayList<>();
    }
    public void addAttribute(String attribute) {
        this.attribute.add(attribute);
    }
    public void removeAttribute(String attribute) {
        this.attribute.remove(attribute);
    }
    public DottedName getModule() {
        return module;
    }
    public List<String> getAttribute() {
        return attribute;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(indent).append("Module:");
        sb.append(module.print(indentation)).append("\n");
        sb.append(indent).append("Attribute: {\n");
        for (String attribute : attribute) {
            sb.append(indentation).append(attribute).append("\n");
        }
        sb.append(indent).append("}\n");
        return sb.toString();
    }
}

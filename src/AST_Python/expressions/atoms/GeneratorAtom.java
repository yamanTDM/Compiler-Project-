package AST_Python.expressions.atoms;

import AST_Python.Expression;
import AST_Python.expressions.Atom;
import Visitor.ASTVisitor;

public class GeneratorAtom extends Atom {
    private final Expression output;
    private final String name;
    private final Expression list;
    private final Expression condition;

    public GeneratorAtom(int line,Expression output, String name, Expression list, Expression condition) {
        super(line,"Generator Atom");
        this.output = output;
        this.name = name;
        this.list = list;
        this.condition = condition;
    }
    public Expression getOutput() {
        return output;
    }
    public String getName() {
        return name;
    }
    public Expression getList() {
        return list;
    }
    public Expression getCondition() {
        return condition;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        sb.append(output.print(indentation)).append("\n");
        sb.append(indentation).append("name: ").append(name).append("\n");
        sb.append(list.print(indentation)).append("\n");
        if (condition != null) {
            sb.append(condition.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {

        return visitor.visit(this);

    }
}

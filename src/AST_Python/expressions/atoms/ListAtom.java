package AST_Python.expressions.atoms;

import AST_Python.Expression;
import AST_Python.expressions.Atom;

import java.util.ArrayList;
import java.util.List;

public class ListAtom extends Atom {
    private final List<Expression> items;

    public ListAtom(int line) {
        super(line, "List Atom");
        items = new ArrayList<>();
    }
    public void addItem(Expression item) {
        items.add(item);
    }
    public List<Expression> getItems() {
        return items;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for (Expression item : items) {
            sb.append(item.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

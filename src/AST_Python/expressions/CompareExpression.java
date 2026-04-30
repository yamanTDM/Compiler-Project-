package AST_Python.expressions;

import AST_Python.Expression;

import java.util.ArrayList;
import java.util.List;

public class CompareExpression extends Expression {
    private final List<Comparision> comparisons;

    public CompareExpression(int line) {
        super(line, "Compare Expression");
        comparisons = new ArrayList<Comparision>();
    }
    public void addComparison(Comparision comparison) {
        comparisons.add(comparison);
    }

    public List<Comparision> getComparisons() {
        return comparisons;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for (Comparision comparison : comparisons) {
            sb.append(comparison.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

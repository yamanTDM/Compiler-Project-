package AST_Python.expressions.atoms;

import AST_Python.expressions.Atom;
import AST_Python.expressions.DictionaryEntry;

import java.util.ArrayList;
import java.util.List;

public class DictionaryAtom extends Atom {
    private final List<DictionaryEntry> entries;

    public DictionaryAtom(int line) {
        super(line, "Dictionary Atom");
        entries = new ArrayList<DictionaryEntry>();
    }
    public void addEntry(DictionaryEntry entry) {
        entries.add(entry);
    }
    public List<DictionaryEntry> getEntries() {
        return entries;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        for (DictionaryEntry entry : entries) {
            sb.append(entry.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

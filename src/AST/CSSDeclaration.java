package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSSDeclaration extends Node{
    private final String name;
    private final List<CSSTerm> terms;
    // Parallel to `terms`: true if this term was preceded by a real comma in
    // the source, false if just whitespace-adjacent (e.g. box-shadow's
    // "0 4px 12px hsl(...)"). Index 0 is always false/unused.
    private final List<Boolean> commaBeforeTerm;


    public CSSDeclaration(int line, String name) {
        super(line, "CSS Declaration");
        this.name = name;
        this.terms = new ArrayList<>();
        this.commaBeforeTerm = new ArrayList<>();
    }
    public void addTerm(CSSTerm term){
        this.terms.add(term);
        this.commaBeforeTerm.add(false);
    }
    public void addTerm(CSSTerm term, boolean commaBefore){
        this.terms.add(term);
        this.commaBeforeTerm.add(commaBefore);
    }
    public boolean isCommaBefore(int index){
        return index < commaBeforeTerm.size() && commaBeforeTerm.get(index);
    }
    public void removeTerm(CSSTerm term){
        int idx = this.terms.indexOf(term);
        this.terms.remove(term);
        if (idx >= 0 && idx < commaBeforeTerm.size()) commaBeforeTerm.remove(idx);
    }
    public String getName() {
        return name;
    }
    public List<CSSTerm> getTerms() {
        return terms;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append("- ").append(name).append(" : ");
        for (CSSTerm term : terms) {
            stringBuilder.append(term.toString()).append(" ");
        }
        return stringBuilder.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

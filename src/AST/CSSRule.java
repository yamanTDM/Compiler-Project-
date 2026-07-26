package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSSRule extends Node{
    private final List<CSSSelector> selectors;
    private final List<CSSDeclaration> declarations;
    // Parallel to `selectors`: true if this selector was preceded by a real
    // comma in the source (start of a new grouped selector), false if it's
    // adjacent to the previous one with only whitespace (descendant combinator,
    // e.g. "nav a"). Index 0 is always false/unused.
    private final List<Boolean> commaBeforeSelector;
    public CSSRule(int line) {
        super(line, "CSS Rule");
        this.selectors = new ArrayList<>();
        this.declarations = new ArrayList<>();
        this.commaBeforeSelector = new ArrayList<>();
    }
    public void addSelector(CSSSelector selector){
        this.selectors.add(selector);
        this.commaBeforeSelector.add(this.selectors.size() == 1); // fallback: treat 1st as new group
    }
    public void addSelector(CSSSelector selector, boolean commaBefore){
        this.selectors.add(selector);
        this.commaBeforeSelector.add(commaBefore);
    }
    public boolean isCommaBefore(int index){
        return index < commaBeforeSelector.size() && commaBeforeSelector.get(index);
    }
    public void addDeclaration(CSSDeclaration declaration){
        this.declarations.add(declaration);
    }
    public void removeSelector(CSSSelector selector){
        int idx = this.selectors.indexOf(selector);
        this.selectors.remove(selector);
        if (idx >= 0 && idx < commaBeforeSelector.size()) commaBeforeSelector.remove(idx);
    }
    public void removeDeclaration(CSSDeclaration declaration){
        this.declarations.remove(declaration);
    }
    public List<CSSSelector> getSelectors(){
        return selectors;
    }
    public List<CSSDeclaration> getDeclarations(){
        return declarations;
    }

    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("{\n");
        String indentation = indent + "\t";
        for (CSSSelector selector : selectors) {
            stringBuilder.append(indentation).append(selector.toString()).append("\n");
        }
        for (CSSDeclaration declaration : declarations) {
            stringBuilder.append(indentation).append(declaration.toString()).append("\n");
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }
    public List<Node> getChildrenSearch() {
        return Collections.emptyList();
    }
    public <T> T accept(ASTVisitorJinja<T> visitor) {

        return visitor.visit(this);

    }
}

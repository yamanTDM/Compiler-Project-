package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSSRule extends Node{
    private final List<CSSSelector> selectors;
    private final List<CSSDeclaration> declarations;
    public CSSRule(int line) {
        super(line, "CSS Rule");
        this.selectors = new ArrayList<>();
        this.declarations = new ArrayList<>();
    }
    public void addSelector(CSSSelector selector){
        this.selectors.add(selector);
    }
    public void addDeclaration(CSSDeclaration declaration){
        this.declarations.add(declaration);
    }
    public void removeSelector(CSSSelector selector){
        this.selectors.remove(selector);
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

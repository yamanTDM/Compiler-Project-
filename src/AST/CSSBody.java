package AST;

import Visitor.ASTVisitorJinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSSBody extends CSSNode{
    private final List<CSSRule> cssRules;

    public CSSBody(int line) {
        super(line, "CSS Body");
        this.cssRules = new ArrayList<>();
    }
    public void addCSSRule(CSSRule cssRule){
        cssRules.add(cssRule);
    }
    public void removeCSSRule(CSSRule cssRule){
        cssRules.remove(cssRule);
    }
    public List<CSSRule> getCssRules(){
        return cssRules;
    }

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("{\n");
        String indentation = indent + "\t";
        for (CSSRule cssRule : cssRules) {
            stringBuilder.append(cssRule.print(indentation));
        }
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

package Visitor;

import AST.*;

public interface ASTVisitorJinja<T> {

    T visit(Attribute node);
    T visit(AttributeJinja node);
    T visit(AttributeString node);
    T visit(AttributeValue node);
    T visit(BodyNode node);
    T visit(CompareCondition node);
    T visit(Condition node);
    T visit(CSSAllSelector node);
    T visit(CSSBody node);
    T visit(CSSCalcFunction node);
    T visit(CSSClassSelector node);
    T visit(CSSDeclaration node);
    T visit(CSSFunction node);
    T visit(CSSHex node);
    T visit(CSSHSLFunction node);
    T visit(CSSIDSelector node);
    T visit(CSSNode node);
    T visit(CSSNormalSelector node);
    T visit(CSSNumber node);
    T visit(CSSRotateFunction node);
    T visit(CSSRule node);
    T visit(CSSScaleFunction node);
    T visit(CSSSelector node);
    T visit(CSSTerm node);
    T visit(CSSText node);
    T visit(CSSTranslateFunction node);
    T visit(HTMLElement node);
    T visit(HTMLNode node);
    T visit(HTMLSingleElement node);
    T visit(JinjaAssign node);
    T visit(JinjaBlock node);
    T visit(JinjaCombine node);
    T visit(JinjaElif node);
    T visit(JinjaExpr node);
    T visit(JinjaExpression node);
    T visit(JinjaFor node);
    T visit(JinjaFunction node);
    T visit(JinjaId node);
    T visit(JinjaIf node);
    T visit(JinjaInheritance node);
    T visit(JinjaNode node);
    T visit(JinjaStatement node);
    T visit(JinjaSuperBlock node);
    T visit(JinjaText Node);
    T visit(LogicCondition node);
    T visit(Node node);
    T visit(NotCondition node);
    T visit(Program node);
    T visit(Text node);
    T visit(VariableCondition node);
}

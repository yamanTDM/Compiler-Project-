package Visitor;

import AST.*;
import SymbolTable.*;
import SymbolTable.SymbolKind;

import java.util.ArrayList;
import java.util.List;

public class JinjaSymbolTableBuilder implements ASTVisitorJinja<Void> {
    private final SymbolTable symbolTable = new SymbolTable();
    private final List<Symbol> pythonSymbols;

    public JinjaSymbolTableBuilder(List<Symbol> pythonSymbols) {
        this.pythonSymbols = pythonSymbols;
        if (pythonSymbols != null) {
            for (Symbol sym : pythonSymbols) {
                symbolTable.defineInGlobal(sym.getName(), sym.getType(), sym.getValue(),
                        sym.getKind(), sym.getLine(), true);
            }
        }
    }
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visit(Program node) {
        for (BodyNode bodyNode : node.getBodyNodes()) {
            bodyNode.accept(this);
        }
        return null;
    }


    @Override
    public Void visit(HTMLElement node) {
        for (Attribute attribute : node.getAttributes()) {
            attribute.accept(this);
        }
        for (BodyNode child : node.getChildren()) {
            if(child instanceof JinjaFor){
            }
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(HTMLSingleElement node) {
        for (Attribute attribute : node.getAttributes()) {
            attribute.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Attribute node) {

        return null;
    }

    @Override
    public Void visit(AttributeJinja node) {
        node.getText().accept(this);
        return null;
    }

    @Override
    public Void visit(AttributeString node) {
        return null;
    }

    @Override
    public Void visit(AttributeValue node) {
        return null;
    }

    @Override
    public Void visit(JinjaExpression node) {
        for (JinjaExpr expr : node.getText()) {
            expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaFunction node) {
        node.getName().accept(this);
        for (JinjaExpr argument : node.getArguments()) {
            argument.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaAssign node) {
        node.getValue().accept(this);
        symbolTable.define(node.getName().getFullName(), null, null, SymbolKind.VARIABLE, node.getLine(), false);
        return null;
    }

    @Override
    public Void visit(JinjaCombine node) {
        for (JinjaExpr part : node.getParts()) {
            part.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaStatement node) {
        for (JinjaExpr part : node.getText()) {
            part.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaId node) {

        return null;
    }

    @Override
    public Void visit(JinjaText node) {
        return null; // leaf, literal string
    }

    @Override
    public Void visit(Text node) {
        return null; // leaf, literal HTML text
    }

    @Override
    public Void visit(JinjaSuperBlock node) {
        return null;
    }


    @Override
    public Void visit(JinjaBlock node) {

        for (BodyNode body : node.getBodys()) {
            body.accept(this);
        }
        if (node.getSuperBlock() != null) {
            node.getSuperBlock().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaInheritance node) {
        for (BodyNode body : node.getBodys()) {
            body.accept(this);
        }
        for (JinjaBlock block : node.getBlocks()) {
            block.accept(this);
        }
        return null;
    }


    @Override
    public Void visit(JinjaIf node) {
        node.getCondition().accept(this);
        if (node.getIfBody() != null) {
            node.getIfBody().accept(this);
        }
        for (JinjaElif elif : node.getElifs()) {
            elif.accept(this);
        }
        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(JinjaElif node) {
        node.getCondition().accept(this);
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        return null;
    }



    @Override
    public Void visit(Condition node) {
        return null;
    }

    @Override
    public Void visit(CompareCondition node) {
        return null;
    }

    @Override
    public Void visit(LogicCondition node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        return null;
    }

    @Override
    public Void visit(NotCondition node) {
        node.getCondition().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableCondition node) {
        return null;
    }


    @Override
    public Void visit(JinjaFor node) {

        node.getCollectionName().accept(this);
        if (node.getFilterCondition() != null) {
            node.getFilterCondition().accept(this);
        }
        symbolTable.enterScope("for@" + node.getLine());
        symbolTable.define(
                node.getItemName().getFullName(),
                null, null,
                SymbolKind.LOOP_VAR,
                node.getLine(),
                false
        );
        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        symbolTable.exitScope();


        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }


    @Override public Void visit(CSSAllSelector node)       { return null; }
    @Override public Void visit(CSSBody node)               { return null; }
    @Override public Void visit(CSSCalcFunction node)       { return null; }
    @Override public Void visit(CSSClassSelector node)      { return null; }
    @Override public Void visit(CSSDeclaration node)        { return null; }
    @Override public Void visit(CSSFunction node)           { return null; }
    @Override public Void visit(CSSHex node)                 { return null; }
    @Override public Void visit(CSSHSLFunction node)         { return null; }
    @Override public Void visit(CSSIDSelector node)          { return null; }
    @Override public Void visit(CSSNode node)                { return null; }
    @Override public Void visit(CSSNormalSelector node)      { return null; }
    @Override public Void visit(CSSNumber node)               { return null; }
    @Override public Void visit(CSSRotateFunction node)       { return null; }
    @Override public Void visit(CSSRule node)                 { return null; }
    @Override public Void visit(CSSScaleFunction node)        { return null; }
    @Override public Void visit(CSSSelector node)             { return null; }
    @Override public Void visit(CSSTerm node)                 { return null; }
    @Override public Void visit(CSSText node)                 { return null; }
    @Override public Void visit(CSSTranslateFunction node)    { return null; }


    @Override public Void visit(BodyNode node)  { return null; }
    @Override public Void visit(HTMLNode node)  { return null; }
    @Override public Void visit(JinjaExpr node) { return null; }
    @Override public Void visit(JinjaNode node) { return null; }
    @Override public Void visit(Node node)      { return null; }
}
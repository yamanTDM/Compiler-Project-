package Visitor;

import AST.*;
import SymbolTable.*;
import antlr.JinjaHtmlParser;
import antlr.JinjaHtmlParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Objects;


public class JinjaHtmlVisitor extends JinjaHtmlParserBaseVisitor {


    @Override
    public Program visitProg(JinjaHtmlParser.ProgContext ctx) {
        int line = ctx.start.getLine();
        Program program = new Program(line);
        if (ctx.document() != null) {
            for (int i = 0; i < ctx.document().size(); i++) {
                program.addBodyNode(visitDocument(ctx.document(i)));

            }
        }
        return program;
    }

    @Override
    public BodyNode visitDocument(JinjaHtmlParser.DocumentContext ctx) {
        return (BodyNode) visit(ctx.body());
    }

    @Override
    public HTMLElement visitHtmlElement(JinjaHtmlParser.HtmlElementContext ctx) {
        int line = ctx.start.getLine();
        HTMLElement htmlElement = new HTMLElement(line, ctx.startElement().PAIRED_TAG().getText());
        if (ctx.startElement().attribute() != null) {
            for (int i = 0; i < ctx.startElement().attribute().size(); i++) {
                htmlElement.addAttribute(visitAttribute(ctx.startElement().attribute().get(i)));
            }
        }
        if (ctx.body() != null) {
            for (int i = 0; i < ctx.body().size(); i++) {
                htmlElement.addChild((BodyNode) visit(ctx.body().get(i)));
            }
        }
        return htmlElement;
    }

    @Override
    public CSSBody visitStyleElement(JinjaHtmlParser.StyleElementContext ctx) {

        return visitStyleBody(ctx.styleBody());
    }

    @Override
    public HTMLSingleElement visitSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx) {
        int line = ctx.start.getLine();
        AST.HTMLSingleElement htmlSingleElement = new HTMLSingleElement(line, ctx.singleElement().VOID_TAG().getText());
        if (ctx.singleElement().attribute() != null) {
            for (int i = 0; i < ctx.singleElement().attribute().size(); i++) {
                htmlSingleElement.addAttribute(visitAttribute(ctx.singleElement().attribute().get(i)));
            }
        }

        return htmlSingleElement;
    }

    @Override
    public JinjaExpression visitJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx) {
        return visitJinjaExpr(ctx.jinjaExpr());
    }

    @Override
    public JinjaIf visitJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx) {
        return visitJinjaConditionStmt(ctx.jinjaConditionStmt());
    }

    @Override
    public JinjaBlock visitJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx) {
        return visitJinjaBlock(ctx.jinjaBlock());
    }

    @Override
    public JinjaFor visitJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx) {
        return visitJinjaForLoop(ctx.jinjaForLoop());
    }

    @Override
    public JinjaStatement visitJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx) {
        return visitJinjaStmt(ctx.jinjaStmt());
    }

    @Override
    public JinjaInheritance visitJinjaInheritanceBody(JinjaHtmlParser.JinjaInheritanceBodyContext ctx) {
        return visitJinjaInheritance(ctx.jinjaInheritance());
    }

    @Override
    public Text visitIdentifier(JinjaHtmlParser.IdentifierContext ctx) {
        int line = ctx.start.getLine();
        Text text = new Text(line, ctx.ID().getText());
        return text;
    }

    @Override
    public Text visitText(JinjaHtmlParser.TextContext ctx) {
        int line = ctx.start.getLine();
        Text text = new Text(line, ctx.TEXT().getText());
        return text;
    }


    @Override
    public Attribute visitAttribute(JinjaHtmlParser.AttributeContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.ID().getText();

        Attribute attribute;
        if (ctx.attributeValue() != null) {
            AttributeValue value = (AttributeValue) visit(ctx.attributeValue());
            attribute = new Attribute(line, name, value);


        } else {
            attribute = new Attribute(line, name);
        }
        return attribute;
    }

    @Override
    public AttributeString visitStringAttribute(JinjaHtmlParser.StringAttributeContext ctx) {
        int line = ctx.start.getLine();
        String text = "";
        if (ctx.DQ_TEXT() != null) {
            text = ctx.DQ_TEXT().getText();
        }
        return new AttributeString(line, text);
    }

    @Override
    public AttributeJinja visitJinjaSQAttribute(JinjaHtmlParser.JinjaSQAttributeContext ctx) {
        int line = ctx.start.getLine();
        JinjaExpression expr = null;
        if (ctx.jinjaExpr() != null) {
            expr = visitJinjaExpr(ctx.jinjaExpr());
        }

        AttributeJinja attributeJinja = new AttributeJinja(line, expr);
        return attributeJinja;
    }

    @Override
    public AttributeJinja visitJinjaDQAttribute(JinjaHtmlParser.JinjaDQAttributeContext ctx) {
        int line = ctx.start.getLine();
        JinjaExpression expr = null;
        if (ctx.jinjaExpr() != null) {
            expr = visitJinjaExpr(ctx.jinjaExpr());
        }
        AttributeJinja attributeJinja = new AttributeJinja(line, expr);
        return attributeJinja;
    }

    @Override
    public JinjaInheritance visitJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx) {
        int line = ctx.start.getLine();

        JinjaInheritance jinjaInheritance = new JinjaInheritance(line, ctx.inheritanceStart().JINJA_STRING().getText());
        if (ctx.body() != null) {
            for (int i = 0; i < ctx.body().size(); i++) {
                BodyNode body = (BodyNode) visit(ctx.body().get(i));
                jinjaInheritance.addBody(body);
            }
        }
        for (int i = 0; i < ctx.jinjaBlock().size(); i++) {
            JinjaBlock block = visitJinjaBlock(ctx.jinjaBlock().get(i));
            jinjaInheritance.addBlock(block);
        }

        return jinjaInheritance;


    }

    @Override
    public CSSBody visitStyleBody(JinjaHtmlParser.StyleBodyContext ctx) {
        int line = ctx.start.getLine();
        CSSBody cssBody = new CSSBody(line);
        if (ctx.cssRule() != null) {
            for (int i = 0; i < ctx.cssRule().size(); i++) {
                CSSRule rule = visitCssRule(ctx.cssRule().get(i));
                cssBody.addCSSRule(rule);

            }
        }
        return cssBody;
    }

    @Override
    public CSSRule visitCssRule(JinjaHtmlParser.CssRuleContext ctx) {
        int line = ctx.start.getLine();
        CSSRule cssRule = new CSSRule(line);
        for (int i = 0; i < ctx.selectorList().selector().size(); i++) {
            CSSSelector selector = (CSSSelector) visit(ctx.selectorList().selector().get(i));
            cssRule.addSelector(selector);
        }
        if (ctx.declarationList() != null) {
            for (int i = 0; i < ctx.declarationList().declaration().size(); i++) {
                CSSDeclaration declaration = visitDeclaration(ctx.declarationList().declaration().get(i));
                cssRule.addDeclaration(declaration);
            }
        }
        return cssRule;
    }


    @Override
    public CSSNormalSelector visitNormalSelector(JinjaHtmlParser.NormalSelectorContext ctx) {
        int line = ctx.start.getLine();
        CSSNormalSelector normalSelector = new CSSNormalSelector(line, ctx.CSS_NAME().getText());
        return normalSelector;
    }

    @Override
    public CSSClassSelector visitClassSelector(JinjaHtmlParser.ClassSelectorContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.CSS_NAME().getText();

        CSSClassSelector classSelector = new CSSClassSelector(line, name);
        return classSelector;
    }

    @Override
    public CSSIDSelector visitIdSelector(JinjaHtmlParser.IdSelectorContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.CSS_NAME().getText();

        CSSIDSelector idSelector = new CSSIDSelector(line, ctx.CSS_NAME().getText());
        return idSelector;
    }

    @Override
    public CSSAllSelector visitAllSelector(JinjaHtmlParser.AllSelectorContext ctx) {
        int line = ctx.start.getLine();
        CSSAllSelector allSelector = new CSSAllSelector(line);
        return allSelector;
    }


    @Override
    public CSSDeclaration visitDeclaration(JinjaHtmlParser.DeclarationContext ctx) {
        int line = ctx.start.getLine();
        CSSDeclaration declaration = new CSSDeclaration(line, ctx.CSS_NAME().getText());

        for (int i = 0; i < ctx.value().cssTerm().size(); i++) {
            CSSTerm term = (CSSTerm) visit(ctx.value().cssTerm().get(i));
            declaration.addTerm(term);
        }

        return declaration;

    }

    @Override
    public CSSNumber visitNumberTerm(JinjaHtmlParser.NumberTermContext ctx) {
        int line = ctx.start.getLine();
        String unit = null;
        if (ctx.CSS_UNIT() != null) {
            unit = ctx.CSS_UNIT().getText();
        }
        CSSNumber number = new CSSNumber(line, Double.valueOf(ctx.CSS_NUMBER().getText()), unit);
        return number;
    }

    @Override
    public CSSText visitStringTerm(JinjaHtmlParser.StringTermContext ctx) {
        int line = ctx.start.getLine();
        CSSText string = new CSSText(line, ctx.CSS_STRING().getText());
        return string;

    }

    @Override
    public CSSText visitNameTerm(JinjaHtmlParser.NameTermContext ctx) {
        int line = ctx.start.getLine();
        CSSText string = new CSSText(line, ctx.CSS_NAME().getText());
        return string;
    }

    @Override
    public CSSHex visitHexTerm(JinjaHtmlParser.HexTermContext ctx) {
        int line = ctx.start.getLine();
        CSSHex hex = new CSSHex(line, ctx.hexNum().getChild(1).getText());
        return hex;
    }


    @Override
    public CSSHSLFunction visitHSLFunction(JinjaHtmlParser.HSLFunctionContext ctx) {
        int line = ctx.start.getLine();
        String unit1 = null;
        String unit2 = null;
        String unit3 = null;
        if (ctx.cssNum().get(0).CSS_UNIT() != null) {
            unit1 = ctx.cssNum().get(0).CSS_UNIT().getText();
        }
        if (ctx.cssNum().get(1).CSS_UNIT() != null) {
            unit2 = ctx.cssNum().get(1).CSS_UNIT().getText();
        }
        if (ctx.cssNum().get(2).CSS_UNIT() != null) {
            unit3 = ctx.cssNum().get(2).CSS_UNIT().getText();
        }

        CSSHSLFunction hsl = new CSSHSLFunction(line,
                Double.parseDouble(ctx.cssNum().get(0).CSS_NUMBER().getText()), unit1,
                Double.parseDouble(ctx.cssNum().get(1).CSS_NUMBER().getText()), unit2,
                Double.parseDouble(ctx.cssNum().get(2).CSS_NUMBER().getText()), unit3);
        return hsl;
    }


    @Override
    public CSSCalcFunction visitCalcFunction(JinjaHtmlParser.CalcFunctionContext ctx) {
        int line = ctx.start.getLine();
        String unit1 = null;
        String unit2 = null;
        if (ctx.cssNum().get(0).CSS_UNIT() != null) {
            unit1 = ctx.cssNum().get(0).CSS_UNIT().getText();
        }
        if (ctx.cssNum().get(1).CSS_UNIT() != null) {
            unit2 = ctx.cssNum().get(1).CSS_UNIT().getText();
        }
        CSSCalcFunction calc = new CSSCalcFunction(line,
                Double.parseDouble(ctx.cssNum().get(0).CSS_NUMBER().getText()), unit1,
                ctx.operator().getText(),
                Double.parseDouble(ctx.cssNum().get(1).CSS_NUMBER().getText()), unit2);
        return calc;
    }

    @Override
    public CSSTranslateFunction visitTranslateX(JinjaHtmlParser.TranslateXContext ctx) {
        int line = ctx.start.getLine();
        String unit = null;
        if (ctx.cssNum().CSS_UNIT() != null) {
            unit = ctx.cssNum().CSS_UNIT().getText();
        }
        CSSTranslateFunction translateFunction = new CSSTranslateFunction(line, Double.parseDouble(ctx.cssNum().CSS_NUMBER().getText()), unit, true);
        return translateFunction;

    }

    @Override
    public CSSTranslateFunction visitTranslateY(JinjaHtmlParser.TranslateYContext ctx) {
        int line = ctx.start.getLine();
        String unit = null;
        if (ctx.cssNum().CSS_UNIT() != null) {
            unit = ctx.cssNum().CSS_UNIT().getText();
        }
        CSSTranslateFunction translateFunction = new CSSTranslateFunction(line, Double.parseDouble(ctx.cssNum().CSS_NUMBER().getText()), unit, false);
        return translateFunction;
    }

    @Override
    public CSSTranslateFunction visitTranslateFull(JinjaHtmlParser.TranslateFullContext ctx) {
        int line = ctx.start.getLine();
        String unit1 = null;
        String unit2 = null;
        if (ctx.cssNum().get(0).CSS_UNIT() != null) {
            unit1 = ctx.cssNum().get(0).CSS_UNIT().getText();
        }
        if (ctx.cssNum().get(1).CSS_UNIT() != null) {
            unit2 = ctx.cssNum().get(1).CSS_UNIT().getText();
        }
        CSSTranslateFunction translateFunction = new CSSTranslateFunction(line,
                Double.parseDouble(ctx.cssNum().get(0).CSS_NUMBER().getText()), unit1,
                Double.parseDouble(ctx.cssNum().get(1).CSS_NUMBER().getText()), unit2
        );
        return translateFunction;
    }

    @Override
    public CSSScaleFunction visitScaleX(JinjaHtmlParser.ScaleXContext ctx) {
        int line = ctx.start.getLine();
        String unit = null;
        if (ctx.cssNum().CSS_UNIT() != null) {
            unit = ctx.cssNum().CSS_UNIT().getText();
        }
        CSSScaleFunction scaleFunction = new CSSScaleFunction(line, Double.parseDouble(ctx.cssNum().CSS_NUMBER().getText()), unit, true);
        return scaleFunction;
    }

    @Override
    public CSSScaleFunction visitScaleY(JinjaHtmlParser.ScaleYContext ctx) {
        int line = ctx.start.getLine();
        String unit = null;
        if (ctx.cssNum().CSS_UNIT() != null) {
            unit = ctx.cssNum().CSS_UNIT().getText();
        }
        CSSScaleFunction scaleFunction = new CSSScaleFunction(line, Double.parseDouble(ctx.cssNum().CSS_NUMBER().getText()), unit, false);
        return scaleFunction;
    }

    @Override
    public CSSScaleFunction visitScaleFull(JinjaHtmlParser.ScaleFullContext ctx) {
        int line = ctx.start.getLine();
        String unit1 = null;
        String unit2 = null;
        if (ctx.cssNum().get(0).CSS_UNIT() != null) {
            unit1 = ctx.cssNum().get(0).CSS_UNIT().getText();
        }
        if (ctx.cssNum().get(1).CSS_UNIT() != null) {
            unit2 = ctx.cssNum().get(1).CSS_UNIT().getText();
        }
        CSSScaleFunction scaleFunction = new CSSScaleFunction(line,
                Double.parseDouble(ctx.cssNum().get(0).getText()), unit1,
                Double.parseDouble(ctx.cssNum().get(1).getText()), unit2
        );
        return scaleFunction;
    }


    @Override
    public JinjaBlock visitJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx) {
        int line = ctx.start.getLine();
        JinjaBlock block;

        JinjaId name = (JinjaId) visit(ctx.jinjaBlockStart().jinjaId());

        if (ctx.jinjaSuperBlock() != null) {
            JinjaSuperBlock superBlock = new JinjaSuperBlock(line);
            block = new JinjaBlock(line, name, superBlock);
        } else {
            block = new JinjaBlock(line, name);
        }
        if (ctx.body() != null) {

            for (int i = 0; i < ctx.body().size(); i++) {
                BodyNode bodyNode = (BodyNode) visit(ctx.body().get(i));
                block.addBody(bodyNode);
            }
        }

        return block;

    }


    @Override
    public JinjaIf visitJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx) {
        int line = ctx.start.getLine();
        Condition ifCondition = (Condition) visit(ctx.jinjaIf().jinjaConditions());
        BodyNode ifBody = (BodyNode) visit(ctx.jinjaIf().body());
        BodyNode elseBody = (BodyNode) visit(ctx.jinjaElse().body());
        JinjaIf jinjaIf = new JinjaIf(line, ifCondition, ifBody, elseBody);
        if (ctx.jinjaElseIf() != null) {
            for (int i = 0; i < ctx.jinjaElseIf().size(); i++) {
                Condition elseIfCondition = (Condition) visit(ctx.jinjaElseIf().get(i).jinjaConditions());
                BodyNode elseIFBody = (BodyNode) visit(ctx.jinjaElseIf().get(i).body());
                JinjaElif jinjaElif = new JinjaElif(line, elseIfCondition, elseIFBody);


                jinjaIf.addElif(jinjaElif);
            }
        }

        return jinjaIf;

    }


    @Override
    public Condition visitJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx) {
        return (Condition) visit(ctx.jinjaConditions());
    }

    @Override
    public LogicCondition visitJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx) {
        int line = ctx.start.getLine();
        Condition leftCondition = (Condition) visit(ctx.jinjaConditions().getFirst());
        Condition rightCondition = (Condition) visit(ctx.jinjaConditions().getLast());
        LogicCondition condition = new LogicCondition(line, leftCondition, ctx.JINJA_LOGIC().getText(), rightCondition);
        return condition;

    }

    @Override
    public JinjaExpression visitJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx) {
        int line = ctx.start.getLine();
        JinjaExpression jinjaExpression = new JinjaExpression(line);
        if (ctx.expr() != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                JinjaExpr expr = (JinjaExpr) visit(ctx.expr().get(i));
                jinjaExpression.addExpr(expr);
            }
        }
        return jinjaExpression;
    }

    @Override
    public NotCondition visitJinjaNotCondition(JinjaHtmlParser.JinjaNotConditionContext ctx) {
        int line = ctx.start.getLine();
        Condition condition = (Condition) visit(ctx.jinjaConditions());
        NotCondition notCondition = new NotCondition(line, condition);

        return notCondition;
    }

    @Override
    public VariableCondition visitJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx) {
        int line = ctx.start.getLine();
        String text;
        if (ctx.jinjaVariable().jinjaId() != null) {
            JinjaId jinjaId = (JinjaId) visit(ctx.jinjaVariable().jinjaId());

            text = jinjaId.getFullName();
        } else {
            text = ctx.jinjaVariable().getText();
        }
        VariableCondition condition = new VariableCondition(line, text);

        return condition;
    }

    @Override
    public CompareCondition visitJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx) {
        int line = ctx.start.getLine();
        String text1;
        if (ctx.jinjaVariable().getFirst().jinjaId() != null) {
            JinjaId jinjaId = (JinjaId) visit(ctx.jinjaVariable().getFirst().jinjaId());

            text1 = jinjaId.getFullName();
        } else {
            text1 = ctx.jinjaVariable().getFirst().getText();
        }
        String text2;
        if (ctx.jinjaVariable().getLast().jinjaId() != null) {
            JinjaId jinjaId = (JinjaId) visit(ctx.jinjaVariable().getLast().jinjaId());

            text2 = jinjaId.getFullName();
        } else {
            text2 = ctx.jinjaVariable().getLast().getText();
        }
        CompareCondition condition = new CompareCondition(line, text1, ctx.compare().getText(), text2);
        return condition;
    }

    @Override
    public JinjaFor visitJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx) {
        int line = ctx.start.getLine();
        JinjaId itemName = (JinjaId) visit(ctx.jinjaFor().jinjaId().getFirst());
        JinjaId collectionName = (JinjaId) visit(ctx.jinjaFor().jinjaId().get(1));

        Condition condition = null;
        if (ctx.jinjaFor().jinjaConditions() != null) {
            condition = (Condition) visit(ctx.jinjaFor().jinjaConditions());
        }
        BodyNode body = null;
        if (ctx.body() != null) {
            body = (BodyNode) visit(ctx.body());
        }
        BodyNode elseBody = null;
        if (ctx.jinjaElse() != null) {
            if (ctx.jinjaElse().body() != null) {
                elseBody = (BodyNode) visit(ctx.jinjaElse().body());
            }
        }
        JinjaFor jinjaFor = new JinjaFor(line, itemName, collectionName, condition, body, elseBody);
        return jinjaFor;
    }

    @Override
    public JinjaId visitJinjaExpressionID(JinjaHtmlParser.JinjaExpressionIDContext ctx) {
        int line = ctx.start.getLine();

        JinjaId jinjaId = new JinjaId(line);

        for (int i = 0; i < ctx.JINJA_ID_EXPR().size(); i++) {
            jinjaId.addPart(ctx.JINJA_ID_EXPR().get(i).getText());

        }
        return jinjaId;
    }

    @Override
    public JinjaId visitJinjaStatementID(JinjaHtmlParser.JinjaStatementIDContext ctx) {
        int line = ctx.start.getLine();
        JinjaId jinjaId = new JinjaId(line);
        for (int i = 0; i < ctx.JINJA_ID_STMT().size(); i++) {
            jinjaId.addPart(ctx.JINJA_ID_STMT().get(i).getText());

        }
        return jinjaId;
    }


    @Override
    public JinjaId visitJinjaExpressionIDBody(JinjaHtmlParser.JinjaExpressionIDBodyContext ctx) {
        return (JinjaId) visit(ctx.jinjaId());
    }


    @Override
    public JinjaText visitJinjaExpressionStringBody(JinjaHtmlParser.JinjaExpressionStringBodyContext ctx) {
        int line = ctx.start.getLine();

        return new JinjaText(line, ctx.JINJA_STRING_EXPR().getText());
    }


    @Override
    public JinjaFunction visitJinjaExpressionFunction(JinjaHtmlParser.JinjaExpressionFunctionContext ctx) {
        int line = ctx.start.getLine();
        JinjaId jinjaId = (JinjaId) visit(ctx.functionCall().jinjaId());

        JinjaFunction function = new JinjaFunction(line, jinjaId);
        for (int i = 0; i < ctx.functionCall().expr().size(); i++) {
            JinjaExpr expr = (JinjaExpr) visit(ctx.functionCall().expr().get(i));
            function.addArgument(expr);

        }
        return function;


    }

    @Override
    public JinjaText visitJinjaExpressionText(JinjaHtmlParser.JinjaExpressionTextContext ctx) {
        int line = ctx.start.getLine();
        JinjaText text = new JinjaText(line, ctx.JINJA_TEXT().getText());
        return text;
    }

    @Override
    public JinjaCombine visitJinjaExpressionCombine(JinjaHtmlParser.JinjaExpressionCombineContext ctx) {
        int line = ctx.start.getLine();
        JinjaCombine jinjaCombine = new JinjaCombine(line);
        for (int i = 0; i < ctx.combineHalf().size(); i++) {
            if (ctx.combineHalf().get(i).JINJA_STRING_EXPR() != null) {
                String text = ctx.combineHalf().get(i).JINJA_STRING_EXPR().getText();
                text = text.substring(1, text.length() - 1);
                jinjaCombine.addPart(new JinjaText(line, text));
            } else {
                JinjaId text = (JinjaId) visit(ctx.combineHalf().get(i).jinjaId());
                jinjaCombine.addPart(text);
            }

        }
        return jinjaCombine;
    }

    @Override
    public JinjaAssign visitJinjaExpressionAssign(JinjaHtmlParser.JinjaExpressionAssignContext ctx) {
        int line = ctx.start.getLine();
        JinjaId jinjaId = (JinjaId) visit(ctx.jinjaId());

        JinjaAssign assign = new JinjaAssign(line, jinjaId, (JinjaExpr) visit(ctx.expr()));
        return assign;
    }


    @Override
    public JinjaStatement visitJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx) {
        int line = ctx.start.getLine();


        JinjaStatement jinjaStatement = new JinjaStatement(line);

        if (ctx.stmtBody() != null) {
            for (int i = 0; i < ctx.stmtBody().size(); i++) {
                JinjaHtmlParser.StmtBodyContext body = ctx.stmtBody().get(i);

                if (body.jinjaId() != null) {
                    jinjaStatement.addText((JinjaId) visit(body.jinjaId()));
                } else if (body.JINJA_STRING() != null) {
                    jinjaStatement.addText(new JinjaText(line, body.JINJA_STRING().getText()));
                } else if (body.JINJA_TEXT_STMT() != null) {
                    jinjaStatement.addText(new JinjaText(line, body.JINJA_TEXT_STMT().getText()));
                }
            }
        }
        return jinjaStatement;
    }
}

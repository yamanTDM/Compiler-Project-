// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/JinjaHtmlParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaHtmlParser}.
 */
public interface JinjaHtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JinjaHtmlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JinjaHtmlParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(JinjaHtmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(JinjaHtmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(JinjaHtmlParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(JinjaHtmlParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleHtml}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleHtml}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpression}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpression}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaConditionStatement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaConditionStatement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockPlace}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockPlace}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaLoop}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaLoop}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaStatement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaStatement}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaInheritanceBody}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaInheritanceBody(JinjaHtmlParser.JinjaInheritanceBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaInheritanceBody}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaInheritanceBody(JinjaHtmlParser.JinjaInheritanceBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterText(JinjaHtmlParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link JinjaHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitText(JinjaHtmlParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#startElement}.
	 * @param ctx the parse tree
	 */
	void enterStartElement(JinjaHtmlParser.StartElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#startElement}.
	 * @param ctx the parse tree
	 */
	void exitStartElement(JinjaHtmlParser.StartElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#endElement}.
	 * @param ctx the parse tree
	 */
	void enterEndElement(JinjaHtmlParser.EndElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#endElement}.
	 * @param ctx the parse tree
	 */
	void exitEndElement(JinjaHtmlParser.EndElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#singleElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleElement(JinjaHtmlParser.SingleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#singleElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleElement(JinjaHtmlParser.SingleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JinjaHtmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JinjaHtmlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterStringAttribute(JinjaHtmlParser.StringAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitStringAttribute(JinjaHtmlParser.StringAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSQAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSQAttribute(JinjaHtmlParser.JinjaSQAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSQAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSQAttribute(JinjaHtmlParser.JinjaSQAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaDQAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJinjaDQAttribute(JinjaHtmlParser.JinjaDQAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaDQAttribute}
	 * labeled alternative in {@link JinjaHtmlParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJinjaDQAttribute(JinjaHtmlParser.JinjaDQAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaInheritance}.
	 * @param ctx the parse tree
	 */
	void enterJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaInheritance}.
	 * @param ctx the parse tree
	 */
	void exitJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#inheritanceStart}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceStart(JinjaHtmlParser.InheritanceStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#inheritanceStart}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceStart(JinjaHtmlParser.InheritanceStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#styleStartElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleStartElement(JinjaHtmlParser.StyleStartElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#styleStartElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleStartElement(JinjaHtmlParser.StyleStartElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#styleEndElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleEndElement(JinjaHtmlParser.StyleEndElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#styleEndElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleEndElement(JinjaHtmlParser.StyleEndElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#styleBody}.
	 * @param ctx the parse tree
	 */
	void enterStyleBody(JinjaHtmlParser.StyleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#styleBody}.
	 * @param ctx the parse tree
	 */
	void exitStyleBody(JinjaHtmlParser.StyleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(JinjaHtmlParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(JinjaHtmlParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(JinjaHtmlParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(JinjaHtmlParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterNormalSelector(JinjaHtmlParser.NormalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitNormalSelector(JinjaHtmlParser.NormalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(JinjaHtmlParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(JinjaHtmlParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(JinjaHtmlParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(JinjaHtmlParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterAllSelector(JinjaHtmlParser.AllSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitAllSelector(JinjaHtmlParser.AllSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(JinjaHtmlParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(JinjaHtmlParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JinjaHtmlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JinjaHtmlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JinjaHtmlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JinjaHtmlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterNumberTerm(JinjaHtmlParser.NumberTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitNumberTerm(JinjaHtmlParser.NumberTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterStringTerm(JinjaHtmlParser.StringTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitStringTerm(JinjaHtmlParser.StringTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterNameTerm(JinjaHtmlParser.NameTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitNameTerm(JinjaHtmlParser.NameTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterHexTerm(JinjaHtmlParser.HexTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitHexTerm(JinjaHtmlParser.HexTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTerm(JinjaHtmlParser.FunctionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTerm(JinjaHtmlParser.FunctionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HSLFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterHSLFunction(JinjaHtmlParser.HSLFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HSLFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitHSLFunction(JinjaHtmlParser.HSLFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TranslateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterTranslateFunction(JinjaHtmlParser.TranslateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TranslateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitTranslateFunction(JinjaHtmlParser.TranslateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaleFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterScaleFunction(JinjaHtmlParser.ScaleFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaleFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitScaleFunction(JinjaHtmlParser.ScaleFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RotateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterRotateFunction(JinjaHtmlParser.RotateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RotateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitRotateFunction(JinjaHtmlParser.RotateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterCalcFunction(JinjaHtmlParser.CalcFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitCalcFunction(JinjaHtmlParser.CalcFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#cssNum}.
	 * @param ctx the parse tree
	 */
	void enterCssNum(JinjaHtmlParser.CssNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#cssNum}.
	 * @param ctx the parse tree
	 */
	void exitCssNum(JinjaHtmlParser.CssNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JinjaHtmlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JinjaHtmlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TranslateX}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void enterTranslateX(JinjaHtmlParser.TranslateXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TranslateX}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void exitTranslateX(JinjaHtmlParser.TranslateXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TranslateY}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void enterTranslateY(JinjaHtmlParser.TranslateYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TranslateY}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void exitTranslateY(JinjaHtmlParser.TranslateYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TranslateFull}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void enterTranslateFull(JinjaHtmlParser.TranslateFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TranslateFull}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 */
	void exitTranslateFull(JinjaHtmlParser.TranslateFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaleX}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScaleX(JinjaHtmlParser.ScaleXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaleX}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScaleX(JinjaHtmlParser.ScaleXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaleY}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScaleY(JinjaHtmlParser.ScaleYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaleY}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScaleY(JinjaHtmlParser.ScaleYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaleFull}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScaleFull(JinjaHtmlParser.ScaleFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaleFull}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScaleFull(JinjaHtmlParser.ScaleFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#hexNum}.
	 * @param ctx the parse tree
	 */
	void enterHexNum(JinjaHtmlParser.HexNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#hexNum}.
	 * @param ctx the parse tree
	 */
	void exitHexNum(JinjaHtmlParser.HexNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockStart(JinjaHtmlParser.JinjaBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockStart(JinjaHtmlParser.JinjaBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlockeEnd}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockeEnd(JinjaHtmlParser.JinjaBlockeEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockeEnd}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockeEnd(JinjaHtmlParser.JinjaBlockeEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaSuperBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSuperBlock(JinjaHtmlParser.JinjaSuperBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaSuperBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSuperBlock(JinjaHtmlParser.JinjaSuperBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(JinjaHtmlParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(JinjaHtmlParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaElseIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElseIf(JinjaHtmlParser.JinjaElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaElseIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElseIf(JinjaHtmlParser.JinjaElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElse(JinjaHtmlParser.JinjaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElse(JinjaHtmlParser.JinjaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaEndIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndIf(JinjaHtmlParser.JinjaEndIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaEndIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndIf(JinjaHtmlParser.JinjaEndIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaParentecesCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaParentecesCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaNotCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNotCondition(JinjaHtmlParser.JinjaNotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaNotCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNotCondition(JinjaHtmlParser.JinjaNotConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaConditionsRoot}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaConditionsRoot}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVaraiableConditon}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVaraiableConditon}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCompareCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCompareCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(JinjaHtmlParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(JinjaHtmlParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaForLoop}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaForLoop}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(JinjaHtmlParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(JinjaHtmlParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaEndFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndFor(JinjaHtmlParser.JinjaEndForContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaEndFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndFor(JinjaHtmlParser.JinjaEndForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariable(JinjaHtmlParser.JinjaVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariable(JinjaHtmlParser.JinjaVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionID}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaId}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionID(JinjaHtmlParser.JinjaExpressionIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionID}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaId}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionID(JinjaHtmlParser.JinjaExpressionIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaStatementID}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaId}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatementID(JinjaHtmlParser.JinjaStatementIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaStatementID}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaId}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatementID(JinjaHtmlParser.JinjaStatementIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionFunction}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionFunction(JinjaHtmlParser.JinjaExpressionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionFunction}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionFunction(JinjaHtmlParser.JinjaExpressionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionCombine}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionCombine(JinjaHtmlParser.JinjaExpressionCombineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionCombine}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionCombine(JinjaHtmlParser.JinjaExpressionCombineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionAssign}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionAssign(JinjaHtmlParser.JinjaExpressionAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionAssign}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionAssign(JinjaHtmlParser.JinjaExpressionAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionStringBody}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionStringBody(JinjaHtmlParser.JinjaExpressionStringBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionStringBody}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionStringBody(JinjaHtmlParser.JinjaExpressionStringBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionIDBody}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionIDBody(JinjaHtmlParser.JinjaExpressionIDBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionIDBody}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionIDBody(JinjaHtmlParser.JinjaExpressionIDBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionText}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionText(JinjaHtmlParser.JinjaExpressionTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionText}
	 * labeled alternative in {@link JinjaHtmlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionText(JinjaHtmlParser.JinjaExpressionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#combineHalf}.
	 * @param ctx the parse tree
	 */
	void enterCombineHalf(JinjaHtmlParser.CombineHalfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#combineHalf}.
	 * @param ctx the parse tree
	 */
	void exitCombineHalf(JinjaHtmlParser.CombineHalfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JinjaHtmlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JinjaHtmlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#stmtBody}.
	 * @param ctx the parse tree
	 */
	void enterStmtBody(JinjaHtmlParser.StmtBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#stmtBody}.
	 * @param ctx the parse tree
	 */
	void exitStmtBody(JinjaHtmlParser.StmtBodyContext ctx);
}
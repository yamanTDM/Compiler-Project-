// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PythonParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSmall(PythonParser.ImportSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSmall(PythonParser.GlobalSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSmall(PythonParser.ReturnSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSmall(PythonParser.ExprSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainImport(PythonParser.PlainImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr_or_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_assign(PythonParser.Expr_or_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAssign(PythonParser.OpAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpPlusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpPlusAssign(PythonParser.OpPlusAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpMinusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMinusAssign(PythonParser.OpMinusAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundIf(PythonParser.CompoundIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComppundWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComppundWith(PythonParser.ComppundWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundFunc(PythonParser.CompoundFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDecorated(PythonParser.CompoundDecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_stmt(PythonParser.Else_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(PythonParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotPassthrough}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPassthrough(PythonParser.NotPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompEq(PythonParser.CompEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompNeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompNeq(PythonParser.CompNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompLt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompLt(PythonParser.CompLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompGt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompGt(PythonParser.CompGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompLeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompLeq(PythonParser.CompLeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompGeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompGeq(PythonParser.CompGeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompIn(PythonParser.CompInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompNotIn(PythonParser.CompNotInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithPassthrough}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithPassthrough(PythonParser.ArithPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAccess(PythonParser.AttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptAccess(PythonParser.SubscriptAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(PythonParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(PythonParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(PythonParser.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComp(PythonParser.ListCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDict(PythonParser.EmptyDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#kv_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKv_pair(PythonParser.Kv_pairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArg(PythonParser.PositionalArgContext ctx);
}
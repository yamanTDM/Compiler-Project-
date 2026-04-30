// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportSmall(PythonParser.ImportSmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportSmall(PythonParser.ImportSmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalSmall(PythonParser.GlobalSmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalSmall(PythonParser.GlobalSmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnSmall(PythonParser.ReturnSmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnSmall(PythonParser.ReturnSmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSmall(PythonParser.ExprSmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSmall}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSmall(PythonParser.ExprSmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPlainImport(PythonParser.PlainImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainImport}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPlainImport(PythonParser.PlainImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr_or_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_assign(PythonParser.Expr_or_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr_or_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_assign(PythonParser.Expr_or_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterOpAssign(PythonParser.OpAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitOpAssign(PythonParser.OpAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpPlusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterOpPlusAssign(PythonParser.OpPlusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpPlusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitOpPlusAssign(PythonParser.OpPlusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpMinusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterOpMinusAssign(PythonParser.OpMinusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpMinusAssign}
	 * labeled alternative in {@link PythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitOpMinusAssign(PythonParser.OpMinusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundIf(PythonParser.CompoundIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundIf(PythonParser.CompoundIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComppundWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComppundWith(PythonParser.ComppundWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComppundWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComppundWith(PythonParser.ComppundWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundFunc(PythonParser.CompoundFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundFunc(PythonParser.CompoundFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDecorated(PythonParser.CompoundDecoratedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDecorated(PythonParser.CompoundDecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_stmt(PythonParser.Else_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_stmt(PythonParser.Else_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(PythonParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(PythonParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotPassthrough}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNotPassthrough(PythonParser.NotPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotPassthrough}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNotPassthrough(PythonParser.NotPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompEq(PythonParser.CompEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompEq(PythonParser.CompEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompNeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompNeq(PythonParser.CompNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompNeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompNeq(PythonParser.CompNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompLt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompLt(PythonParser.CompLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompLt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompLt(PythonParser.CompLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompGt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompGt(PythonParser.CompGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompGt}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompGt(PythonParser.CompGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompLeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompLeq(PythonParser.CompLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompLeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompLeq(PythonParser.CompLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompGeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompGeq(PythonParser.CompGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompGeq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompGeq(PythonParser.CompGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompIn(PythonParser.CompInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompIn(PythonParser.CompInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompNotIn(PythonParser.CompNotInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompNotIn(PythonParser.CompNotInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithPassthrough}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithPassthrough(PythonParser.ArithPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithPassthrough}
	 * labeled alternative in {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithPassthrough(PythonParser.ArithPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterAttrAccess(PythonParser.AttrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitAttrAccess(PythonParser.AttrAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptAccess(PythonParser.SubscriptAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptAccess(PythonParser.SubscriptAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(PythonParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(PythonParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(PythonParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(PythonParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(PythonParser.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(PythonParser.EmptyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void enterListComp(PythonParser.ListCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void exitListComp(PythonParser.ListCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_display}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDict(PythonParser.EmptyDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDict(PythonParser.EmptyDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_display}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#kv_pair}.
	 * @param ctx the parse tree
	 */
	void enterKv_pair(PythonParser.Kv_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#kv_pair}.
	 * @param ctx the parse tree
	 */
	void exitKv_pair(PythonParser.Kv_pairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 */
	void enterGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 */
	void exitGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#paren_form}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArg(PythonParser.PositionalArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArg(PythonParser.PositionalArgContext ctx);
}
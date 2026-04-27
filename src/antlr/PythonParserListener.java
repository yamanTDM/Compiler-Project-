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
	 * Enter a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtLine(PythonParser.CompoundStmtLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtLine(PythonParser.CompoundStmtLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmtNewline(PythonParser.SimpleStmtNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmtNewline(PythonParser.SimpleStmtNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtNewline(PythonParser.CompoundStmtNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtNewline(PythonParser.CompoundStmtNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void enterEmptyNewline(PythonParser.EmptyNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void exitEmptyNewline(PythonParser.EmptyNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EofStmt}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void enterEofStmt(PythonParser.EofStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EofStmt}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void exitEofStmt(PythonParser.EofStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmts(PythonParser.Simple_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmts(PythonParser.Simple_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAliasStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasStmt(PythonParser.TypeAliasStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAliasStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasStmt(PythonParser.TypeAliasStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportFromStmt(PythonParser.ImportFromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportFromStmt(PythonParser.ImportFromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStmtBare}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmtBare(PythonParser.RaiseStmtBareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStmtBare}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmtBare(PythonParser.RaiseStmtBareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfCompound(PythonParser.IfCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfCompound(PythonParser.IfCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileCompound(PythonParser.WhileCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileCompound(PythonParser.WhileCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForCompound(PythonParser.ForCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForCompound(PythonParser.ForCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithCompound(PythonParser.WithCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithCompound(PythonParser.WithCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryCompound(PythonParser.TryCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryCompound(PythonParser.TryCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatchCompound(PythonParser.MatchCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatchCompound(PythonParser.MatchCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefCompound(PythonParser.FuncDefCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefCompound(PythonParser.FuncDefCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClassDefCompound(PythonParser.ClassDefCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClassDefCompound(PythonParser.ClassDefCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedCompound(PythonParser.DecoratedCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedCompound(PythonParser.DecoratedCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsyncCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsyncCompound(PythonParser.AsyncCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsyncCompound(PythonParser.AsyncCompoundContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(PythonParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(PythonParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(PythonParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(PythonParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmtParens}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmtParens(PythonParser.WithStmtParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmtParens}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmtParens(PythonParser.WithStmtParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithItemAs}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWithItemAs(PythonParser.WithItemAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithItemAs}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWithItemAs(PythonParser.WithItemAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithItemExpr}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWithItemExpr(PythonParser.WithItemExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithItemExpr}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWithItemExpr(PythonParser.WithItemExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatch}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(PythonParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatch}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(PythonParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchStar}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStar(PythonParser.TryCatchStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchStar}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStar(PythonParser.TryCatchStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void enterExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void exitExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BareExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void enterBareExceptBlock(PythonParser.BareExceptBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BareExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void exitBareExceptBlock(PythonParser.BareExceptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#except_star_block}.
	 * @param ctx the parse tree
	 */
	void enterExcept_star_block(PythonParser.Except_star_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#except_star_block}.
	 * @param ctx the parse tree
	 */
	void exitExcept_star_block(PythonParser.Except_star_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(PythonParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(PythonParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_stmt(PythonParser.Match_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_stmt(PythonParser.Match_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void enterTupleSubject(PythonParser.TupleSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void exitTupleSubject(PythonParser.TupleSubjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSubject(PythonParser.SimpleSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSubject(PythonParser.SimpleSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(PythonParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(PythonParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(PythonParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(PythonParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SequencePatterns}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterSequencePatterns(PythonParser.SequencePatternsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SequencePatterns}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitSequencePatterns(PythonParser.SequencePatternsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SinglePattern}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterSinglePattern(PythonParser.SinglePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SinglePattern}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitSinglePattern(PythonParser.SinglePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsPattern}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsPattern}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrPatternOnly}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterOrPatternOnly(PythonParser.OrPatternOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrPatternOnly}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitOrPatternOnly(PythonParser.OrPatternOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOr_pattern(PythonParser.Or_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOr_pattern(PythonParser.Or_patternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPat(PythonParser.LiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPat(PythonParser.LiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CapturePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCapturePat(PythonParser.CapturePatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CapturePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCapturePat(PythonParser.CapturePatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupPat(PythonParser.GroupPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupPat(PythonParser.GroupPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValuePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValuePat(PythonParser.ValuePatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValuePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValuePat(PythonParser.ValuePatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterListPat(PythonParser.ListPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitListPat(PythonParser.ListPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TuplePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePat(PythonParser.TuplePatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TuplePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePat(PythonParser.TuplePatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEmptyMappingPat(PythonParser.EmptyMappingPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEmptyMappingPat(PythonParser.EmptyMappingPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DblStarMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterDblStarMappingPat(PythonParser.DblStarMappingPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DblStarMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitDblStarMappingPat(PythonParser.DblStarMappingPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemsMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterItemsMappingPat(PythonParser.ItemsMappingPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemsMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitItemsMappingPat(PythonParser.ItemsMappingPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyClassPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEmptyClassPat(PythonParser.EmptyClassPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyClassPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEmptyClassPat(PythonParser.EmptyClassPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassPatArgs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterClassPatArgs(PythonParser.ClassPatArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassPatArgs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitClassPatArgs(PythonParser.ClassPatArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassPatKwargs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterClassPatKwargs(PythonParser.ClassPatKwargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassPatKwargs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitClassPatKwargs(PythonParser.ClassPatKwargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralPat(PythonParser.NumberLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralPat(PythonParser.NumberLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteralPat(PythonParser.FloatLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteralPat(PythonParser.FloatLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterComplexLiteralPat(PythonParser.ComplexLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitComplexLiteralPat(PythonParser.ComplexLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralPat(PythonParser.StringLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralPat(PythonParser.StringLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteralPat(PythonParser.NoneLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteralPat(PythonParser.NoneLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralPat(PythonParser.TrueLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralPat(PythonParser.TrueLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralPat(PythonParser.FalseLiteralPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralPat(PythonParser.FalseLiteralPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void enterStarPat(PythonParser.StarPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void exitStarPat(PythonParser.StarPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonStarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void enterNonStarPat(PythonParser.NonStarPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonStarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void exitNonStarPat(PythonParser.NonStarPatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#items_pattern}.
	 * @param ctx the parse tree
	 */
	void enterItems_pattern(PythonParser.Items_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#items_pattern}.
	 * @param ctx the parse tree
	 */
	void exitItems_pattern(PythonParser.Items_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keyword_pattern}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_pattern(PythonParser.Keyword_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keyword_pattern}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_pattern(PythonParser.Keyword_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#name_or_attr}.
	 * @param ctx the parse tree
	 */
	void enterName_or_attr(PythonParser.Name_or_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#name_or_attr}.
	 * @param ctx the parse tree
	 */
	void exitName_or_attr(PythonParser.Name_or_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(PythonParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(PythonParser.Func_defContext ctx);
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
	 * Enter a parse tree produced by the {@code AsyncFuncDef}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsyncFuncDef(PythonParser.AsyncFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncFuncDef}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsyncFuncDef(PythonParser.AsyncFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsyncWithStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsyncWithStmt(PythonParser.AsyncWithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncWithStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsyncWithStmt(PythonParser.AsyncWithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsyncForStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsyncForStmt(PythonParser.AsyncForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncForStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsyncForStmt(PythonParser.AsyncForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(PythonParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(PythonParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(PythonParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(PythonParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterAllParams(PythonParser.AllParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitAllParams(PythonParser.AllParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterDefaultParams(PythonParser.DefaultParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitDefaultParams(PythonParser.DefaultParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterStarParams(PythonParser.StarParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitStarParams(PythonParser.StarParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DblStarOnlyParam}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterDblStarOnlyParam(PythonParser.DblStarOnlyParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DblStarOnlyParam}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitDblStarOnlyParam(PythonParser.DblStarOnlyParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosOnlyParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPosOnlyParams(PythonParser.PosOnlyParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosOnlyParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPosOnlyParams(PythonParser.PosOnlyParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param_no_default}.
	 * @param ctx the parse tree
	 */
	void enterParam_no_default(PythonParser.Param_no_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param_no_default}.
	 * @param ctx the parse tree
	 */
	void exitParam_no_default(PythonParser.Param_no_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param_with_default}.
	 * @param ctx the parse tree
	 */
	void enterParam_with_default(PythonParser.Param_with_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param_with_default}.
	 * @param ctx the parse tree
	 */
	void exitParam_with_default(PythonParser.Param_with_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param_maybe_default}.
	 * @param ctx the parse tree
	 */
	void enterParam_maybe_default(PythonParser.Param_maybe_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param_maybe_default}.
	 * @param ctx the parse tree
	 */
	void exitParam_maybe_default(PythonParser.Param_maybe_defaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 */
	void enterStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 */
	void exitStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BareStar}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 */
	void enterBareStar(PythonParser.BareStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BareStar}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 */
	void exitBareStar(PythonParser.BareStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#default_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDefault_assignment(PythonParser.Default_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#default_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDefault_assignment(PythonParser.Default_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void enterType_alias(PythonParser.Type_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void exitType_alias(PythonParser.Type_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#type_param_seq}.
	 * @param ctx the parse tree
	 */
	void enterType_param_seq(PythonParser.Type_param_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#type_param_seq}.
	 * @param ctx the parse tree
	 */
	void exitType_param_seq(PythonParser.Type_param_seqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeParamBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeParamBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeVarTupleBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarTupleBound(PythonParser.TypeVarTupleBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeVarTupleBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarTupleBound(PythonParser.TypeVarTupleBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamSpecBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterParamSpecBound(PythonParser.ParamSpecBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamSpecBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitParamSpecBound(PythonParser.ParamSpecBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(PythonParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(PythonParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeVarTuple}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarTuple(PythonParser.TypeVarTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeVarTuple}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarTuple(PythonParser.TypeVarTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamSpec}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterParamSpec(PythonParser.ParamSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamSpec}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitParamSpec(PythonParser.ParamSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_names(PythonParser.Import_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_names(PythonParser.Import_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
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
	 * Enter a parse tree produced by the {@code RelativeModule}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 */
	void enterRelativeModule(PythonParser.RelativeModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeModule}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 */
	void exitRelativeModule(PythonParser.RelativeModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelativeDots}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDots(PythonParser.RelativeDotsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeDots}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDots(PythonParser.RelativeDotsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportParens}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void enterImportParens(PythonParser.ImportParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportParens}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void exitImportParens(PythonParser.ImportParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFlat}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void enterImportFlat(PythonParser.ImportFlatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFlat}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void exitImportFlat(PythonParser.ImportFlatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStar}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void enterImportStar(PythonParser.ImportStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStar}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void exitImportStar(PythonParser.ImportStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_from_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_from_as_names(PythonParser.Import_from_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_from_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_from_as_names(PythonParser.Import_from_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_from_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_from_as_name(PythonParser.Import_from_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_from_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_from_as_name(PythonParser.Import_from_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterInlineBlock(PythonParser.InlineBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitInlineBlock(PythonParser.InlineBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpr(PythonParser.TupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpr(PythonParser.TupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(PythonParser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(PythonParser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(PythonParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(PythonParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctionExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionExpr(PythonParser.DisjunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctionExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionExpr(PythonParser.DisjunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExprBody(PythonParser.LambdaExprBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExprBody(PythonParser.LambdaExprBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExprBody(PythonParser.YieldExprBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExprBody(PythonParser.YieldExprBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldFrom}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYieldFrom(PythonParser.YieldFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldFrom}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYieldFrom(PythonParser.YieldFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Yield}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield(PythonParser.YieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Yield}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield(PythonParser.YieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTuple}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 */
	void enterStarTuple(PythonParser.StarTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTuple}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 */
	void exitStarTuple(PythonParser.StarTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarSingle}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 */
	void enterStarSingle(PythonParser.StarSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarSingle}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 */
	void exitStarSingle(PythonParser.StarSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 */
	void enterStarExpr(PythonParser.StarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 */
	void exitStarExpr(PythonParser.StarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 */
	void enterPlainExpr(PythonParser.PlainExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 */
	void exitPlainExpr(PythonParser.PlainExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void enterStarNamedExpr(PythonParser.StarNamedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void exitStarNamedExpr(PythonParser.StarNamedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void enterPlainNamedExpr(PythonParser.PlainNamedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void exitPlainNamedExpr(PythonParser.PlainNamedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WalrusExpr}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void enterWalrusExpr(PythonParser.WalrusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WalrusExpr}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void exitWalrusExpr(PythonParser.WalrusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainNamedExpr2}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void enterPlainNamedExpr2(PythonParser.PlainNamedExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainNamedExpr2}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void exitPlainNamedExpr2(PythonParser.PlainNamedExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjunctionPassthrough}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionPassthrough(PythonParser.ConjunctionPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjunctionPassthrough}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionPassthrough(PythonParser.ConjunctionPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InversionPassthrough}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterInversionPassthrough(PythonParser.InversionPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InversionPassthrough}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitInversionPassthrough(PythonParser.InversionPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonPassthrough}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterComparisonPassthrough(PythonParser.ComparisonPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonPassthrough}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitComparisonPassthrough(PythonParser.ComparisonPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(PythonParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(PythonParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseOrPassthrough}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrPassthrough(PythonParser.BitwiseOrPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseOrPassthrough}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrPassthrough(PythonParser.BitwiseOrPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterEqCompare(PythonParser.EqCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitEqCompare(PythonParser.EqCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterNeqCompare(PythonParser.NeqCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitNeqCompare(PythonParser.NeqCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterLteCompare(PythonParser.LteCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitLteCompare(PythonParser.LteCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterLtCompare(PythonParser.LtCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitLtCompare(PythonParser.LtCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterGteCompare(PythonParser.GteCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitGteCompare(PythonParser.GteCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterGtCompare(PythonParser.GtCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitGtCompare(PythonParser.GtCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterNotInCompare(PythonParser.NotInCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitNotInCompare(PythonParser.NotInCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterInCompare(PythonParser.InCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitInCompare(PythonParser.InCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterIsNotCompare(PythonParser.IsNotCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitIsNotCompare(PythonParser.IsNotCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterIsCompare(PythonParser.IsCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitIsCompare(PythonParser.IsCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXorPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void enterBitXorPassthrough(PythonParser.BitXorPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXorPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void exitBitXorPassthrough(PythonParser.BitXorPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpr(PythonParser.BitOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpr(PythonParser.BitOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void enterBitAndPassthrough(PythonParser.BitAndPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void exitBitAndPassthrough(PythonParser.BitAndPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void enterBitXorExpr(PythonParser.BitXorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void exitBitXorExpr(PythonParser.BitXorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpr(PythonParser.BitAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpr(PythonParser.BitAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void enterShiftPassthrough(PythonParser.ShiftPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void exitShiftPassthrough(PythonParser.ShiftPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterLShiftExpr(PythonParser.LShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitLShiftExpr(PythonParser.LShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterRShiftExpr(PythonParser.RShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitRShiftExpr(PythonParser.RShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPassthrough}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterSumPassthrough(PythonParser.SumPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPassthrough}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitSumPassthrough(PythonParser.SumPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(PythonParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(PythonParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void enterTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void exitTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(PythonParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(PythonParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(PythonParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(PythonParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(PythonParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(PythonParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorPassthrough(PythonParser.FactorPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorPassthrough(PythonParser.FactorPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloorDivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFloorDivExpr(PythonParser.FloorDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloorDivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFloorDivExpr(PythonParser.FloorDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(PythonParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(PythonParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatMulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMatMulExpr(PythonParser.MatMulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatMulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMatMulExpr(PythonParser.MatMulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpr(PythonParser.UnaryPlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpr(PythonParser.UnaryPlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(PythonParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(PythonParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryInvertExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInvertExpr(PythonParser.UnaryInvertExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInvertExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInvertExpr(PythonParser.UnaryInvertExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerPassthrough}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPowerPassthrough(PythonParser.PowerPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerPassthrough}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPowerPassthrough(PythonParser.PowerPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitPassthrough}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterAwaitPassthrough(PythonParser.AwaitPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitPassthrough}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitAwaitPassthrough(PythonParser.AwaitPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpr(PythonParser.AwaitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpr(PythonParser.AwaitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryPassthrough}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryPassthrough(PythonParser.PrimaryPassthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryPassthrough}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryPassthrough(PythonParser.PrimaryPassthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PythonParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PythonParser.FuncCallContext ctx);
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
	 * Enter a parse tree produced by the {@code GeneratorCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorCall(PythonParser.GeneratorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorCall(PythonParser.GeneratorCallContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void enterSlices(PythonParser.SlicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void exitSlices(PythonParser.SlicesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Slice}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 */
	void enterSlice(PythonParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Slice}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 */
	void exitSlice(PythonParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceIndex}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 */
	void enterSliceIndex(PythonParser.SliceIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceIndex}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 */
	void exitSliceIndex(PythonParser.SliceIndexContext ctx);
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
	 * Enter a parse tree produced by the {@code ImagAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterImagAtom(PythonParser.ImagAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImagAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitImagAtom(PythonParser.ImagAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterHexAtom(PythonParser.HexAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitHexAtom(PythonParser.HexAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBinAtom(PythonParser.BinAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBinAtom(PythonParser.BinAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OctAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterOctAtom(PythonParser.OctAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OctAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitOctAtom(PythonParser.OctAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterYieldAtom(PythonParser.YieldAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitYieldAtom(PythonParser.YieldAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTupleAtom(PythonParser.TupleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTupleAtom(PythonParser.TupleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenExprAtom(PythonParser.ParenExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenExprAtom(PythonParser.ParenExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGenExprAtom(PythonParser.GenExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGenExprAtom(PythonParser.GenExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyTupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleAtom(PythonParser.EmptyTupleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyTupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleAtom(PythonParser.EmptyTupleAtomContext ctx);
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
	 * Enter a parse tree produced by the {@code ListCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListCompAtom(PythonParser.ListCompAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListCompAtom(PythonParser.ListCompAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmptyListAtom(PythonParser.EmptyListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmptyListAtom(PythonParser.EmptyListAtomContext ctx);
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
	 * Enter a parse tree produced by the {@code DictCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictCompAtom(PythonParser.DictCompAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictCompAtom(PythonParser.DictCompAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyDictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDictAtom(PythonParser.EmptyDictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyDictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDictAtom(PythonParser.EmptyDictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSetAtom(PythonParser.SetAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSetAtom(PythonParser.SetAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSetCompAtom(PythonParser.SetCompAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSetCompAtom(PythonParser.SetCompAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(PythonParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(PythonParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void enterDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void exitDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictPair}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void enterDictPair(PythonParser.DictPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictPair}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void exitDictPair(PythonParser.DictPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 */
	void enterDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 */
	void exitDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 */
	void enterSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 */
	void exitSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 */
	void enterListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 */
	void exitListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void enterGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void exitGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 */
	void enterSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 */
	void exitSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetElement}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(PythonParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetElement}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(PythonParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_if_clauses}.
	 * @param ctx the parse tree
	 */
	void enterFor_if_clauses(PythonParser.For_if_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_if_clauses}.
	 * @param ctx the parse tree
	 */
	void exitFor_if_clauses(PythonParser.For_if_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_if_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_if_clause(PythonParser.For_if_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_if_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_if_clause(PythonParser.For_if_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambda_expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expr(PythonParser.Lambda_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambda_expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expr(PythonParser.Lambda_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambda_params}.
	 * @param ctx the parse tree
	 */
	void enterLambda_params(PythonParser.Lambda_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambda_params}.
	 * @param ctx the parse tree
	 */
	void exitLambda_params(PythonParser.Lambda_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaAllParams}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAllParams(PythonParser.LambdaAllParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaAllParams}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAllParams(PythonParser.LambdaAllParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaDblStar}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDblStar(PythonParser.LambdaDblStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaDblStar}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDblStar(PythonParser.LambdaDblStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnAssign(PythonParser.AnnAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnAssign(PythonParser.AnnAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnAssignParens}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnAssignParens(PythonParser.AnnAssignParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnAssignParens}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnAssignParens(PythonParser.AnnAssignParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnAssignSubscript}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnAssignSubscript(PythonParser.AnnAssignSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnAssignSubscript}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnAssignSubscript(PythonParser.AnnAssignSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterChainedAssign(PythonParser.ChainedAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitChainedAssign(PythonParser.ChainedAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAugAssign(PythonParser.AugAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAugAssign(PythonParser.AugAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedYield}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedYield(PythonParser.AnnotatedYieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedYield}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedYield(PythonParser.AnnotatedYieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedExpr}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedExpr(PythonParser.AnnotatedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedExpr}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedExpr(PythonParser.AnnotatedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugPlus(PythonParser.AugPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugPlus(PythonParser.AugPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugMinus(PythonParser.AugMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugMinus(PythonParser.AugMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugMul(PythonParser.AugMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugMul(PythonParser.AugMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugDiv(PythonParser.AugDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugDiv(PythonParser.AugDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugFloorDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugFloorDiv(PythonParser.AugFloorDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugFloorDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugFloorDiv(PythonParser.AugFloorDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugMod}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugMod(PythonParser.AugModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugMod}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugMod(PythonParser.AugModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugMatMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugMatMul(PythonParser.AugMatMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugMatMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugMatMul(PythonParser.AugMatMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugBitAnd}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugBitAnd(PythonParser.AugBitAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugBitAnd}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugBitAnd(PythonParser.AugBitAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugBitOr}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugBitOr(PythonParser.AugBitOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugBitOr}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugBitOr(PythonParser.AugBitOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugBitXor}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugBitXor(PythonParser.AugBitXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugBitXor}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugBitXor(PythonParser.AugBitXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugLShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugLShift(PythonParser.AugLShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugLShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugLShift(PythonParser.AugLShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugRShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugRShift(PythonParser.AugRShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugRShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugRShift(PythonParser.AugRShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugPow}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugPow(PythonParser.AugPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugPow}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugPow(PythonParser.AugPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTargetTuple}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetTuple(PythonParser.StarTargetTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTargetTuple}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetTuple(PythonParser.StarTargetTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTargetSingle}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetSingle(PythonParser.StarTargetSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTargetSingle}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetSingle(PythonParser.StarTargetSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTargetStar}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetStar(PythonParser.StarTargetStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTargetStar}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetStar(PythonParser.StarTargetStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTargetPlain}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetPlain(PythonParser.StarTargetPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTargetPlain}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetPlain(PythonParser.StarTargetPlainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TargetAttr}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void enterTargetAttr(PythonParser.TargetAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TargetAttr}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void exitTargetAttr(PythonParser.TargetAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TargetSubscript}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void enterTargetSubscript(PythonParser.TargetSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TargetSubscript}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void exitTargetSubscript(PythonParser.TargetSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TargetStarAtom}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void enterTargetStarAtom(PythonParser.TargetStarAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TargetStarAtom}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 */
	void exitTargetStarAtom(PythonParser.TargetStarAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAtomName}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void enterStarAtomName(PythonParser.StarAtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAtomName}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void exitStarAtomName(PythonParser.StarAtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAtomParens}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void enterStarAtomParens(PythonParser.StarAtomParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAtomParens}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void exitStarAtomParens(PythonParser.StarAtomParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAtomTuple}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void enterStarAtomTuple(PythonParser.StarAtomTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAtomTuple}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void exitStarAtomTuple(PythonParser.StarAtomTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAtomList}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void enterStarAtomList(PythonParser.StarAtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAtomList}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 */
	void exitStarAtomList(PythonParser.StarAtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleTargetSub}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void enterSingleTargetSub(PythonParser.SingleTargetSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleTargetSub}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void exitSingleTargetSub(PythonParser.SingleTargetSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleTargetName}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void enterSingleTargetName(PythonParser.SingleTargetNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleTargetName}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void exitSingleTargetName(PythonParser.SingleTargetNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleTargetParens}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void enterSingleTargetParens(PythonParser.SingleTargetParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleTargetParens}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 */
	void exitSingleTargetParens(PythonParser.SingleTargetParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleAttrTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 */
	void enterSingleAttrTarget(PythonParser.SingleAttrTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleAttrTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 */
	void exitSingleAttrTarget(PythonParser.SingleAttrTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleSubscriptTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 */
	void enterSingleSubscriptTarget(PythonParser.SingleSubscriptTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleSubscriptTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 */
	void exitSingleSubscriptTarget(PythonParser.SingleSubscriptTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimarySlice}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimarySlice(PythonParser.TPrimarySliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimarySlice}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimarySlice(PythonParser.TPrimarySliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryAttr}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryAttr(PythonParser.TPrimaryAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryAttr}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryAttr(PythonParser.TPrimaryAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryCall}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryCall(PythonParser.TPrimaryCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryCall}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryCall(PythonParser.TPrimaryCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryGen}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryGen(PythonParser.TPrimaryGenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryGen}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryGen(PythonParser.TPrimaryGenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#del_targets}.
	 * @param ctx the parse tree
	 */
	void enterDel_targets(PythonParser.Del_targetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#del_targets}.
	 * @param ctx the parse tree
	 */
	void exitDel_targets(PythonParser.Del_targetsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelAttr}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void enterDelAttr(PythonParser.DelAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelAttr}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void exitDelAttr(PythonParser.DelAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelSubscript}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void enterDelSubscript(PythonParser.DelSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelSubscript}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void exitDelSubscript(PythonParser.DelSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelName}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void enterDelName(PythonParser.DelNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelName}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 */
	void exitDelName(PythonParser.DelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(PythonParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(PythonParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WalrusArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterWalrusArg(PythonParser.WalrusArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WalrusArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitWalrusArg(PythonParser.WalrusArgContext ctx);
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
	 * Enter a parse tree produced by the {@code DblStarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterDblStarArg(PythonParser.DblStarArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DblStarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitDblStarArg(PythonParser.DblStarArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterStarArg(PythonParser.StarArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitStarArg(PythonParser.StarArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPosArg(PythonParser.PosArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPosArg(PythonParser.PosArgContext ctx);
}
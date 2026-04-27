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
	 * Visit a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtLine(PythonParser.CompoundStmtLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmtNewline(PythonParser.SimpleStmtNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtNewline(PythonParser.CompoundStmtNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyNewline}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyNewline(PythonParser.EmptyNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EofStmt}
	 * labeled alternative in {@link PythonParser#statement_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEofStmt(PythonParser.EofStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simple_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmts(PythonParser.Simple_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAliasStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStmt(PythonParser.TypeAliasStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromStmt(PythonParser.ImportFromStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaiseStmtBare}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStmtBare(PythonParser.RaiseStmtBareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCompound(PythonParser.IfCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCompound(PythonParser.WhileCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCompound(PythonParser.ForCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCompound(PythonParser.WithCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCompound(PythonParser.TryCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchCompound(PythonParser.MatchCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefCompound(PythonParser.FuncDefCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDefCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefCompound(PythonParser.ClassDefCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedCompound(PythonParser.DecoratedCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsyncCompound}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncCompound(PythonParser.AsyncCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_clause(PythonParser.Elif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(PythonParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmtParens}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmtParens(PythonParser.WithStmtParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithItemAs}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItemAs(PythonParser.WithItemAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithItemExpr}
	 * labeled alternative in {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItemExpr(PythonParser.WithItemExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatch}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(PythonParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchStar}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStar(PythonParser.TryCatchStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BareExceptBlock}
	 * labeled alternative in {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareExceptBlock(PythonParser.BareExceptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#except_star_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_star_block(PythonParser.Except_star_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#finally_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(PythonParser.Finally_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#match_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_stmt(PythonParser.Match_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleSubject(PythonParser.TupleSubjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link PythonParser#subject_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSubject(PythonParser.SimpleSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#case_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_block(PythonParser.Case_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(PythonParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SequencePatterns}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencePatterns(PythonParser.SequencePatternsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SinglePattern}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePattern(PythonParser.SinglePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsPattern}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrPatternOnly}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPatternOnly(PythonParser.OrPatternOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#or_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_pattern(PythonParser.Or_patternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPat(PythonParser.LiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CapturePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturePat(PythonParser.CapturePatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPat(PythonParser.GroupPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValuePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePat(PythonParser.ValuePatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPat(PythonParser.ListPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TuplePat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplePat(PythonParser.TuplePatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyMappingPat(PythonParser.EmptyMappingPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DblStarMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblStarMappingPat(PythonParser.DblStarMappingPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ItemsMappingPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsMappingPat(PythonParser.ItemsMappingPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyClassPat}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyClassPat(PythonParser.EmptyClassPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassPatArgs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPatArgs(PythonParser.ClassPatArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassPatKwargs}
	 * labeled alternative in {@link PythonParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPatKwargs(PythonParser.ClassPatKwargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralPat(PythonParser.NumberLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteralPat(PythonParser.FloatLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexLiteralPat(PythonParser.ComplexLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralPat(PythonParser.StringLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteralPat(PythonParser.NoneLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteralPat(PythonParser.TrueLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteralPat}
	 * labeled alternative in {@link PythonParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteralPat(PythonParser.FalseLiteralPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarPat(PythonParser.StarPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonStarPat}
	 * labeled alternative in {@link PythonParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonStarPat(PythonParser.NonStarPatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#items_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems_pattern(PythonParser.Items_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keyword_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_pattern(PythonParser.Keyword_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#name_or_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_or_attr(PythonParser.Name_or_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(PythonParser.Func_defContext ctx);
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
	 * Visit a parse tree produced by the {@code AsyncFuncDef}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncFuncDef(PythonParser.AsyncFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsyncWithStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncWithStmt(PythonParser.AsyncWithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsyncForStmt}
	 * labeled alternative in {@link PythonParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncForStmt(PythonParser.AsyncForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(PythonParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(PythonParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllParams(PythonParser.AllParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultParams(PythonParser.DefaultParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParams(PythonParser.StarParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DblStarOnlyParam}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblStarOnlyParam(PythonParser.DblStarOnlyParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosOnlyParams}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosOnlyParams(PythonParser.PosOnlyParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param_no_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_no_default(PythonParser.Param_no_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_with_default(PythonParser.Param_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param_maybe_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_maybe_default(PythonParser.Param_maybe_defaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BareStar}
	 * labeled alternative in {@link PythonParser#star_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareStar(PythonParser.BareStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#default_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_assignment(PythonParser.Default_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#type_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_alias(PythonParser.Type_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#type_param_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_param_seq(PythonParser.Type_param_seqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeParamBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeVarTupleBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVarTupleBound(PythonParser.TypeVarTupleBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamSpecBound}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSpecBound(PythonParser.ParamSpecBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParam(PythonParser.TypeParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeVarTuple}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVarTuple(PythonParser.TypeVarTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamSpec}
	 * labeled alternative in {@link PythonParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSpec(PythonParser.ParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_names(PythonParser.Import_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelativeModule}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeModule(PythonParser.RelativeModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelativeDots}
	 * labeled alternative in {@link PythonParser#relative_module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDots(PythonParser.RelativeDotsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportParens}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportParens(PythonParser.ImportParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFlat}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFlat(PythonParser.ImportFlatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStar}
	 * labeled alternative in {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStar(PythonParser.ImportStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_from_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from_as_names(PythonParser.Import_from_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_from_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from_as_name(PythonParser.Import_from_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineBlock(PythonParser.InlineBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpr(PythonParser.TupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpr(PythonParser.SingleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(PythonParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjunctionExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionExpr(PythonParser.DisjunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExprBody(PythonParser.LambdaExprBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldExprBody}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldExprBody(PythonParser.YieldExprBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldFrom}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldFrom(PythonParser.YieldFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Yield}
	 * labeled alternative in {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield(PythonParser.YieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTuple}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTuple(PythonParser.StarTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarSingle}
	 * labeled alternative in {@link PythonParser#star_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarSingle(PythonParser.StarSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarExpr(PythonParser.StarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainExpr}
	 * labeled alternative in {@link PythonParser#star_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainExpr(PythonParser.PlainExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarNamedExpr(PythonParser.StarNamedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainNamedExpr}
	 * labeled alternative in {@link PythonParser#star_named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainNamedExpr(PythonParser.PlainNamedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WalrusExpr}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWalrusExpr(PythonParser.WalrusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainNamedExpr2}
	 * labeled alternative in {@link PythonParser#named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainNamedExpr2(PythonParser.PlainNamedExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjunctionPassthrough}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionPassthrough(PythonParser.ConjunctionPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InversionPassthrough}
	 * labeled alternative in {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversionPassthrough(PythonParser.InversionPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonPassthrough}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonPassthrough(PythonParser.ComparisonPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(PythonParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOrPassthrough}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrPassthrough(PythonParser.BitwiseOrPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCompare(PythonParser.EqCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeqCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqCompare(PythonParser.NeqCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteCompare(PythonParser.LteCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtCompare(PythonParser.LtCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GteCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteCompare(PythonParser.GteCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtCompare(PythonParser.GtCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInCompare(PythonParser.NotInCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCompare(PythonParser.InCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotCompare(PythonParser.IsNotCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsCompare}
	 * labeled alternative in {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCompare(PythonParser.IsCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXorPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXorPassthrough(PythonParser.BitXorPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpr(PythonParser.BitOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndPassthrough(PythonParser.BitAndPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXorExpr(PythonParser.BitXorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpr(PythonParser.BitAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftPassthrough}
	 * labeled alternative in {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftPassthrough(PythonParser.ShiftPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLShiftExpr(PythonParser.LShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RShiftExpr}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRShiftExpr(PythonParser.RShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPassthrough}
	 * labeled alternative in {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPassthrough(PythonParser.SumPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(PythonParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermPassthrough}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPassthrough(PythonParser.TermPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PythonParser#sum_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(PythonParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(PythonParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(PythonParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorPassthrough}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPassthrough(PythonParser.FactorPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloorDivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorDivExpr(PythonParser.FloorDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(PythonParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatMulExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatMulExpr(PythonParser.MatMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpr(PythonParser.UnaryPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(PythonParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInvertExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInvertExpr(PythonParser.UnaryInvertExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerPassthrough}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerPassthrough(PythonParser.PowerPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitPassthrough}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitPassthrough(PythonParser.AwaitPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpr(PythonParser.AwaitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryPassthrough}
	 * labeled alternative in {@link PythonParser#await_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryPassthrough(PythonParser.PrimaryPassthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PythonParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAccess(PythonParser.AttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorCall}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorCall(PythonParser.GeneratorCallContext ctx);
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
	 * Visit a parse tree produced by {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlices(PythonParser.SlicesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Slice}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(PythonParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SliceIndex}
	 * labeled alternative in {@link PythonParser#slice_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceIndex(PythonParser.SliceIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAtom(PythonParser.NameAtomContext ctx);
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
	 * Visit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(PythonParser.StringAtomContext ctx);
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
	 * Visit a parse tree produced by the {@code ImagAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagAtom(PythonParser.ImagAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexAtom(PythonParser.HexAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinAtom(PythonParser.BinAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OctAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctAtom(PythonParser.OctAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldAtom(PythonParser.YieldAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleAtom(PythonParser.TupleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExprAtom(PythonParser.ParenExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenExprAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExprAtom(PythonParser.GenExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyTupleAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTupleAtom(PythonParser.EmptyTupleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCompAtom(PythonParser.ListCompAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListAtom(PythonParser.EmptyListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictCompAtom(PythonParser.DictCompAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyDictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDictAtom(PythonParser.EmptyDictAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAtom(PythonParser.SetAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompAtom(PythonParser.SetCompAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(PythonParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictPair}
	 * labeled alternative in {@link PythonParser#dict_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPair(PythonParser.DictPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetElement}
	 * labeled alternative in {@link PythonParser#set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(PythonParser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_if_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_if_clauses(PythonParser.For_if_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_if_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_if_clause(PythonParser.For_if_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambda_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expr(PythonParser.Lambda_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambda_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_params(PythonParser.Lambda_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaAllParams}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAllParams(PythonParser.LambdaAllParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaDblStar}
	 * labeled alternative in {@link PythonParser#lambda_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDblStar(PythonParser.LambdaDblStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnAssign(PythonParser.AnnAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnAssignParens}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnAssignParens(PythonParser.AnnAssignParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnAssignSubscript}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnAssignSubscript(PythonParser.AnnAssignSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedAssign(PythonParser.ChainedAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssign}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssign(PythonParser.AugAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedYield}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedYield(PythonParser.AnnotatedYieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedExpr}
	 * labeled alternative in {@link PythonParser#annotated_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedExpr(PythonParser.AnnotatedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugPlus(PythonParser.AugPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugMinus(PythonParser.AugMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugMul(PythonParser.AugMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugDiv(PythonParser.AugDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugFloorDiv}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugFloorDiv(PythonParser.AugFloorDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugMod}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugMod(PythonParser.AugModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugMatMul}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugMatMul(PythonParser.AugMatMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugBitAnd}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugBitAnd(PythonParser.AugBitAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugBitOr}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugBitOr(PythonParser.AugBitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugBitXor}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugBitXor(PythonParser.AugBitXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugLShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugLShift(PythonParser.AugLShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugRShift}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugRShift(PythonParser.AugRShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugPow}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugPow(PythonParser.AugPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTargetTuple}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetTuple(PythonParser.StarTargetTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTargetSingle}
	 * labeled alternative in {@link PythonParser#star_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetSingle(PythonParser.StarTargetSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTargetStar}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetStar(PythonParser.StarTargetStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTargetPlain}
	 * labeled alternative in {@link PythonParser#star_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetPlain(PythonParser.StarTargetPlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TargetAttr}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetAttr(PythonParser.TargetAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TargetSubscript}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetSubscript(PythonParser.TargetSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TargetStarAtom}
	 * labeled alternative in {@link PythonParser#target_with_star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetStarAtom(PythonParser.TargetStarAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAtomName}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAtomName(PythonParser.StarAtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAtomParens}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAtomParens(PythonParser.StarAtomParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAtomTuple}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAtomTuple(PythonParser.StarAtomTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAtomList}
	 * labeled alternative in {@link PythonParser#star_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAtomList(PythonParser.StarAtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleTargetSub}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTargetSub(PythonParser.SingleTargetSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleTargetName}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTargetName(PythonParser.SingleTargetNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleTargetParens}
	 * labeled alternative in {@link PythonParser#single_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTargetParens(PythonParser.SingleTargetParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleAttrTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAttrTarget(PythonParser.SingleAttrTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleSubscriptTarget}
	 * labeled alternative in {@link PythonParser#single_subscript_attr_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSubscriptTarget(PythonParser.SingleSubscriptTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimarySlice}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimarySlice(PythonParser.TPrimarySliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryAttr}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryAttr(PythonParser.TPrimaryAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryCall}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryCall(PythonParser.TPrimaryCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryGen}
	 * labeled alternative in {@link PythonParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryGen(PythonParser.TPrimaryGenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#del_targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_targets(PythonParser.Del_targetsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelAttr}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelAttr(PythonParser.DelAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelSubscript}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelSubscript(PythonParser.DelSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelName}
	 * labeled alternative in {@link PythonParser#del_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelName(PythonParser.DelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(PythonParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WalrusArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWalrusArg(PythonParser.WalrusArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DblStarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblStarArg(PythonParser.DblStarArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarArg(PythonParser.StarArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosArg(PythonParser.PosArgContext ctx);
}
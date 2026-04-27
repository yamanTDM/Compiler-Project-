// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, FALSE=3, NONE=4, TRUE=5, AND=6, AS=7, ASSERT=8, ASYNC=9, 
		AWAIT=10, BREAK=11, CLASS=12, CONTINUE=13, DEF=14, DEL=15, ELIF=16, ELSE=17, 
		EXCEPT=18, FINALLY=19, FOR=20, FROM=21, GLOBAL=22, IF=23, IMPORT=24, IN=25, 
		IS=26, LAMBDA=27, NONLOCAL=28, NOT=29, OR=30, PASS=31, RAISE=32, RETURN=33, 
		TRY=34, WHILE=35, WITH=36, YIELD=37, MATCH=38, CASE=39, TYPE=40, INT_LIT=41, 
		BIN_INTEGER=42, OCT_INTEGER=43, HEX_INTEGER=44, FLOAT_NUMBER=45, IMAG_NUMBER=46, 
		LONG_STRING=47, SHORT_STRING=48, BYTES_LITERAL=49, NAME=50, PLUS_ASSIGN=51, 
		MINUS_ASSIGN=52, STAR_STAR_ASSIGN=53, STAR_ASSIGN=54, SLASH_SLASH_ASSIGN=55, 
		SLASH_ASSIGN=56, PERCENT_ASSIGN=57, AT_ASSIGN=58, AMP_ASSIGN=59, PIPE_ASSIGN=60, 
		CARET_ASSIGN=61, LSHIFT_ASSIGN=62, RSHIFT_ASSIGN=63, WALRUS=64, EQ=65, 
		NEQ=66, LTE=67, GTE=68, LT=69, GT=70, STAR_STAR=71, SLASH_SLASH=72, PLUS=73, 
		MINUS=74, STAR=75, SLASH=76, PERCENT=77, AT=78, LSHIFT=79, RSHIFT=80, 
		AMP=81, PIPE=82, CARET=83, TILDE=84, ASSIGN=85, ARROW=86, LPAREN=87, RPAREN=88, 
		LBRACKET=89, RBRACKET=90, LBRACE=91, RBRACE=92, COMMA=93, COLON=94, SEMI=95, 
		DOT=96, ELLIPSIS=97, NEWLINE=98, TYPE_COMMENT=99, LINE_COMMENT=100, WS=101, 
		LINE_JOINING=102, UNKNOWN=103;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_statement_newline = 2, RULE_simple_stmts = 3, 
		RULE_simple_stmt = 4, RULE_compound_stmt = 5, RULE_if_stmt = 6, RULE_elif_clause = 7, 
		RULE_else_clause = 8, RULE_while_stmt = 9, RULE_for_stmt = 10, RULE_with_stmt = 11, 
		RULE_with_item = 12, RULE_try_stmt = 13, RULE_except_block = 14, RULE_except_star_block = 15, 
		RULE_finally_clause = 16, RULE_match_stmt = 17, RULE_subject_expr = 18, 
		RULE_case_block = 19, RULE_guard = 20, RULE_patterns = 21, RULE_pattern = 22, 
		RULE_or_pattern = 23, RULE_closed_pattern = 24, RULE_literal_pattern = 25, 
		RULE_maybe_star_pattern = 26, RULE_items_pattern = 27, RULE_keyword_pattern = 28, 
		RULE_name_or_attr = 29, RULE_func_def = 30, RULE_decorated = 31, RULE_decorator = 32, 
		RULE_async_stmt = 33, RULE_class_def = 34, RULE_parameter_list = 35, RULE_parameters = 36, 
		RULE_param_no_default = 37, RULE_param_with_default = 38, RULE_param_maybe_default = 39, 
		RULE_star_param = 40, RULE_annotation = 41, RULE_default_assignment = 42, 
		RULE_type_alias = 43, RULE_type_param_seq = 44, RULE_type_param = 45, 
		RULE_import_names = 46, RULE_dotted_as_name = 47, RULE_dotted_name = 48, 
		RULE_relative_module = 49, RULE_import_from_targets = 50, RULE_import_from_as_names = 51, 
		RULE_import_from_as_name = 52, RULE_block = 53, RULE_expressions = 54, 
		RULE_expression = 55, RULE_yield_expr = 56, RULE_star_expressions = 57, 
		RULE_star_expression = 58, RULE_star_named_expression = 59, RULE_named_expression = 60, 
		RULE_disjunction = 61, RULE_conjunction = 62, RULE_inversion = 63, RULE_comparison = 64, 
		RULE_compare_op = 65, RULE_bitwise_or = 66, RULE_bitwise_xor = 67, RULE_bitwise_and = 68, 
		RULE_shift_expr = 69, RULE_sum_expr = 70, RULE_term = 71, RULE_factor = 72, 
		RULE_power = 73, RULE_await_primary = 74, RULE_primary = 75, RULE_slices = 76, 
		RULE_slice_item = 77, RULE_atom = 78, RULE_strings = 79, RULE_dict_item = 80, 
		RULE_dictcomp = 81, RULE_setcomp = 82, RULE_listcomp = 83, RULE_genexp = 84, 
		RULE_set_item = 85, RULE_for_if_clauses = 86, RULE_for_if_clause = 87, 
		RULE_lambda_expr = 88, RULE_lambda_params = 89, RULE_lambda_parameters = 90, 
		RULE_assignment = 91, RULE_annotated_rhs = 92, RULE_augassign = 93, RULE_star_targets = 94, 
		RULE_star_target = 95, RULE_target_with_star_atom = 96, RULE_star_atom = 97, 
		RULE_single_target = 98, RULE_single_subscript_attr_target = 99, RULE_t_primary = 100, 
		RULE_del_targets = 101, RULE_del_target = 102, RULE_argument_list = 103, 
		RULE_argument = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "statement_newline", "simple_stmts", "simple_stmt", 
			"compound_stmt", "if_stmt", "elif_clause", "else_clause", "while_stmt", 
			"for_stmt", "with_stmt", "with_item", "try_stmt", "except_block", "except_star_block", 
			"finally_clause", "match_stmt", "subject_expr", "case_block", "guard", 
			"patterns", "pattern", "or_pattern", "closed_pattern", "literal_pattern", 
			"maybe_star_pattern", "items_pattern", "keyword_pattern", "name_or_attr", 
			"func_def", "decorated", "decorator", "async_stmt", "class_def", "parameter_list", 
			"parameters", "param_no_default", "param_with_default", "param_maybe_default", 
			"star_param", "annotation", "default_assignment", "type_alias", "type_param_seq", 
			"type_param", "import_names", "dotted_as_name", "dotted_name", "relative_module", 
			"import_from_targets", "import_from_as_names", "import_from_as_name", 
			"block", "expressions", "expression", "yield_expr", "star_expressions", 
			"star_expression", "star_named_expression", "named_expression", "disjunction", 
			"conjunction", "inversion", "comparison", "compare_op", "bitwise_or", 
			"bitwise_xor", "bitwise_and", "shift_expr", "sum_expr", "term", "factor", 
			"power", "await_primary", "primary", "slices", "slice_item", "atom", 
			"strings", "dict_item", "dictcomp", "setcomp", "listcomp", "genexp", 
			"set_item", "for_if_clauses", "for_if_clause", "lambda_expr", "lambda_params", 
			"lambda_parameters", "assignment", "annotated_rhs", "augassign", "star_targets", 
			"star_target", "target_with_star_atom", "star_atom", "single_target", 
			"single_subscript_attr_target", "t_primary", "del_targets", "del_target", 
			"argument_list", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'False'", "'None'", "'True'", "'and'", "'as'", "'assert'", 
			"'async'", "'await'", "'break'", "'class'", "'continue'", "'def'", "'del'", 
			"'elif'", "'else'", "'except'", "'finally'", "'for'", "'from'", "'global'", 
			"'if'", "'import'", "'in'", "'is'", "'lambda'", "'nonlocal'", "'not'", 
			"'or'", "'pass'", "'raise'", "'return'", "'try'", "'while'", "'with'", 
			"'yield'", "'match'", "'case'", "'type'", null, null, null, null, null, 
			null, null, null, null, null, "'+='", "'-='", "'**='", "'*='", "'//='", 
			"'/='", "'%='", "'@='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "':='", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'**'", "'//'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'@'", "'<<'", "'>>'", "'&'", "'|'", "'^'", 
			"'~'", "'='", "'->'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"':'", "';'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "FALSE", "NONE", "TRUE", "AND", "AS", "ASSERT", 
			"ASYNC", "AWAIT", "BREAK", "CLASS", "CONTINUE", "DEF", "DEL", "ELIF", 
			"ELSE", "EXCEPT", "FINALLY", "FOR", "FROM", "GLOBAL", "IF", "IMPORT", 
			"IN", "IS", "LAMBDA", "NONLOCAL", "NOT", "OR", "PASS", "RAISE", "RETURN", 
			"TRY", "WHILE", "WITH", "YIELD", "MATCH", "CASE", "TYPE", "INT_LIT", 
			"BIN_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "FLOAT_NUMBER", "IMAG_NUMBER", 
			"LONG_STRING", "SHORT_STRING", "BYTES_LITERAL", "NAME", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "STAR_STAR_ASSIGN", "STAR_ASSIGN", "SLASH_SLASH_ASSIGN", 
			"SLASH_ASSIGN", "PERCENT_ASSIGN", "AT_ASSIGN", "AMP_ASSIGN", "PIPE_ASSIGN", 
			"CARET_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "WALRUS", "EQ", "NEQ", 
			"LTE", "GTE", "LT", "GT", "STAR_STAR", "SLASH_SLASH", "PLUS", "MINUS", 
			"STAR", "SLASH", "PERCENT", "AT", "LSHIFT", "RSHIFT", "AMP", "PIPE", 
			"CARET", "TILDE", "ASSIGN", "ARROW", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMI", "DOT", "ELLIPSIS", 
			"NEWLINE", "TYPE_COMMENT", "LINE_COMMENT", "WS", "LINE_JOINING", "UNKNOWN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251248882483000L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123367L) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtLineContext extends StatementContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public SimpleStmtLineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStmtLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStmtLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStmtLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtLineContext extends StatementContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public CompoundStmtLineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NONE:
			case TRUE:
			case ASSERT:
			case AWAIT:
			case BREAK:
			case CONTINUE:
			case DEL:
			case FROM:
			case GLOBAL:
			case IMPORT:
			case LAMBDA:
			case NONLOCAL:
			case NOT:
			case PASS:
			case RAISE:
			case RETURN:
			case YIELD:
			case TYPE:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new SimpleStmtLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				simple_stmts();
				}
				break;
			case ASYNC:
			case CLASS:
			case DEF:
			case FOR:
			case IF:
			case TRY:
			case WHILE:
			case WITH:
			case MATCH:
			case AT:
				_localctx = new CompoundStmtLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				compound_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_newlineContext extends ParserRuleContext {
		public Statement_newlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_newline; }
	 
		public Statement_newlineContext() { }
		public void copyFrom(Statement_newlineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyNewlineContext extends Statement_newlineContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public EmptyNewlineContext(Statement_newlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtNewlineContext extends Statement_newlineContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public CompoundStmtNewlineContext(Statement_newlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EofStmtContext extends Statement_newlineContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public EofStmtContext(Statement_newlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEofStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEofStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEofStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtNewlineContext extends Statement_newlineContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public SimpleStmtNewlineContext(Statement_newlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStmtNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStmtNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStmtNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_newlineContext statement_newline() throws RecognitionException {
		Statement_newlineContext _localctx = new Statement_newlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_newline);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NONE:
			case TRUE:
			case ASSERT:
			case AWAIT:
			case BREAK:
			case CONTINUE:
			case DEL:
			case FROM:
			case GLOBAL:
			case IMPORT:
			case LAMBDA:
			case NONLOCAL:
			case NOT:
			case PASS:
			case RAISE:
			case RETURN:
			case YIELD:
			case TYPE:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new SimpleStmtNewlineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				simple_stmts();
				}
				break;
			case ASYNC:
			case CLASS:
			case DEF:
			case FOR:
			case IF:
			case TRY:
			case WHILE:
			case WITH:
			case MATCH:
			case AT:
				_localctx = new CompoundStmtNewlineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				compound_stmt();
				setState(224);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new EmptyNewlineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(NEWLINE);
				}
				break;
			case EOF:
				_localctx = new EofStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtsContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PythonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PythonParser.SEMI, i);
		}
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimple_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimple_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimple_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			simple_stmt();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(SEMI);
					setState(232);
					simple_stmt();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(238);
				match(SEMI);
				}
			}

			setState(241);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtContext extends ParserRuleContext {
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	 
		public Simple_stmtContext() { }
		public void copyFrom(Simple_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonlocalStmtContext extends Simple_stmtContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public NonlocalStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonlocalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonlocalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonlocalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends Simple_stmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelStmtContext extends Simple_stmtContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public Del_targetsContext del_targets() {
			return getRuleContext(Del_targetsContext.class,0);
		}
		public DelStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassStmtContext extends Simple_stmtContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public PassStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPassStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPassStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStmtContext extends Simple_stmtContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RaiseStmtContext extends Simple_stmtContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public RaiseStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaiseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaiseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRaiseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RaiseStmtBareContext extends Simple_stmtContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public RaiseStmtBareContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaiseStmtBare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaiseStmtBare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRaiseStmtBare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends Simple_stmtContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public ContinueStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAliasStmtContext extends Simple_stmtContext {
		public Type_aliasContext type_alias() {
			return getRuleContext(Type_aliasContext.class,0);
		}
		public TypeAliasStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeAliasStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeAliasStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeAliasStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends Simple_stmtContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Import_namesContext import_names() {
			return getRuleContext(Import_namesContext.class,0);
		}
		public ImportStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends Simple_stmtContext {
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public ExprStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends Simple_stmtContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public BreakStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStmtContext extends Simple_stmtContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public YieldStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertStmtContext extends Simple_stmtContext {
		public TerminalNode ASSERT() { return getToken(PythonParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public AssertStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends Simple_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public ReturnStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromStmtContext extends Simple_stmtContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public Relative_moduleContext relative_module() {
			return getRuleContext(Relative_moduleContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Import_from_targetsContext import_from_targets() {
			return getRuleContext(Import_from_targetsContext.class,0);
		}
		public ImportFromStmtContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_stmt);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				assignment();
				}
				break;
			case 2:
				_localctx = new TypeAliasStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				type_alias();
				}
				break;
			case 3:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				star_expressions();
				}
				break;
			case 4:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(RETURN);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123335L) != 0)) {
					{
					setState(247);
					star_expressions();
					}
				}

				}
				break;
			case 5:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(IMPORT);
				setState(251);
				import_names();
				}
				break;
			case 6:
				_localctx = new ImportFromStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(FROM);
				setState(253);
				relative_module();
				setState(254);
				match(IMPORT);
				setState(255);
				import_from_targets();
				}
				break;
			case 7:
				_localctx = new RaiseStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(RAISE);
				setState(258);
				expression();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(259);
					match(FROM);
					setState(260);
					expression();
					}
				}

				}
				break;
			case 8:
				_localctx = new RaiseStmtBareContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(RAISE);
				}
				break;
			case 9:
				_localctx = new PassStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(264);
				match(PASS);
				}
				break;
			case 10:
				_localctx = new DelStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(265);
				match(DEL);
				setState(266);
				del_targets();
				}
				break;
			case 11:
				_localctx = new YieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(267);
				match(YIELD);
				setState(268);
				yield_expr();
				}
				break;
			case 12:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(269);
				match(ASSERT);
				setState(270);
				expression();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(271);
					match(COMMA);
					setState(272);
					expression();
					}
				}

				}
				break;
			case 13:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(275);
				match(BREAK);
				}
				break;
			case 14:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(276);
				match(CONTINUE);
				}
				break;
			case 15:
				_localctx = new GlobalStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(277);
				match(GLOBAL);
				setState(278);
				match(NAME);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					match(NAME);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 16:
				_localctx = new NonlocalStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(286);
				match(NONLOCAL);
				setState(287);
				match(NAME);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(288);
					match(COMMA);
					setState(289);
					match(NAME);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileCompoundContext extends Compound_stmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhileCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhileCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhileCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithCompoundContext extends Compound_stmtContext {
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public WithCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefCompoundContext extends Compound_stmtContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public FuncDefCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFuncDefCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFuncDefCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFuncDefCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncCompoundContext extends Compound_stmtContext {
		public Async_stmtContext async_stmt() {
			return getRuleContext(Async_stmtContext.class,0);
		}
		public AsyncCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefCompoundContext extends Compound_stmtContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public ClassDefCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDefCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDefCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedCompoundContext extends Compound_stmtContext {
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public DecoratedCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecoratedCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecoratedCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecoratedCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfCompoundContext extends Compound_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryCompoundContext extends Compound_stmtContext {
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public TryCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchCompoundContext extends Compound_stmtContext {
		public Match_stmtContext match_stmt() {
			return getRuleContext(Match_stmtContext.class,0);
		}
		public MatchCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatchCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatchCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatchCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCompoundContext extends Compound_stmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForCompoundContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compound_stmt);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfCompoundContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				if_stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileCompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				while_stmt();
				}
				break;
			case FOR:
				_localctx = new ForCompoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				for_stmt();
				}
				break;
			case WITH:
				_localctx = new WithCompoundContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				with_stmt();
				}
				break;
			case TRY:
				_localctx = new TryCompoundContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				try_stmt();
				}
				break;
			case MATCH:
				_localctx = new MatchCompoundContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				match_stmt();
				}
				break;
			case DEF:
				_localctx = new FuncDefCompoundContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				func_def();
				}
				break;
			case CLASS:
				_localctx = new ClassDefCompoundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				class_def();
				}
				break;
			case AT:
				_localctx = new DecoratedCompoundContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				decorated();
				}
				break;
			case ASYNC:
				_localctx = new AsyncCompoundContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				async_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Elif_clauseContext> elif_clause() {
			return getRuleContexts(Elif_clauseContext.class);
		}
		public Elif_clauseContext elif_clause(int i) {
			return getRuleContext(Elif_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IF);
			setState(310);
			named_expression();
			setState(311);
			match(COLON);
			setState(312);
			block();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(313);
				elif_clause();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(319);
				else_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_clauseContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_clauseContext elif_clause() throws RecognitionException {
		Elif_clauseContext _localctx = new Elif_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ELIF);
			setState(323);
			named_expression();
			setState(324);
			match(COLON);
			setState(325);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ELSE);
			setState(328);
			match(COLON);
			setState(329);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(WHILE);
			setState(332);
			named_expression();
			setState(333);
			match(COLON);
			setState(334);
			block();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(335);
				else_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOR);
			setState(339);
			star_targets();
			setState(340);
			match(IN);
			setState(341);
			star_expressions();
			setState(342);
			match(COLON);
			setState(343);
			block();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(344);
				else_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_stmtContext extends ParserRuleContext {
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
	 
		public With_stmtContext() { }
		public void copyFrom(With_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithStmtContext extends With_stmtContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public WithStmtContext(With_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithStmtParensContext extends With_stmtContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public WithStmtParensContext(With_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithStmtParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithStmtParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithStmtParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_with_stmt);
		int _la;
		try {
			int _alt;
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new WithStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(WITH);
				setState(348);
				with_item();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(349);
					match(COMMA);
					setState(350);
					with_item();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(COLON);
				setState(357);
				block();
				}
				break;
			case 2:
				_localctx = new WithStmtParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(WITH);
				setState(360);
				match(LPAREN);
				setState(361);
				with_item();
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						match(COMMA);
						setState(363);
						with_item();
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(369);
					match(COMMA);
					}
				}

				setState(372);
				match(RPAREN);
				setState(373);
				match(COLON);
				setState(374);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_itemContext extends ParserRuleContext {
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
	 
		public With_itemContext() { }
		public void copyFrom(With_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithItemAsContext extends With_itemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public WithItemAsContext(With_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithItemAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithItemAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithItemAs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithItemExprContext extends With_itemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WithItemExprContext(With_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithItemExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithItemExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithItemExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_with_item);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new WithItemAsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				expression();
				setState(379);
				match(AS);
				setState(380);
				star_target();
				}
				break;
			case 2:
				_localctx = new WithItemExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_stmtContext extends ParserRuleContext {
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
	 
		public Try_stmtContext() { }
		public void copyFrom(Try_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchContext extends Try_stmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Except_blockContext> except_block() {
			return getRuleContexts(Except_blockContext.class);
		}
		public Except_blockContext except_block(int i) {
			return getRuleContext(Except_blockContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryCatchContext(Try_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStarContext extends Try_stmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Except_star_blockContext> except_star_block() {
			return getRuleContexts(Except_star_blockContext.class);
		}
		public Except_star_blockContext except_star_block(int i) {
			return getRuleContext(Except_star_blockContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryCatchStarContext(Try_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryCatchStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryCatchStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryCatchStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryFinallyContext extends Try_stmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryFinallyContext(Try_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_try_stmt);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new TryCatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(TRY);
				setState(386);
				match(COLON);
				setState(387);
				block();
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					except_block();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(393);
					else_clause();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(396);
					finally_clause();
					}
				}

				}
				break;
			case 2:
				_localctx = new TryCatchStarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(TRY);
				setState(400);
				match(COLON);
				setState(401);
				block();
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(402);
					except_star_block();
					}
					}
					setState(405); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(407);
					else_clause();
					}
				}

				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(410);
					finally_clause();
					}
				}

				}
				break;
			case 3:
				_localctx = new TryFinallyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(TRY);
				setState(414);
				match(COLON);
				setState(415);
				block();
				setState(416);
				finally_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Except_blockContext extends ParserRuleContext {
		public Except_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_block; }
	 
		public Except_blockContext() { }
		public void copyFrom(Except_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExceptBlockContext extends Except_blockContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExceptBlockContext(Except_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExceptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExceptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExceptBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareExceptBlockContext extends Except_blockContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BareExceptBlockContext(Except_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBareExceptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBareExceptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBareExceptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_blockContext except_block() throws RecognitionException {
		Except_blockContext _localctx = new Except_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_except_block);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ExceptBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(EXCEPT);
				setState(421);
				expression();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(422);
					match(AS);
					setState(423);
					match(NAME);
					}
				}

				setState(426);
				match(COLON);
				setState(427);
				block();
				}
				break;
			case 2:
				_localctx = new BareExceptBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(EXCEPT);
				setState(430);
				match(COLON);
				setState(431);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Except_star_blockContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_star_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_star_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExcept_star_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExcept_star_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExcept_star_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_star_blockContext except_star_block() throws RecognitionException {
		Except_star_blockContext _localctx = new Except_star_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_except_star_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(EXCEPT);
			setState(435);
			match(STAR);
			setState(436);
			expression();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(437);
				match(AS);
				setState(438);
				match(NAME);
				}
			}

			setState(441);
			match(COLON);
			setState(442);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFinally_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFinally_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FINALLY);
			setState(445);
			match(COLON);
			setState(446);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_stmtContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(PythonParser.MATCH, 0); }
		public Subject_exprContext subject_expr() {
			return getRuleContext(Subject_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Match_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_stmtContext match_stmt() throws RecognitionException {
		Match_stmtContext _localctx = new Match_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_match_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(MATCH);
			setState(449);
			subject_expr();
			setState(450);
			match(COLON);
			setState(451);
			match(NEWLINE);
			setState(452);
			match(INDENT);
			setState(454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(453);
				case_block();
				}
				}
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(458);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subject_exprContext extends ParserRuleContext {
		public Subject_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_expr; }
	 
		public Subject_exprContext() { }
		public void copyFrom(Subject_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSubjectContext extends Subject_exprContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public SimpleSubjectContext(Subject_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleSubject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleSubjectContext extends Subject_exprContext {
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TupleSubjectContext(Subject_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subject_exprContext subject_expr() throws RecognitionException {
		Subject_exprContext _localctx = new Subject_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subject_expr);
		int _la;
		try {
			int _alt;
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new TupleSubjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				star_named_expression();
				setState(463); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(461);
						match(COMMA);
						setState(462);
						star_named_expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(467);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new SimpleSubjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PythonParser.CASE, 0); }
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCase_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCase_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(CASE);
			setState(474);
			patterns();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(475);
				guard();
				}
			}

			setState(478);
			match(COLON);
			setState(479);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(IF);
			setState(482);
			named_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternsContext extends ParserRuleContext {
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
	 
		public PatternsContext() { }
		public void copyFrom(PatternsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequencePatternsContext extends PatternsContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SequencePatternsContext(PatternsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSequencePatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSequencePatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSequencePatterns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SinglePatternContext extends PatternsContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public SinglePatternContext(PatternsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSinglePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSinglePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSinglePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_patterns);
		int _la;
		try {
			int _alt;
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new SequencePatternsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				pattern();
				setState(487); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(485);
						match(COMMA);
						setState(486);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(489); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(491);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new SinglePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsPatternContext extends PatternContext {
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AsPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrPatternOnlyContext extends PatternContext {
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public OrPatternOnlyContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOrPatternOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOrPatternOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrPatternOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pattern);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new AsPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				or_pattern();
				setState(498);
				match(AS);
				setState(499);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new OrPatternOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				or_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Or_patternContext extends ParserRuleContext {
		public List<Closed_patternContext> closed_pattern() {
			return getRuleContexts(Closed_patternContext.class);
		}
		public Closed_patternContext closed_pattern(int i) {
			return getRuleContext(Closed_patternContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(PythonParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(PythonParser.PIPE, i);
		}
		public Or_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOr_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOr_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOr_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_patternContext or_pattern() throws RecognitionException {
		Or_patternContext _localctx = new Or_patternContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_or_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			closed_pattern();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(505);
				match(PIPE);
				setState(506);
				closed_pattern();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closed_patternContext extends ParserRuleContext {
		public Closed_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closed_pattern; }
	 
		public Closed_patternContext() { }
		public void copyFrom(Closed_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TuplePatContext extends Closed_patternContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<Maybe_star_patternContext> maybe_star_pattern() {
			return getRuleContexts(Maybe_star_patternContext.class);
		}
		public Maybe_star_patternContext maybe_star_pattern(int i) {
			return getRuleContext(Maybe_star_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TuplePatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTuplePat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTuplePat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTuplePat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CapturePatContext extends Closed_patternContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public CapturePatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCapturePat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCapturePat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCapturePat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListPatContext extends Closed_patternContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public List<Maybe_star_patternContext> maybe_star_pattern() {
			return getRuleContexts(Maybe_star_patternContext.class);
		}
		public Maybe_star_patternContext maybe_star_pattern(int i) {
			return getRuleContext(Maybe_star_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPatArgsContext extends Closed_patternContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<Keyword_patternContext> keyword_pattern() {
			return getRuleContexts(Keyword_patternContext.class);
		}
		public Keyword_patternContext keyword_pattern(int i) {
			return getRuleContext(Keyword_patternContext.class,i);
		}
		public ClassPatArgsContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassPatArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassPatArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassPatArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DblStarMappingPatContext extends Closed_patternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public DblStarMappingPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDblStarMappingPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDblStarMappingPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDblStarMappingPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyMappingPatContext extends Closed_patternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public EmptyMappingPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyMappingPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyMappingPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyMappingPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyClassPatContext extends Closed_patternContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public EmptyClassPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyClassPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyClassPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyClassPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPatContext extends Closed_patternContext {
		public Literal_patternContext literal_pattern() {
			return getRuleContext(Literal_patternContext.class,0);
		}
		public LiteralPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItemsMappingPatContext extends Closed_patternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public List<Items_patternContext> items_pattern() {
			return getRuleContexts(Items_patternContext.class);
		}
		public Items_patternContext items_pattern(int i) {
			return getRuleContext(Items_patternContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ItemsMappingPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterItemsMappingPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitItemsMappingPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitItemsMappingPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupPatContext extends Closed_patternContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public GroupPatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroupPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroupPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGroupPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuePatContext extends Closed_patternContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public ValuePatContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValuePat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValuePat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValuePat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPatKwargsContext extends Closed_patternContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<Keyword_patternContext> keyword_pattern() {
			return getRuleContexts(Keyword_patternContext.class);
		}
		public Keyword_patternContext keyword_pattern(int i) {
			return getRuleContext(Keyword_patternContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ClassPatKwargsContext(Closed_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassPatKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassPatKwargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassPatKwargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closed_patternContext closed_pattern() throws RecognitionException {
		Closed_patternContext _localctx = new Closed_patternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_closed_pattern);
		int _la;
		try {
			int _alt;
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new LiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				literal_pattern();
				}
				break;
			case 2:
				_localctx = new CapturePatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(NAME);
				}
				break;
			case 3:
				_localctx = new GroupPatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(LPAREN);
				setState(515);
				pattern();
				setState(516);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ValuePatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(NAME);
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(519);
					match(DOT);
					setState(520);
					match(NAME);
					}
					}
					setState(523); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case 5:
				_localctx = new ListPatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				match(LBRACKET);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2148445720674360L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 172035L) != 0)) {
					{
					setState(526);
					maybe_star_pattern();
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(527);
							match(COMMA);
							setState(528);
							maybe_star_pattern();
							}
							} 
						}
						setState(533);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					}
				}

				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(536);
					match(COMMA);
					}
				}

				setState(539);
				match(RBRACKET);
				}
				break;
			case 6:
				_localctx = new TuplePatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				match(LPAREN);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2148445720674360L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 172035L) != 0)) {
					{
					setState(541);
					maybe_star_pattern();
					setState(546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(542);
							match(COMMA);
							setState(543);
							maybe_star_pattern();
							}
							} 
						}
						setState(548);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					}
				}

				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(551);
					match(COMMA);
					}
				}

				setState(554);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new EmptyMappingPatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				match(LBRACE);
				setState(556);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new DblStarMappingPatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(557);
				match(LBRACE);
				setState(558);
				match(STAR);
				setState(559);
				match(STAR);
				setState(560);
				match(NAME);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(561);
					match(COMMA);
					}
				}

				setState(564);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new ItemsMappingPatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				match(LBRACE);
				setState(566);
				items_pattern();
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(COMMA);
						setState(568);
						items_pattern();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(574);
					match(COMMA);
					setState(575);
					match(STAR);
					setState(576);
					match(STAR);
					setState(577);
					match(NAME);
					}
					break;
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(580);
					match(COMMA);
					}
				}

				setState(583);
				match(RBRACE);
				}
				break;
			case 10:
				_localctx = new EmptyClassPatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(585);
				name_or_attr();
				setState(586);
				match(LPAREN);
				setState(587);
				match(RPAREN);
				}
				break;
			case 11:
				_localctx = new ClassPatArgsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(589);
				name_or_attr();
				setState(590);
				match(LPAREN);
				setState(591);
				pattern();
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(COMMA);
						setState(593);
						pattern();
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(599);
						match(COMMA);
						setState(600);
						keyword_pattern();
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(606);
					match(COMMA);
					}
				}

				setState(609);
				match(RPAREN);
				}
				break;
			case 12:
				_localctx = new ClassPatKwargsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(611);
				name_or_attr();
				setState(612);
				match(LPAREN);
				setState(613);
				keyword_pattern();
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(614);
						match(COMMA);
						setState(615);
						keyword_pattern();
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(621);
					match(COMMA);
					}
				}

				setState(624);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_patternContext extends ParserRuleContext {
		public Literal_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_pattern; }
	 
		public Literal_patternContext() { }
		public void copyFrom(Literal_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralPatContext extends Literal_patternContext {
		public TerminalNode INT_LIT() { return getToken(PythonParser.INT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public NumberLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumberLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumberLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralPatContext extends Literal_patternContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalseLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalseLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralPatContext extends Literal_patternContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralPatContext extends Literal_patternContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrueLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrueLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexLiteralPatContext extends Literal_patternContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(PythonParser.FLOAT_NUMBER, 0); }
		public TerminalNode IMAG_NUMBER() { return getToken(PythonParser.IMAG_NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public List<TerminalNode> MINUS() { return getTokens(PythonParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PythonParser.MINUS, i);
		}
		public ComplexLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComplexLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComplexLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralPatContext extends Literal_patternContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoneLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoneLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralPatContext extends Literal_patternContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(PythonParser.FLOAT_NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public FloatLiteralPatContext(Literal_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFloatLiteralPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFloatLiteralPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFloatLiteralPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal_pattern);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new NumberLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(628);
					match(MINUS);
					}
				}

				setState(631);
				match(INT_LIT);
				}
				break;
			case 2:
				_localctx = new FloatLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(632);
					match(MINUS);
					}
				}

				setState(635);
				match(FLOAT_NUMBER);
				}
				break;
			case 3:
				_localctx = new ComplexLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(636);
					match(MINUS);
					}
				}

				setState(639);
				match(FLOAT_NUMBER);
				setState(640);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(641);
				match(IMAG_NUMBER);
				}
				break;
			case 4:
				_localctx = new StringLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				strings();
				}
				break;
			case 5:
				_localctx = new NoneLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				match(NONE);
				}
				break;
			case 6:
				_localctx = new TrueLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(644);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new FalseLiteralPatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(645);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Maybe_star_patternContext extends ParserRuleContext {
		public Maybe_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_star_pattern; }
	 
		public Maybe_star_patternContext() { }
		public void copyFrom(Maybe_star_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarPatContext extends Maybe_star_patternContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public StarPatContext(Maybe_star_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarPat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonStarPatContext extends Maybe_star_patternContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public NonStarPatContext(Maybe_star_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonStarPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonStarPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonStarPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_star_patternContext maybe_star_pattern() throws RecognitionException {
		Maybe_star_patternContext _localctx = new Maybe_star_patternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_maybe_star_pattern);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarPatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(STAR);
				setState(649);
				match(NAME);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case INT_LIT:
			case FLOAT_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case MINUS:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
				_localctx = new NonStarPatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				pattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Items_patternContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public TerminalNode INT_LIT() { return getToken(PythonParser.INT_LIT, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(PythonParser.FLOAT_NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public Items_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterItems_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitItems_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitItems_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Items_patternContext items_pattern() throws RecognitionException {
		Items_patternContext _localctx = new Items_patternContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_items_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(653);
				strings();
				}
				break;
			case 2:
				{
				setState(654);
				match(NONE);
				}
				break;
			case 3:
				{
				setState(655);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(656);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(657);
					match(MINUS);
					}
				}

				setState(660);
				match(INT_LIT);
				}
				break;
			case 6:
				{
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(661);
					match(MINUS);
					}
				}

				setState(664);
				match(FLOAT_NUMBER);
				}
				break;
			}
			setState(667);
			match(COLON);
			setState(668);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyword_patternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Keyword_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeyword_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeyword_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeyword_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_patternContext keyword_pattern() throws RecognitionException {
		Keyword_patternContext _localctx = new Keyword_patternContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_keyword_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(NAME);
			setState(671);
			match(ASSIGN);
			setState(672);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_or_attrContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public Name_or_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_or_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterName_or_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitName_or_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitName_or_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_or_attrContext name_or_attr() throws RecognitionException {
		Name_or_attrContext _localctx = new Name_or_attrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_name_or_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(NAME);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(675);
				match(DOT);
				setState(676);
				match(NAME);
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Type_param_seqContext type_param_seq() {
			return getRuleContext(Type_param_seqContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(DEF);
			setState(683);
			match(NAME);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(684);
				type_param_seq();
				}
			}

			setState(687);
			match(LPAREN);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==STAR) {
				{
				setState(688);
				parameter_list();
				}
			}

			setState(691);
			match(RPAREN);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(692);
				match(ARROW);
				setState(693);
				expression();
				}
			}

			setState(696);
			match(COLON);
			setState(697);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedContext extends ParserRuleContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Async_stmtContext async_stmt() {
			return getRuleContext(Async_stmtContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decorated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(699);
				decorator();
				}
				}
				setState(702); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(704);
				class_def();
				}
				break;
			case DEF:
				{
				setState(705);
				func_def();
				}
				break;
			case ASYNC:
				{
				setState(706);
				async_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(AT);
			setState(710);
			named_expression();
			setState(711);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Async_stmtContext extends ParserRuleContext {
		public Async_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_stmt; }
	 
		public Async_stmtContext() { }
		public void copyFrom(Async_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncForStmtContext extends Async_stmtContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public AsyncForStmtContext(Async_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncFuncDefContext extends Async_stmtContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public AsyncFuncDefContext(Async_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncWithStmtContext extends Async_stmtContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public AsyncWithStmtContext(Async_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncWithStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncWithStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Async_stmtContext async_stmt() throws RecognitionException {
		Async_stmtContext _localctx = new Async_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_async_stmt);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new AsyncFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(ASYNC);
				setState(714);
				func_def();
				}
				break;
			case 2:
				_localctx = new AsyncWithStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(ASYNC);
				setState(716);
				with_stmt();
				}
				break;
			case 3:
				_localctx = new AsyncForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(ASYNC);
				setState(718);
				for_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Type_param_seqContext type_param_seq() {
			return getRuleContext(Type_param_seqContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(CLASS);
			setState(722);
			match(NAME);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(723);
				type_param_seq();
				}
			}

			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(726);
				match(LPAREN);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123335L) != 0)) {
					{
					setState(727);
					argument_list();
					}
				}

				setState(730);
				match(RPAREN);
				}
			}

			setState(733);
			match(COLON);
			setState(734);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosOnlyParamsContext extends ParametersContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Star_paramContext star_param() {
			return getRuleContext(Star_paramContext.class,0);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public PosOnlyParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPosOnlyParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPosOnlyParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPosOnlyParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParamsContext extends ParametersContext {
		public Star_paramContext star_param() {
			return getRuleContext(Star_paramContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public StarParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DblStarOnlyParamContext extends ParametersContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public DblStarOnlyParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDblStarOnlyParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDblStarOnlyParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDblStarOnlyParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllParamsContext extends ParametersContext {
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Star_paramContext star_param() {
			return getRuleContext(Star_paramContext.class,0);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public AllParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAllParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAllParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAllParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultParamsContext extends ParametersContext {
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_paramContext star_param() {
			return getRuleContext(Star_paramContext.class,0);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public DefaultParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDefaultParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDefaultParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDefaultParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameters);
		int _la;
		try {
			int _alt;
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new AllParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				param_no_default();
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(COMMA);
						setState(740);
						param_no_default();
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(746);
						match(COMMA);
						setState(747);
						param_with_default();
						}
						} 
					}
					setState(752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(753);
					match(COMMA);
					setState(754);
					star_param();
					}
					break;
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						match(COMMA);
						setState(758);
						param_maybe_default();
						}
						} 
					}
					setState(763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(764);
					match(COMMA);
					setState(765);
					match(STAR);
					setState(766);
					match(STAR);
					setState(767);
					param_no_default();
					}
					break;
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(770);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new DefaultParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				param_with_default();
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(774);
						match(COMMA);
						setState(775);
						param_with_default();
						}
						} 
					}
					setState(780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(781);
					match(COMMA);
					setState(782);
					star_param();
					}
					break;
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(785);
						match(COMMA);
						setState(786);
						param_maybe_default();
						}
						} 
					}
					setState(791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(792);
					match(COMMA);
					setState(793);
					match(STAR);
					setState(794);
					match(STAR);
					setState(795);
					param_no_default();
					}
					break;
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(798);
					match(COMMA);
					}
				}

				}
				break;
			case 3:
				_localctx = new StarParamsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				star_param();
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(802);
						match(COMMA);
						setState(803);
						param_maybe_default();
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(809);
					match(COMMA);
					setState(810);
					match(STAR);
					setState(811);
					match(STAR);
					setState(812);
					param_no_default();
					}
					break;
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(815);
					match(COMMA);
					}
				}

				}
				break;
			case 4:
				_localctx = new DblStarOnlyParamContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(818);
				match(STAR);
				setState(819);
				match(STAR);
				setState(820);
				param_no_default();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(821);
					match(COMMA);
					}
				}

				}
				break;
			case 5:
				_localctx = new PosOnlyParamsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(824);
					param_no_default();
					}
					}
					setState(827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(829);
				match(SLASH);
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(830);
						match(COMMA);
						setState(831);
						param_no_default();
						}
						} 
					}
					setState(836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(837);
						match(COMMA);
						setState(838);
						param_with_default();
						}
						} 
					}
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(844);
					match(COMMA);
					setState(845);
					star_param();
					}
					break;
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(848);
						match(COMMA);
						setState(849);
						param_maybe_default();
						}
						} 
					}
					setState(854);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(855);
					match(COMMA);
					setState(856);
					match(STAR);
					setState(857);
					match(STAR);
					setState(858);
					param_no_default();
					}
					break;
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(861);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_no_defaultContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Param_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_no_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_no_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_no_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParam_no_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_no_defaultContext param_no_default() throws RecognitionException {
		Param_no_defaultContext _localctx = new Param_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_param_no_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(NAME);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(867);
				annotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_with_defaultContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Param_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_with_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_with_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_with_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParam_with_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_with_defaultContext param_with_default() throws RecognitionException {
		Param_with_defaultContext _localctx = new Param_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_param_with_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(NAME);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(871);
				annotation();
				}
			}

			setState(874);
			default_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_maybe_defaultContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public Param_maybe_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_maybe_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_maybe_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_maybe_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParam_maybe_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_maybe_defaultContext param_maybe_default() throws RecognitionException {
		Param_maybe_defaultContext _localctx = new Param_maybe_defaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_param_maybe_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(NAME);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(877);
				annotation();
				}
			}

			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(880);
				default_assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_paramContext extends ParserRuleContext {
		public Star_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_param; }
	 
		public Star_paramContext() { }
		public void copyFrom(Star_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParamContext extends Star_paramContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public StarParamContext(Star_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareStarContext extends Star_paramContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public BareStarContext(Star_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBareStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBareStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBareStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_paramContext star_param() throws RecognitionException {
		Star_paramContext _localctx = new Star_paramContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_star_param);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new StarParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(STAR);
				setState(884);
				match(NAME);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(885);
					annotation();
					}
				}

				}
				break;
			case 2:
				_localctx = new BareStarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				match(STAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(COLON);
			setState(892);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDefault_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDefault_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDefault_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_assignmentContext default_assignment() throws RecognitionException {
		Default_assignmentContext _localctx = new Default_assignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_default_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(ASSIGN);
			setState(895);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_aliasContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PythonParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_param_seqContext type_param_seq() {
			return getRuleContext(Type_param_seqContext.class,0);
		}
		public Type_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitType_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_aliasContext type_alias() throws RecognitionException {
		Type_aliasContext _localctx = new Type_aliasContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(TYPE);
			setState(898);
			match(NAME);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(899);
				type_param_seq();
				}
			}

			setState(902);
			match(ASSIGN);
			setState(903);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_param_seqContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Type_param_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_param_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_param_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitType_param_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_param_seqContext type_param_seq() throws RecognitionException {
		Type_param_seqContext _localctx = new Type_param_seqContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type_param_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(LBRACKET);
			setState(906);
			type_param();
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(907);
					match(COMMA);
					setState(908);
					type_param();
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(914);
				match(COMMA);
				}
			}

			setState(917);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_paramContext extends ParserRuleContext {
		public Type_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param; }
	 
		public Type_paramContext() { }
		public void copyFrom(Type_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamSpecContext extends Type_paramContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ParamSpecContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamContext extends Type_paramContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TypeParamContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamBoundContext extends Type_paramContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeParamBoundContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParamBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParamBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParamBound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamSpecBoundContext extends Type_paramContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParamSpecBoundContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamSpecBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamSpecBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamSpecBound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeVarTupleBoundContext extends Type_paramContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeVarTupleBoundContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeVarTupleBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeVarTupleBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeVarTupleBound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeVarTupleContext extends Type_paramContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TypeVarTupleContext(Type_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeVarTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeVarTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeVarTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_paramContext type_param() throws RecognitionException {
		Type_paramContext _localctx = new Type_paramContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_type_param);
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new TypeParamBoundContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				match(NAME);
				setState(920);
				match(COLON);
				setState(921);
				expression();
				}
				break;
			case 2:
				_localctx = new TypeVarTupleBoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(STAR);
				setState(923);
				match(NAME);
				setState(924);
				match(COLON);
				setState(925);
				expression();
				}
				break;
			case 3:
				_localctx = new ParamSpecBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(STAR);
				setState(927);
				match(STAR);
				setState(928);
				match(NAME);
				setState(929);
				match(COLON);
				setState(930);
				expression();
				}
				break;
			case 4:
				_localctx = new TypeParamContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
				match(NAME);
				}
				break;
			case 5:
				_localctx = new TypeVarTupleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(932);
				match(STAR);
				setState(933);
				match(NAME);
				}
				break;
			case 6:
				_localctx = new ParamSpecContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(934);
				match(STAR);
				setState(935);
				match(STAR);
				setState(936);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Import_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_namesContext import_names() throws RecognitionException {
		Import_namesContext _localctx = new Import_namesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_import_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			dotted_as_name();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(940);
				match(COMMA);
				setState(941);
				dotted_as_name();
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			dotted_name();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(948);
				match(AS);
				setState(949);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(NAME);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(953);
				match(DOT);
				setState(954);
				match(NAME);
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relative_moduleContext extends ParserRuleContext {
		public Relative_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_module; }
	 
		public Relative_moduleContext() { }
		public void copyFrom(Relative_moduleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelativeModuleContext extends Relative_moduleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public RelativeModuleContext(Relative_moduleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRelativeModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRelativeModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRelativeModule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelativeDotsContext extends Relative_moduleContext {
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public RelativeDotsContext(Relative_moduleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRelativeDots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRelativeDots(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRelativeDots(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relative_moduleContext relative_module() throws RecognitionException {
		Relative_moduleContext _localctx = new Relative_moduleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relative_module);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new RelativeModuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(960);
					match(DOT);
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				dotted_name();
				}
				break;
			case 2:
				_localctx = new RelativeDotsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(968); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(967);
					match(DOT);
					}
					}
					setState(970); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_from_targetsContext extends ParserRuleContext {
		public Import_from_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_targets; }
	 
		public Import_from_targetsContext() { }
		public void copyFrom(Import_from_targetsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportParensContext extends Import_from_targetsContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Import_from_as_namesContext import_from_as_names() {
			return getRuleContext(Import_from_as_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ImportParensContext(Import_from_targetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFlatContext extends Import_from_targetsContext {
		public Import_from_as_namesContext import_from_as_names() {
			return getRuleContext(Import_from_as_namesContext.class,0);
		}
		public ImportFlatContext(Import_from_targetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFlat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFlat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFlat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStarContext extends Import_from_targetsContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ImportStarContext(Import_from_targetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_from_targetsContext import_from_targets() throws RecognitionException {
		Import_from_targetsContext _localctx = new Import_from_targetsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_import_from_targets);
		int _la;
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ImportParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				match(LPAREN);
				setState(975);
				import_from_as_names();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(976);
					match(COMMA);
					}
				}

				setState(979);
				match(RPAREN);
				}
				break;
			case NAME:
				_localctx = new ImportFlatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				import_from_as_names();
				}
				break;
			case STAR:
				_localctx = new ImportStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(982);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_from_as_namesContext extends ParserRuleContext {
		public List<Import_from_as_nameContext> import_from_as_name() {
			return getRuleContexts(Import_from_as_nameContext.class);
		}
		public Import_from_as_nameContext import_from_as_name(int i) {
			return getRuleContext(Import_from_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Import_from_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_from_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_from_as_namesContext import_from_as_names() throws RecognitionException {
		Import_from_as_namesContext _localctx = new Import_from_as_namesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_import_from_as_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			import_from_as_name();
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(986);
					match(COMMA);
					setState(987);
					import_from_as_name();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_from_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Import_from_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_from_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_from_as_nameContext import_from_as_name() throws RecognitionException {
		Import_from_as_nameContext _localctx = new Import_from_as_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_import_from_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(NAME);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(994);
				match(AS);
				setState(995);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndentedBlockContext extends BlockContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IndentedBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIndentedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIndentedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIndentedBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineBlockContext extends BlockContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public InlineBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInlineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInlineBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInlineBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NONE:
			case TRUE:
			case ASSERT:
			case AWAIT:
			case BREAK:
			case CONTINUE:
			case DEL:
			case FROM:
			case GLOBAL:
			case IMPORT:
			case LAMBDA:
			case NONLOCAL:
			case NOT:
			case PASS:
			case RAISE:
			case RETURN:
			case YIELD:
			case TYPE:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new InlineBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				simple_stmts();
				}
				break;
			case NEWLINE:
				_localctx = new IndentedBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(NEWLINE);
				setState(1000);
				match(INDENT);
				setState(1002); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1001);
					statement();
					}
					}
					setState(1004); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2251248882483000L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123367L) != 0) );
				setState(1006);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	 
		public ExpressionsContext() { }
		public void copyFrom(ExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleExprContext extends ExpressionsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleExprContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExprContext extends ExpressionsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TupleExprContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressions);
		int _la;
		try {
			int _alt;
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new TupleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				expression();
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1011);
						match(COMMA);
						setState(1012);
						expression();
						}
						} 
					}
					setState(1017);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1018);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new SingleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionExprContext extends ExpressionContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDisjunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDisjunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDisjunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprBodyContext extends ExpressionContext {
		public Lambda_exprContext lambda_expr() {
			return getRuleContext(Lambda_exprContext.class,0);
		}
		public LambdaExprBodyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaExprBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaExprBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaExprBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldExprBodyContext extends ExpressionContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public YieldExprBodyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldExprBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldExprBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldExprBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExprContext extends ExpressionContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expression);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new TernaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				disjunction(0);
				setState(1025);
				match(IF);
				setState(1026);
				disjunction(0);
				setState(1027);
				match(ELSE);
				setState(1028);
				expression();
				}
				break;
			case 2:
				_localctx = new DisjunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				disjunction(0);
				}
				break;
			case 3:
				_localctx = new LambdaExprBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				lambda_expr();
				}
				break;
			case 4:
				_localctx = new YieldExprBodyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				yield_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Yield_exprContext extends ParserRuleContext {
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
	 
		public Yield_exprContext() { }
		public void copyFrom(Yield_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldContext extends Yield_exprContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public YieldContext(Yield_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYield(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldFromContext extends Yield_exprContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldFromContext(Yield_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_yield_expr);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new YieldFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				match(YIELD);
				setState(1036);
				match(FROM);
				setState(1037);
				expression();
				}
				break;
			case 2:
				_localctx = new YieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				match(YIELD);
				setState(1040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1039);
					star_expressions();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_expressionsContext extends ParserRuleContext {
		public Star_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expressions; }
	 
		public Star_expressionsContext() { }
		public void copyFrom(Star_expressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTupleContext extends Star_expressionsContext {
		public List<Star_expressionContext> star_expression() {
			return getRuleContexts(Star_expressionContext.class);
		}
		public Star_expressionContext star_expression(int i) {
			return getRuleContext(Star_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarTupleContext(Star_expressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarSingleContext extends Star_expressionsContext {
		public Star_expressionContext star_expression() {
			return getRuleContext(Star_expressionContext.class,0);
		}
		public StarSingleContext(Star_expressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_expressionsContext star_expressions() throws RecognitionException {
		Star_expressionsContext _localctx = new Star_expressionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_star_expressions);
		try {
			int _alt;
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new StarTupleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				star_expression();
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1045);
						match(COMMA);
						setState(1046);
						star_expression();
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(1053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1052);
					match(COMMA);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new StarSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				star_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_expressionContext extends ParserRuleContext {
		public Star_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expression; }
	 
		public Star_expressionContext() { }
		public void copyFrom(Star_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarExprContext extends Star_expressionContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public StarExprContext(Star_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainExprContext extends Star_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlainExprContext(Star_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPlainExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPlainExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlainExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_expressionContext star_expression() throws RecognitionException {
		Star_expressionContext _localctx = new Star_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_star_expression);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(STAR);
				setState(1059);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case AWAIT:
			case LAMBDA:
			case NOT:
			case YIELD:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new PlainExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_named_expressionContext extends ParserRuleContext {
		public Star_named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expression; }
	 
		public Star_named_expressionContext() { }
		public void copyFrom(Star_named_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainNamedExprContext extends Star_named_expressionContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public PlainNamedExprContext(Star_named_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPlainNamedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPlainNamedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlainNamedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarNamedExprContext extends Star_named_expressionContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public StarNamedExprContext(Star_named_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarNamedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarNamedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarNamedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_named_expressionContext star_named_expression() throws RecognitionException {
		Star_named_expressionContext _localctx = new Star_named_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_star_named_expression);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarNamedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(STAR);
				setState(1064);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case AWAIT:
			case LAMBDA:
			case NOT:
			case YIELD:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new PlainNamedExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				named_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_expressionContext extends ParserRuleContext {
		public Named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_expression; }
	 
		public Named_expressionContext() { }
		public void copyFrom(Named_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WalrusExprContext extends Named_expressionContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode WALRUS() { return getToken(PythonParser.WALRUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WalrusExprContext(Named_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWalrusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWalrusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWalrusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainNamedExpr2Context extends Named_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlainNamedExpr2Context(Named_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPlainNamedExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPlainNamedExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlainNamedExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_expressionContext named_expression() throws RecognitionException {
		Named_expressionContext _localctx = new Named_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_named_expression);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new WalrusExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				match(NAME);
				setState(1069);
				match(WALRUS);
				setState(1070);
				expression();
				}
				break;
			case 2:
				_localctx = new PlainNamedExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionContext extends ParserRuleContext {
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
	 
		public DisjunctionContext() { }
		public void copyFrom(DisjunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionPassthroughContext extends DisjunctionContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConjunctionPassthroughContext(DisjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConjunctionPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConjunctionPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConjunctionPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends DisjunctionContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public OrExprContext(DisjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		return disjunction(0);
	}

	private DisjunctionContext disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, _parentState);
		DisjunctionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConjunctionPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1075);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new DisjunctionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(1077);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1078);
					match(OR);
					setState(1079);
					conjunction(0);
					}
					} 
				}
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionContext extends ParserRuleContext {
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	 
		public ConjunctionContext() { }
		public void copyFrom(ConjunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ConjunctionContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public AndExprContext(ConjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InversionPassthroughContext extends ConjunctionContext {
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public InversionPassthroughContext(ConjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInversionPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInversionPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInversionPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		return conjunction(0);
	}

	private ConjunctionContext conjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, _parentState);
		ConjunctionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InversionPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1086);
			inversion();
			}
			_ctx.stop = _input.LT(-1);
			setState(1093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new ConjunctionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(1088);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1089);
					match(AND);
					setState(1090);
					inversion();
					}
					} 
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InversionContext extends ParserRuleContext {
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
	 
		public InversionContext() { }
		public void copyFrom(InversionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonPassthroughContext extends InversionContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonPassthroughContext(InversionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparisonPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparisonPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends InversionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public NotExprContext(InversionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_inversion);
		try {
			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(NOT);
				setState(1097);
				inversion();
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case AWAIT:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new ComparisonPassthroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrPassthroughContext extends ComparisonContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public BitwiseOrPassthroughContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseOrPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseOrPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseOrPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ComparisonContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public List<Compare_opContext> compare_op() {
			return getRuleContexts(Compare_opContext.class);
		}
		public Compare_opContext compare_op(int i) {
			return getRuleContext(Compare_opContext.class,i);
		}
		public CompareExprContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_comparison);
		try {
			int _alt;
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				bitwise_or(0);
				setState(1103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1102);
						compare_op();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new BitwiseOrPassthroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				bitwise_or(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_opContext extends ParserRuleContext {
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
	 
		public Compare_opContext() { }
		public void copyFrom(Compare_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsCompareContext extends Compare_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public IsCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtCompareContext extends Compare_opContext {
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public LtCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLtCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLtCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLtCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InCompareContext extends Compare_opContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public InCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotCompareContext extends Compare_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public IsNotCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsNotCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsNotCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsNotCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInCompareContext extends Compare_opContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public NotInCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotInCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotInCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotInCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteCompareContext extends Compare_opContext {
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public GteCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGteCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGteCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGteCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtCompareContext extends Compare_opContext {
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public GtCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGtCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGtCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGtCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteCompareContext extends Compare_opContext {
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public LteCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLteCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLteCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLteCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqCompareContext extends Compare_opContext {
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public EqCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEqCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEqCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqCompareContext extends Compare_opContext {
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public NeqCompareContext(Compare_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNeqCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNeqCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNeqCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_compare_op);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new EqCompareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(EQ);
				setState(1111);
				bitwise_or(0);
				}
				break;
			case 2:
				_localctx = new NeqCompareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(NEQ);
				setState(1113);
				bitwise_or(0);
				}
				break;
			case 3:
				_localctx = new LteCompareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				match(LTE);
				setState(1115);
				bitwise_or(0);
				}
				break;
			case 4:
				_localctx = new LtCompareContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1116);
				match(LT);
				setState(1117);
				bitwise_or(0);
				}
				break;
			case 5:
				_localctx = new GteCompareContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1118);
				match(GTE);
				setState(1119);
				bitwise_or(0);
				}
				break;
			case 6:
				_localctx = new GtCompareContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1120);
				match(GT);
				setState(1121);
				bitwise_or(0);
				}
				break;
			case 7:
				_localctx = new NotInCompareContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1122);
				match(NOT);
				setState(1123);
				match(IN);
				setState(1124);
				bitwise_or(0);
				}
				break;
			case 8:
				_localctx = new InCompareContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1125);
				match(IN);
				setState(1126);
				bitwise_or(0);
				}
				break;
			case 9:
				_localctx = new IsNotCompareContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1127);
				match(IS);
				setState(1128);
				match(NOT);
				setState(1129);
				bitwise_or(0);
				}
				break;
			case 10:
				_localctx = new IsCompareContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1130);
				match(IS);
				setState(1131);
				bitwise_or(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
	 
		public Bitwise_orContext() { }
		public void copyFrom(Bitwise_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXorPassthroughContext extends Bitwise_orContext {
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public BitXorPassthroughContext(Bitwise_orContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitXorPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitXorPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitXorPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrExprContext extends Bitwise_orContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(PythonParser.PIPE, 0); }
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public BitOrExprContext(Bitwise_orContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		return bitwise_or(0);
	}

	private Bitwise_orContext bitwise_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, _parentState);
		Bitwise_orContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_bitwise_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BitXorPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1135);
			bitwise_xor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitOrExprContext(new Bitwise_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_or);
					setState(1137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1138);
					match(PIPE);
					setState(1139);
					bitwise_xor(0);
					}
					} 
				}
				setState(1144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitwise_xorContext extends ParserRuleContext {
		public Bitwise_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor; }
	 
		public Bitwise_xorContext() { }
		public void copyFrom(Bitwise_xorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndPassthroughContext extends Bitwise_xorContext {
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public BitAndPassthroughContext(Bitwise_xorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitAndPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitAndPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitAndPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXorExprContext extends Bitwise_xorContext {
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public TerminalNode CARET() { return getToken(PythonParser.CARET, 0); }
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public BitXorExprContext(Bitwise_xorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitXorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitXorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_xorContext bitwise_xor() throws RecognitionException {
		return bitwise_xor(0);
	}

	private Bitwise_xorContext bitwise_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_xorContext _localctx = new Bitwise_xorContext(_ctx, _parentState);
		Bitwise_xorContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_bitwise_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BitAndPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1146);
			bitwise_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitXorExprContext(new Bitwise_xorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_xor);
					setState(1148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1149);
					match(CARET);
					setState(1150);
					bitwise_and(0);
					}
					} 
				}
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitwise_andContext extends ParserRuleContext {
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
	 
		public Bitwise_andContext() { }
		public void copyFrom(Bitwise_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndExprContext extends Bitwise_andContext {
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public TerminalNode AMP() { return getToken(PythonParser.AMP, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public BitAndExprContext(Bitwise_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftPassthroughContext extends Bitwise_andContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public ShiftPassthroughContext(Bitwise_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShiftPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShiftPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitShiftPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		return bitwise_and(0);
	}

	private Bitwise_andContext bitwise_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, _parentState);
		Bitwise_andContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_bitwise_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1157);
			shift_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitAndExprContext(new Bitwise_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_and);
					setState(1159);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1160);
					match(AMP);
					setState(1161);
					shift_expr(0);
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_exprContext extends ParserRuleContext {
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	 
		public Shift_exprContext() { }
		public void copyFrom(Shift_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LShiftExprContext extends Shift_exprContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(PythonParser.LSHIFT, 0); }
		public Sum_exprContext sum_expr() {
			return getRuleContext(Sum_exprContext.class,0);
		}
		public LShiftExprContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RShiftExprContext extends Shift_exprContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(PythonParser.RSHIFT, 0); }
		public Sum_exprContext sum_expr() {
			return getRuleContext(Sum_exprContext.class,0);
		}
		public RShiftExprContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumPassthroughContext extends Shift_exprContext {
		public Sum_exprContext sum_expr() {
			return getRuleContext(Sum_exprContext.class,0);
		}
		public SumPassthroughContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSumPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSumPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSumPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		return shift_expr(0);
	}

	private Shift_exprContext shift_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, _parentState);
		Shift_exprContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_shift_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SumPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1168);
			sum_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new LShiftExprContext(new Shift_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(1170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1171);
						match(LSHIFT);
						setState(1172);
						sum_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new RShiftExprContext(new Shift_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(1173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1174);
						match(RSHIFT);
						setState(1175);
						sum_expr(0);
						}
						break;
					}
					} 
				}
				setState(1180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sum_exprContext extends ParserRuleContext {
		public Sum_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_expr; }
	 
		public Sum_exprContext() { }
		public void copyFrom(Sum_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends Sum_exprContext {
		public Sum_exprContext sum_expr() {
			return getRuleContext(Sum_exprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubExprContext(Sum_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermPassthroughContext extends Sum_exprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermPassthroughContext(Sum_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTermPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTermPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTermPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends Sum_exprContext {
		public Sum_exprContext sum_expr() {
			return getRuleContext(Sum_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddExprContext(Sum_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_exprContext sum_expr() throws RecognitionException {
		return sum_expr(0);
	}

	private Sum_exprContext sum_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sum_exprContext _localctx = new Sum_exprContext(_ctx, _parentState);
		Sum_exprContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_sum_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1182);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new Sum_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sum_expr);
						setState(1184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1185);
						match(PLUS);
						setState(1186);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new SubExprContext(new Sum_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sum_expr);
						setState(1187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1188);
						match(MINUS);
						setState(1189);
						term(0);
						}
						break;
					}
					} 
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DivExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorPassthroughContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorPassthroughContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFactorPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFactorPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFactorPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SLASH_SLASH() { return getToken(PythonParser.SLASH_SLASH, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FloorDivExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFloorDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFloorDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFloorDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(PythonParser.PERCENT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ModExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatMulExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MatMulExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactorPassthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1196);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1199);
						match(STAR);
						setState(1200);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1202);
						match(SLASH);
						setState(1203);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new FloorDivExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1205);
						match(SLASH_SLASH);
						setState(1206);
						factor();
						}
						break;
					case 4:
						{
						_localctx = new ModExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1208);
						match(PERCENT);
						setState(1209);
						factor();
						}
						break;
					case 5:
						{
						_localctx = new MatMulExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1211);
						match(AT);
						setState(1212);
						factor();
						}
						break;
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusExprContext extends FactorContext {
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryPlusExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUnaryPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUnaryPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUnaryPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerPassthroughContext extends FactorContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerPassthroughContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPowerPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPowerPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPowerPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends FactorContext {
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryMinusExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryInvertExprContext extends FactorContext {
		public TerminalNode TILDE() { return getToken(PythonParser.TILDE, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryInvertExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUnaryInvertExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUnaryInvertExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUnaryInvertExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_factor);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new UnaryPlusExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(PLUS);
				setState(1219);
				factor();
				}
				break;
			case MINUS:
				_localctx = new UnaryMinusExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				match(MINUS);
				setState(1221);
				factor();
				}
				break;
			case TILDE:
				_localctx = new UnaryInvertExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				match(TILDE);
				setState(1223);
				factor();
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case AWAIT:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new PowerPassthroughContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1224);
				power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	 
		public PowerContext() { }
		public void copyFrom(PowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExprContext extends PowerContext {
		public Await_primaryContext await_primary() {
			return getRuleContext(Await_primaryContext.class,0);
		}
		public TerminalNode STAR_STAR() { return getToken(PythonParser.STAR_STAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerExprContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitPassthroughContext extends PowerContext {
		public Await_primaryContext await_primary() {
			return getRuleContext(Await_primaryContext.class,0);
		}
		public AwaitPassthroughContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAwaitPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAwaitPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAwaitPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_power);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new PowerExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				await_primary();
				setState(1228);
				match(STAR_STAR);
				setState(1229);
				factor();
				}
				break;
			case 2:
				_localctx = new AwaitPassthroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				await_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Await_primaryContext extends ParserRuleContext {
		public Await_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_await_primary; }
	 
		public Await_primaryContext() { }
		public void copyFrom(Await_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExprContext extends Await_primaryContext {
		public TerminalNode AWAIT() { return getToken(PythonParser.AWAIT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AwaitExprContext(Await_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAwaitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAwaitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAwaitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryPassthroughContext extends Await_primaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryPassthroughContext(Await_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrimaryPassthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrimaryPassthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrimaryPassthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Await_primaryContext await_primary() throws RecognitionException {
		Await_primaryContext _localctx = new Await_primaryContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_await_primary);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
				_localctx = new AwaitExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				match(AWAIT);
				setState(1235);
				primary(0);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new PrimaryPassthroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				primary(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends PrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public FuncCallContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrAccessContext extends PrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AttrAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorCallContext extends PrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public GeneratorCallContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGeneratorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGeneratorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGeneratorCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends PrimaryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptAccessContext extends PrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public SubscriptAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubscriptAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubscriptAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscriptAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1240);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(1257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						_localctx = new AttrAccessContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1242);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1243);
						match(DOT);
						setState(1244);
						match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new SubscriptAccessContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1246);
						slices();
						}
						break;
					case 3:
						{
						_localctx = new GeneratorCallContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1248);
						genexp();
						}
						break;
					case 4:
						{
						_localctx = new FuncCallContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1250);
						match(LPAREN);
						setState(1252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123335L) != 0)) {
							{
							setState(1251);
							argument_list();
							}
						}

						setState(1254);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlicesContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public List<Slice_itemContext> slice_item() {
			return getRuleContexts(Slice_itemContext.class);
		}
		public Slice_itemContext slice_item(int i) {
			return getRuleContext(Slice_itemContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicesContext slices() throws RecognitionException {
		SlicesContext _localctx = new SlicesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_slices);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(LBRACKET);
			setState(1261);
			slice_item();
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1262);
					match(COMMA);
					setState(1263);
					slice_item();
					}
					} 
				}
				setState(1268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1269);
				match(COMMA);
				}
			}

			setState(1272);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slice_itemContext extends ParserRuleContext {
		public Slice_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_item; }
	 
		public Slice_itemContext() { }
		public void copyFrom(Slice_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceIndexContext extends Slice_itemContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public SliceIndexContext(Slice_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSliceIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSliceIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSliceIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceContext extends Slice_itemContext {
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(Slice_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_itemContext slice_item() throws RecognitionException {
		Slice_itemContext _localctx = new Slice_itemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_slice_item);
		int _la;
		try {
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new SliceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123331L) != 0)) {
					{
					setState(1274);
					expression();
					}
				}

				setState(1277);
				match(COLON);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123331L) != 0)) {
					{
					setState(1278);
					expression();
					}
				}

				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1281);
					match(COLON);
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123331L) != 0)) {
						{
						setState(1282);
						expression();
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new SliceIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictCompAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public DictcompContext dictcomp() {
			return getRuleContext(DictcompContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public DictCompAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictCompAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictCompAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictCompAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenExprAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public GenExprAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGenExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGenExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TupleAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListCompAtomContext extends AtomContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public ListcompContext listcomp() {
			return getRuleContext(ListcompContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public ListCompAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListCompAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListCompAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListCompAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetCompAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public SetcompContext setcomp() {
			return getRuleContext(SetcompContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public SetCompAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetCompAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetCompAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetCompAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctAtomContext extends AtomContext {
		public TerminalNode OCT_INTEGER() { return getToken(PythonParser.OCT_INTEGER, 0); }
		public OctAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOctAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOctAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOctAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImagAtomContext extends AtomContext {
		public TerminalNode IMAG_NUMBER() { return getToken(PythonParser.IMAG_NUMBER, 0); }
		public ImagAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImagAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImagAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImagAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EllipsisAtomContext extends AtomContext {
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public EllipsisAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEllipsisAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEllipsisAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEllipsisAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAtomContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public NameAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneAtomContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoneAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoneAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT_LIT() { return getToken(PythonParser.INT_LIT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyDictAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public EmptyDictAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyDictAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyDictAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyDictAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public List<Dict_itemContext> dict_item() {
			return getRuleContexts(Dict_itemContext.class);
		}
		public Dict_itemContext dict_item(int i) {
			return getRuleContext(Dict_itemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DictAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAtomContext extends AtomContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ParenExprAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinAtomContext extends AtomContext {
		public TerminalNode BIN_INTEGER() { return getToken(PythonParser.BIN_INTEGER, 0); }
		public BinAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBinAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBinAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBinAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public List<Set_itemContext> set_item() {
			return getRuleContexts(Set_itemContext.class);
		}
		public Set_itemContext set_item(int i) {
			return getRuleContext(Set_itemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SetAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyListAtomContext extends AtomContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public EmptyListAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyListAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyListAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyListAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexAtomContext extends AtomContext {
		public TerminalNode HEX_INTEGER() { return getToken(PythonParser.HEX_INTEGER, 0); }
		public HexAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHexAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHexAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHexAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public YieldAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatAtomContext extends AtomContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(PythonParser.FLOAT_NUMBER, 0); }
		public FloatAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTupleAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public EmptyTupleAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyTupleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyTupleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyTupleAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new NameAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(TRUE);
				}
				break;
			case 3:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				match(FALSE);
				}
				break;
			case 4:
				_localctx = new NoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1293);
				match(NONE);
				}
				break;
			case 5:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1294);
				strings();
				}
				break;
			case 6:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1295);
				match(INT_LIT);
				}
				break;
			case 7:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1296);
				match(FLOAT_NUMBER);
				}
				break;
			case 8:
				_localctx = new ImagAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1297);
				match(IMAG_NUMBER);
				}
				break;
			case 9:
				_localctx = new HexAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1298);
				match(HEX_INTEGER);
				}
				break;
			case 10:
				_localctx = new BinAtomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1299);
				match(BIN_INTEGER);
				}
				break;
			case 11:
				_localctx = new OctAtomContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1300);
				match(OCT_INTEGER);
				}
				break;
			case 12:
				_localctx = new YieldAtomContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1301);
				match(LPAREN);
				setState(1302);
				yield_expr();
				setState(1303);
				match(RPAREN);
				}
				break;
			case 13:
				_localctx = new TupleAtomContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1305);
				match(LPAREN);
				setState(1306);
				star_named_expression();
				setState(1307);
				match(COMMA);
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123335L) != 0)) {
					{
					setState(1308);
					star_named_expression();
					setState(1313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1309);
							match(COMMA);
							setState(1310);
							star_named_expression();
							}
							} 
						}
						setState(1315);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
					}
					}
				}

				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1318);
					match(COMMA);
					}
				}

				setState(1321);
				match(RPAREN);
				}
				break;
			case 14:
				_localctx = new ParenExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1323);
				match(LPAREN);
				setState(1324);
				star_named_expression();
				setState(1325);
				match(RPAREN);
				}
				break;
			case 15:
				_localctx = new GenExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1327);
				match(LPAREN);
				setState(1328);
				genexp();
				setState(1329);
				match(RPAREN);
				}
				break;
			case 16:
				_localctx = new EmptyTupleAtomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1331);
				match(LPAREN);
				setState(1332);
				match(RPAREN);
				}
				break;
			case 17:
				_localctx = new ListAtomContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1333);
				match(LBRACKET);
				setState(1334);
				star_named_expression();
				setState(1339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1335);
						match(COMMA);
						setState(1336);
						star_named_expression();
						}
						} 
					}
					setState(1341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1342);
					match(COMMA);
					}
				}

				setState(1345);
				match(RBRACKET);
				}
				break;
			case 18:
				_localctx = new ListCompAtomContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1347);
				match(LBRACKET);
				setState(1348);
				listcomp();
				setState(1349);
				match(RBRACKET);
				}
				break;
			case 19:
				_localctx = new EmptyListAtomContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1351);
				match(LBRACKET);
				setState(1352);
				match(RBRACKET);
				}
				break;
			case 20:
				_localctx = new DictAtomContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1353);
				match(LBRACE);
				setState(1354);
				dict_item();
				setState(1359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1355);
						match(COMMA);
						setState(1356);
						dict_item();
						}
						} 
					}
					setState(1361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1362);
					match(COMMA);
					}
				}

				setState(1365);
				match(RBRACE);
				}
				break;
			case 21:
				_localctx = new DictCompAtomContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1367);
				match(LBRACE);
				setState(1368);
				dictcomp();
				setState(1369);
				match(RBRACE);
				}
				break;
			case 22:
				_localctx = new EmptyDictAtomContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1371);
				match(LBRACE);
				setState(1372);
				match(RBRACE);
				}
				break;
			case 23:
				_localctx = new SetAtomContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1373);
				match(LBRACE);
				setState(1374);
				set_item();
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1375);
						match(COMMA);
						setState(1376);
						set_item();
						}
						} 
					}
					setState(1381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1382);
					match(COMMA);
					}
				}

				setState(1385);
				match(RBRACE);
				}
				break;
			case 24:
				_localctx = new SetCompAtomContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1387);
				match(LBRACE);
				setState(1388);
				setcomp();
				setState(1389);
				match(RBRACE);
				}
				break;
			case 25:
				_localctx = new EllipsisAtomContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1391);
				match(ELLIPSIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> SHORT_STRING() { return getTokens(PythonParser.SHORT_STRING); }
		public TerminalNode SHORT_STRING(int i) {
			return getToken(PythonParser.SHORT_STRING, i);
		}
		public List<TerminalNode> LONG_STRING() { return getTokens(PythonParser.LONG_STRING); }
		public TerminalNode LONG_STRING(int i) {
			return getToken(PythonParser.LONG_STRING, i);
		}
		public List<TerminalNode> BYTES_LITERAL() { return getTokens(PythonParser.BYTES_LITERAL); }
		public TerminalNode BYTES_LITERAL(int i) {
			return getToken(PythonParser.BYTES_LITERAL, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_strings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1394);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dict_itemContext extends ParserRuleContext {
		public Dict_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_item; }
	 
		public Dict_itemContext() { }
		public void copyFrom(Dict_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictUnpackContext extends Dict_itemContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public DictUnpackContext(Dict_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictUnpack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictUnpack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictUnpack(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictPairContext extends Dict_itemContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public DictPairContext(Dict_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_itemContext dict_item() throws RecognitionException {
		Dict_itemContext _localctx = new Dict_itemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dict_item);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new DictUnpackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1399);
				match(STAR);
				setState(1400);
				match(STAR);
				setState(1401);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case AWAIT:
			case LAMBDA:
			case NOT:
			case YIELD:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new DictPairContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				expression();
				setState(1403);
				match(COLON);
				setState(1404);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictcompContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public DictcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictcompContext dictcomp() throws RecognitionException {
		DictcompContext _localctx = new DictcompContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dictcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			expression();
			setState(1409);
			match(COLON);
			setState(1410);
			expression();
			setState(1411);
			for_if_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetcompContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public SetcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcompContext setcomp() throws RecognitionException {
		SetcompContext _localctx = new SetcompContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_setcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			star_named_expression();
			setState(1414);
			for_if_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListcompContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public ListcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListcompContext listcomp() throws RecognitionException {
		ListcompContext _localctx = new ListcompContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_listcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			star_named_expression();
			setState(1417);
			for_if_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenexpContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public GenexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGenexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGenexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenexpContext genexp() throws RecognitionException {
		GenexpContext _localctx = new GenexpContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_genexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			star_named_expression();
			setState(1420);
			for_if_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_itemContext extends ParserRuleContext {
		public Set_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_item; }
	 
		public Set_itemContext() { }
		public void copyFrom(Set_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetUnpackContext extends Set_itemContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public SetUnpackContext(Set_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetUnpack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetUnpack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetUnpack(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetElementContext extends Set_itemContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public SetElementContext(Set_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_itemContext set_item() throws RecognitionException {
		Set_itemContext _localctx = new Set_itemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_set_item);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				_localctx = new SetUnpackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				match(STAR);
				setState(1423);
				bitwise_or(0);
				}
				break;
			case 2:
				_localctx = new SetElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				star_named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_if_clausesContext extends ParserRuleContext {
		public List<For_if_clauseContext> for_if_clause() {
			return getRuleContexts(For_if_clauseContext.class);
		}
		public For_if_clauseContext for_if_clause(int i) {
			return getRuleContext(For_if_clauseContext.class,i);
		}
		public For_if_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_if_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_if_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_if_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_if_clausesContext for_if_clauses() throws RecognitionException {
		For_if_clausesContext _localctx = new For_if_clausesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_for_if_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1427);
					for_if_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1430); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_if_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public List<TerminalNode> IF() { return getTokens(PythonParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PythonParser.IF, i);
		}
		public For_if_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_if_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_if_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_if_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_if_clauseContext for_if_clause() throws RecognitionException {
		For_if_clauseContext _localctx = new For_if_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_for_if_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1432);
				match(ASYNC);
				}
			}

			setState(1435);
			match(FOR);
			setState(1436);
			star_targets();
			setState(1437);
			match(IN);
			setState(1438);
			disjunction(0);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					match(IF);
					setState(1440);
					disjunction(0);
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_exprContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_paramsContext lambda_params() {
			return getRuleContext(Lambda_paramsContext.class,0);
		}
		public Lambda_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambda_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_exprContext lambda_expr() throws RecognitionException {
		Lambda_exprContext _localctx = new Lambda_exprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lambda_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(LAMBDA);
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==STAR) {
				{
				setState(1447);
				lambda_params();
				}
			}

			setState(1450);
			match(COLON);
			setState(1451);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_paramsContext extends ParserRuleContext {
		public Lambda_parametersContext lambda_parameters() {
			return getRuleContext(Lambda_parametersContext.class,0);
		}
		public Lambda_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambda_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_paramsContext lambda_params() throws RecognitionException {
		Lambda_paramsContext _localctx = new Lambda_paramsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambda_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			lambda_parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_parametersContext extends ParserRuleContext {
		public Lambda_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_parameters; }
	 
		public Lambda_parametersContext() { }
		public void copyFrom(Lambda_parametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaAllParamsContext extends Lambda_parametersContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public LambdaAllParamsContext(Lambda_parametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaAllParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaAllParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaAllParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaDblStarContext extends Lambda_parametersContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaDblStarContext(Lambda_parametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaDblStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaDblStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaDblStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_parametersContext lambda_parameters() throws RecognitionException {
		Lambda_parametersContext _localctx = new Lambda_parametersContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lambda_parameters);
		int _la;
		try {
			int _alt;
			setState(1505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new LambdaAllParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				match(NAME);
				setState(1460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1456);
						match(COMMA);
						setState(1457);
						match(NAME);
						}
						} 
					}
					setState(1462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1463);
						match(COMMA);
						setState(1464);
						match(NAME);
						setState(1465);
						match(ASSIGN);
						setState(1466);
						expression();
						}
						} 
					}
					setState(1471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1472);
					match(COMMA);
					setState(1473);
					match(STAR);
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NAME) {
						{
						setState(1474);
						match(NAME);
						}
					}

					}
					break;
				}
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1479);
						match(COMMA);
						setState(1480);
						match(NAME);
						setState(1483);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(1481);
							match(ASSIGN);
							setState(1482);
							expression();
							}
						}

						}
						} 
					}
					setState(1489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1490);
					match(COMMA);
					setState(1491);
					match(STAR);
					setState(1492);
					match(STAR);
					setState(1493);
					match(NAME);
					}
					break;
				}
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1496);
					match(COMMA);
					}
				}

				}
				break;
			case STAR:
				_localctx = new LambdaDblStarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(STAR);
				setState(1500);
				match(STAR);
				setState(1501);
				match(NAME);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1502);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedAssignContext extends AssignmentContext {
		public List<Star_targetsContext> star_targets() {
			return getRuleContexts(Star_targetsContext.class);
		}
		public Star_targetsContext star_targets(int i) {
			return getRuleContext(Star_targetsContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public ChainedAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterChainedAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitChainedAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitChainedAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnAssignSubscriptContext extends AssignmentContext {
		public Single_subscript_attr_targetContext single_subscript_attr_target() {
			return getRuleContext(Single_subscript_attr_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Annotated_rhsContext annotated_rhs() {
			return getRuleContext(Annotated_rhsContext.class,0);
		}
		public AnnAssignSubscriptContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnAssignSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnAssignSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnAssignSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignContext extends AssignmentContext {
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public AugAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnAssignContext extends AssignmentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Annotated_rhsContext annotated_rhs() {
			return getRuleContext(Annotated_rhsContext.class,0);
		}
		public AnnAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnAssignParensContext extends AssignmentContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Annotated_rhsContext annotated_rhs() {
			return getRuleContext(Annotated_rhsContext.class,0);
		}
		public AnnAssignParensContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnAssignParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnAssignParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnAssignParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new AnnAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				match(NAME);
				setState(1508);
				match(COLON);
				setState(1509);
				expression();
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(1510);
					match(ASSIGN);
					setState(1511);
					annotated_rhs();
					}
				}

				}
				break;
			case 2:
				_localctx = new AnnAssignParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				match(LPAREN);
				setState(1515);
				single_target();
				setState(1516);
				match(RPAREN);
				setState(1517);
				match(COLON);
				setState(1518);
				expression();
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(1519);
					match(ASSIGN);
					setState(1520);
					annotated_rhs();
					}
				}

				}
				break;
			case 3:
				_localctx = new AnnAssignSubscriptContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				single_subscript_attr_target();
				setState(1524);
				match(COLON);
				setState(1525);
				expression();
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(1526);
					match(ASSIGN);
					setState(1527);
					annotated_rhs();
					}
				}

				}
				break;
			case 4:
				_localctx = new ChainedAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1530);
				star_targets();
				setState(1535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1531);
						match(ASSIGN);
						setState(1532);
						star_targets();
						}
						} 
					}
					setState(1537);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				setState(1538);
				match(ASSIGN);
				setState(1541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1539);
					yield_expr();
					}
					break;
				case 2:
					{
					setState(1540);
					star_expressions();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new AugAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1543);
				single_target();
				setState(1544);
				augassign();
				setState(1547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1545);
					yield_expr();
					}
					break;
				case 2:
					{
					setState(1546);
					star_expressions();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Annotated_rhsContext extends ParserRuleContext {
		public Annotated_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_rhs; }
	 
		public Annotated_rhsContext() { }
		public void copyFrom(Annotated_rhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedExprContext extends Annotated_rhsContext {
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public AnnotatedExprContext(Annotated_rhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotatedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotatedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotatedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedYieldContext extends Annotated_rhsContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public AnnotatedYieldContext(Annotated_rhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotatedYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotatedYield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotatedYield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotated_rhsContext annotated_rhs() throws RecognitionException {
		Annotated_rhsContext _localctx = new Annotated_rhsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_annotated_rhs);
		try {
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				_localctx = new AnnotatedYieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				yield_expr();
				}
				break;
			case 2:
				_localctx = new AnnotatedExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1552);
				star_expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	 
		public AugassignContext() { }
		public void copyFrom(AugassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugPlusContext extends AugassignContext {
		public TerminalNode PLUS_ASSIGN() { return getToken(PythonParser.PLUS_ASSIGN, 0); }
		public AugPlusContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugFloorDivContext extends AugassignContext {
		public TerminalNode SLASH_SLASH_ASSIGN() { return getToken(PythonParser.SLASH_SLASH_ASSIGN, 0); }
		public AugFloorDivContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugFloorDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugFloorDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugFloorDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugBitOrContext extends AugassignContext {
		public TerminalNode PIPE_ASSIGN() { return getToken(PythonParser.PIPE_ASSIGN, 0); }
		public AugBitOrContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugBitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugBitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugModContext extends AugassignContext {
		public TerminalNode PERCENT_ASSIGN() { return getToken(PythonParser.PERCENT_ASSIGN, 0); }
		public AugModContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugBitXorContext extends AugassignContext {
		public TerminalNode CARET_ASSIGN() { return getToken(PythonParser.CARET_ASSIGN, 0); }
		public AugBitXorContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugBitXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugBitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugBitXor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugMinusContext extends AugassignContext {
		public TerminalNode MINUS_ASSIGN() { return getToken(PythonParser.MINUS_ASSIGN, 0); }
		public AugMinusContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugMatMulContext extends AugassignContext {
		public TerminalNode AT_ASSIGN() { return getToken(PythonParser.AT_ASSIGN, 0); }
		public AugMatMulContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugMatMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugMatMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugMatMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugPowContext extends AugassignContext {
		public TerminalNode STAR_STAR_ASSIGN() { return getToken(PythonParser.STAR_STAR_ASSIGN, 0); }
		public AugPowContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugDivContext extends AugassignContext {
		public TerminalNode SLASH_ASSIGN() { return getToken(PythonParser.SLASH_ASSIGN, 0); }
		public AugDivContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugBitAndContext extends AugassignContext {
		public TerminalNode AMP_ASSIGN() { return getToken(PythonParser.AMP_ASSIGN, 0); }
		public AugBitAndContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugBitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugLShiftContext extends AugassignContext {
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PythonParser.LSHIFT_ASSIGN, 0); }
		public AugLShiftContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugLShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugLShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugLShift(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugRShiftContext extends AugassignContext {
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PythonParser.RSHIFT_ASSIGN, 0); }
		public AugRShiftContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugRShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugRShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugRShift(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugMulContext extends AugassignContext {
		public TerminalNode STAR_ASSIGN() { return getToken(PythonParser.STAR_ASSIGN, 0); }
		public AugMulContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_augassign);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_ASSIGN:
				_localctx = new AugPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				match(PLUS_ASSIGN);
				}
				break;
			case MINUS_ASSIGN:
				_localctx = new AugMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1556);
				match(MINUS_ASSIGN);
				}
				break;
			case STAR_ASSIGN:
				_localctx = new AugMulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1557);
				match(STAR_ASSIGN);
				}
				break;
			case SLASH_ASSIGN:
				_localctx = new AugDivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1558);
				match(SLASH_ASSIGN);
				}
				break;
			case SLASH_SLASH_ASSIGN:
				_localctx = new AugFloorDivContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1559);
				match(SLASH_SLASH_ASSIGN);
				}
				break;
			case PERCENT_ASSIGN:
				_localctx = new AugModContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1560);
				match(PERCENT_ASSIGN);
				}
				break;
			case AT_ASSIGN:
				_localctx = new AugMatMulContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1561);
				match(AT_ASSIGN);
				}
				break;
			case AMP_ASSIGN:
				_localctx = new AugBitAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1562);
				match(AMP_ASSIGN);
				}
				break;
			case PIPE_ASSIGN:
				_localctx = new AugBitOrContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1563);
				match(PIPE_ASSIGN);
				}
				break;
			case CARET_ASSIGN:
				_localctx = new AugBitXorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1564);
				match(CARET_ASSIGN);
				}
				break;
			case LSHIFT_ASSIGN:
				_localctx = new AugLShiftContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1565);
				match(LSHIFT_ASSIGN);
				}
				break;
			case RSHIFT_ASSIGN:
				_localctx = new AugRShiftContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1566);
				match(RSHIFT_ASSIGN);
				}
				break;
			case STAR_STAR_ASSIGN:
				_localctx = new AugPowContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1567);
				match(STAR_STAR_ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_targetsContext extends ParserRuleContext {
		public Star_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets; }
	 
		public Star_targetsContext() { }
		public void copyFrom(Star_targetsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetSingleContext extends Star_targetsContext {
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public StarTargetSingleContext(Star_targetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetTupleContext extends Star_targetsContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarTargetTupleContext(Star_targetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_targetsContext star_targets() throws RecognitionException {
		Star_targetsContext _localctx = new Star_targetsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_star_targets);
		int _la;
		try {
			int _alt;
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new StarTargetTupleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
				star_target();
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1571);
						match(COMMA);
						setState(1572);
						star_target();
						}
						} 
					}
					setState(1577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1578);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new StarTargetSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				star_target();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_targetContext extends ParserRuleContext {
		public Star_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_target; }
	 
		public Star_targetContext() { }
		public void copyFrom(Star_targetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetPlainContext extends Star_targetContext {
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public StarTargetPlainContext(Star_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetPlain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetPlain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetStarContext extends Star_targetContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public StarTargetStarContext(Star_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_targetContext star_target() throws RecognitionException {
		Star_targetContext _localctx = new Star_targetContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_star_target);
		try {
			setState(1587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarTargetStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				match(STAR);
				setState(1585);
				star_target();
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case INT_LIT:
			case BIN_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case LONG_STRING:
			case SHORT_STRING:
			case BYTES_LITERAL:
			case NAME:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case ELLIPSIS:
				_localctx = new StarTargetPlainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				target_with_star_atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Target_with_star_atomContext extends ParserRuleContext {
		public Target_with_star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_with_star_atom; }
	 
		public Target_with_star_atomContext() { }
		public void copyFrom(Target_with_star_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TargetStarAtomContext extends Target_with_star_atomContext {
		public Star_atomContext star_atom() {
			return getRuleContext(Star_atomContext.class,0);
		}
		public TargetStarAtomContext(Target_with_star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTargetStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTargetStarAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTargetStarAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TargetSubscriptContext extends Target_with_star_atomContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TargetSubscriptContext(Target_with_star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTargetSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTargetSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTargetSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TargetAttrContext extends Target_with_star_atomContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TargetAttrContext(Target_with_star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTargetAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTargetAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTargetAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_with_star_atomContext target_with_star_atom() throws RecognitionException {
		Target_with_star_atomContext _localctx = new Target_with_star_atomContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_target_with_star_atom);
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				_localctx = new TargetAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				t_primary(0);
				setState(1590);
				match(DOT);
				setState(1591);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new TargetSubscriptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				t_primary(0);
				setState(1594);
				slices();
				}
				break;
			case 3:
				_localctx = new TargetStarAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1596);
				star_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_atomContext extends ParserRuleContext {
		public Star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_atom; }
	 
		public Star_atomContext() { }
		public void copyFrom(Star_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarAtomListContext extends Star_atomContext {
		public TerminalNode LBRACKET() { return getToken(PythonParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PythonParser.RBRACKET, 0); }
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarAtomListContext(Star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAtomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAtomList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAtomList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarAtomNameContext extends Star_atomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public StarAtomNameContext(Star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAtomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarAtomParensContext extends Star_atomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public StarAtomParensContext(Star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAtomParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAtomParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAtomParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarAtomTupleContext extends Star_atomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarAtomTupleContext(Star_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAtomTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAtomTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAtomTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_atomContext star_atom() throws RecognitionException {
		Star_atomContext _localctx = new Star_atomContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_star_atom);
		int _la;
		try {
			int _alt;
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				_localctx = new StarAtomNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new StarAtomParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				match(LPAREN);
				setState(1601);
				target_with_star_atom();
				setState(1602);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new StarAtomTupleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1604);
				match(LPAREN);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249600790429752L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 4280321L) != 0)) {
					{
					setState(1605);
					star_target();
					setState(1610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1606);
							match(COMMA);
							setState(1607);
							star_target();
							}
							} 
						}
						setState(1612);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					}
					setState(1614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1613);
						match(COMMA);
						}
					}

					}
				}

				setState(1618);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new StarAtomListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1619);
				match(LBRACKET);
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249600790429752L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 4280321L) != 0)) {
					{
					setState(1620);
					star_target();
					setState(1625);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1621);
							match(COMMA);
							setState(1622);
							star_target();
							}
							} 
						}
						setState(1627);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
					}
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1628);
						match(COMMA);
						}
					}

					}
				}

				setState(1633);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_targetContext extends ParserRuleContext {
		public Single_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_target; }
	 
		public Single_targetContext() { }
		public void copyFrom(Single_targetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTargetParensContext extends Single_targetContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public SingleTargetParensContext(Single_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleTargetParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleTargetParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleTargetParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTargetSubContext extends Single_targetContext {
		public Single_subscript_attr_targetContext single_subscript_attr_target() {
			return getRuleContext(Single_subscript_attr_targetContext.class,0);
		}
		public SingleTargetSubContext(Single_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleTargetSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleTargetSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleTargetSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTargetNameContext extends Single_targetContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SingleTargetNameContext(Single_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleTargetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleTargetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleTargetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_targetContext single_target() throws RecognitionException {
		Single_targetContext _localctx = new Single_targetContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_single_target);
		try {
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				_localctx = new SingleTargetSubContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				single_subscript_attr_target();
				}
				break;
			case 2:
				_localctx = new SingleTargetNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				match(NAME);
				}
				break;
			case 3:
				_localctx = new SingleTargetParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1638);
				match(LPAREN);
				setState(1639);
				single_target();
				setState(1640);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_subscript_attr_targetContext extends ParserRuleContext {
		public Single_subscript_attr_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_subscript_attr_target; }
	 
		public Single_subscript_attr_targetContext() { }
		public void copyFrom(Single_subscript_attr_targetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleSubscriptTargetContext extends Single_subscript_attr_targetContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public SingleSubscriptTargetContext(Single_subscript_attr_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleSubscriptTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleSubscriptTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleSubscriptTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleAttrTargetContext extends Single_subscript_attr_targetContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SingleAttrTargetContext(Single_subscript_attr_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleAttrTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleAttrTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleAttrTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_subscript_attr_targetContext single_subscript_attr_target() throws RecognitionException {
		Single_subscript_attr_targetContext _localctx = new Single_subscript_attr_targetContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_single_subscript_attr_target);
		try {
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new SingleAttrTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				t_primary(0);
				setState(1645);
				match(DOT);
				setState(1646);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new SingleSubscriptTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				t_primary(0);
				setState(1649);
				slices();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class T_primaryContext extends ParserRuleContext {
		public T_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_primary; }
	 
		public T_primaryContext() { }
		public void copyFrom(T_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimarySliceContext extends T_primaryContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TPrimarySliceContext(T_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimarySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimarySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimarySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryAtomContext extends T_primaryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TPrimaryAtomContext(T_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryAttrContext extends T_primaryContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TPrimaryAttrContext(T_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryCallContext extends T_primaryContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TPrimaryCallContext(T_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryGenContext extends T_primaryContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TPrimaryGenContext(T_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_primaryContext t_primary() throws RecognitionException {
		return t_primary(0);
	}

	private T_primaryContext t_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_primaryContext _localctx = new T_primaryContext(_ctx, _parentState);
		T_primaryContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_t_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TPrimaryAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1654);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(1671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						_localctx = new TPrimaryAttrContext(new T_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(1656);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1657);
						match(DOT);
						setState(1658);
						match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new TPrimarySliceContext(new T_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(1659);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1660);
						slices();
						}
						break;
					case 3:
						{
						_localctx = new TPrimaryGenContext(new T_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(1661);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1662);
						genexp();
						}
						break;
					case 4:
						{
						_localctx = new TPrimaryCallContext(new T_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(1663);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1664);
						match(LPAREN);
						setState(1666);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2249738900472888L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 17123335L) != 0)) {
							{
							setState(1665);
							argument_list();
							}
						}

						setState(1668);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Del_targetsContext extends ParserRuleContext {
		public List<Del_targetContext> del_target() {
			return getRuleContexts(Del_targetContext.class);
		}
		public Del_targetContext del_target(int i) {
			return getRuleContext(Del_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Del_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_targets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_targets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDel_targets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_targetsContext del_targets() throws RecognitionException {
		Del_targetsContext _localctx = new Del_targetsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_del_targets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			del_target();
			setState(1679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1675);
					match(COMMA);
					setState(1676);
					del_target();
					}
					} 
				}
				setState(1681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1682);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Del_targetContext extends ParserRuleContext {
		public Del_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_target; }
	 
		public Del_targetContext() { }
		public void copyFrom(Del_targetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelSubscriptContext extends Del_targetContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public DelSubscriptContext(Del_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelAttrContext extends Del_targetContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public DelAttrContext(Del_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelNameContext extends Del_targetContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public DelNameContext(Del_targetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_targetContext del_target() throws RecognitionException {
		Del_targetContext _localctx = new Del_targetContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_del_target);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				_localctx = new DelAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				t_primary(0);
				setState(1686);
				match(DOT);
				setState(1687);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new DelSubscriptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				t_primary(0);
				setState(1690);
				slices();
				}
				break;
			case 3:
				_localctx = new DelNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1692);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			argument();
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1696);
					match(COMMA);
					setState(1697);
					argument();
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1703);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DblStarArgContext extends ArgumentContext {
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DblStarArgContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDblStarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDblStarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDblStarArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarArgContext extends ArgumentContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StarArgContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosArgContext extends ArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PosArgContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPosArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPosArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPosArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WalrusArgContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode WALRUS() { return getToken(PythonParser.WALRUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WalrusArgContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWalrusArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWalrusArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWalrusArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeywordArgContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeywordArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeywordArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_argument);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new WalrusArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				match(NAME);
				setState(1707);
				match(WALRUS);
				setState(1708);
				expression();
				}
				break;
			case 2:
				_localctx = new KeywordArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				match(NAME);
				setState(1710);
				match(ASSIGN);
				setState(1711);
				expression();
				}
				break;
			case 3:
				_localctx = new DblStarArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1712);
				match(STAR);
				setState(1713);
				match(STAR);
				setState(1714);
				expression();
				}
				break;
			case 4:
				_localctx = new StarArgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1715);
				match(STAR);
				setState(1716);
				expression();
				}
				break;
			case 5:
				_localctx = new PosArgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1717);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 61:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
		case 62:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 66:
			return bitwise_or_sempred((Bitwise_orContext)_localctx, predIndex);
		case 67:
			return bitwise_xor_sempred((Bitwise_xorContext)_localctx, predIndex);
		case 68:
			return bitwise_and_sempred((Bitwise_andContext)_localctx, predIndex);
		case 69:
			return shift_expr_sempred((Shift_exprContext)_localctx, predIndex);
		case 70:
			return sum_expr_sempred((Sum_exprContext)_localctx, predIndex);
		case 71:
			return term_sempred((TermContext)_localctx, predIndex);
		case 75:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 100:
			return t_primary_sempred((T_primaryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_or_sempred(Bitwise_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_xor_sempred(Bitwise_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_and_sempred(Bitwise_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_expr_sempred(Shift_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_expr_sempred(Sum_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_primary_sempred(T_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u06b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0001"+
		"\u0000\u0005\u0000\u00d4\b\u0000\n\u0000\f\u0000\u00d7\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u00dd\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00e5\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ea\b"+
		"\u0003\n\u0003\f\u0003\u00ed\t\u0003\u0001\u0003\u0003\u0003\u00f0\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00f9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0106\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0112\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u011a\b\u0004"+
		"\n\u0004\f\u0004\u011d\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0123\b\u0004\n\u0004\f\u0004\u0126\t\u0004\u0003\u0004"+
		"\u0128\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0134\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u013b\b\u0006\n\u0006\f\u0006\u013e\t\u0006\u0001\u0006\u0003"+
		"\u0006\u0141\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0151\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u015a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0160\b\u000b\n\u000b\f\u000b\u0163\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u016d\b\u000b\n\u000b\f\u000b\u0170\t\u000b\u0001"+
		"\u000b\u0003\u000b\u0173\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0179\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0180\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0186\b\r"+
		"\u000b\r\f\r\u0187\u0001\r\u0003\r\u018b\b\r\u0001\r\u0003\r\u018e\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0194\b\r\u000b\r\f\r\u0195\u0001"+
		"\r\u0003\r\u0199\b\r\u0001\r\u0003\r\u019c\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u01a3\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u01a9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01b1\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01b8\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u01c7\b\u0011\u000b\u0011\f\u0011\u01c8\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u01d0"+
		"\b\u0012\u000b\u0012\f\u0012\u01d1\u0001\u0012\u0003\u0012\u01d5\b\u0012"+
		"\u0001\u0012\u0003\u0012\u01d8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01dd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u01e8\b\u0015\u000b\u0015\f\u0015\u01e9\u0001\u0015\u0003\u0015\u01ed"+
		"\b\u0015\u0001\u0015\u0003\u0015\u01f0\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f7\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01fc\b\u0017\n\u0017\f\u0017\u01ff"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u020a\b\u0018\u000b"+
		"\u0018\f\u0018\u020b\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0212\b\u0018\n\u0018\f\u0018\u0215\t\u0018\u0003\u0018\u0217\b"+
		"\u0018\u0001\u0018\u0003\u0018\u021a\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0221\b\u0018\n\u0018\f\u0018"+
		"\u0224\t\u0018\u0003\u0018\u0226\b\u0018\u0001\u0018\u0003\u0018\u0229"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0233\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u023a\b\u0018\n"+
		"\u0018\f\u0018\u023d\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0243\b\u0018\u0001\u0018\u0003\u0018\u0246\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0253\b\u0018\n\u0018\f\u0018\u0256\t\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u025a\b\u0018\n\u0018\f\u0018\u025d\t\u0018\u0001\u0018\u0003\u0018"+
		"\u0260\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0269\b\u0018\n\u0018\f\u0018\u026c"+
		"\t\u0018\u0001\u0018\u0003\u0018\u026f\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0273\b\u0018\u0001\u0019\u0003\u0019\u0276\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u027a\b\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u027e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0287\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u028c\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0293\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0297\b\u001b\u0001\u001b\u0003\u001b\u029a\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u02a6\b\u001d"+
		"\n\u001d\f\u001d\u02a9\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u02ae\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02b2\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02b7\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u02bd\b\u001f\u000b\u001f"+
		"\f\u001f\u02be\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02c4\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!"+
		"\u0001!\u0003!\u02d0\b!\u0001\"\u0001\"\u0001\"\u0003\"\u02d5\b\"\u0001"+
		"\"\u0001\"\u0003\"\u02d9\b\"\u0001\"\u0003\"\u02dc\b\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u02e6\b$\n$\f$\u02e9"+
		"\t$\u0001$\u0001$\u0005$\u02ed\b$\n$\f$\u02f0\t$\u0001$\u0001$\u0003$"+
		"\u02f4\b$\u0001$\u0001$\u0005$\u02f8\b$\n$\f$\u02fb\t$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0301\b$\u0001$\u0003$\u0304\b$\u0001$\u0001$\u0001$\u0005"+
		"$\u0309\b$\n$\f$\u030c\t$\u0001$\u0001$\u0003$\u0310\b$\u0001$\u0001$"+
		"\u0005$\u0314\b$\n$\f$\u0317\t$\u0001$\u0001$\u0001$\u0001$\u0003$\u031d"+
		"\b$\u0001$\u0003$\u0320\b$\u0001$\u0001$\u0001$\u0005$\u0325\b$\n$\f$"+
		"\u0328\t$\u0001$\u0001$\u0001$\u0001$\u0003$\u032e\b$\u0001$\u0003$\u0331"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u0337\b$\u0001$\u0004$\u033a\b"+
		"$\u000b$\f$\u033b\u0001$\u0001$\u0001$\u0005$\u0341\b$\n$\f$\u0344\t$"+
		"\u0001$\u0001$\u0005$\u0348\b$\n$\f$\u034b\t$\u0001$\u0001$\u0003$\u034f"+
		"\b$\u0001$\u0001$\u0005$\u0353\b$\n$\f$\u0356\t$\u0001$\u0001$\u0001$"+
		"\u0001$\u0003$\u035c\b$\u0001$\u0003$\u035f\b$\u0003$\u0361\b$\u0001%"+
		"\u0001%\u0003%\u0365\b%\u0001&\u0001&\u0003&\u0369\b&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0003\'\u036f\b\'\u0001\'\u0003\'\u0372\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u0377\b(\u0001(\u0003(\u037a\b(\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0003+\u0385\b+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u038e\b,\n,\f,\u0391\t,\u0001,\u0003,\u0394"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u03aa\b-\u0001.\u0001.\u0001.\u0005.\u03af\b.\n.\f.\u03b2\t."+
		"\u0001/\u0001/\u0001/\u0003/\u03b7\b/\u00010\u00010\u00010\u00050\u03bc"+
		"\b0\n0\f0\u03bf\t0\u00011\u00051\u03c2\b1\n1\f1\u03c5\t1\u00011\u0001"+
		"1\u00041\u03c9\b1\u000b1\f1\u03ca\u00031\u03cd\b1\u00012\u00012\u0001"+
		"2\u00032\u03d2\b2\u00012\u00012\u00012\u00012\u00032\u03d8\b2\u00013\u0001"+
		"3\u00013\u00053\u03dd\b3\n3\f3\u03e0\t3\u00014\u00014\u00014\u00034\u03e5"+
		"\b4\u00015\u00015\u00015\u00015\u00045\u03eb\b5\u000b5\f5\u03ec\u0001"+
		"5\u00015\u00035\u03f1\b5\u00016\u00016\u00016\u00056\u03f6\b6\n6\f6\u03f9"+
		"\t6\u00016\u00036\u03fc\b6\u00016\u00036\u03ff\b6\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u040a\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u0411\b8\u00038\u0413\b8\u00019\u00019\u0001"+
		"9\u00059\u0418\b9\n9\f9\u041b\t9\u00019\u00039\u041e\b9\u00019\u00039"+
		"\u0421\b9\u0001:\u0001:\u0001:\u0003:\u0426\b:\u0001;\u0001;\u0001;\u0003"+
		";\u042b\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u0431\b<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0005=\u0439\b=\n=\f=\u043c\t=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0005>\u0444\b>\n>\f>\u0447\t>\u0001?\u0001?\u0001"+
		"?\u0003?\u044c\b?\u0001@\u0001@\u0004@\u0450\b@\u000b@\f@\u0451\u0001"+
		"@\u0003@\u0455\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0003A\u046d\bA\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0005B\u0475\bB\nB\fB\u0478\tB\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0005C\u0480\bC\nC\fC\u0483\tC\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0005D\u048b\bD\nD\fD\u048e\tD\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0005E\u0499\bE\nE\fE\u049c\tE\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u04a7"+
		"\bF\nF\fF\u04aa\tF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0005G\u04be\bG\nG\fG\u04c1\tG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u04ca\bH\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u04d1"+
		"\bI\u0001J\u0001J\u0001J\u0003J\u04d6\bJ\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u04e5"+
		"\bK\u0001K\u0005K\u04e8\bK\nK\fK\u04eb\tK\u0001L\u0001L\u0001L\u0001L"+
		"\u0005L\u04f1\bL\nL\fL\u04f4\tL\u0001L\u0003L\u04f7\bL\u0001L\u0001L\u0001"+
		"M\u0003M\u04fc\bM\u0001M\u0001M\u0003M\u0500\bM\u0001M\u0001M\u0003M\u0504"+
		"\bM\u0003M\u0506\bM\u0001M\u0003M\u0509\bM\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0005N\u0520\bN\nN"+
		"\fN\u0523\tN\u0003N\u0525\bN\u0001N\u0003N\u0528\bN\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0005N\u053a\bN\nN\fN\u053d\tN\u0001N\u0003N\u0540"+
		"\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0005N\u054e\bN\nN\fN\u0551\tN\u0001N\u0003N\u0554\bN"+
		"\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0005N\u0562\bN\nN\fN\u0565\tN\u0001N\u0003N\u0568\bN"+
		"\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0571\bN\u0001"+
		"O\u0004O\u0574\bO\u000bO\fO\u0575\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0003P\u057f\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0003U\u0592\bU\u0001V\u0004V\u0595\bV\u000bV\fV\u0596\u0001W\u0003"+
		"W\u059a\bW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u05a2\bW\n"+
		"W\fW\u05a5\tW\u0001X\u0001X\u0003X\u05a9\bX\u0001X\u0001X\u0001X\u0001"+
		"Y\u0001Y\u0001Z\u0001Z\u0001Z\u0005Z\u05b3\bZ\nZ\fZ\u05b6\tZ\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0005Z\u05bc\bZ\nZ\fZ\u05bf\tZ\u0001Z\u0001Z\u0001Z\u0003"+
		"Z\u05c4\bZ\u0003Z\u05c6\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u05cc\b"+
		"Z\u0005Z\u05ce\bZ\nZ\fZ\u05d1\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u05d7"+
		"\bZ\u0001Z\u0003Z\u05da\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u05e0\b"+
		"Z\u0003Z\u05e2\bZ\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u05e9\b[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u05f2\b[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0003[\u05f9\b[\u0001[\u0001[\u0001[\u0005[\u05fe"+
		"\b[\n[\f[\u0601\t[\u0001[\u0001[\u0001[\u0003[\u0606\b[\u0001[\u0001["+
		"\u0001[\u0001[\u0003[\u060c\b[\u0003[\u060e\b[\u0001\\\u0001\\\u0003\\"+
		"\u0612\b\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u0621\b]\u0001^\u0001^\u0001^\u0005"+
		"^\u0626\b^\n^\f^\u0629\t^\u0001^\u0003^\u062c\b^\u0001^\u0003^\u062f\b"+
		"^\u0001_\u0001_\u0001_\u0003_\u0634\b_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0003`\u063e\b`\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0005a\u0649\ba\na\fa\u064c\ta\u0001a\u0003"+
		"a\u064f\ba\u0003a\u0651\ba\u0001a\u0001a\u0001a\u0001a\u0001a\u0005a\u0658"+
		"\ba\na\fa\u065b\ta\u0001a\u0003a\u065e\ba\u0003a\u0660\ba\u0001a\u0003"+
		"a\u0663\ba\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u066b\bb\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u0674\bc\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0003d\u0683\bd\u0001d\u0005d\u0686\bd\nd\fd\u0689\td\u0001e"+
		"\u0001e\u0001e\u0005e\u068e\be\ne\fe\u0691\te\u0001e\u0003e\u0694\be\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u069e\bf\u0001"+
		"g\u0001g\u0001g\u0005g\u06a3\bg\ng\fg\u06a6\tg\u0001g\u0003g\u06a9\bg"+
		"\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0003h\u06b7\bh\u0001h\u0000\nz|\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0096\u00c8i\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u0000\u0002\u0001\u0000"+
		"IJ\u0001\u0000/1\u07a1\u0000\u00d5\u0001\u0000\u0000\u0000\u0002\u00dc"+
		"\u0001\u0000\u0000\u0000\u0004\u00e4\u0001\u0000\u0000\u0000\u0006\u00e6"+
		"\u0001\u0000\u0000\u0000\b\u0127\u0001\u0000\u0000\u0000\n\u0133\u0001"+
		"\u0000\u0000\u0000\f\u0135\u0001\u0000\u0000\u0000\u000e\u0142\u0001\u0000"+
		"\u0000\u0000\u0010\u0147\u0001\u0000\u0000\u0000\u0012\u014b\u0001\u0000"+
		"\u0000\u0000\u0014\u0152\u0001\u0000\u0000\u0000\u0016\u0178\u0001\u0000"+
		"\u0000\u0000\u0018\u017f\u0001\u0000\u0000\u0000\u001a\u01a2\u0001\u0000"+
		"\u0000\u0000\u001c\u01b0\u0001\u0000\u0000\u0000\u001e\u01b2\u0001\u0000"+
		"\u0000\u0000 \u01bc\u0001\u0000\u0000\u0000\"\u01c0\u0001\u0000\u0000"+
		"\u0000$\u01d7\u0001\u0000\u0000\u0000&\u01d9\u0001\u0000\u0000\u0000("+
		"\u01e1\u0001\u0000\u0000\u0000*\u01ef\u0001\u0000\u0000\u0000,\u01f6\u0001"+
		"\u0000\u0000\u0000.\u01f8\u0001\u0000\u0000\u00000\u0272\u0001\u0000\u0000"+
		"\u00002\u0286\u0001\u0000\u0000\u00004\u028b\u0001\u0000\u0000\u00006"+
		"\u0299\u0001\u0000\u0000\u00008\u029e\u0001\u0000\u0000\u0000:\u02a2\u0001"+
		"\u0000\u0000\u0000<\u02aa\u0001\u0000\u0000\u0000>\u02bc\u0001\u0000\u0000"+
		"\u0000@\u02c5\u0001\u0000\u0000\u0000B\u02cf\u0001\u0000\u0000\u0000D"+
		"\u02d1\u0001\u0000\u0000\u0000F\u02e0\u0001\u0000\u0000\u0000H\u0360\u0001"+
		"\u0000\u0000\u0000J\u0362\u0001\u0000\u0000\u0000L\u0366\u0001\u0000\u0000"+
		"\u0000N\u036c\u0001\u0000\u0000\u0000P\u0379\u0001\u0000\u0000\u0000R"+
		"\u037b\u0001\u0000\u0000\u0000T\u037e\u0001\u0000\u0000\u0000V\u0381\u0001"+
		"\u0000\u0000\u0000X\u0389\u0001\u0000\u0000\u0000Z\u03a9\u0001\u0000\u0000"+
		"\u0000\\\u03ab\u0001\u0000\u0000\u0000^\u03b3\u0001\u0000\u0000\u0000"+
		"`\u03b8\u0001\u0000\u0000\u0000b\u03cc\u0001\u0000\u0000\u0000d\u03d7"+
		"\u0001\u0000\u0000\u0000f\u03d9\u0001\u0000\u0000\u0000h\u03e1\u0001\u0000"+
		"\u0000\u0000j\u03f0\u0001\u0000\u0000\u0000l\u03fe\u0001\u0000\u0000\u0000"+
		"n\u0409\u0001\u0000\u0000\u0000p\u0412\u0001\u0000\u0000\u0000r\u0420"+
		"\u0001\u0000\u0000\u0000t\u0425\u0001\u0000\u0000\u0000v\u042a\u0001\u0000"+
		"\u0000\u0000x\u0430\u0001\u0000\u0000\u0000z\u0432\u0001\u0000\u0000\u0000"+
		"|\u043d\u0001\u0000\u0000\u0000~\u044b\u0001\u0000\u0000\u0000\u0080\u0454"+
		"\u0001\u0000\u0000\u0000\u0082\u046c\u0001\u0000\u0000\u0000\u0084\u046e"+
		"\u0001\u0000\u0000\u0000\u0086\u0479\u0001\u0000\u0000\u0000\u0088\u0484"+
		"\u0001\u0000\u0000\u0000\u008a\u048f\u0001\u0000\u0000\u0000\u008c\u049d"+
		"\u0001\u0000\u0000\u0000\u008e\u04ab\u0001\u0000\u0000\u0000\u0090\u04c9"+
		"\u0001\u0000\u0000\u0000\u0092\u04d0\u0001\u0000\u0000\u0000\u0094\u04d5"+
		"\u0001\u0000\u0000\u0000\u0096\u04d7\u0001\u0000\u0000\u0000\u0098\u04ec"+
		"\u0001\u0000\u0000\u0000\u009a\u0508\u0001\u0000\u0000\u0000\u009c\u0570"+
		"\u0001\u0000\u0000\u0000\u009e\u0573\u0001\u0000\u0000\u0000\u00a0\u057e"+
		"\u0001\u0000\u0000\u0000\u00a2\u0580\u0001\u0000\u0000\u0000\u00a4\u0585"+
		"\u0001\u0000\u0000\u0000\u00a6\u0588\u0001\u0000\u0000\u0000\u00a8\u058b"+
		"\u0001\u0000\u0000\u0000\u00aa\u0591\u0001\u0000\u0000\u0000\u00ac\u0594"+
		"\u0001\u0000\u0000\u0000\u00ae\u0599\u0001\u0000\u0000\u0000\u00b0\u05a6"+
		"\u0001\u0000\u0000\u0000\u00b2\u05ad\u0001\u0000\u0000\u0000\u00b4\u05e1"+
		"\u0001\u0000\u0000\u0000\u00b6\u060d\u0001\u0000\u0000\u0000\u00b8\u0611"+
		"\u0001\u0000\u0000\u0000\u00ba\u0620\u0001\u0000\u0000\u0000\u00bc\u062e"+
		"\u0001\u0000\u0000\u0000\u00be\u0633\u0001\u0000\u0000\u0000\u00c0\u063d"+
		"\u0001\u0000\u0000\u0000\u00c2\u0662\u0001\u0000\u0000\u0000\u00c4\u066a"+
		"\u0001\u0000\u0000\u0000\u00c6\u0673\u0001\u0000\u0000\u0000\u00c8\u0675"+
		"\u0001\u0000\u0000\u0000\u00ca\u068a\u0001\u0000\u0000\u0000\u00cc\u069d"+
		"\u0001\u0000\u0000\u0000\u00ce\u069f\u0001\u0000\u0000\u0000\u00d0\u06b6"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u0002\u0001\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0000\u0000\u0001\u00d9\u0001\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0003\u0006\u0003\u0000\u00db\u00dd\u0003\n\u0005\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u0003\u0001"+
		"\u0000\u0000\u0000\u00de\u00e5\u0003\u0006\u0003\u0000\u00df\u00e0\u0003"+
		"\n\u0005\u0000\u00e0\u00e1\u0005b\u0000\u0000\u00e1\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0005b\u0000\u0000\u00e3\u00e5\u0005\u0000\u0000"+
		"\u0001\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u0005\u0001\u0000\u0000\u0000\u00e6\u00eb\u0003\b\u0004\u0000"+
		"\u00e7\u00e8\u0005_\u0000\u0000\u00e8\u00ea\u0003\b\u0004\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f0\u0005_\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005b\u0000\u0000\u00f2\u0007\u0001\u0000\u0000\u0000\u00f3\u0128\u0003"+
		"\u00b6[\u0000\u00f4\u0128\u0003V+\u0000\u00f5\u0128\u0003r9\u0000\u00f6"+
		"\u00f8\u0005!\u0000\u0000\u00f7\u00f9\u0003r9\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0128\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb\u0128\u0003"+
		"\\.\u0000\u00fc\u00fd\u0005\u0015\u0000\u0000\u00fd\u00fe\u0003b1\u0000"+
		"\u00fe\u00ff\u0005\u0018\u0000\u0000\u00ff\u0100\u0003d2\u0000\u0100\u0128"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0005 \u0000\u0000\u0102\u0105\u0003"+
		"n7\u0000\u0103\u0104\u0005\u0015\u0000\u0000\u0104\u0106\u0003n7\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0128\u0001\u0000\u0000\u0000\u0107\u0128\u0005 \u0000\u0000\u0108"+
		"\u0128\u0005\u001f\u0000\u0000\u0109\u010a\u0005\u000f\u0000\u0000\u010a"+
		"\u0128\u0003\u00cae\u0000\u010b\u010c\u0005%\u0000\u0000\u010c\u0128\u0003"+
		"p8\u0000\u010d\u010e\u0005\b\u0000\u0000\u010e\u0111\u0003n7\u0000\u010f"+
		"\u0110\u0005]\u0000\u0000\u0110\u0112\u0003n7\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0128\u0001"+
		"\u0000\u0000\u0000\u0113\u0128\u0005\u000b\u0000\u0000\u0114\u0128\u0005"+
		"\r\u0000\u0000\u0115\u0116\u0005\u0016\u0000\u0000\u0116\u011b\u00052"+
		"\u0000\u0000\u0117\u0118\u0005]\u0000\u0000\u0118\u011a\u00052\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u0128\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u001c\u0000\u0000\u011f\u0124\u00052\u0000\u0000\u0120"+
		"\u0121\u0005]\u0000\u0000\u0121\u0123\u00052\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u00f3\u0001"+
		"\u0000\u0000\u0000\u0127\u00f4\u0001\u0000\u0000\u0000\u0127\u00f5\u0001"+
		"\u0000\u0000\u0000\u0127\u00f6\u0001\u0000\u0000\u0000\u0127\u00fa\u0001"+
		"\u0000\u0000\u0000\u0127\u00fc\u0001\u0000\u0000\u0000\u0127\u0101\u0001"+
		"\u0000\u0000\u0000\u0127\u0107\u0001\u0000\u0000\u0000\u0127\u0108\u0001"+
		"\u0000\u0000\u0000\u0127\u0109\u0001\u0000\u0000\u0000\u0127\u010b\u0001"+
		"\u0000\u0000\u0000\u0127\u010d\u0001\u0000\u0000\u0000\u0127\u0113\u0001"+
		"\u0000\u0000\u0000\u0127\u0114\u0001\u0000\u0000\u0000\u0127\u0115\u0001"+
		"\u0000\u0000\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0128\t\u0001\u0000"+
		"\u0000\u0000\u0129\u0134\u0003\f\u0006\u0000\u012a\u0134\u0003\u0012\t"+
		"\u0000\u012b\u0134\u0003\u0014\n\u0000\u012c\u0134\u0003\u0016\u000b\u0000"+
		"\u012d\u0134\u0003\u001a\r\u0000\u012e\u0134\u0003\"\u0011\u0000\u012f"+
		"\u0134\u0003<\u001e\u0000\u0130\u0134\u0003D\"\u0000\u0131\u0134\u0003"+
		">\u001f\u0000\u0132\u0134\u0003B!\u0000\u0133\u0129\u0001\u0000\u0000"+
		"\u0000\u0133\u012a\u0001\u0000\u0000\u0000\u0133\u012b\u0001\u0000\u0000"+
		"\u0000\u0133\u012c\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000\u0000"+
		"\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000"+
		"\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u000b\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\u0017\u0000\u0000\u0136\u0137\u0003x<\u0000\u0137"+
		"\u0138\u0005^\u0000\u0000\u0138\u013c\u0003j5\u0000\u0139\u013b\u0003"+
		"\u000e\u0007\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0003\u0010\b\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\r\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\u0010\u0000\u0000\u0143\u0144\u0003x<\u0000\u0144"+
		"\u0145\u0005^\u0000\u0000\u0145\u0146\u0003j5\u0000\u0146\u000f\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0005\u0011\u0000\u0000\u0148\u0149\u0005"+
		"^\u0000\u0000\u0149\u014a\u0003j5\u0000\u014a\u0011\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005#\u0000\u0000\u014c\u014d\u0003x<\u0000\u014d"+
		"\u014e\u0005^\u0000\u0000\u014e\u0150\u0003j5\u0000\u014f\u0151\u0003"+
		"\u0010\b\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0013\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0014"+
		"\u0000\u0000\u0153\u0154\u0003\u00bc^\u0000\u0154\u0155\u0005\u0019\u0000"+
		"\u0000\u0155\u0156\u0003r9\u0000\u0156\u0157\u0005^\u0000\u0000\u0157"+
		"\u0159\u0003j5\u0000\u0158\u015a\u0003\u0010\b\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0015\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0005$\u0000\u0000\u015c\u0161\u0003\u0018"+
		"\f\u0000\u015d\u015e\u0005]\u0000\u0000\u015e\u0160\u0003\u0018\f\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0005^\u0000\u0000\u0165\u0166\u0003j5\u0000\u0166\u0179"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0005$\u0000\u0000\u0168\u0169\u0005"+
		"W\u0000\u0000\u0169\u016e\u0003\u0018\f\u0000\u016a\u016b\u0005]\u0000"+
		"\u0000\u016b\u016d\u0003\u0018\f\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u0005]\u0000\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0005X\u0000\u0000\u0175\u0176"+
		"\u0005^\u0000\u0000\u0176\u0177\u0003j5\u0000\u0177\u0179\u0001\u0000"+
		"\u0000\u0000\u0178\u015b\u0001\u0000\u0000\u0000\u0178\u0167\u0001\u0000"+
		"\u0000\u0000\u0179\u0017\u0001\u0000\u0000\u0000\u017a\u017b\u0003n7\u0000"+
		"\u017b\u017c\u0005\u0007\u0000\u0000\u017c\u017d\u0003\u00be_\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u0180\u0003n7\u0000\u017f\u017a\u0001"+
		"\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0019\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\"\u0000\u0000\u0182\u0183\u0005^"+
		"\u0000\u0000\u0183\u0185\u0003j5\u0000\u0184\u0186\u0003\u001c\u000e\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003\u0010\b\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0003 \u0010\u0000\u018d\u018c"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u01a3"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0005\"\u0000\u0000\u0190\u0191\u0005"+
		"^\u0000\u0000\u0191\u0193\u0003j5\u0000\u0192\u0194\u0003\u001e\u000f"+
		"\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0199\u0003\u0010\b\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u019c\u0003 \u0010\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u01a3\u0001\u0000\u0000\u0000\u019d\u019e\u0005\"\u0000\u0000\u019e\u019f"+
		"\u0005^\u0000\u0000\u019f\u01a0\u0003j5\u0000\u01a0\u01a1\u0003 \u0010"+
		"\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u0181\u0001\u0000\u0000"+
		"\u0000\u01a2\u018f\u0001\u0000\u0000\u0000\u01a2\u019d\u0001\u0000\u0000"+
		"\u0000\u01a3\u001b\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0012\u0000"+
		"\u0000\u01a5\u01a8\u0003n7\u0000\u01a6\u01a7\u0005\u0007\u0000\u0000\u01a7"+
		"\u01a9\u00052\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0005^\u0000\u0000\u01ab\u01ac\u0003j5\u0000\u01ac\u01b1\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005\u0012\u0000\u0000\u01ae\u01af\u0005^\u0000"+
		"\u0000\u01af\u01b1\u0003j5\u0000\u01b0\u01a4\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ad\u0001\u0000\u0000\u0000\u01b1\u001d\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0005\u0012\u0000\u0000\u01b3\u01b4\u0005K\u0000\u0000\u01b4\u01b7"+
		"\u0003n7\u0000\u01b5\u01b6\u0005\u0007\u0000\u0000\u01b6\u01b8\u00052"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005^\u0000"+
		"\u0000\u01ba\u01bb\u0003j5\u0000\u01bb\u001f\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005\u0013\u0000\u0000\u01bd\u01be\u0005^\u0000\u0000\u01be\u01bf"+
		"\u0003j5\u0000\u01bf!\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005&\u0000"+
		"\u0000\u01c1\u01c2\u0003$\u0012\u0000\u01c2\u01c3\u0005^\u0000\u0000\u01c3"+
		"\u01c4\u0005b\u0000\u0000\u01c4\u01c6\u0005\u0001\u0000\u0000\u01c5\u01c7"+
		"\u0003&\u0013\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005"+
		"\u0002\u0000\u0000\u01cb#\u0001\u0000\u0000\u0000\u01cc\u01cf\u0003v;"+
		"\u0000\u01cd\u01ce\u0005]\u0000\u0000\u01ce\u01d0\u0003v;\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005]\u0000\u0000\u01d4\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0003x<\u0000\u01d7\u01cc\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8%\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0005\'\u0000\u0000\u01da\u01dc\u0003*\u0015\u0000"+
		"\u01db\u01dd\u0003(\u0014\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0005^\u0000\u0000\u01df\u01e0\u0003j5\u0000\u01e0\'\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0005\u0017\u0000\u0000\u01e2\u01e3\u0003x<\u0000"+
		"\u01e3)\u0001\u0000\u0000\u0000\u01e4\u01e7\u0003,\u0016\u0000\u01e5\u01e6"+
		"\u0005]\u0000\u0000\u01e6\u01e8\u0003,\u0016\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ed\u0005]\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f0\u0003,\u0016\u0000\u01ef\u01e4\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0+\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0003.\u0017\u0000\u01f2\u01f3\u0005\u0007\u0000\u0000\u01f3\u01f4"+
		"\u00052\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f7\u0003"+
		".\u0017\u0000\u01f6\u01f1\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7-\u0001\u0000\u0000\u0000\u01f8\u01fd\u00030\u0018\u0000"+
		"\u01f9\u01fa\u0005R\u0000\u0000\u01fa\u01fc\u00030\u0018\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe/\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0273\u0003"+
		"2\u0019\u0000\u0201\u0273\u00052\u0000\u0000\u0202\u0203\u0005W\u0000"+
		"\u0000\u0203\u0204\u0003,\u0016\u0000\u0204\u0205\u0005X\u0000\u0000\u0205"+
		"\u0273\u0001\u0000\u0000\u0000\u0206\u0209\u00052\u0000\u0000\u0207\u0208"+
		"\u0005`\u0000\u0000\u0208\u020a\u00052\u0000\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u0273\u0001\u0000"+
		"\u0000\u0000\u020d\u0216\u0005Y\u0000\u0000\u020e\u0213\u00034\u001a\u0000"+
		"\u020f\u0210\u0005]\u0000\u0000\u0210\u0212\u00034\u001a\u0000\u0211\u020f"+
		"\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0217"+
		"\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u020e"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219"+
		"\u0001\u0000\u0000\u0000\u0218\u021a\u0005]\u0000\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001"+
		"\u0000\u0000\u0000\u021b\u0273\u0005Z\u0000\u0000\u021c\u0225\u0005W\u0000"+
		"\u0000\u021d\u0222\u00034\u001a\u0000\u021e\u021f\u0005]\u0000\u0000\u021f"+
		"\u0221\u00034\u001a\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u021d\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0001\u0000\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0229"+
		"\u0005]\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u0273\u0005"+
		"X\u0000\u0000\u022b\u022c\u0005[\u0000\u0000\u022c\u0273\u0005\\\u0000"+
		"\u0000\u022d\u022e\u0005[\u0000\u0000\u022e\u022f\u0005K\u0000\u0000\u022f"+
		"\u0230\u0005K\u0000\u0000\u0230\u0232\u00052\u0000\u0000\u0231\u0233\u0005"+
		"]\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0273\u0005\\\u0000"+
		"\u0000\u0235\u0236\u0005[\u0000\u0000\u0236\u023b\u00036\u001b\u0000\u0237"+
		"\u0238\u0005]\u0000\u0000\u0238\u023a\u00036\u001b\u0000\u0239\u0237\u0001"+
		"\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u0242\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0005"+
		"]\u0000\u0000\u023f\u0240\u0005K\u0000\u0000\u0240\u0241\u0005K\u0000"+
		"\u0000\u0241\u0243\u00052\u0000\u0000\u0242\u023e\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000"+
		"\u0244\u0246\u0005]\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0005\\\u0000\u0000\u0248\u0273\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0003:\u001d\u0000\u024a\u024b\u0005W\u0000\u0000\u024b\u024c\u0005X"+
		"\u0000\u0000\u024c\u0273\u0001\u0000\u0000\u0000\u024d\u024e\u0003:\u001d"+
		"\u0000\u024e\u024f\u0005W\u0000\u0000\u024f\u0254\u0003,\u0016\u0000\u0250"+
		"\u0251\u0005]\u0000\u0000\u0251\u0253\u0003,\u0016\u0000\u0252\u0250\u0001"+
		"\u0000\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u025b\u0001"+
		"\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u0258\u0005"+
		"]\u0000\u0000\u0258\u025a\u00038\u001c\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000"+
		"\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0260\u0005]\u0000\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0005X\u0000\u0000\u0262"+
		"\u0273\u0001\u0000\u0000\u0000\u0263\u0264\u0003:\u001d\u0000\u0264\u0265"+
		"\u0005W\u0000\u0000\u0265\u026a\u00038\u001c\u0000\u0266\u0267\u0005]"+
		"\u0000\u0000\u0267\u0269\u00038\u001c\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000"+
		"\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026f\u0005]\u0000\u0000"+
		"\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0005X\u0000\u0000\u0271"+
		"\u0273\u0001\u0000\u0000\u0000\u0272\u0200\u0001\u0000\u0000\u0000\u0272"+
		"\u0201\u0001\u0000\u0000\u0000\u0272\u0202\u0001\u0000\u0000\u0000\u0272"+
		"\u0206\u0001\u0000\u0000\u0000\u0272\u020d\u0001\u0000\u0000\u0000\u0272"+
		"\u021c\u0001\u0000\u0000\u0000\u0272\u022b\u0001\u0000\u0000\u0000\u0272"+
		"\u022d\u0001\u0000\u0000\u0000\u0272\u0235\u0001\u0000\u0000\u0000\u0272"+
		"\u0249\u0001\u0000\u0000\u0000\u0272\u024d\u0001\u0000\u0000\u0000\u0272"+
		"\u0263\u0001\u0000\u0000\u0000\u02731\u0001\u0000\u0000\u0000\u0274\u0276"+
		"\u0005J\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0287\u0005"+
		")\u0000\u0000\u0278\u027a\u0005J\u0000\u0000\u0279\u0278\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u0287\u0005-\u0000\u0000\u027c\u027e\u0005J\u0000\u0000\u027d"+
		"\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0005-\u0000\u0000\u0280\u0281"+
		"\u0007\u0000\u0000\u0000\u0281\u0287\u0005.\u0000\u0000\u0282\u0287\u0003"+
		"\u009eO\u0000\u0283\u0287\u0005\u0004\u0000\u0000\u0284\u0287\u0005\u0005"+
		"\u0000\u0000\u0285\u0287\u0005\u0003\u0000\u0000\u0286\u0275\u0001\u0000"+
		"\u0000\u0000\u0286\u0279\u0001\u0000\u0000\u0000\u0286\u027d\u0001\u0000"+
		"\u0000\u0000\u0286\u0282\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000"+
		"\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0285\u0001\u0000"+
		"\u0000\u0000\u02873\u0001\u0000\u0000\u0000\u0288\u0289\u0005K\u0000\u0000"+
		"\u0289\u028c\u00052\u0000\u0000\u028a\u028c\u0003,\u0016\u0000\u028b\u0288"+
		"\u0001\u0000\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c5\u0001"+
		"\u0000\u0000\u0000\u028d\u029a\u0003\u009eO\u0000\u028e\u029a\u0005\u0004"+
		"\u0000\u0000\u028f\u029a\u0005\u0005\u0000\u0000\u0290\u029a\u0005\u0003"+
		"\u0000\u0000\u0291\u0293\u0005J\u0000\u0000\u0292\u0291\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000"+
		"\u0000\u0294\u029a\u0005)\u0000\u0000\u0295\u0297\u0005J\u0000\u0000\u0296"+
		"\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297"+
		"\u0298\u0001\u0000\u0000\u0000\u0298\u029a\u0005-\u0000\u0000\u0299\u028d"+
		"\u0001\u0000\u0000\u0000\u0299\u028e\u0001\u0000\u0000\u0000\u0299\u028f"+
		"\u0001\u0000\u0000\u0000\u0299\u0290\u0001\u0000\u0000\u0000\u0299\u0292"+
		"\u0001\u0000\u0000\u0000\u0299\u0296\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u029c\u0005^\u0000\u0000\u029c\u029d\u0003"+
		",\u0016\u0000\u029d7\u0001\u0000\u0000\u0000\u029e\u029f\u00052\u0000"+
		"\u0000\u029f\u02a0\u0005U\u0000\u0000\u02a0\u02a1\u0003,\u0016\u0000\u02a1"+
		"9\u0001\u0000\u0000\u0000\u02a2\u02a7\u00052\u0000\u0000\u02a3\u02a4\u0005"+
		"`\u0000\u0000\u02a4\u02a6\u00052\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8;\u0001\u0000\u0000\u0000"+
		"\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005\u000e\u0000\u0000"+
		"\u02ab\u02ad\u00052\u0000\u0000\u02ac\u02ae\u0003X,\u0000\u02ad\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u02b1\u0005W\u0000\u0000\u02b0\u02b2\u0003"+
		"F#\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b6\u0005X\u0000\u0000"+
		"\u02b4\u02b5\u0005V\u0000\u0000\u02b5\u02b7\u0003n7\u0000\u02b6\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005^\u0000\u0000\u02b9\u02ba\u0003"+
		"j5\u0000\u02ba=\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003@ \u0000\u02bc"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c0\u02c4\u0003D\"\u0000\u02c1\u02c4"+
		"\u0003<\u001e\u0000\u02c2\u02c4\u0003B!\u0000\u02c3\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c4?\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005N\u0000\u0000"+
		"\u02c6\u02c7\u0003x<\u0000\u02c7\u02c8\u0005b\u0000\u0000\u02c8A\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0005\t\u0000\u0000\u02ca\u02d0\u0003<"+
		"\u001e\u0000\u02cb\u02cc\u0005\t\u0000\u0000\u02cc\u02d0\u0003\u0016\u000b"+
		"\u0000\u02cd\u02ce\u0005\t\u0000\u0000\u02ce\u02d0\u0003\u0014\n\u0000"+
		"\u02cf\u02c9\u0001\u0000\u0000\u0000\u02cf\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0C\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0005\f\u0000\u0000\u02d2\u02d4\u00052\u0000\u0000\u02d3\u02d5"+
		"\u0003X,\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d5\u02db\u0001\u0000\u0000\u0000\u02d6\u02d8\u0005W\u0000"+
		"\u0000\u02d7\u02d9\u0003\u00ceg\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000"+
		"\u02da\u02dc\u0005X\u0000\u0000\u02db\u02d6\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0005^\u0000\u0000\u02de\u02df\u0003j5\u0000\u02dfE\u0001\u0000"+
		"\u0000\u0000\u02e0\u02e1\u0003H$\u0000\u02e1G\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e7\u0003J%\u0000\u02e3\u02e4\u0005]\u0000\u0000\u02e4\u02e6"+
		"\u0003J%\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u02ee\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0005]\u0000\u0000\u02eb\u02ed\u0003L&\u0000"+
		"\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f3\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0005]\u0000\u0000\u02f2\u02f4\u0003P(\u0000\u02f3\u02f1"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005]\u0000\u0000\u02f6\u02f8\u0003"+
		"N\'\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fa\u0300\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fd\u0005]\u0000\u0000\u02fd\u02fe\u0005K\u0000\u0000"+
		"\u02fe\u02ff\u0005K\u0000\u0000\u02ff\u0301\u0003J%\u0000\u0300\u02fc"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0303"+
		"\u0001\u0000\u0000\u0000\u0302\u0304\u0005]\u0000\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0361\u0001"+
		"\u0000\u0000\u0000\u0305\u030a\u0003L&\u0000\u0306\u0307\u0005]\u0000"+
		"\u0000\u0307\u0309\u0003L&\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309"+
		"\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u030f\u0001\u0000\u0000\u0000\u030c"+
		"\u030a\u0001\u0000\u0000\u0000\u030d\u030e\u0005]\u0000\u0000\u030e\u0310"+
		"\u0003P(\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000"+
		"\u0000\u0000\u0310\u0315\u0001\u0000\u0000\u0000\u0311\u0312\u0005]\u0000"+
		"\u0000\u0312\u0314\u0003N\'\u0000\u0313\u0311\u0001\u0000\u0000\u0000"+
		"\u0314\u0317\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000"+
		"\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u031c\u0001\u0000\u0000\u0000"+
		"\u0317\u0315\u0001\u0000\u0000\u0000\u0318\u0319\u0005]\u0000\u0000\u0319"+
		"\u031a\u0005K\u0000\u0000\u031a\u031b\u0005K\u0000\u0000\u031b\u031d\u0003"+
		"J%\u0000\u031c\u0318\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u0320\u0005]\u0000\u0000"+
		"\u031f\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000"+
		"\u0320\u0361\u0001\u0000\u0000\u0000\u0321\u0326\u0003P(\u0000\u0322\u0323"+
		"\u0005]\u0000\u0000\u0323\u0325\u0003N\'\u0000\u0324\u0322\u0001\u0000"+
		"\u0000\u0000\u0325\u0328\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u032d\u0001\u0000"+
		"\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032a\u0005]\u0000"+
		"\u0000\u032a\u032b\u0005K\u0000\u0000\u032b\u032c\u0005K\u0000\u0000\u032c"+
		"\u032e\u0003J%\u0000\u032d\u0329\u0001\u0000\u0000\u0000\u032d\u032e\u0001"+
		"\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000\u032f\u0331\u0005"+
		"]\u0000\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000"+
		"\u0000\u0000\u0331\u0361\u0001\u0000\u0000\u0000\u0332\u0333\u0005K\u0000"+
		"\u0000\u0333\u0334\u0005K\u0000\u0000\u0334\u0336\u0003J%\u0000\u0335"+
		"\u0337\u0005]\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0001\u0000\u0000\u0000\u0337\u0361\u0001\u0000\u0000\u0000\u0338\u033a"+
		"\u0003J%\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u0342\u0005L\u0000"+
		"\u0000\u033e\u033f\u0005]\u0000\u0000\u033f\u0341\u0003J%\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342"+
		"\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u0349\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345"+
		"\u0346\u0005]\u0000\u0000\u0346\u0348\u0003L&\u0000\u0347\u0345\u0001"+
		"\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034e\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034d\u0005"+
		"]\u0000\u0000\u034d\u034f\u0003P(\u0000\u034e\u034c\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0354\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0005]\u0000\u0000\u0351\u0353\u0003N\'\u0000\u0352"+
		"\u0350\u0001\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354"+
		"\u0352\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355"+
		"\u035b\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0005]\u0000\u0000\u0358\u0359\u0005K\u0000\u0000\u0359\u035a\u0005"+
		"K\u0000\u0000\u035a\u035c\u0003J%\u0000\u035b\u0357\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000\u0000"+
		"\u0000\u035d\u035f\u0005]\u0000\u0000\u035e\u035d\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0361\u0001\u0000\u0000\u0000"+
		"\u0360\u02e2\u0001\u0000\u0000\u0000\u0360\u0305\u0001\u0000\u0000\u0000"+
		"\u0360\u0321\u0001\u0000\u0000\u0000\u0360\u0332\u0001\u0000\u0000\u0000"+
		"\u0360\u0339\u0001\u0000\u0000\u0000\u0361I\u0001\u0000\u0000\u0000\u0362"+
		"\u0364\u00052\u0000\u0000\u0363\u0365\u0003R)\u0000\u0364\u0363\u0001"+
		"\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365K\u0001\u0000"+
		"\u0000\u0000\u0366\u0368\u00052\u0000\u0000\u0367\u0369\u0003R)\u0000"+
		"\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000"+
		"\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036b\u0003T*\u0000\u036bM"+
		"\u0001\u0000\u0000\u0000\u036c\u036e\u00052\u0000\u0000\u036d\u036f\u0003"+
		"R)\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000"+
		"\u0000\u036f\u0371\u0001\u0000\u0000\u0000\u0370\u0372\u0003T*\u0000\u0371"+
		"\u0370\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372"+
		"O\u0001\u0000\u0000\u0000\u0373\u0374\u0005K\u0000\u0000\u0374\u0376\u0005"+
		"2\u0000\u0000\u0375\u0377\u0003R)\u0000\u0376\u0375\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000"+
		"\u0000\u0378\u037a\u0005K\u0000\u0000\u0379\u0373\u0001\u0000\u0000\u0000"+
		"\u0379\u0378\u0001\u0000\u0000\u0000\u037aQ\u0001\u0000\u0000\u0000\u037b"+
		"\u037c\u0005^\u0000\u0000\u037c\u037d\u0003n7\u0000\u037dS\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0005U\u0000\u0000\u037f\u0380\u0003n7\u0000"+
		"\u0380U\u0001\u0000\u0000\u0000\u0381\u0382\u0005(\u0000\u0000\u0382\u0384"+
		"\u00052\u0000\u0000\u0383\u0385\u0003X,\u0000\u0384\u0383\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000"+
		"\u0000\u0000\u0386\u0387\u0005U\u0000\u0000\u0387\u0388\u0003n7\u0000"+
		"\u0388W\u0001\u0000\u0000\u0000\u0389\u038a\u0005Y\u0000\u0000\u038a\u038f"+
		"\u0003Z-\u0000\u038b\u038c\u0005]\u0000\u0000\u038c\u038e\u0003Z-\u0000"+
		"\u038d\u038b\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u0393\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000"+
		"\u0392\u0394\u0005]\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0005Z\u0000\u0000\u0396Y\u0001\u0000\u0000\u0000\u0397\u0398\u0005"+
		"2\u0000\u0000\u0398\u0399\u0005^\u0000\u0000\u0399\u03aa\u0003n7\u0000"+
		"\u039a\u039b\u0005K\u0000\u0000\u039b\u039c\u00052\u0000\u0000\u039c\u039d"+
		"\u0005^\u0000\u0000\u039d\u03aa\u0003n7\u0000\u039e\u039f\u0005K\u0000"+
		"\u0000\u039f\u03a0\u0005K\u0000\u0000\u03a0\u03a1\u00052\u0000\u0000\u03a1"+
		"\u03a2\u0005^\u0000\u0000\u03a2\u03aa\u0003n7\u0000\u03a3\u03aa\u0005"+
		"2\u0000\u0000\u03a4\u03a5\u0005K\u0000\u0000\u03a5\u03aa\u00052\u0000"+
		"\u0000\u03a6\u03a7\u0005K\u0000\u0000\u03a7\u03a8\u0005K\u0000\u0000\u03a8"+
		"\u03aa\u00052\u0000\u0000\u03a9\u0397\u0001\u0000\u0000\u0000\u03a9\u039a"+
		"\u0001\u0000\u0000\u0000\u03a9\u039e\u0001\u0000\u0000\u0000\u03a9\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a9\u03a4\u0001\u0000\u0000\u0000\u03a9\u03a6"+
		"\u0001\u0000\u0000\u0000\u03aa[\u0001\u0000\u0000\u0000\u03ab\u03b0\u0003"+
		"^/\u0000\u03ac\u03ad\u0005]\u0000\u0000\u03ad\u03af\u0003^/\u0000\u03ae"+
		"\u03ac\u0001\u0000\u0000\u0000\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0"+
		"\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1"+
		"]\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b6"+
		"\u0003`0\u0000\u03b4\u03b5\u0005\u0007\u0000\u0000\u03b5\u03b7\u00052"+
		"\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7_\u0001\u0000\u0000\u0000\u03b8\u03bd\u00052\u0000\u0000"+
		"\u03b9\u03ba\u0005`\u0000\u0000\u03ba\u03bc\u00052\u0000\u0000\u03bb\u03b9"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03bea\u0001"+
		"\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c2\u0005"+
		"`\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c6\u03cd\u0003`0\u0000\u03c7\u03c9\u0005`\u0000\u0000"+
		"\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03c3\u0001\u0000\u0000\u0000"+
		"\u03cc\u03c8\u0001\u0000\u0000\u0000\u03cdc\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0005W\u0000\u0000\u03cf\u03d1\u0003f3\u0000\u03d0\u03d2\u0005"+
		"]\u0000\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005X\u0000"+
		"\u0000\u03d4\u03d8\u0001\u0000\u0000\u0000\u03d5\u03d8\u0003f3\u0000\u03d6"+
		"\u03d8\u0005K\u0000\u0000\u03d7\u03ce\u0001\u0000\u0000\u0000\u03d7\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d8e\u0001"+
		"\u0000\u0000\u0000\u03d9\u03de\u0003h4\u0000\u03da\u03db\u0005]\u0000"+
		"\u0000\u03db\u03dd\u0003h4\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd"+
		"\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de"+
		"\u03df\u0001\u0000\u0000\u0000\u03dfg\u0001\u0000\u0000\u0000\u03e0\u03de"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e4\u00052\u0000\u0000\u03e2\u03e3\u0005"+
		"\u0007\u0000\u0000\u03e3\u03e5\u00052\u0000\u0000\u03e4\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5i\u0001\u0000\u0000"+
		"\u0000\u03e6\u03f1\u0003\u0006\u0003\u0000\u03e7\u03e8\u0005b\u0000\u0000"+
		"\u03e8\u03ea\u0005\u0001\u0000\u0000\u03e9\u03eb\u0003\u0002\u0001\u0000"+
		"\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000"+
		"\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005\u0002\u0000\u0000"+
		"\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03e6\u0001\u0000\u0000\u0000"+
		"\u03f0\u03e7\u0001\u0000\u0000\u0000\u03f1k\u0001\u0000\u0000\u0000\u03f2"+
		"\u03f7\u0003n7\u0000\u03f3\u03f4\u0005]\u0000\u0000\u03f4\u03f6\u0003"+
		"n7\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f9\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000"+
		"\u0000\u03f8\u03fb\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fc\u0005]\u0000\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000\u0000\u0000"+
		"\u03fd\u03ff\u0003n7\u0000\u03fe\u03f2\u0001\u0000\u0000\u0000\u03fe\u03fd"+
		"\u0001\u0000\u0000\u0000\u03ffm\u0001\u0000\u0000\u0000\u0400\u0401\u0003"+
		"z=\u0000\u0401\u0402\u0005\u0017\u0000\u0000\u0402\u0403\u0003z=\u0000"+
		"\u0403\u0404\u0005\u0011\u0000\u0000\u0404\u0405\u0003n7\u0000\u0405\u040a"+
		"\u0001\u0000\u0000\u0000\u0406\u040a\u0003z=\u0000\u0407\u040a\u0003\u00b0"+
		"X\u0000\u0408\u040a\u0003p8\u0000\u0409\u0400\u0001\u0000\u0000\u0000"+
		"\u0409\u0406\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000"+
		"\u0409\u0408\u0001\u0000\u0000\u0000\u040ao\u0001\u0000\u0000\u0000\u040b"+
		"\u040c\u0005%\u0000\u0000\u040c\u040d\u0005\u0015\u0000\u0000\u040d\u0413"+
		"\u0003n7\u0000\u040e\u0410\u0005%\u0000\u0000\u040f\u0411\u0003r9\u0000"+
		"\u0410\u040f\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000"+
		"\u0411\u0413\u0001\u0000\u0000\u0000\u0412\u040b\u0001\u0000\u0000\u0000"+
		"\u0412\u040e\u0001\u0000\u0000\u0000\u0413q\u0001\u0000\u0000\u0000\u0414"+
		"\u0419\u0003t:\u0000\u0415\u0416\u0005]\u0000\u0000\u0416\u0418\u0003"+
		"t:\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000\u0000"+
		"\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000"+
		"\u0000\u041a\u041d\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000"+
		"\u0000\u041c\u041e\u0005]\u0000\u0000\u041d\u041c\u0001\u0000\u0000\u0000"+
		"\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u0421\u0001\u0000\u0000\u0000"+
		"\u041f\u0421\u0003t:\u0000\u0420\u0414\u0001\u0000\u0000\u0000\u0420\u041f"+
		"\u0001\u0000\u0000\u0000\u0421s\u0001\u0000\u0000\u0000\u0422\u0423\u0005"+
		"K\u0000\u0000\u0423\u0426\u0003\u0084B\u0000\u0424\u0426\u0003n7\u0000"+
		"\u0425\u0422\u0001\u0000\u0000\u0000\u0425\u0424\u0001\u0000\u0000\u0000"+
		"\u0426u\u0001\u0000\u0000\u0000\u0427\u0428\u0005K\u0000\u0000\u0428\u042b"+
		"\u0003\u0084B\u0000\u0429\u042b\u0003x<\u0000\u042a\u0427\u0001\u0000"+
		"\u0000\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042bw\u0001\u0000\u0000"+
		"\u0000\u042c\u042d\u00052\u0000\u0000\u042d\u042e\u0005@\u0000\u0000\u042e"+
		"\u0431\u0003n7\u0000\u042f\u0431\u0003n7\u0000\u0430\u042c\u0001\u0000"+
		"\u0000\u0000\u0430\u042f\u0001\u0000\u0000\u0000\u0431y\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0006=\uffff\uffff\u0000\u0433\u0434\u0003|>\u0000"+
		"\u0434\u043a\u0001\u0000\u0000\u0000\u0435\u0436\n\u0002\u0000\u0000\u0436"+
		"\u0437\u0005\u001e\u0000\u0000\u0437\u0439\u0003|>\u0000\u0438\u0435\u0001"+
		"\u0000\u0000\u0000\u0439\u043c\u0001\u0000\u0000\u0000\u043a\u0438\u0001"+
		"\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b{\u0001\u0000"+
		"\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043d\u043e\u0006>\uffff"+
		"\uffff\u0000\u043e\u043f\u0003~?\u0000\u043f\u0445\u0001\u0000\u0000\u0000"+
		"\u0440\u0441\n\u0002\u0000\u0000\u0441\u0442\u0005\u0006\u0000\u0000\u0442"+
		"\u0444\u0003~?\u0000\u0443\u0440\u0001\u0000\u0000\u0000\u0444\u0447\u0001"+
		"\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001"+
		"\u0000\u0000\u0000\u0446}\u0001\u0000\u0000\u0000\u0447\u0445\u0001\u0000"+
		"\u0000\u0000\u0448\u0449\u0005\u001d\u0000\u0000\u0449\u044c\u0003~?\u0000"+
		"\u044a\u044c\u0003\u0080@\u0000\u044b\u0448\u0001\u0000\u0000\u0000\u044b"+
		"\u044a\u0001\u0000\u0000\u0000\u044c\u007f\u0001\u0000\u0000\u0000\u044d"+
		"\u044f\u0003\u0084B\u0000\u044e\u0450\u0003\u0082A\u0000\u044f\u044e\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0455\u0001"+
		"\u0000\u0000\u0000\u0453\u0455\u0003\u0084B\u0000\u0454\u044d\u0001\u0000"+
		"\u0000\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0081\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0005A\u0000\u0000\u0457\u046d\u0003\u0084B\u0000"+
		"\u0458\u0459\u0005B\u0000\u0000\u0459\u046d\u0003\u0084B\u0000\u045a\u045b"+
		"\u0005C\u0000\u0000\u045b\u046d\u0003\u0084B\u0000\u045c\u045d\u0005E"+
		"\u0000\u0000\u045d\u046d\u0003\u0084B\u0000\u045e\u045f\u0005D\u0000\u0000"+
		"\u045f\u046d\u0003\u0084B\u0000\u0460\u0461\u0005F\u0000\u0000\u0461\u046d"+
		"\u0003\u0084B\u0000\u0462\u0463\u0005\u001d\u0000\u0000\u0463\u0464\u0005"+
		"\u0019\u0000\u0000\u0464\u046d\u0003\u0084B\u0000\u0465\u0466\u0005\u0019"+
		"\u0000\u0000\u0466\u046d\u0003\u0084B\u0000\u0467\u0468\u0005\u001a\u0000"+
		"\u0000\u0468\u0469\u0005\u001d\u0000\u0000\u0469\u046d\u0003\u0084B\u0000"+
		"\u046a\u046b\u0005\u001a\u0000\u0000\u046b\u046d\u0003\u0084B\u0000\u046c"+
		"\u0456\u0001\u0000\u0000\u0000\u046c\u0458\u0001\u0000\u0000\u0000\u046c"+
		"\u045a\u0001\u0000\u0000\u0000\u046c\u045c\u0001\u0000\u0000\u0000\u046c"+
		"\u045e\u0001\u0000\u0000\u0000\u046c\u0460\u0001\u0000\u0000\u0000\u046c"+
		"\u0462\u0001\u0000\u0000\u0000\u046c\u0465\u0001\u0000\u0000\u0000\u046c"+
		"\u0467\u0001\u0000\u0000\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046d"+
		"\u0083\u0001\u0000\u0000\u0000\u046e\u046f\u0006B\uffff\uffff\u0000\u046f"+
		"\u0470\u0003\u0086C\u0000\u0470\u0476\u0001\u0000\u0000\u0000\u0471\u0472"+
		"\n\u0002\u0000\u0000\u0472\u0473\u0005R\u0000\u0000\u0473\u0475\u0003"+
		"\u0086C\u0000\u0474\u0471\u0001\u0000\u0000\u0000\u0475\u0478\u0001\u0000"+
		"\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0476\u0477\u0001\u0000"+
		"\u0000\u0000\u0477\u0085\u0001\u0000\u0000\u0000\u0478\u0476\u0001\u0000"+
		"\u0000\u0000\u0479\u047a\u0006C\uffff\uffff\u0000\u047a\u047b\u0003\u0088"+
		"D\u0000\u047b\u0481\u0001\u0000\u0000\u0000\u047c\u047d\n\u0002\u0000"+
		"\u0000\u047d\u047e\u0005S\u0000\u0000\u047e\u0480\u0003\u0088D\u0000\u047f"+
		"\u047c\u0001\u0000\u0000\u0000\u0480\u0483\u0001\u0000\u0000\u0000\u0481"+
		"\u047f\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482"+
		"\u0087\u0001\u0000\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0484"+
		"\u0485\u0006D\uffff\uffff\u0000\u0485\u0486\u0003\u008aE\u0000\u0486\u048c"+
		"\u0001\u0000\u0000\u0000\u0487\u0488\n\u0002\u0000\u0000\u0488\u0489\u0005"+
		"Q\u0000\u0000\u0489\u048b\u0003\u008aE\u0000\u048a\u0487\u0001\u0000\u0000"+
		"\u0000\u048b\u048e\u0001\u0000\u0000\u0000\u048c\u048a\u0001\u0000\u0000"+
		"\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d\u0089\u0001\u0000\u0000"+
		"\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048f\u0490\u0006E\uffff\uffff"+
		"\u0000\u0490\u0491\u0003\u008cF\u0000\u0491\u049a\u0001\u0000\u0000\u0000"+
		"\u0492\u0493\n\u0003\u0000\u0000\u0493\u0494\u0005O\u0000\u0000\u0494"+
		"\u0499\u0003\u008cF\u0000\u0495\u0496\n\u0002\u0000\u0000\u0496\u0497"+
		"\u0005P\u0000\u0000\u0497\u0499\u0003\u008cF\u0000\u0498\u0492\u0001\u0000"+
		"\u0000\u0000\u0498\u0495\u0001\u0000\u0000\u0000\u0499\u049c\u0001\u0000"+
		"\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000"+
		"\u0000\u0000\u049b\u008b\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000"+
		"\u0000\u0000\u049d\u049e\u0006F\uffff\uffff\u0000\u049e\u049f\u0003\u008e"+
		"G\u0000\u049f\u04a8\u0001\u0000\u0000\u0000\u04a0\u04a1\n\u0003\u0000"+
		"\u0000\u04a1\u04a2\u0005I\u0000\u0000\u04a2\u04a7\u0003\u008eG\u0000\u04a3"+
		"\u04a4\n\u0002\u0000\u0000\u04a4\u04a5\u0005J\u0000\u0000\u04a5\u04a7"+
		"\u0003\u008eG\u0000\u04a6\u04a0\u0001\u0000\u0000\u0000\u04a6\u04a3\u0001"+
		"\u0000\u0000\u0000\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a6\u0001"+
		"\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9\u008d\u0001"+
		"\u0000\u0000\u0000\u04aa\u04a8\u0001\u0000\u0000\u0000\u04ab\u04ac\u0006"+
		"G\uffff\uffff\u0000\u04ac\u04ad\u0003\u0090H\u0000\u04ad\u04bf\u0001\u0000"+
		"\u0000\u0000\u04ae\u04af\n\u0006\u0000\u0000\u04af\u04b0\u0005K\u0000"+
		"\u0000\u04b0\u04be\u0003\u0090H\u0000\u04b1\u04b2\n\u0005\u0000\u0000"+
		"\u04b2\u04b3\u0005L\u0000\u0000\u04b3\u04be\u0003\u0090H\u0000\u04b4\u04b5"+
		"\n\u0004\u0000\u0000\u04b5\u04b6\u0005H\u0000\u0000\u04b6\u04be\u0003"+
		"\u0090H\u0000\u04b7\u04b8\n\u0003\u0000\u0000\u04b8\u04b9\u0005M\u0000"+
		"\u0000\u04b9\u04be\u0003\u0090H\u0000\u04ba\u04bb\n\u0002\u0000\u0000"+
		"\u04bb\u04bc\u0005N\u0000\u0000\u04bc\u04be\u0003\u0090H\u0000\u04bd\u04ae"+
		"\u0001\u0000\u0000\u0000\u04bd\u04b1\u0001\u0000\u0000\u0000\u04bd\u04b4"+
		"\u0001\u0000\u0000\u0000\u04bd\u04b7\u0001\u0000\u0000\u0000\u04bd\u04ba"+
		"\u0001\u0000\u0000\u0000\u04be\u04c1\u0001\u0000\u0000\u0000\u04bf\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u008f"+
		"\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000\u04c2\u04c3"+
		"\u0005I\u0000\u0000\u04c3\u04ca\u0003\u0090H\u0000\u04c4\u04c5\u0005J"+
		"\u0000\u0000\u04c5\u04ca\u0003\u0090H\u0000\u04c6\u04c7\u0005T\u0000\u0000"+
		"\u04c7\u04ca\u0003\u0090H\u0000\u04c8\u04ca\u0003\u0092I\u0000\u04c9\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c9\u04c4\u0001\u0000\u0000\u0000\u04c9\u04c6"+
		"\u0001\u0000\u0000\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04ca\u0091"+
		"\u0001\u0000\u0000\u0000\u04cb\u04cc\u0003\u0094J\u0000\u04cc\u04cd\u0005"+
		"G\u0000\u0000\u04cd\u04ce\u0003\u0090H\u0000\u04ce\u04d1\u0001\u0000\u0000"+
		"\u0000\u04cf\u04d1\u0003\u0094J\u0000\u04d0\u04cb\u0001\u0000\u0000\u0000"+
		"\u04d0\u04cf\u0001\u0000\u0000\u0000\u04d1\u0093\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d3\u0005\n\u0000\u0000\u04d3\u04d6\u0003\u0096K\u0000\u04d4"+
		"\u04d6\u0003\u0096K\u0000\u04d5\u04d2\u0001\u0000\u0000\u0000\u04d5\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d6\u0095\u0001\u0000\u0000\u0000\u04d7\u04d8"+
		"\u0006K\uffff\uffff\u0000\u04d8\u04d9\u0003\u009cN\u0000\u04d9\u04e9\u0001"+
		"\u0000\u0000\u0000\u04da\u04db\n\u0005\u0000\u0000\u04db\u04dc\u0005`"+
		"\u0000\u0000\u04dc\u04e8\u00052\u0000\u0000\u04dd\u04de\n\u0004\u0000"+
		"\u0000\u04de\u04e8\u0003\u0098L\u0000\u04df\u04e0\n\u0003\u0000\u0000"+
		"\u04e0\u04e8\u0003\u00a8T\u0000\u04e1\u04e2\n\u0002\u0000\u0000\u04e2"+
		"\u04e4\u0005W\u0000\u0000\u04e3\u04e5\u0003\u00ceg\u0000\u04e4\u04e3\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e8\u0005X\u0000\u0000\u04e7\u04da\u0001\u0000"+
		"\u0000\u0000\u04e7\u04dd\u0001\u0000\u0000\u0000\u04e7\u04df\u0001\u0000"+
		"\u0000\u0000\u04e7\u04e1\u0001\u0000\u0000\u0000\u04e8\u04eb\u0001\u0000"+
		"\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000"+
		"\u0000\u0000\u04ea\u0097\u0001\u0000\u0000\u0000\u04eb\u04e9\u0001\u0000"+
		"\u0000\u0000\u04ec\u04ed\u0005Y\u0000\u0000\u04ed\u04f2\u0003\u009aM\u0000"+
		"\u04ee\u04ef\u0005]\u0000\u0000\u04ef\u04f1\u0003\u009aM\u0000\u04f0\u04ee"+
		"\u0001\u0000\u0000\u0000\u04f1\u04f4\u0001\u0000\u0000\u0000\u04f2\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f6"+
		"\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f5\u04f7"+
		"\u0005]\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001"+
		"\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f9\u0005"+
		"Z\u0000\u0000\u04f9\u0099\u0001\u0000\u0000\u0000\u04fa\u04fc\u0003n7"+
		"\u0000\u04fb\u04fa\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000"+
		"\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000\u04fd\u04ff\u0005^\u0000\u0000"+
		"\u04fe\u0500\u0003n7\u0000\u04ff\u04fe\u0001\u0000\u0000\u0000\u04ff\u0500"+
		"\u0001\u0000\u0000\u0000\u0500\u0505\u0001\u0000\u0000\u0000\u0501\u0503"+
		"\u0005^\u0000\u0000\u0502\u0504\u0003n7\u0000\u0503\u0502\u0001\u0000"+
		"\u0000\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0506\u0001\u0000"+
		"\u0000\u0000\u0505\u0501\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000"+
		"\u0000\u0000\u0506\u0509\u0001\u0000\u0000\u0000\u0507\u0509\u0003x<\u0000"+
		"\u0508\u04fb\u0001\u0000\u0000\u0000\u0508\u0507\u0001\u0000\u0000\u0000"+
		"\u0509\u009b\u0001\u0000\u0000\u0000\u050a\u0571\u00052\u0000\u0000\u050b"+
		"\u0571\u0005\u0005\u0000\u0000\u050c\u0571\u0005\u0003\u0000\u0000\u050d"+
		"\u0571\u0005\u0004\u0000\u0000\u050e\u0571\u0003\u009eO\u0000\u050f\u0571"+
		"\u0005)\u0000\u0000\u0510\u0571\u0005-\u0000\u0000\u0511\u0571\u0005."+
		"\u0000\u0000\u0512\u0571\u0005,\u0000\u0000\u0513\u0571\u0005*\u0000\u0000"+
		"\u0514\u0571\u0005+\u0000\u0000\u0515\u0516\u0005W\u0000\u0000\u0516\u0517"+
		"\u0003p8\u0000\u0517\u0518\u0005X\u0000\u0000\u0518\u0571\u0001\u0000"+
		"\u0000\u0000\u0519\u051a\u0005W\u0000\u0000\u051a\u051b\u0003v;\u0000"+
		"\u051b\u0524\u0005]\u0000\u0000\u051c\u0521\u0003v;\u0000\u051d\u051e"+
		"\u0005]\u0000\u0000\u051e\u0520\u0003v;\u0000\u051f\u051d\u0001\u0000"+
		"\u0000\u0000\u0520\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000"+
		"\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0525\u0001\u0000"+
		"\u0000\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0524\u051c\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0527\u0001\u0000"+
		"\u0000\u0000\u0526\u0528\u0005]\u0000\u0000\u0527\u0526\u0001\u0000\u0000"+
		"\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u0529\u0001\u0000\u0000"+
		"\u0000\u0529\u052a\u0005X\u0000\u0000\u052a\u0571\u0001\u0000\u0000\u0000"+
		"\u052b\u052c\u0005W\u0000\u0000\u052c\u052d\u0003v;\u0000\u052d\u052e"+
		"\u0005X\u0000\u0000\u052e\u0571\u0001\u0000\u0000\u0000\u052f\u0530\u0005"+
		"W\u0000\u0000\u0530\u0531\u0003\u00a8T\u0000\u0531\u0532\u0005X\u0000"+
		"\u0000\u0532\u0571\u0001\u0000\u0000\u0000\u0533\u0534\u0005W\u0000\u0000"+
		"\u0534\u0571\u0005X\u0000\u0000\u0535\u0536\u0005Y\u0000\u0000\u0536\u053b"+
		"\u0003v;\u0000\u0537\u0538\u0005]\u0000\u0000\u0538\u053a\u0003v;\u0000"+
		"\u0539\u0537\u0001\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000\u0000"+
		"\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000"+
		"\u053c\u053f\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000"+
		"\u053e\u0540\u0005]\u0000\u0000\u053f\u053e\u0001\u0000\u0000\u0000\u053f"+
		"\u0540\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541"+
		"\u0542\u0005Z\u0000\u0000\u0542\u0571\u0001\u0000\u0000\u0000\u0543\u0544"+
		"\u0005Y\u0000\u0000\u0544\u0545\u0003\u00a6S\u0000\u0545\u0546\u0005Z"+
		"\u0000\u0000\u0546\u0571\u0001\u0000\u0000\u0000\u0547\u0548\u0005Y\u0000"+
		"\u0000\u0548\u0571\u0005Z\u0000\u0000\u0549\u054a\u0005[\u0000\u0000\u054a"+
		"\u054f\u0003\u00a0P\u0000\u054b\u054c\u0005]\u0000\u0000\u054c\u054e\u0003"+
		"\u00a0P\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054e\u0551\u0001\u0000"+
		"\u0000\u0000\u054f\u054d\u0001\u0000\u0000\u0000\u054f\u0550\u0001\u0000"+
		"\u0000\u0000\u0550\u0553\u0001\u0000\u0000\u0000\u0551\u054f\u0001\u0000"+
		"\u0000\u0000\u0552\u0554\u0005]\u0000\u0000\u0553\u0552\u0001\u0000\u0000"+
		"\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000"+
		"\u0000\u0555\u0556\u0005\\\u0000\u0000\u0556\u0571\u0001\u0000\u0000\u0000"+
		"\u0557\u0558\u0005[\u0000\u0000\u0558\u0559\u0003\u00a2Q\u0000\u0559\u055a"+
		"\u0005\\\u0000\u0000\u055a\u0571\u0001\u0000\u0000\u0000\u055b\u055c\u0005"+
		"[\u0000\u0000\u055c\u0571\u0005\\\u0000\u0000\u055d\u055e\u0005[\u0000"+
		"\u0000\u055e\u0563\u0003\u00aaU\u0000\u055f\u0560\u0005]\u0000\u0000\u0560"+
		"\u0562\u0003\u00aaU\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0562\u0565"+
		"\u0001\u0000\u0000\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0563\u0564"+
		"\u0001\u0000\u0000\u0000\u0564\u0567\u0001\u0000\u0000\u0000\u0565\u0563"+
		"\u0001\u0000\u0000\u0000\u0566\u0568\u0005]\u0000\u0000\u0567\u0566\u0001"+
		"\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569\u0001"+
		"\u0000\u0000\u0000\u0569\u056a\u0005\\\u0000\u0000\u056a\u0571\u0001\u0000"+
		"\u0000\u0000\u056b\u056c\u0005[\u0000\u0000\u056c\u056d\u0003\u00a4R\u0000"+
		"\u056d\u056e\u0005\\\u0000\u0000\u056e\u0571\u0001\u0000\u0000\u0000\u056f"+
		"\u0571\u0005a\u0000\u0000\u0570\u050a\u0001\u0000\u0000\u0000\u0570\u050b"+
		"\u0001\u0000\u0000\u0000\u0570\u050c\u0001\u0000\u0000\u0000\u0570\u050d"+
		"\u0001\u0000\u0000\u0000\u0570\u050e\u0001\u0000\u0000\u0000\u0570\u050f"+
		"\u0001\u0000\u0000\u0000\u0570\u0510\u0001\u0000\u0000\u0000\u0570\u0511"+
		"\u0001\u0000\u0000\u0000\u0570\u0512\u0001\u0000\u0000\u0000\u0570\u0513"+
		"\u0001\u0000\u0000\u0000\u0570\u0514\u0001\u0000\u0000\u0000\u0570\u0515"+
		"\u0001\u0000\u0000\u0000\u0570\u0519\u0001\u0000\u0000\u0000\u0570\u052b"+
		"\u0001\u0000\u0000\u0000\u0570\u052f\u0001\u0000\u0000\u0000\u0570\u0533"+
		"\u0001\u0000\u0000\u0000\u0570\u0535\u0001\u0000\u0000\u0000\u0570\u0543"+
		"\u0001\u0000\u0000\u0000\u0570\u0547\u0001\u0000\u0000\u0000\u0570\u0549"+
		"\u0001\u0000\u0000\u0000\u0570\u0557\u0001\u0000\u0000\u0000\u0570\u055b"+
		"\u0001\u0000\u0000\u0000\u0570\u055d\u0001\u0000\u0000\u0000\u0570\u056b"+
		"\u0001\u0000\u0000\u0000\u0570\u056f\u0001\u0000\u0000\u0000\u0571\u009d"+
		"\u0001\u0000\u0000\u0000\u0572\u0574\u0007\u0001\u0000\u0000\u0573\u0572"+
		"\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575\u0573"+
		"\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u009f"+
		"\u0001\u0000\u0000\u0000\u0577\u0578\u0005K\u0000\u0000\u0578\u0579\u0005"+
		"K\u0000\u0000\u0579\u057f\u0003\u0084B\u0000\u057a\u057b\u0003n7\u0000"+
		"\u057b\u057c\u0005^\u0000\u0000\u057c\u057d\u0003n7\u0000\u057d\u057f"+
		"\u0001\u0000\u0000\u0000\u057e\u0577\u0001\u0000\u0000\u0000\u057e\u057a"+
		"\u0001\u0000\u0000\u0000\u057f\u00a1\u0001\u0000\u0000\u0000\u0580\u0581"+
		"\u0003n7\u0000\u0581\u0582\u0005^\u0000\u0000\u0582\u0583\u0003n7\u0000"+
		"\u0583\u0584\u0003\u00acV\u0000\u0584\u00a3\u0001\u0000\u0000\u0000\u0585"+
		"\u0586\u0003v;\u0000\u0586\u0587\u0003\u00acV\u0000\u0587\u00a5\u0001"+
		"\u0000\u0000\u0000\u0588\u0589\u0003v;\u0000\u0589\u058a\u0003\u00acV"+
		"\u0000\u058a\u00a7\u0001\u0000\u0000\u0000\u058b\u058c\u0003v;\u0000\u058c"+
		"\u058d\u0003\u00acV\u0000\u058d\u00a9\u0001\u0000\u0000\u0000\u058e\u058f"+
		"\u0005K\u0000\u0000\u058f\u0592\u0003\u0084B\u0000\u0590\u0592\u0003v"+
		";\u0000\u0591\u058e\u0001\u0000\u0000\u0000\u0591\u0590\u0001\u0000\u0000"+
		"\u0000\u0592\u00ab\u0001\u0000\u0000\u0000\u0593\u0595\u0003\u00aeW\u0000"+
		"\u0594\u0593\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000"+
		"\u0596\u0594\u0001\u0000\u0000\u0000\u0596\u0597\u0001\u0000\u0000\u0000"+
		"\u0597\u00ad\u0001\u0000\u0000\u0000\u0598\u059a\u0005\t\u0000\u0000\u0599"+
		"\u0598\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a"+
		"\u059b\u0001\u0000\u0000\u0000\u059b\u059c\u0005\u0014\u0000\u0000\u059c"+
		"\u059d\u0003\u00bc^\u0000\u059d\u059e\u0005\u0019\u0000\u0000\u059e\u05a3"+
		"\u0003z=\u0000\u059f\u05a0\u0005\u0017\u0000\u0000\u05a0\u05a2\u0003z"+
		"=\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a2\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000"+
		"\u0000\u05a4\u00af\u0001\u0000\u0000\u0000\u05a5\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a8\u0005\u001b\u0000\u0000\u05a7\u05a9\u0003\u00b2Y\u0000"+
		"\u05a8\u05a7\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000"+
		"\u05a9\u05aa\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005^\u0000\u0000\u05ab"+
		"\u05ac\u0003n7\u0000\u05ac\u00b1\u0001\u0000\u0000\u0000\u05ad\u05ae\u0003"+
		"\u00b4Z\u0000\u05ae\u00b3\u0001\u0000\u0000\u0000\u05af\u05b4\u00052\u0000"+
		"\u0000\u05b0\u05b1\u0005]\u0000\u0000\u05b1\u05b3\u00052\u0000\u0000\u05b2"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b3\u05b6\u0001\u0000\u0000\u0000\u05b4"+
		"\u05b2\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5"+
		"\u05bd\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000\u0000\u05b7"+
		"\u05b8\u0005]\u0000\u0000\u05b8\u05b9\u00052\u0000\u0000\u05b9\u05ba\u0005"+
		"U\u0000\u0000\u05ba\u05bc\u0003n7\u0000\u05bb\u05b7\u0001\u0000\u0000"+
		"\u0000\u05bc\u05bf\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000"+
		"\u0000\u05bd\u05be\u0001\u0000\u0000\u0000\u05be\u05c5\u0001\u0000\u0000"+
		"\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005]\u0000\u0000"+
		"\u05c1\u05c3\u0005K\u0000\u0000\u05c2\u05c4\u00052\u0000\u0000\u05c3\u05c2"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u05c6"+
		"\u0001\u0000\u0000\u0000\u05c5\u05c0\u0001\u0000\u0000\u0000\u05c5\u05c6"+
		"\u0001\u0000\u0000\u0000\u05c6\u05cf\u0001\u0000\u0000\u0000\u05c7\u05c8"+
		"\u0005]\u0000\u0000\u05c8\u05cb\u00052\u0000\u0000\u05c9\u05ca\u0005U"+
		"\u0000\u0000\u05ca\u05cc\u0003n7\u0000\u05cb\u05c9\u0001\u0000\u0000\u0000"+
		"\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05ce\u0001\u0000\u0000\u0000"+
		"\u05cd\u05c7\u0001\u0000\u0000\u0000\u05ce\u05d1\u0001\u0000\u0000\u0000"+
		"\u05cf\u05cd\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000"+
		"\u05d0\u05d6\u0001\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d3\u0005]\u0000\u0000\u05d3\u05d4\u0005K\u0000\u0000\u05d4\u05d5"+
		"\u0005K\u0000\u0000\u05d5\u05d7\u00052\u0000\u0000\u05d6\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d9\u0001\u0000"+
		"\u0000\u0000\u05d8\u05da\u0005]\u0000\u0000\u05d9\u05d8\u0001\u0000\u0000"+
		"\u0000\u05d9\u05da\u0001\u0000\u0000\u0000\u05da\u05e2\u0001\u0000\u0000"+
		"\u0000\u05db\u05dc\u0005K\u0000\u0000\u05dc\u05dd\u0005K\u0000\u0000\u05dd"+
		"\u05df\u00052\u0000\u0000\u05de\u05e0\u0005]\u0000\u0000\u05df\u05de\u0001"+
		"\u0000\u0000\u0000\u05df\u05e0\u0001\u0000\u0000\u0000\u05e0\u05e2\u0001"+
		"\u0000\u0000\u0000\u05e1\u05af\u0001\u0000\u0000\u0000\u05e1\u05db\u0001"+
		"\u0000\u0000\u0000\u05e2\u00b5\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005"+
		"2\u0000\u0000\u05e4\u05e5\u0005^\u0000\u0000\u05e5\u05e8\u0003n7\u0000"+
		"\u05e6\u05e7\u0005U\u0000\u0000\u05e7\u05e9\u0003\u00b8\\\u0000\u05e8"+
		"\u05e6\u0001\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9"+
		"\u060e\u0001\u0000\u0000\u0000\u05ea\u05eb\u0005W\u0000\u0000\u05eb\u05ec"+
		"\u0003\u00c4b\u0000\u05ec\u05ed\u0005X\u0000\u0000\u05ed\u05ee\u0005^"+
		"\u0000\u0000\u05ee\u05f1\u0003n7\u0000\u05ef\u05f0\u0005U\u0000\u0000"+
		"\u05f0\u05f2\u0003\u00b8\\\u0000\u05f1\u05ef\u0001\u0000\u0000\u0000\u05f1"+
		"\u05f2\u0001\u0000\u0000\u0000\u05f2\u060e\u0001\u0000\u0000\u0000\u05f3"+
		"\u05f4\u0003\u00c6c\u0000\u05f4\u05f5\u0005^\u0000\u0000\u05f5\u05f8\u0003"+
		"n7\u0000\u05f6\u05f7\u0005U\u0000\u0000\u05f7\u05f9\u0003\u00b8\\\u0000"+
		"\u05f8\u05f6\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000"+
		"\u05f9\u060e\u0001\u0000\u0000\u0000\u05fa\u05ff\u0003\u00bc^\u0000\u05fb"+
		"\u05fc\u0005U\u0000\u0000\u05fc\u05fe\u0003\u00bc^\u0000\u05fd\u05fb\u0001"+
		"\u0000\u0000\u0000\u05fe\u0601\u0001\u0000\u0000\u0000\u05ff\u05fd\u0001"+
		"\u0000\u0000\u0000\u05ff\u0600\u0001\u0000\u0000\u0000\u0600\u0602\u0001"+
		"\u0000\u0000\u0000\u0601\u05ff\u0001\u0000\u0000\u0000\u0602\u0605\u0005"+
		"U\u0000\u0000\u0603\u0606\u0003p8\u0000\u0604\u0606\u0003r9\u0000\u0605"+
		"\u0603\u0001\u0000\u0000\u0000\u0605\u0604\u0001\u0000\u0000\u0000\u0606"+
		"\u060e\u0001\u0000\u0000\u0000\u0607\u0608\u0003\u00c4b\u0000\u0608\u060b"+
		"\u0003\u00ba]\u0000\u0609\u060c\u0003p8\u0000\u060a\u060c\u0003r9\u0000"+
		"\u060b\u0609\u0001\u0000\u0000\u0000\u060b\u060a\u0001\u0000\u0000\u0000"+
		"\u060c\u060e\u0001\u0000\u0000\u0000\u060d\u05e3\u0001\u0000\u0000\u0000"+
		"\u060d\u05ea\u0001\u0000\u0000\u0000\u060d\u05f3\u0001\u0000\u0000\u0000"+
		"\u060d\u05fa\u0001\u0000\u0000\u0000\u060d\u0607\u0001\u0000\u0000\u0000"+
		"\u060e\u00b7\u0001\u0000\u0000\u0000\u060f\u0612\u0003p8\u0000\u0610\u0612"+
		"\u0003r9\u0000\u0611\u060f\u0001\u0000\u0000\u0000\u0611\u0610\u0001\u0000"+
		"\u0000\u0000\u0612\u00b9\u0001\u0000\u0000\u0000\u0613\u0621\u00053\u0000"+
		"\u0000\u0614\u0621\u00054\u0000\u0000\u0615\u0621\u00056\u0000\u0000\u0616"+
		"\u0621\u00058\u0000\u0000\u0617\u0621\u00057\u0000\u0000\u0618\u0621\u0005"+
		"9\u0000\u0000\u0619\u0621\u0005:\u0000\u0000\u061a\u0621\u0005;\u0000"+
		"\u0000\u061b\u0621\u0005<\u0000\u0000\u061c\u0621\u0005=\u0000\u0000\u061d"+
		"\u0621\u0005>\u0000\u0000\u061e\u0621\u0005?\u0000\u0000\u061f\u0621\u0005"+
		"5\u0000\u0000\u0620\u0613\u0001\u0000\u0000\u0000\u0620\u0614\u0001\u0000"+
		"\u0000\u0000\u0620\u0615\u0001\u0000\u0000\u0000\u0620\u0616\u0001\u0000"+
		"\u0000\u0000\u0620\u0617\u0001\u0000\u0000\u0000\u0620\u0618\u0001\u0000"+
		"\u0000\u0000\u0620\u0619\u0001\u0000\u0000\u0000\u0620\u061a\u0001\u0000"+
		"\u0000\u0000\u0620\u061b\u0001\u0000\u0000\u0000\u0620\u061c\u0001\u0000"+
		"\u0000\u0000\u0620\u061d\u0001\u0000\u0000\u0000\u0620\u061e\u0001\u0000"+
		"\u0000\u0000\u0620\u061f\u0001\u0000\u0000\u0000\u0621\u00bb\u0001\u0000"+
		"\u0000\u0000\u0622\u0627\u0003\u00be_\u0000\u0623\u0624\u0005]\u0000\u0000"+
		"\u0624\u0626\u0003\u00be_\u0000\u0625\u0623\u0001\u0000\u0000\u0000\u0626"+
		"\u0629\u0001\u0000\u0000\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0627"+
		"\u0628\u0001\u0000\u0000\u0000\u0628\u062b\u0001\u0000\u0000\u0000\u0629"+
		"\u0627\u0001\u0000\u0000\u0000\u062a\u062c\u0005]\u0000\u0000\u062b\u062a"+
		"\u0001\u0000\u0000\u0000\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u062f"+
		"\u0001\u0000\u0000\u0000\u062d\u062f\u0003\u00be_\u0000\u062e\u0622\u0001"+
		"\u0000\u0000\u0000\u062e\u062d\u0001\u0000\u0000\u0000\u062f\u00bd\u0001"+
		"\u0000\u0000\u0000\u0630\u0631\u0005K\u0000\u0000\u0631\u0634\u0003\u00be"+
		"_\u0000\u0632\u0634\u0003\u00c0`\u0000\u0633\u0630\u0001\u0000\u0000\u0000"+
		"\u0633\u0632\u0001\u0000\u0000\u0000\u0634\u00bf\u0001\u0000\u0000\u0000"+
		"\u0635\u0636\u0003\u00c8d\u0000\u0636\u0637\u0005`\u0000\u0000\u0637\u0638"+
		"\u00052\u0000\u0000\u0638\u063e\u0001\u0000\u0000\u0000\u0639\u063a\u0003"+
		"\u00c8d\u0000\u063a\u063b\u0003\u0098L\u0000\u063b\u063e\u0001\u0000\u0000"+
		"\u0000\u063c\u063e\u0003\u00c2a\u0000\u063d\u0635\u0001\u0000\u0000\u0000"+
		"\u063d\u0639\u0001\u0000\u0000\u0000\u063d\u063c\u0001\u0000\u0000\u0000"+
		"\u063e\u00c1\u0001\u0000\u0000\u0000\u063f\u0663\u00052\u0000\u0000\u0640"+
		"\u0641\u0005W\u0000\u0000\u0641\u0642\u0003\u00c0`\u0000\u0642\u0643\u0005"+
		"X\u0000\u0000\u0643\u0663\u0001\u0000\u0000\u0000\u0644\u0650\u0005W\u0000"+
		"\u0000\u0645\u064a\u0003\u00be_\u0000\u0646\u0647\u0005]\u0000\u0000\u0647"+
		"\u0649\u0003\u00be_\u0000\u0648\u0646\u0001\u0000\u0000\u0000\u0649\u064c"+
		"\u0001\u0000\u0000\u0000\u064a\u0648\u0001\u0000\u0000\u0000\u064a\u064b"+
		"\u0001\u0000\u0000\u0000\u064b\u064e\u0001\u0000\u0000\u0000\u064c\u064a"+
		"\u0001\u0000\u0000\u0000\u064d\u064f\u0005]\u0000\u0000\u064e\u064d\u0001"+
		"\u0000\u0000\u0000\u064e\u064f\u0001\u0000\u0000\u0000\u064f\u0651\u0001"+
		"\u0000\u0000\u0000\u0650\u0645\u0001\u0000\u0000\u0000\u0650\u0651\u0001"+
		"\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0663\u0005"+
		"X\u0000\u0000\u0653\u065f\u0005Y\u0000\u0000\u0654\u0659\u0003\u00be_"+
		"\u0000\u0655\u0656\u0005]\u0000\u0000\u0656\u0658\u0003\u00be_\u0000\u0657"+
		"\u0655\u0001\u0000\u0000\u0000\u0658\u065b\u0001\u0000\u0000\u0000\u0659"+
		"\u0657\u0001\u0000\u0000\u0000\u0659\u065a\u0001\u0000\u0000\u0000\u065a"+
		"\u065d\u0001\u0000\u0000\u0000\u065b\u0659\u0001\u0000\u0000\u0000\u065c"+
		"\u065e\u0005]\u0000\u0000\u065d\u065c\u0001\u0000\u0000\u0000\u065d\u065e"+
		"\u0001\u0000\u0000\u0000\u065e\u0660\u0001\u0000\u0000\u0000\u065f\u0654"+
		"\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0661"+
		"\u0001\u0000\u0000\u0000\u0661\u0663\u0005Z\u0000\u0000\u0662\u063f\u0001"+
		"\u0000\u0000\u0000\u0662\u0640\u0001\u0000\u0000\u0000\u0662\u0644\u0001"+
		"\u0000\u0000\u0000\u0662\u0653\u0001\u0000\u0000\u0000\u0663\u00c3\u0001"+
		"\u0000\u0000\u0000\u0664\u066b\u0003\u00c6c\u0000\u0665\u066b\u00052\u0000"+
		"\u0000\u0666\u0667\u0005W\u0000\u0000\u0667\u0668\u0003\u00c4b\u0000\u0668"+
		"\u0669\u0005X\u0000\u0000\u0669\u066b\u0001\u0000\u0000\u0000\u066a\u0664"+
		"\u0001\u0000\u0000\u0000\u066a\u0665\u0001\u0000\u0000\u0000\u066a\u0666"+
		"\u0001\u0000\u0000\u0000\u066b\u00c5\u0001\u0000\u0000\u0000\u066c\u066d"+
		"\u0003\u00c8d\u0000\u066d\u066e\u0005`\u0000\u0000\u066e\u066f\u00052"+
		"\u0000\u0000\u066f\u0674\u0001\u0000\u0000\u0000\u0670\u0671\u0003\u00c8"+
		"d\u0000\u0671\u0672\u0003\u0098L\u0000\u0672\u0674\u0001\u0000\u0000\u0000"+
		"\u0673\u066c\u0001\u0000\u0000\u0000\u0673\u0670\u0001\u0000\u0000\u0000"+
		"\u0674\u00c7\u0001\u0000\u0000\u0000\u0675\u0676\u0006d\uffff\uffff\u0000"+
		"\u0676\u0677\u0003\u009cN\u0000\u0677\u0687\u0001\u0000\u0000\u0000\u0678"+
		"\u0679\n\u0005\u0000\u0000\u0679\u067a\u0005`\u0000\u0000\u067a\u0686"+
		"\u00052\u0000\u0000\u067b\u067c\n\u0004\u0000\u0000\u067c\u0686\u0003"+
		"\u0098L\u0000\u067d\u067e\n\u0003\u0000\u0000\u067e\u0686\u0003\u00a8"+
		"T\u0000\u067f\u0680\n\u0002\u0000\u0000\u0680\u0682\u0005W\u0000\u0000"+
		"\u0681\u0683\u0003\u00ceg\u0000\u0682\u0681\u0001\u0000\u0000\u0000\u0682"+
		"\u0683\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000\u0000\u0000\u0684"+
		"\u0686\u0005X\u0000\u0000\u0685\u0678\u0001\u0000\u0000\u0000\u0685\u067b"+
		"\u0001\u0000\u0000\u0000\u0685\u067d\u0001\u0000\u0000\u0000\u0685\u067f"+
		"\u0001\u0000\u0000\u0000\u0686\u0689\u0001\u0000\u0000\u0000\u0687\u0685"+
		"\u0001\u0000\u0000\u0000\u0687\u0688\u0001\u0000\u0000\u0000\u0688\u00c9"+
		"\u0001\u0000\u0000\u0000\u0689\u0687\u0001\u0000\u0000\u0000\u068a\u068f"+
		"\u0003\u00ccf\u0000\u068b\u068c\u0005]\u0000\u0000\u068c\u068e\u0003\u00cc"+
		"f\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068e\u0691\u0001\u0000\u0000"+
		"\u0000\u068f\u068d\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000"+
		"\u0000\u0690\u0693\u0001\u0000\u0000\u0000\u0691\u068f\u0001\u0000\u0000"+
		"\u0000\u0692\u0694\u0005]\u0000\u0000\u0693\u0692\u0001\u0000\u0000\u0000"+
		"\u0693\u0694\u0001\u0000\u0000\u0000\u0694\u00cb\u0001\u0000\u0000\u0000"+
		"\u0695\u0696\u0003\u00c8d\u0000\u0696\u0697\u0005`\u0000\u0000\u0697\u0698"+
		"\u00052\u0000\u0000\u0698\u069e\u0001\u0000\u0000\u0000\u0699\u069a\u0003"+
		"\u00c8d\u0000\u069a\u069b\u0003\u0098L\u0000\u069b\u069e\u0001\u0000\u0000"+
		"\u0000\u069c\u069e\u00052\u0000\u0000\u069d\u0695\u0001\u0000\u0000\u0000"+
		"\u069d\u0699\u0001\u0000\u0000\u0000\u069d\u069c\u0001\u0000\u0000\u0000"+
		"\u069e\u00cd\u0001\u0000\u0000\u0000\u069f\u06a4\u0003\u00d0h\u0000\u06a0"+
		"\u06a1\u0005]\u0000\u0000\u06a1\u06a3\u0003\u00d0h\u0000\u06a2\u06a0\u0001"+
		"\u0000\u0000\u0000\u06a3\u06a6\u0001\u0000\u0000\u0000\u06a4\u06a2\u0001"+
		"\u0000\u0000\u0000\u06a4\u06a5\u0001\u0000\u0000\u0000\u06a5\u06a8\u0001"+
		"\u0000\u0000\u0000\u06a6\u06a4\u0001\u0000\u0000\u0000\u06a7\u06a9\u0005"+
		"]\u0000\u0000\u06a8\u06a7\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000"+
		"\u0000\u0000\u06a9\u00cf\u0001\u0000\u0000\u0000\u06aa\u06ab\u00052\u0000"+
		"\u0000\u06ab\u06ac\u0005@\u0000\u0000\u06ac\u06b7\u0003n7\u0000\u06ad"+
		"\u06ae\u00052\u0000\u0000\u06ae\u06af\u0005U\u0000\u0000\u06af\u06b7\u0003"+
		"n7\u0000\u06b0\u06b1\u0005K\u0000\u0000\u06b1\u06b2\u0005K\u0000\u0000"+
		"\u06b2\u06b7\u0003n7\u0000\u06b3\u06b4\u0005K\u0000\u0000\u06b4\u06b7"+
		"\u0003n7\u0000\u06b5\u06b7\u0003n7\u0000\u06b6\u06aa\u0001\u0000\u0000"+
		"\u0000\u06b6\u06ad\u0001\u0000\u0000\u0000\u06b6\u06b0\u0001\u0000\u0000"+
		"\u0000\u06b6\u06b3\u0001\u0000\u0000\u0000\u06b6\u06b5\u0001\u0000\u0000"+
		"\u0000\u06b7\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d5\u00dc\u00e4\u00eb"+
		"\u00ef\u00f8\u0105\u0111\u011b\u0124\u0127\u0133\u013c\u0140\u0150\u0159"+
		"\u0161\u016e\u0172\u0178\u017f\u0187\u018a\u018d\u0195\u0198\u019b\u01a2"+
		"\u01a8\u01b0\u01b7\u01c8\u01d1\u01d4\u01d7\u01dc\u01e9\u01ec\u01ef\u01f6"+
		"\u01fd\u020b\u0213\u0216\u0219\u0222\u0225\u0228\u0232\u023b\u0242\u0245"+
		"\u0254\u025b\u025f\u026a\u026e\u0272\u0275\u0279\u027d\u0286\u028b\u0292"+
		"\u0296\u0299\u02a7\u02ad\u02b1\u02b6\u02be\u02c3\u02cf\u02d4\u02d8\u02db"+
		"\u02e7\u02ee\u02f3\u02f9\u0300\u0303\u030a\u030f\u0315\u031c\u031f\u0326"+
		"\u032d\u0330\u0336\u033b\u0342\u0349\u034e\u0354\u035b\u035e\u0360\u0364"+
		"\u0368\u036e\u0371\u0376\u0379\u0384\u038f\u0393\u03a9\u03b0\u03b6\u03bd"+
		"\u03c3\u03ca\u03cc\u03d1\u03d7\u03de\u03e4\u03ec\u03f0\u03f7\u03fb\u03fe"+
		"\u0409\u0410\u0412\u0419\u041d\u0420\u0425\u042a\u0430\u043a\u0445\u044b"+
		"\u0451\u0454\u046c\u0476\u0481\u048c\u0498\u049a\u04a6\u04a8\u04bd\u04bf"+
		"\u04c9\u04d0\u04d5\u04e4\u04e7\u04e9\u04f2\u04f6\u04fb\u04ff\u0503\u0505"+
		"\u0508\u0521\u0524\u0527\u053b\u053f\u054f\u0553\u0563\u0567\u0570\u0575"+
		"\u057e\u0591\u0596\u0599\u05a3\u05a8\u05b4\u05bd\u05c3\u05c5\u05cb\u05cf"+
		"\u05d6\u05d9\u05df\u05e1\u05e8\u05f1\u05f8\u05ff\u0605\u060b\u060d\u0611"+
		"\u0620\u0627\u062b\u062e\u0633\u063d\u064a\u064e\u0650\u0659\u065d\u065f"+
		"\u0662\u066a\u0673\u0682\u0685\u0687\u068f\u0693\u069d\u06a4\u06a8\u06b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
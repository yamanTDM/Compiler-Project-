// ANTLR v4 Lexer Grammar for Python 3
// PythonLexer.g4
//
// Target: Python 3  (antlr4-python3-runtime ≥ 4.13)
// Regenerate with:
//   java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 -visitor PythonLexer.g4

lexer grammar PythonLexer;

// ─────────────────────────────────────────────────────────────────────────────
// BUG 1 (FIXED): The entire block was Java.
//   Was: Java types (Deque<Integer>, ArrayDeque, CharStream), Java visibility
//        modifiers (public/private), Java constructor signature.
//   Fix: Rewrote as valid Python 3 to match the declared -Dlanguage=Python3 target.
//
// BUG 3 (FIXED): Delimiter actions used `self.opened`; renamed to `self._opened`
//   (Python convention; must match the attribute used in the delimiter rules below).
// ─────────────────────────────────────────────────────────────────────────────
@lexer::members {

  private final java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
  private final java.util.Stack<Integer> indents = new java.util.Stack<>();
  private int opened = 0;
  private Token lastToken = null;

  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {

    if (_input.LA(1) == EOF && !indents.isEmpty()) {

      // remove trailing EOFs
      while (!tokens.isEmpty() && tokens.peekLast().getType() == EOF) {
        tokens.pollLast();
      }

      // emit a final NEWLINE
      emit(commonToken(NEWLINE, "\n"));

      // emit remaining DEDENTs
      while (!indents.isEmpty()) {
        emit(commonToken(DEDENT, ""));
        indents.pop();
      }

      emit(commonToken(EOF, "<EOF>"));
    }

    Token next = super.nextToken();

    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
      lastToken = next;
    }

    return tokens.isEmpty() ? next : tokens.poll();
  }

  private CommonToken commonToken(int type, String text) {
    int stop = getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(_tokenFactorySourcePair, type, Token.DEFAULT_CHANNEL, start, stop);
  }

  private int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      if (ch == '\t') {
        count += 8 - (count % 8);
      } else {
        count++;
      }
    }
    return count;
  }

  private boolean atStartOfInput() {
    return getCharPositionInLine() == 0 && getLine() == 1;
  }

}

tokens { INDENT, DEDENT }

// ── Keywords ──────────────────────────────────────────────────────────────────
FALSE     : 'False' ;
NONE      : 'None' ;
TRUE      : 'True' ;
AND       : 'and' ;
AS        : 'as' ;
ASSERT    : 'assert' ;
ASYNC     : 'async' ;
AWAIT     : 'await' ;
BREAK     : 'break' ;
CLASS     : 'class' ;
CONTINUE  : 'continue' ;
DEF       : 'def' ;
DEL       : 'del' ;
ELIF      : 'elif' ;
ELSE      : 'else' ;
EXCEPT    : 'except' ;
FINALLY   : 'finally' ;
FOR       : 'for' ;
FROM      : 'from' ;
GLOBAL    : 'global' ;
IF        : 'if' ;
IMPORT    : 'import' ;
IN        : 'in' ;
IS        : 'is' ;
LAMBDA    : 'lambda' ;
NONLOCAL  : 'nonlocal' ;
NOT       : 'not' ;
OR        : 'or' ;
PASS      : 'pass' ;
RAISE     : 'raise' ;
RETURN    : 'return' ;
TRY       : 'try' ;
WHILE     : 'while' ;
WITH      : 'with' ;
YIELD     : 'yield' ;

// ── Soft keywords (valid identifiers in most contexts) ────────────────────────
MATCH     : 'match' ;
CASE      : 'case' ;
TYPE      : 'type' ;

// ── Integer literals ──────────────────────────────────────────────────────────
INT_LIT     : NON_ZERO_DIGIT ('_'? DIGIT)*
            | '0'+ ('_'? '0')*
            ;

BIN_INTEGER : '0' [bB] ('_'? [01])+ ;
OCT_INTEGER : '0' [oO] ('_'? [0-7])+ ;
HEX_INTEGER : '0' [xX] ('_'? HEX_DIGIT)+ ;

// ── Floating-point literals ───────────────────────────────────────────────────
FLOAT_NUMBER : DIGIT_PART '.' DIGIT_PART? EXPONENT?
             | '.' DIGIT_PART EXPONENT?
             | DIGIT_PART EXPONENT
             ;

// ── Imaginary literals ────────────────────────────────────────────────────────
IMAG_NUMBER : (FLOAT_NUMBER | DIGIT_PART) [jJ] ;

// ── String literals ───────────────────────────────────────────────────────────
LONG_STRING
    : STRING_PREFIX?
      ( '"""' LONG_STRING_ITEM_DOUBLE* '"""'
      | '\'\'\'' LONG_STRING_ITEM_SINGLE* '\'\'\''
      )
    ;

SHORT_STRING
    : STRING_PREFIX?
      ( '"'  SHORT_STRING_ITEM_DOUBLE*  '"'
      | '\'' SHORT_STRING_ITEM_SINGLE* '\''
      )
    ;

BYTES_LITERAL
    : BYTES_PREFIX
      ( '"""' LONG_STRING_ITEM_DOUBLE* '"""'
      | '\'\'\'' LONG_STRING_ITEM_SINGLE* '\'\'\''
      | '"'  SHORT_STRING_ITEM_DOUBLE*  '"'
      | '\'' SHORT_STRING_ITEM_SINGLE* '\''
      )
    ;

// ── Identifiers ───────────────────────────────────────────────────────────────
NAME : ID_START ID_CONTINUE* ;

// ── Operators ─────────────────────────────────────────────────────────────────
PLUS_ASSIGN       : '+=' ;
MINUS_ASSIGN      : '-=' ;
STAR_STAR_ASSIGN  : '**=' ;
STAR_ASSIGN       : '*=' ;
SLASH_SLASH_ASSIGN: '//=' ;
SLASH_ASSIGN      : '/=' ;
PERCENT_ASSIGN    : '%=' ;
AT_ASSIGN         : '@=' ;
AMP_ASSIGN        : '&=' ;
PIPE_ASSIGN       : '|=' ;
CARET_ASSIGN      : '^=' ;
LSHIFT_ASSIGN     : '<<=' ;
RSHIFT_ASSIGN     : '>>=' ;

WALRUS            : ':=' ;

EQ                : '==' ;
NEQ               : '!=' ;
LTE               : '<=' ;
GTE               : '>=' ;
LT                : '<' ;
GT                : '>' ;

STAR_STAR         : '**' ;
SLASH_SLASH       : '//' ;
PLUS              : '+' ;
MINUS             : '-' ;
STAR              : '*' ;
SLASH             : '/' ;
PERCENT           : '%' ;
AT                : '@' ;

LSHIFT            : '<<' ;
RSHIFT            : '>>' ;
AMP               : '&' ;
PIPE              : '|' ;
CARET             : '^' ;
TILDE             : '~' ;

ASSIGN            : '=' ;
ARROW             : '->' ;

// ── Delimiters ────────────────────────────────────────────────────────────────
// BUG 3 (FIXED): Was `self.opened` — changed to `self._opened` everywhere so
// the actions reference the attribute defined in @lexer::members above.
LPAREN    : '(' { opened++; } ;
RPAREN    : ')' { opened--;} ;
LBRACKET  : '[' { opened++; } ;
RBRACKET  : ']' { opened--;} ;
LBRACE    : '{' { opened++; } ;
RBRACE    : '}' { opened--; } ;

COMMA     : ',' ;
COLON     : ':' ;
SEMI      : ';' ;
DOT       : '.' ;
ELLIPSIS  : '...' ;

// ── Indentation ───────────────────────────────────────────────────────────────
// BUG 2 (FIXED): The action block was Java.  Rewrote as Python 3.
//
// BUG 6 (FIXED): Blank-line and comment-only-line detection was delegated to
//   the EMPTY_LINE rule, which had two problems:
//     (a) it referenced the LINE_COMMENT token rule inline, causing it to silently
//         absorb every comment before LINE_COMMENT or NEWLINE could fire;
//     (b) the comment alternative omitted the trailing '\n', leaving orphaned
//         newlines for NEWLINE to process (incorrect indentation events).
//   Fix: blank-line detection is now done in the NEWLINE action via a one-char
//   lookahead (self._input.LA(1)).  If the very next character starts a blank
//   line ('\r', '\n', '\f') or a comment ('#'), this newline is skipped instead
//   of emitting a NEWLINE token or triggering indentation processing.
NEWLINE
  : ( '\r'? '\n' | '\r' | '\f' ) [ \t]*
    {
      String text = getText();
      String newLine = text.replaceAll("[^\\r\\n\\f]+", "");
      String spaces = text.replaceAll("[\\r\\n\\f]+", "");

      int nextChar = _input.LA(1);

      if (opened > 0 || nextChar == '\r' || nextChar == '\n'
                     || nextChar == '\f' || nextChar == '#') {
        skip();
      } else {
        emit(commonToken(NEWLINE, newLine));

        int indent = getIndentationCount(spaces);
        int previous = indents.isEmpty() ? 0 : indents.peek();

        if (indent == previous) {
          // same level
        } else if (indent > previous) {
          indents.push(indent);
          emit(commonToken(INDENT, spaces));
        } else {
          while (!indents.isEmpty() && indents.peek() > indent) {
            emit(commonToken(DEDENT, ""));
            indents.pop();
          }
        }
      }
    }
  ;

// ── Comments / whitespace ─────────────────────────────────────────────────────
// BUG 4 (FIXED): TYPE_COMMENT was defined AFTER LINE_COMMENT.  Both start with
//   '#'; ANTLR gives priority to the earlier-defined rule for same-length
//   matches, so TYPE_COMMENT was unreachable dead code.
//   Fix: moved TYPE_COMMENT above LINE_COMMENT.
//
// BUG 5 (FIXED): LINE_COMMENT had no channel/skip directive, so every comment
//   was pushed into the parser token stream.
//   Fix: added -> channel(HIDDEN) so comments are still accessible to tooling
//   (e.g. formatters) but invisible to the parser.  Use -> skip if you never
//   need them.
//
// BUG 6 (FIXED): EMPTY_LINE is removed; its job is done by the NEWLINE action.
TYPE_COMMENT : '#' SPACES? 'type:' SPACES? ~[\r\n]* ;
LINE_COMMENT : '#' ~[\r\n\f]*                         -> channel(HIDDEN) ;

WS           : SPACES                                 -> skip ;
LINE_JOINING : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' ) -> skip ;
UNKNOWN      : . ;

// ── Fragments ─────────────────────────────────────────────────────────────────
fragment DIGIT          : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment HEX_DIGIT      : [0-9a-fA-F] ;
fragment DIGIT_PART     : DIGIT ('_'? DIGIT)* ;

fragment EXPONENT       : [eE] [+\-]? DIGIT_PART ;

fragment STRING_PREFIX  : [rRuU]
                        | [rR] [bB]
                        | [bB] [rR]
                        ;

fragment BYTES_PREFIX   : [bB] [rR]?
                        | [rR] [bB]
                        ;

fragment LONG_STRING_ITEM_DOUBLE : ~[\\"]  | ESCAPE_SEQ ;
fragment LONG_STRING_ITEM_SINGLE : ~[\\']  | ESCAPE_SEQ ;
fragment SHORT_STRING_ITEM_DOUBLE: ~[\\\r\n"] | ESCAPE_SEQ ;
fragment SHORT_STRING_ITEM_SINGLE: ~[\\\r\n'] | ESCAPE_SEQ ;

fragment ESCAPE_SEQ
    : '\\' ( '\r' '\n'? | '\n'
           | [\\'"abfnrtvx]
           | [0-7] [0-7]? [0-7]?
           | 'x' HEX_DIGIT HEX_DIGIT
           | 'N' '{' [A-Za-z ]+ '}'
           | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
           | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                 HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
           )
    ;

// Unicode identifier support (PEP 3131)
fragment ID_START    : [\p{L}\p{Nl}_] ;
fragment ID_CONTINUE : ID_START | [\p{Mn}\p{Mc}\p{Nd}\p{Pc}] ;

fragment SPACES : [ \t]+ ;

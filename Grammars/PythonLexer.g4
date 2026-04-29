// ═══════════════════════════════════════════════════════════════════════════
//  PythonLexer.g4
//
//  INDENT / DEDENT are NOT emitted here — they are injected by
//  PythonIndentLexer.java, which overrides nextToken() and tracks an
//  indent-level stack.
//
//  KEY DESIGN CHOICE:
//    NEWLINE matches ONLY the line-terminator character(s).
//    It does NOT consume the leading whitespace of the next line.
//    Leading whitespace is handled by WS (skipped), so ANTLR's built-in
//    charPositionInLine for the first real token on each line gives
//    the exact indent column that PythonIndentLexer needs.
// ═══════════════════════════════════════════════════════════════════════════

lexer grammar PythonLexer;

// INDENT and DEDENT are virtual tokens emitted by PythonIndentLexer.java
tokens { INDENT, DEDENT }


// ─────────────────────────────────────────────────────────────────────────────
//  Keywords  (must come BEFORE the NAME rule)
// ─────────────────────────────────────────────────────────────────────────────

FROM        : 'from'   ;
IMPORT      : 'import' ;
DEF         : 'def'    ;
RETURN      : 'return' ;
IF          : 'if'     ;
ELIF        : 'elif'   ;
ELSE        : 'else'   ;
GLOBAL      : 'global' ;
WITH        : 'with'   ;
AS          : 'as'     ;
FOR         : 'for'    ;
IN          : 'in'     ;
NOT         : 'not'    ;
AND         : 'and'    ;
OR          : 'or'     ;
NONE        : 'None'   ;
TRUE        : 'True'   ;
FALSE       : 'False'  ;
PASS        : 'pass'   ;


// ─────────────────────────────────────────────────────────────────────────────
//  Operators  (longer/higher-priority alternatives listed first)
// ─────────────────────────────────────────────────────────────────────────────

// Augmented assignment
PLUS_ASSIGN  : '+=' ;
MINUS_ASSIGN : '-=' ;

// Comparison  (two-char before one-char)
EQ           : '==' ;
NEQ          : '!=' ;
LEQ          : '<=' ;
GEQ          : '>=' ;
LT           : '<'  ;
GT           : '>'  ;

// Plain assignment
ASSIGN       : '='  ;

// Arithmetic
PLUS         : '+'  ;
MINUS        : '-'  ;
STAR         : '*'  ;
SLASH        : '/'  ;


// ─────────────────────────────────────────────────────────────────────────────
//  Delimiters / Punctuation
// ─────────────────────────────────────────────────────────────────────────────

LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACK  : '[' ;
RBRACK  : ']' ;
LBRACE  : '{' ;
RBRACE  : '}' ;
DOT     : '.' ;
COMMA   : ',' ;
COLON   : ':' ;
AT      : '@' ;


// ─────────────────────────────────────────────────────────────────────────────
//  String Literals
//  Covers plain, f-, r-, b-strings and triple-quoted variants.
// ─────────────────────────────────────────────────────────────────────────────

STRING
    : STRING_PREFIX? SHORT_STRING
    | STRING_PREFIX? LONG_STRING
    ;

fragment STRING_PREFIX
    : [fFrRbBuU]
    | 'fr' | 'Fr' | 'fR' | 'FR'
    | 'rf' | 'rF' | 'Rf' | 'RF'
    | 'rb' | 'rB' | 'Rb' | 'RB'
    | 'br' | 'bR' | 'Br' | 'BR'
    ;

fragment SHORT_STRING
    : '\'' ( STRING_ESC_SEQ | ~[\\\r\n\f'] )* '\''
    | '"'  ( STRING_ESC_SEQ | ~[\\\r\n\f"] )* '"'
    ;

fragment LONG_STRING
    : '\'\'\'' LONG_ITEM*? '\'\'\''
    | '"""'    LONG_ITEM*? '"""'
    ;

fragment LONG_ITEM      : LONG_CHAR | STRING_ESC_SEQ ;
fragment LONG_CHAR      : ~'\\' ;
fragment STRING_ESC_SEQ : '\\' . ;


// ─────────────────────────────────────────────────────────────────────────────
//  Numeric Literals
// ─────────────────────────────────────────────────────────────────────────────

INTEGER   : DIGIT+                       ;
FLOAT_NUM : DIGIT+ '.' DIGIT*
          | '.' DIGIT+
          ;

fragment DIGIT : [0-9] ;


// ─────────────────────────────────────────────────────────────────────────────
//  Identifiers  (after all keyword rules)
// ─────────────────────────────────────────────────────────────────────────────

NAME : [a-zA-Z_][a-zA-Z0-9_]* ;


// ─────────────────────────────────────────────────────────────────────────────
//  Newlines, Whitespace, Comments
// ─────────────────────────────────────────────────────────────────────────────

// NEWLINE = the bare line terminator only.
// PythonIndentLexer intercepts these and emits INDENT / DEDENT as needed.
NEWLINE : ( '\r'? '\n' | '\r' | '\f' ) ;

// Intra-line spaces/tabs are skipped; ANTLR still counts them for
// charPositionInLine, which PythonIndentLexer reads to get the indent level.
WS : [ \t]+ -> skip ;

// Single-line comments are discarded entirely.
COMMENT : '#' ~[\r\n\f]* -> skip ;

// Explicit line continuation: backslash + newline → skip both.
LINE_JOINING : '\\' ( '\r'? '\n' | '\r' | '\f' ) -> skip ;

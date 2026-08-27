
lexer grammar PythonLexer;

tokens { INDENT, DEDENT }

//  Keywords
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



// Augmented assignment
PLUS_ASSIGN  : '+=' ;
MINUS_ASSIGN : '-=' ;

// Comparison
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


// Punctuation

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


//  String

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


//  Numeric Literals

INTEGER   : DIGIT+                       ;
FLOAT_NUM : DIGIT+ '.' DIGIT*
          | '.' DIGIT+
          ;

fragment DIGIT : [0-9] ;


//  Identifiers

NAME : [a-zA-Z_][a-zA-Z0-9_]* ;


//  Newlines, Whitespace, Comments

NEWLINE : ( '\r'? '\n' | '\r' | '\f' ) ;

WS : [ \t]+ -> skip ;

COMMENT : '#' ~[\r\n\f]* -> skip ;

LINE_JOINING : '\\' ( '\r'? '\n' | '\r' | '\f' ) -> skip ;

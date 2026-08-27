lexer grammar JinjaHtmlLexer;


DOCTYPE
    : '<!DOCTYPE' (~'>')* '>'
    ;

JINJA_EXPR_START : '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START : '{%' -> pushMode(JINJA_STMT);

OST : '<'  -> pushMode(TAG);
OET : '</' -> pushMode(TAG);

JINJA_COMMENT : '{#' .*? '#}' -> skip;
HTML_COMMENT  : '<!--' .*? '-->' -> skip;

WS : [ \t\r\n]+ -> skip ;

TEXT
    : ( ~[<{}\n\r]
      | '{' ~[{%#]
      | ~[%#}] '}'
      )+
    ;

//Jinja Expression mode -----------------------------------------------------------------------

mode JINJA_EXPR;

JINJA_EXPR_END : '}}' -> popMode;

JINJA_LP_EXPR : '(';
JINJA_RP_EXPR : ')';
JINJA_COMMA   : ',';
JINJA_DOT_EXPR: '.';
JINJA_EQUAL  : '=';
JINJA_COMBINE: '~';

JINJA_ID_EXPR
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

JINJA_STRING_EXPR
    : '\'' (~['\\] | '\\' .)* '\''
    | '"'  (~["\\] | '\\' .)* '"'
    ;

JINJA_EXPR_WS : [ \t\r\n]+ -> skip ;

JINJA_TEXT
    : (~[%\n\t])+?
    ;

//Jinja Statement mode -----------------------------------------------------------------------

mode JINJA_STMT;

JINJA_STMT_END : '%}' -> popMode;

JINJA_LP : '(';
JINJA_RP : ')';
JINJA_DOT_STMT: '.';

JINJA_BLOCK    : 'block';
JINJA_ENDBLOCK : 'endblock';
JINJA_SUPER    : 'super';
JINJA_EXTENDS  : 'extends';
JINJA_INCLUDE  : 'include';
JINJA_FOR      : 'for';
JINJA_ENDFOR   : 'endfor';
JINJA_IF       : 'if';
JINJA_ELIF     : 'elif';
JINJA_ELSE     : 'else';
JINJA_ENDIF    : 'endif';

JINJA_INS      : 'in' | 'not in';
JINJA_COMPARE : '==' | '!=' | '<' | '>' | '<=' | '>=' | 'is';
JINJA_LOGIC   : 'and' | 'or';
JINJA_NOT     : 'not';

JINJA_NUM
    : '0' | [1-9][0-9]*
    ;

JINJA_ID_STMT
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

JINJA_STRING
    : '"' (~["\\])* '"'
    ;

JINJA_STMT_WS : [ \t\r\n]+ -> skip ;

JINJA_TEXT_STMT
    : (~[%\n\t])+?
    ;

//Tag mode -----------------------------------------------------------------------

mode TAG;

CT : '>' -> popMode ;

STYLE_TAG
    : 'style>' -> pushMode(CSS)
    ;

DQ_START
    : '"' -> pushMode(DQ_STRING)
    ;

SQ_START
    : '\'' -> pushMode(SQ_STRING)
    ;


EM     : '!';
EQUALS : '=';
COLON  : ':';
LKB    : '{';
RKB    : '}';
COMMA : ',';

PAIRED_TAG
    : 'html' | 'body' | 'head' | 'title'
    | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6'
    | 'nav' | 'div' | 'span' | 'a' | 'p'
    | 'form' | 'label' | 'button' | 'strong'
    | 'ul' | 'ol' | 'li' | 'textarea'
    | 'section' | 'article' | 'header' | 'footer'
    | 'table' | 'tr' | 'td' | 'th'
    | 'thead' | 'tbody' | 'tfoot'
    ;

VOID_TAG
    : 'link' | 'img' | 'input' | 'br' | 'hr' | 'meta'
    ;

ID : [a-zA-Z0-9]+;

TAG_WS : [ \t\r\n]+ -> skip ;

//DQ string mode -----------------------------------------------------------------------
mode DQ_STRING;

DQ_JINJA_START
    : '{{' -> pushMode(JINJA_EXPR)
    ;



DQ_END
    : '"' -> popMode
    ;

DQ_WS:[ \t\r\n]+ -> skip ;
DQ_TEXT
    : ~["\\{]+
    ;
//SQ string mode -----------------------------------------------------------------------

mode SQ_STRING;

SQ_JINJA_START
    : '{{' -> pushMode(JINJA_EXPR)
    ;



SQ_END
    : '\'' -> popMode
    ;

SQ_WS: [ \t\r\n]+ -> skip ;
SQ_TEXT
    : ~['\\{]+
    ;

//css mode -----------------------------------------------------------------------

mode CSS;

CSS_END_STYLE
    : '</style' -> popMode
    ;

CSS_LBRACE : '{';
CSS_RBRACE : '}';
CSS_COLON  : ':';
CSS_SEMI   : ';';
CSS_COMMA  : ',';
CSS_DOT    : '.';
CSS_HASH   : '#';
CSS_ALL    : '*';
CSS_LP     : '(';
CSS_RP     : ')';

CSS_HSL        : 'hsl';
CSS_TRANSLATEX : 'translateX';
CSS_TRANSLATEY : 'translateY';
CSS_TRANSLATE  : 'translate';
CSS_ROTATE     : 'rotate';
CSS_SCALEX     : 'scaleX';
CSS_SCALEY     : 'scaleY';
CSS_SCALE      : 'scale';
CSS_CALC       : 'calc';

CSS_NUMBER
    : '-'? [0-9]+ ('.' [0-9]+)?
    ;

CSS_MATH : '+' | '-' | '/';

CSS_UNIT
    : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'deg' | 'fr' | 's' | 'ms'
    ;

CSS_STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

fragment HEX : [0-9a-fA-F];

CSS_HEX
    : HEX HEX HEX
    | HEX HEX HEX HEX HEX HEX
    | HEX HEX HEX HEX HEX HEX HEX HEX
    ;

CSS_NAME
    : [_a-zA-Z] [_a-zA-Z0-9-]*
    ;

CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

CSS_WS
    : [ \t\r\n]+ -> skip
    ;

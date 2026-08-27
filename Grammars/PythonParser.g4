// ═══════════════════════════════════════════════════════════════════════════
//  PythonParser.g4
//
//  Entry point renamed from file_input → prog to match the Main.java call:
//      ParseTree tree = parser.prog();
// ═══════════════════════════════════════════════════════════════════════════

parser grammar PythonParser;

options { tokenVocab = PythonLexer; }


prog
    : ( NEWLINE | stmt )* EOF
    ;


stmt
    : simple_stmt                                                   #SimpleStatement
    | compound_stmt                                                 #CompoundStatement
    ;

simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : import_stmt                                                    #ImportSmall
    | global_stmt                                                    #GlobalSmall
    | return_stmt                                                    #ReturnSmall
    | expr_or_assign                                                 #ExprSmall
    ;



import_stmt
    : FROM dotted_name IMPORT import_as_names                           #FromImport
    | IMPORT dotted_name                                                #PlainImport
    ;

dotted_name
    : NAME ( DOT NAME )*
    ;

import_as_names
    : NAME ( COMMA NAME )*
    ;



global_stmt
    : GLOBAL NAME ( COMMA NAME )*
    ;


return_stmt
    : RETURN expr?
    ;


expr_or_assign
    : expr ( assign_op expr )?
    ;

assign_op
    : ASSIGN                     #OpAssign
    | PLUS_ASSIGN                #OpPlusAssign
    | MINUS_ASSIGN               #OpMinusAssign
    ;


compound_stmt
    : if_stmt                             #CompoundIf
    | with_stmt                           #ComppundWith
    | funcdef                             #CompoundFunc
    | decorated                           #CompoundDecorated
    ;

if_stmt
    : IF expr COLON suite
      else_if_stmt
      ( ELSE COLON suite )?
    ;

else_if_stmt:
      ( ELIF expr COLON suite )*
;

with_stmt
    : WITH expr ( AS NAME )? COLON suite
    ;


funcdef
    : DEF NAME LPAREN param_list? RPAREN COLON suite
    ;

param_list
    : NAME ( COMMA NAME )*
    ;



decorated
    : decorator+ funcdef
    ;

decorator
    : AT dotted_name ( LPAREN arglist? RPAREN )? NEWLINE
    ;


suite
    : NEWLINE INDENT stmt+ DEDENT
    ;



expr : or_test ;

or_test
    : and_test ( OR and_test )*
    ;

and_test
    : not_test ( AND not_test )*
    ;

not_test
    : NOT not_test   #NotExpr
    | comparison     #NotPassthrough
    ;

comparison
    : arith_expr ( comp_op arith_expr )*
    ;

comp_op
    : EQ     #CompEq
    | NEQ    #CompNeq
    | LT     #CompLt
    | GT     #CompGt
    | LEQ    #CompLeq
    | GEQ    #CompGeq
    | IN     #CompIn
    | NOT IN #CompNotIn
    ;

arith_expr
    : arith_expr ( PLUS | MINUS ) term   #AddSub
    | term                               #ArithPassthrough
    ;

term
    : term ( STAR | SLASH ) primary   #MulDiv
    | primary                         #TermPassthrough
    ;



primary
    : primary DOT NAME                    #AttrAccess
    | primary LBRACK expr RBRACK          #SubscriptAccess
    | primary LPAREN arglist? RPAREN      #CallExpr
    | atom                                #AtomExpr
    ;



atom
    : NAME         #NameAtom
    | INTEGER      #IntAtom
    | FLOAT_NUM    #FloatAtom
    | STRING+      #StringAtom
    | NONE         #NoneAtom
    | TRUE         #TrueAtom
    | FALSE        #FalseAtom
    | list_display #ListAtom
    | dict_display #DictAtom
    | paren_form   #ParenAtom
    ;



list_display
    : LBRACK RBRACK                                            #EmptyList
    | LBRACK expr comp_for RBRACK                             #ListComp
    | LBRACK expr ( COMMA expr )* COMMA? RBRACK              #ListLiteral
    ;


dict_display
    : LBRACE RBRACE                                            #EmptyDict
    | LBRACE kv_pair ( COMMA kv_pair )* COMMA? RBRACE        #DictLiteral
    ;

kv_pair
    : expr COLON expr
    ;


paren_form
    : LPAREN expr comp_for RPAREN   #GenExpr
    | LPAREN expr RPAREN            #ParenExpr
    ;


comp_for
    : FOR NAME IN expr ( IF expr )?
    ;



arglist
    : argument ( COMMA argument )* COMMA?
    ;

argument
    : NAME ASSIGN expr   #KeywordArg
    | expr               #PositionalArg
    ;

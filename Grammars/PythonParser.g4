// ANTLR v4 Parser Grammar for Python 3
// PythonParser.g4
//
// Target: Python 3  (antlr4-python3-runtime ≥ 4.13)
// Regenerate with:
//   java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 -visitor PythonParser.g4

parser grammar PythonParser;
options { tokenVocab = PythonLexer; }


prog: statement* EOF;


// ─────────────────────────────────────────────────────────────────────────────
// Statements
// ─────────────────────────────────────────────────────────────────────────────

statement
    : simple_stmts          #SimpleStmtLine
    | compound_stmt         #CompoundStmtLine
    ;

statement_newline
    : simple_stmts          #SimpleStmtNewline
    | compound_stmt NEWLINE #CompoundStmtNewline
    | NEWLINE               #EmptyNewline
    | EOF                   #EofStmt
    ;

simple_stmts
    : simple_stmt (SEMI simple_stmt)* SEMI? NEWLINE
    ;

simple_stmt
    : assignment                                                #AssignStmt
    | type_alias                                                #TypeAliasStmt
    | star_expressions                                          #ExprStmt
    | RETURN star_expressions?                                  #ReturnStmt
    | IMPORT import_names                                       #ImportStmt
    | FROM relative_module IMPORT import_from_targets           #ImportFromStmt
    | RAISE expression (FROM expression)?                       #RaiseStmt
    | RAISE                                                     #RaiseStmtBare
    | PASS                                                      #PassStmt
    | DEL del_targets                                           #DelStmt
    | YIELD yield_expr                                          #YieldStmt
    | ASSERT expression (COMMA expression)?                     #AssertStmt
    | BREAK                                                     #BreakStmt
    | CONTINUE                                                  #ContinueStmt
    | GLOBAL NAME (COMMA NAME)*                                 #GlobalStmt
    | NONLOCAL NAME (COMMA NAME)*                               #NonlocalStmt
    ;

compound_stmt
    : if_stmt       #IfCompound
    | while_stmt    #WhileCompound
    | for_stmt      #ForCompound
    | with_stmt     #WithCompound
    | try_stmt      #TryCompound
    | match_stmt    #MatchCompound
    | func_def      #FuncDefCompound
    | class_def     #ClassDefCompound
    | decorated     #DecoratedCompound
    | async_stmt    #AsyncCompound
    ;


// ─────────────────────────────────────────────────────────────────────────────
// If / Elif / Else
// ─────────────────────────────────────────────────────────────────────────────

if_stmt: IF named_expression COLON block elif_clause* else_clause?;

elif_clause: ELIF named_expression COLON block;

else_clause: ELSE COLON block;


// ─────────────────────────────────────────────────────────────────────────────
// While
// ─────────────────────────────────────────────────────────────────────────────

while_stmt: WHILE named_expression COLON block else_clause?;


// ─────────────────────────────────────────────────────────────────────────────
// For
// ─────────────────────────────────────────────────────────────────────────────

for_stmt: FOR star_targets IN star_expressions COLON block else_clause?;


// ─────────────────────────────────────────────────────────────────────────────
// With
// ─────────────────────────────────────────────────────────────────────────────

with_stmt
    : WITH with_item (COMMA with_item)* COLON block                             #WithStmt
    | WITH LPAREN with_item (COMMA with_item)* COMMA? RPAREN COLON block       #WithStmtParens
    ;

with_item
    : expression AS star_target     #WithItemAs
    | expression                    #WithItemExpr
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Try / Except / Finally
// ─────────────────────────────────────────────────────────────────────────────

try_stmt
    : TRY COLON block except_block+ else_clause? finally_clause?       #TryCatch
    | TRY COLON block except_star_block+ else_clause? finally_clause?  #TryCatchStar
    | TRY COLON block finally_clause                                    #TryFinally
    ;

except_block
    : EXCEPT expression (AS NAME)? COLON block  #ExceptBlock
    | EXCEPT COLON block                        #BareExceptBlock
    ;

except_star_block: EXCEPT STAR expression (AS NAME)? COLON block;

finally_clause: FINALLY COLON block;


// ─────────────────────────────────────────────────────────────────────────────
// Match / Case  (PEP 634)
// ─────────────────────────────────────────────────────────────────────────────

match_stmt: MATCH subject_expr COLON NEWLINE INDENT case_block+ DEDENT;

subject_expr
    : star_named_expression (COMMA star_named_expression)+ COMMA?   #TupleSubject
    | named_expression                                               #SimpleSubject
    ;

case_block: CASE patterns guard? COLON block;

guard: IF named_expression;

patterns
    : pattern (COMMA pattern)+ COMMA?  #SequencePatterns
    | pattern                          #SinglePattern
    ;

pattern
    : or_pattern AS NAME    #AsPattern
    | or_pattern            #OrPatternOnly
    ;

or_pattern: closed_pattern (PIPE closed_pattern)*;

closed_pattern
    : literal_pattern                                                                           #LiteralPat
    | NAME                                                                                      #CapturePat
    | LPAREN pattern RPAREN                                                                     #GroupPat
    | NAME (DOT NAME)+                                                                          #ValuePat
    | LBRACKET (maybe_star_pattern (COMMA maybe_star_pattern)*)? COMMA? RBRACKET               #ListPat
    | LPAREN (maybe_star_pattern (COMMA maybe_star_pattern)*)? COMMA? RPAREN                   #TuplePat
    | LBRACE RBRACE                                                                             #EmptyMappingPat
    | LBRACE STAR STAR NAME COMMA? RBRACE                                                      #DblStarMappingPat
    | LBRACE items_pattern (COMMA items_pattern)* (COMMA STAR STAR NAME)? COMMA? RBRACE        #ItemsMappingPat
    | name_or_attr LPAREN RPAREN                                                               #EmptyClassPat
    | name_or_attr LPAREN pattern (COMMA pattern)* (COMMA keyword_pattern)* COMMA? RPAREN     #ClassPatArgs
    | name_or_attr LPAREN keyword_pattern (COMMA keyword_pattern)* COMMA? RPAREN              #ClassPatKwargs
    ;

literal_pattern
    : MINUS? INT_LIT                                            #NumberLiteralPat
    | MINUS? FLOAT_NUMBER                                       #FloatLiteralPat
    | MINUS? FLOAT_NUMBER (PLUS|MINUS) IMAG_NUMBER             #ComplexLiteralPat
    | strings                                                   #StringLiteralPat
    | NONE                                                      #NoneLiteralPat
    | TRUE                                                      #TrueLiteralPat
    | FALSE                                                     #FalseLiteralPat
    ;

maybe_star_pattern
    : STAR NAME     #StarPat
    | pattern       #NonStarPat
    ;

items_pattern: (strings | NONE | TRUE | FALSE | MINUS? INT_LIT | MINUS? FLOAT_NUMBER) COLON pattern;

keyword_pattern: NAME ASSIGN pattern;

name_or_attr: NAME (DOT NAME)*;


// ─────────────────────────────────────────────────────────────────────────────
// Functions & Classes
// ─────────────────────────────────────────────────────────────────────────────

func_def: DEF NAME type_param_seq? LPAREN parameter_list? RPAREN (ARROW expression)? COLON block;

decorated: decorator+ (class_def | func_def | async_stmt);

decorator: AT named_expression NEWLINE;

async_stmt
    : ASYNC func_def    #AsyncFuncDef
    | ASYNC with_stmt   #AsyncWithStmt
    | ASYNC for_stmt    #AsyncForStmt
    ;

class_def: CLASS NAME type_param_seq? (LPAREN argument_list? RPAREN)? COLON block;


// ─────────────────────────────────────────────────────────────────────────────
// Parameters
// ─────────────────────────────────────────────────────────────────────────────

parameter_list: parameters;

parameters
    : param_no_default (COMMA param_no_default)*
        (COMMA param_with_default)*
        (COMMA star_param)?
        (COMMA param_maybe_default)*
        (COMMA STAR STAR param_no_default)? COMMA?          #AllParams
    | param_with_default (COMMA param_with_default)*
        (COMMA star_param)?
        (COMMA param_maybe_default)*
        (COMMA STAR STAR param_no_default)? COMMA?          #DefaultParams
    | star_param
        (COMMA param_maybe_default)*
        (COMMA STAR STAR param_no_default)? COMMA?          #StarParams
    | STAR STAR param_no_default COMMA?                     #DblStarOnlyParam
    | param_no_default+ SLASH
        (COMMA param_no_default)*
        (COMMA param_with_default)*
        (COMMA star_param)?
        (COMMA param_maybe_default)*
        (COMMA STAR STAR param_no_default)? COMMA?          #PosOnlyParams
    ;

param_no_default:   NAME annotation?;
param_with_default: NAME annotation? default_assignment;
param_maybe_default: NAME annotation? default_assignment?;

star_param
    : STAR NAME annotation?     #StarParam
    | STAR                      #BareStar
    ;

annotation: COLON expression;
default_assignment: ASSIGN expression;


// ─────────────────────────────────────────────────────────────────────────────
// Type parameters (PEP 695)
// ─────────────────────────────────────────────────────────────────────────────

type_alias: TYPE NAME type_param_seq? ASSIGN expression;

type_param_seq: LBRACKET type_param (COMMA type_param)* COMMA? RBRACKET;

type_param
    : NAME COLON expression             #TypeParamBound
    | STAR NAME COLON expression        #TypeVarTupleBound
    | STAR STAR NAME COLON expression   #ParamSpecBound
    | NAME                              #TypeParam
    | STAR NAME                         #TypeVarTuple
    | STAR STAR NAME                    #ParamSpec
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Imports
// ─────────────────────────────────────────────────────────────────────────────

import_names: dotted_as_name (COMMA dotted_as_name)*;

dotted_as_name: dotted_name (AS NAME)?;

dotted_name: NAME (DOT NAME)*;

relative_module
    : DOT* dotted_name  #RelativeModule
    | DOT+              #RelativeDots
    ;

import_from_targets
    : LPAREN import_from_as_names COMMA? RPAREN #ImportParens
    | import_from_as_names                      #ImportFlat
    | STAR                                      #ImportStar
    ;

import_from_as_names: import_from_as_name (COMMA import_from_as_name)*;

import_from_as_name: NAME (AS NAME)?;


// ─────────────────────────────────────────────────────────────────────────────
// Block
// ─────────────────────────────────────────────────────────────────────────────

block
    : simple_stmts                          #InlineBlock
    | NEWLINE INDENT statement+ DEDENT      #IndentedBlock
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Expressions  (lowest → highest precedence)
// ─────────────────────────────────────────────────────────────────────────────

expressions
    : expression (COMMA expression)* COMMA? #TupleExpr
    | expression                            #SingleExpr
    ;

expression
    : disjunction IF disjunction ELSE expression    #TernaryExpr
    | disjunction                                   #DisjunctionExpr
    | lambda_expr                                   #LambdaExprBody
    | yield_expr                                    #YieldExprBody
    ;

yield_expr
    : YIELD FROM expression     #YieldFrom
    | YIELD star_expressions?   #Yield
    ;

star_expressions
    : star_expression (COMMA star_expression)* COMMA?   #StarTuple
    | star_expression                                   #StarSingle
    ;

star_expression
    : STAR bitwise_or   #StarExpr
    | expression        #PlainExpr
    ;

star_named_expression
    : STAR bitwise_or   #StarNamedExpr
    | named_expression  #PlainNamedExpr
    ;

named_expression
    : NAME WALRUS expression    #WalrusExpr
    | expression                #PlainNamedExpr2
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Boolean
// ─────────────────────────────────────────────────────────────────────────────

disjunction
    : disjunction OR conjunction    #OrExpr
    | conjunction                   #ConjunctionPassthrough
    ;

conjunction
    : conjunction AND inversion     #AndExpr
    | inversion                     #InversionPassthrough
    ;

inversion
    : NOT inversion     #NotExpr
    | comparison        #ComparisonPassthrough
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Comparison
// ─────────────────────────────────────────────────────────────────────────────

comparison
    : bitwise_or compare_op+    #CompareExpr
    | bitwise_or                #BitwiseOrPassthrough
    ;

compare_op
    : EQ  bitwise_or        #EqCompare
    | NEQ bitwise_or        #NeqCompare
    | LTE bitwise_or        #LteCompare
    | LT  bitwise_or        #LtCompare
    | GTE bitwise_or        #GteCompare
    | GT  bitwise_or        #GtCompare
    | NOT IN  bitwise_or    #NotInCompare
    | IN      bitwise_or    #InCompare
    | IS NOT  bitwise_or    #IsNotCompare
    | IS      bitwise_or    #IsCompare
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Bitwise
// ─────────────────────────────────────────────────────────────────────────────

bitwise_or
    : bitwise_or PIPE bitwise_xor   #BitOrExpr
    | bitwise_xor                   #BitXorPassthrough
    ;

bitwise_xor
    : bitwise_xor CARET bitwise_and #BitXorExpr
    | bitwise_and                   #BitAndPassthrough
    ;

bitwise_and
    : bitwise_and AMP shift_expr    #BitAndExpr
    | shift_expr                    #ShiftPassthrough
    ;

shift_expr
    : shift_expr LSHIFT sum_expr    #LShiftExpr
    | shift_expr RSHIFT sum_expr    #RShiftExpr
    | sum_expr                      #SumPassthrough
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Arithmetic
// ─────────────────────────────────────────────────────────────────────────────

sum_expr
    : sum_expr PLUS  term   #AddExpr
    | sum_expr MINUS term   #SubExpr
    | term                  #TermPassthrough
    ;

term
    : term STAR         factor  #MulExpr
    | term SLASH        factor  #DivExpr
    | term SLASH_SLASH  factor  #FloorDivExpr
    | term PERCENT      factor  #ModExpr
    | term AT           factor  #MatMulExpr
    | factor                    #FactorPassthrough
    ;

factor
    : PLUS  factor  #UnaryPlusExpr
    | MINUS factor  #UnaryMinusExpr
    | TILDE factor  #UnaryInvertExpr
    | power         #PowerPassthrough
    ;

power
    : await_primary STAR_STAR factor    #PowerExpr
    | await_primary                     #AwaitPassthrough
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Await / Primary
// ─────────────────────────────────────────────────────────────────────────────

await_primary
    : AWAIT primary     #AwaitExpr
    | primary           #PrimaryPassthrough
    ;

primary
    : primary DOT NAME                          #AttrAccess
    | primary slices                            #SubscriptAccess
    | primary genexp                            #GeneratorCall
    | primary LPAREN argument_list? RPAREN      #FuncCall
    | atom                                      #AtomExpr
    ;

slices: LBRACKET slice_item (COMMA slice_item)* COMMA? RBRACKET;

slice_item
    : expression? COLON expression? (COLON expression?)?   #Slice
    | named_expression                                      #SliceIndex
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Atoms
// ─────────────────────────────────────────────────────────────────────────────

atom
    : NAME                                                                      #NameAtom
    | TRUE                                                                      #TrueAtom
    | FALSE                                                                     #FalseAtom
    | NONE                                                                      #NoneAtom
    | strings                                                                   #StringAtom
    | INT_LIT                                                                   #IntAtom
    | FLOAT_NUMBER                                                              #FloatAtom
    | IMAG_NUMBER                                                               #ImagAtom
    | HEX_INTEGER                                                               #HexAtom
    | BIN_INTEGER                                                               #BinAtom
    | OCT_INTEGER                                                               #OctAtom
    | LPAREN yield_expr RPAREN                                                  #YieldAtom
    // BUG 7 (FIXED): Was `(COMMA star_named_expression)* COMMA?` which allows
    // zero commas, so `(x)` matched as a one-element tuple.  Python semantics:
    //   (x)    → grouped expression (not a tuple)
    //   (x,)   → single-element tuple
    //   (x, y) → two-element tuple
    // Split into three distinct alternatives.
    | LPAREN star_named_expression COMMA
             (star_named_expression (COMMA star_named_expression)*)? COMMA?
      RPAREN                                                                     #TupleAtom
    | LPAREN star_named_expression RPAREN                                       #ParenExprAtom
    | LPAREN genexp RPAREN                                                      #GenExprAtom
    | LPAREN RPAREN                                                             #EmptyTupleAtom
    | LBRACKET star_named_expression (COMMA star_named_expression)* COMMA? RBRACKET #ListAtom
    | LBRACKET listcomp RBRACKET                                                #ListCompAtom
    | LBRACKET RBRACKET                                                         #EmptyListAtom
    | LBRACE dict_item (COMMA dict_item)* COMMA? RBRACE                        #DictAtom
    | LBRACE dictcomp RBRACE                                                    #DictCompAtom
    | LBRACE RBRACE                                                             #EmptyDictAtom
    | LBRACE set_item  (COMMA set_item)* COMMA? RBRACE                         #SetAtom
    | LBRACE setcomp RBRACE                                                     #SetCompAtom
    | ELLIPSIS                                                                  #EllipsisAtom
    ;

strings: (SHORT_STRING | LONG_STRING | BYTES_LITERAL)+;


// ─────────────────────────────────────────────────────────────────────────────
// Dict / Set / Comprehensions
// ─────────────────────────────────────────────────────────────────────────────

dict_item
    : STAR STAR bitwise_or          #DictUnpack
    | expression COLON expression   #DictPair
    ;

dictcomp:  expression COLON expression for_if_clauses;
setcomp:   star_named_expression for_if_clauses;
listcomp:  star_named_expression for_if_clauses;
genexp:    star_named_expression for_if_clauses;

set_item
    : STAR bitwise_or           #SetUnpack
    | star_named_expression     #SetElement
    ;

for_if_clauses: for_if_clause+;

for_if_clause: ASYNC? FOR star_targets IN disjunction (IF disjunction)*;


// ─────────────────────────────────────────────────────────────────────────────
// Lambda
// ─────────────────────────────────────────────────────────────────────────────

lambda_expr: LAMBDA lambda_params? COLON expression;

lambda_params: lambda_parameters;

lambda_parameters
    : NAME (COMMA NAME)*
        (COMMA NAME ASSIGN expression)*
        (COMMA STAR NAME?)?
        (COMMA NAME (ASSIGN expression)?)*
        (COMMA STAR STAR NAME)? COMMA?  #LambdaAllParams
    | STAR STAR NAME COMMA?             #LambdaDblStar
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Assignment
// ─────────────────────────────────────────────────────────────────────────────

assignment
    : NAME COLON expression (ASSIGN annotated_rhs)?                                 #AnnAssign
    | LPAREN single_target RPAREN COLON expression (ASSIGN annotated_rhs)?          #AnnAssignParens
    | single_subscript_attr_target COLON expression (ASSIGN annotated_rhs)?         #AnnAssignSubscript
    | star_targets (ASSIGN star_targets)* ASSIGN (yield_expr | star_expressions)    #ChainedAssign
    | single_target augassign (yield_expr | star_expressions)                       #AugAssign
    ;

annotated_rhs
    : yield_expr        #AnnotatedYield
    | star_expressions  #AnnotatedExpr
    ;

augassign
    : PLUS_ASSIGN           #AugPlus
    | MINUS_ASSIGN          #AugMinus
    | STAR_ASSIGN           #AugMul
    | SLASH_ASSIGN          #AugDiv
    | SLASH_SLASH_ASSIGN    #AugFloorDiv
    | PERCENT_ASSIGN        #AugMod
    | AT_ASSIGN             #AugMatMul
    | AMP_ASSIGN            #AugBitAnd
    | PIPE_ASSIGN           #AugBitOr
    | CARET_ASSIGN          #AugBitXor
    | LSHIFT_ASSIGN         #AugLShift
    | RSHIFT_ASSIGN         #AugRShift
    | STAR_STAR_ASSIGN      #AugPow
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Assignment targets
// ─────────────────────────────────────────────────────────────────────────────

star_targets
    : star_target (COMMA star_target)* COMMA?   #StarTargetTuple
    | star_target                               #StarTargetSingle
    ;

star_target
    : STAR star_target          #StarTargetStar
    | target_with_star_atom     #StarTargetPlain
    ;

target_with_star_atom
    : t_primary DOT NAME    #TargetAttr
    | t_primary slices      #TargetSubscript
    | star_atom             #TargetStarAtom
    ;

star_atom
    : NAME                                                              #StarAtomName
    | LPAREN target_with_star_atom RPAREN                               #StarAtomParens
    | LPAREN (star_target (COMMA star_target)* COMMA?)? RPAREN         #StarAtomTuple
    | LBRACKET (star_target (COMMA star_target)* COMMA?)? RBRACKET     #StarAtomList
    ;

single_target
    : single_subscript_attr_target  #SingleTargetSub
    | NAME                          #SingleTargetName
    | LPAREN single_target RPAREN   #SingleTargetParens
    ;

single_subscript_attr_target
    : t_primary DOT NAME    #SingleAttrTarget
    | t_primary slices      #SingleSubscriptTarget
    ;

t_primary
    : t_primary DOT NAME                        #TPrimaryAttr
    | t_primary slices                          #TPrimarySlice
    | t_primary genexp                          #TPrimaryGen
    | t_primary LPAREN argument_list? RPAREN    #TPrimaryCall
    | atom                                      #TPrimaryAtom
    ;

del_targets: del_target (COMMA del_target)* COMMA?;

del_target
    : t_primary DOT NAME    #DelAttr
    | t_primary slices      #DelSubscript
    | NAME                  #DelName
    ;


// ─────────────────────────────────────────────────────────────────────────────
// Call arguments
// ─────────────────────────────────────────────────────────────────────────────

argument_list: argument (COMMA argument)* COMMA?;

argument
    : NAME WALRUS expression    #WalrusArg
    | NAME ASSIGN expression    #KeywordArg
    | STAR STAR expression      #DblStarArg
    | STAR expression           #StarArg
    | expression                #PosArg
    ;

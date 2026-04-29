// ═══════════════════════════════════════════════════════════════════════════
//  PythonParser.g4
//
//  Entry point renamed from file_input → prog to match the Main.java call:
//      ParseTree tree = parser.prog();
// ═══════════════════════════════════════════════════════════════════════════

parser grammar PythonParser;

options { tokenVocab = PythonLexer; }


// ═══════════════════════════════════════════════════════════════════════════
//  Top-level entry point
// ═══════════════════════════════════════════════════════════════════════════

prog
    : ( NEWLINE | stmt )* EOF
    ;


// ═══════════════════════════════════════════════════════════════════════════
//  Statements
// ═══════════════════════════════════════════════════════════════════════════

stmt
    : simple_stmt                                                   #SimpleStatement
    | compound_stmt                                                 #CompoundStatement
    ;

// A simple statement lives on a single logical line.
simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : import_stmt                                                    #ImportSmall
    | global_stmt                                                    #GlobalSmall
    | return_stmt                                                    #ReturnSmall
    | expr_or_assign                                                 #ExprSmall    // assignment OR bare expression (call etc.)
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Import
// ─────────────────────────────────────────────────────────────────────────────

import_stmt
    : FROM dotted_name IMPORT import_as_names                           #FromImport
    | IMPORT dotted_name                                                #PlainImport
    ;

// Dotted module path:  werkzeug.utils,  os.path,  flask
dotted_name
    : NAME ( DOT NAME )*
    ;

// One or more imported names:  Flask, render_template, request, ...
import_as_names
    : NAME ( COMMA NAME )*
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  global statement
// ─────────────────────────────────────────────────────────────────────────────

global_stmt
    : GLOBAL NAME ( COMMA NAME )*
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  return statement
// ─────────────────────────────────────────────────────────────────────────────

return_stmt
    : RETURN expr?
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Assignment or bare expression
//
//  The left side is parsed as a full expr to avoid target/primary ambiguity.
//  An optional assign_op + rhs expr makes it an assignment.
//
//  Plain:       products = load_products()
//  Augmented:   next_id += 1
//  Subscript:   app.config["KEY"] = VALUE
//  Bare call:   products.append(product)
// ─────────────────────────────────────────────────────────────────────────────

expr_or_assign
    : expr ( assign_op expr )?
    ;

assign_op
    : ASSIGN                     #OpAssign
    | PLUS_ASSIGN                #OpPlusAssign
    | MINUS_ASSIGN               #OpMinusAssign
    ;


// ═══════════════════════════════════════════════════════════════════════════
//  Compound statements  (each has an indented suite)
// ═══════════════════════════════════════════════════════════════════════════

compound_stmt
    : if_stmt                             #CompoundIf
    | with_stmt                           #ComppundWith
    | funcdef                             #CompoundFunc
    | decorated                           #CompoundDecorated
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  if / elif / else
// ─────────────────────────────────────────────────────────────────────────────

if_stmt
    : IF expr COLON suite
      else_if_stmt
      ( ELSE COLON suite )?
    ;

else_if_stmt:
      ( ELIF expr COLON suite )*
;

// ─────────────────────────────────────────────────────────────────────────────
//  with … as …
// ─────────────────────────────────────────────────────────────────────────────

with_stmt
    : WITH expr ( AS NAME )? COLON suite
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Function definition
// ─────────────────────────────────────────────────────────────────────────────

funcdef
    : DEF NAME LPAREN param_list? RPAREN COLON suite
    ;

// Simple positional parameters only (no *args / **kwargs)
param_list
    : NAME ( COMMA NAME )*
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Decorator + function  (@app.route("/") \n def index(): ...)
// ─────────────────────────────────────────────────────────────────────────────

decorated
    : decorator+ funcdef
    ;

decorator
    : AT dotted_name ( LPAREN arglist? RPAREN )? NEWLINE
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Suite  (indented block)
//
//  PythonIndentLexer guarantees INDENT is emitted immediately after the
//  NEWLINE that opens a block, and DEDENT is emitted when indentation drops.
// ─────────────────────────────────────────────────────────────────────────────

suite
    : NEWLINE INDENT stmt+ DEDENT
    ;


// ═══════════════════════════════════════════════════════════════════════════
//  Expressions  (precedence encoded via rule hierarchy, lowest first)
// ═══════════════════════════════════════════════════════════════════════════

expr : or_test ;


// ─── Boolean: or ─────────────────────────────────────────────────────────────

or_test
    : and_test ( OR and_test )*
    ;


// ─── Boolean: and ────────────────────────────────────────────────────────────

and_test
    : not_test ( AND not_test )*
    ;


// ─── Boolean: not ────────────────────────────────────────────────────────────

not_test
    : NOT not_test   #NotExpr
    | comparison     #NotPassthrough
    ;


// ─── Comparison ──────────────────────────────────────────────────────────────

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


// ─── Addition / subtraction ──────────────────────────────────────────────────

arith_expr
    : arith_expr ( PLUS | MINUS ) term   #AddSub
    | term                               #ArithPassthrough
    ;


// ─── Multiplication / division ───────────────────────────────────────────────

term
    : term ( STAR | SLASH ) primary   #MulDiv
    | primary                         #TermPassthrough
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Primary  —  atom with postfix operations (left-recursive, ANTLR4-safe)
//
//  Handles:
//    Attribute:   os.path.exists,  app.config,  file.filename
//    Subscript:   products["id"],  request.files["image"]
//    Call:        render_template("index.html", products=products)
// ─────────────────────────────────────────────────────────────────────────────

primary
    : primary DOT NAME                    #AttrAccess
    | primary LBRACK expr RBRACK          #SubscriptAccess
    | primary LPAREN arglist? RPAREN      #CallExpr
    | atom                                #AtomExpr
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Atoms
// ─────────────────────────────────────────────────────────────────────────────

atom
    : NAME         #NameAtom
    | INTEGER      #IntAtom
    | FLOAT_NUM    #FloatAtom
    | STRING+      #StringAtom    // adjacent string literals are joined
    | NONE         #NoneAtom
    | TRUE         #TrueAtom
    | FALSE        #FalseAtom
    | list_display #ListAtom
    | dict_display #DictAtom
    | paren_form   #ParenAtom
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  List display  [...]
//
//  Empty:             []
//  Literal:           ["GET", "POST"]
//  List comprehension:[p for p in products if p["id"] != id]
// ─────────────────────────────────────────────────────────────────────────────

list_display
    : LBRACK RBRACK                                            #EmptyList
    | LBRACK expr comp_for RBRACK                             #ListComp
    | LBRACK expr ( COMMA expr )* COMMA? RBRACK              #ListLiteral
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Dict display  {...}
//
//  Empty:   {}
//  Literal: {"id": next_id, "name": request.form["name"], ...}
//
//  NEWLINEs inside {} are suppressed by PythonIndentLexer (bracketDepth > 0),
//  so a multi-line dict parses identically to a single-line dict here.
// ─────────────────────────────────────────────────────────────────────────────

dict_display
    : LBRACE RBRACE                                            #EmptyDict
    | LBRACE kv_pair ( COMMA kv_pair )* COMMA? RBRACE        #DictLiteral
    ;

kv_pair
    : expr COLON expr
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Parenthesised form  (...)
//
//  Generator: (p for p in products if p["id"] == id)   — used by next(...)
//  Grouped:   (redirect(url_for("index")))
//
//  genExpr is tried first to avoid consuming the generator as a bare expr.
// ─────────────────────────────────────────────────────────────────────────────

paren_form
    : LPAREN expr comp_for RPAREN   #GenExpr
    | LPAREN expr RPAREN            #ParenExpr
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Comprehension / generator clause
//    for p in products if p["id"] != id
// ─────────────────────────────────────────────────────────────────────────────

comp_for
    : FOR NAME IN expr ( IF expr )?
    ;


// ─────────────────────────────────────────────────────────────────────────────
//  Argument list in a call
//
//  Positional:  products,  id,  f
//  Keyword:     exist_ok=True,  indent=4,  default=0,  debug=True
// ─────────────────────────────────────────────────────────────────────────────

arglist
    : argument ( COMMA argument )* COMMA?
    ;

argument
    : NAME ASSIGN expr   #KeywordArg      // key=value
    | expr               #PositionalArg   // positional value
    ;

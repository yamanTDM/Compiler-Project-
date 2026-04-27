parser grammar JinjaHtmlParser;
options { tokenVocab= JinjaHtmlLexer; }


prog: document* EOF;


document: DOCTYPE? body;

body:
startElement body* endElement                           #HtmlElement
| styleStartElement styleBody styleEndElement           #StyleElement
| singleElement                                         #SingleHtml
| jinjaExpr                                             #JinjaExpression
| jinjaConditionStmt                                    #JinjaConditionStatement
| jinjaBlock                                            #JinjaBlockPlace
| jinjaForLoop                                          #JinjaLoop
| jinjaStmt                                             #JinjaStatement
| jinjaInheritance                                      #JinjaInheritanceBody
| ID                                                    #Identifier
| TEXT                                                  #Text
;



startElement: OST PAIRED_TAG attribute* CT;
endElement: OET PAIRED_TAG CT;
singleElement: OST VOID_TAG attribute* CT;
attribute
    : COMMA? ID (EQUALS attributeValue)?
    ;

attributeValue
    : DQ_START DQ_TEXT? DQ_END                               #StringAttribute
    | SQ_START jinjaExpr SQ_END                              #JinjaSQAttribute
    | DQ_START jinjaExpr DQ_END                              #JinjaDQAttribute
    ;


jinjaInheritance: inheritanceStart body* jinjaBlock+;

inheritanceStart: JINJA_STMT_START JINJA_EXTENDS JINJA_STRING JINJA_STMT_END;

//CSS
styleStartElement: OST STYLE_TAG;
styleEndElement: CSS_END_STYLE CT;
styleBody
    : cssRule*
    ;

cssRule
    : selectorList CSS_LBRACE declarationList CSS_RBRACE
    ;

selectorList
    : selector (CSS_COMMA? selector )*
    ;

selector
    : CSS_NAME                   #NormalSelector
    | CSS_DOT CSS_NAME           #ClassSelector
    | CSS_HASH CSS_NAME          #IdSelector
    | CSS_ALL                    #AllSelector
    ;

declarationList
    : declaration*
    ;

declaration
    : CSS_NAME CSS_COLON value (CSS_SEMI)?
    ;



value
    : (cssTerm(CSS_COMMA cssTerm)*)+
    ;

cssTerm
    : CSS_NUMBER CSS_UNIT?           #NumberTerm
    | CSS_STRING                     #StringTerm
    | CSS_NAME                       #NameTerm
    | hexNum                         #HexTerm
    | functions                      #FunctionTerm

    ;
functions
: CSS_HSL CSS_LP cssNum CSS_COMMA cssNum CSS_COMMA cssNum CSS_RP                               #HSLFunction
|translate                                                                                     #TranslateFunction
|scale                                                                                         #ScaleFunction
| CSS_ROTATE CSS_LP cssNum CSS_RP                                                              #RotateFunction
| CSS_CALC CSS_LP cssNum operator cssNum CSS_RP                                                #CalcFunction
;
cssNum : CSS_NUMBER CSS_UNIT?;
operator: CSS_MATH | CSS_ALL;
translate
: CSS_TRANSLATEX CSS_LP cssNum CSS_RP                                          #TranslateX
| CSS_TRANSLATEY CSS_LP cssNum CSS_RP                                          #TranslateY
| CSS_TRANSLATE CSS_LP cssNum CSS_COMMA cssNum CSS_RP            #TranslateFull
;
scale
: CSS_SCALEX CSS_LP cssNum CSS_RP                                                  #ScaleX
| CSS_SCALEY CSS_LP cssNum CSS_RP                                                  #ScaleY
| CSS_SCALE CSS_LP cssNum CSS_COMMA cssNum CSS_RP                    #ScaleFull
;
hexNum: CSS_HASH (CSS_HEX | CSS_NAME | CSS_NUMBER);

//Jinja
jinjaBlock: jinjaSuperBlock? jinjaBlockStart body* jinjaBlockeEnd;
jinjaBlockStart: JINJA_STMT_START JINJA_BLOCK jinjaId JINJA_STMT_END;
jinjaBlockeEnd:JINJA_STMT_START JINJA_ENDBLOCK JINJA_STMT_END;
jinjaSuperBlock: JINJA_EXPR_START JINJA_SUPER JINJA_EXPR_END;

jinjaConditionStmt: jinjaIf jinjaElseIf* jinjaElse? jinjaEndIf;
jinjaIf: JINJA_STMT_START JINJA_IF jinjaConditions JINJA_STMT_END body?;
jinjaElseIf:JINJA_STMT_START JINJA_ELIF jinjaConditions JINJA_STMT_END body?;
jinjaElse:JINJA_STMT_START JINJA_ELSE  JINJA_STMT_END body?;
jinjaEndIf:JINJA_STMT_START JINJA_ENDIF  JINJA_STMT_END;
jinjaConditions
: jinjaConditions JINJA_LOGIC jinjaConditions                             #JinjaConditionsRoot
|JINJA_LP jinjaConditions JINJA_RP                                        #JinjaParentecesCondition
| jinjaVariable                                                           #JinjaVaraiableConditon
| JINJA_NOT jinjaConditions                                               #JinjaNotCondition
| jinjaVariable compare jinjaVariable                                     #JinjaCompareCondition
;

compare:(JINJA_COMPARE | JINJA_INS);
jinjaForLoop: jinjaFor body? jinjaElse? jinjaEndFor;
jinjaFor: JINJA_STMT_START JINJA_FOR jinjaId JINJA_INS jinjaId (JINJA_IF jinjaConditions)? JINJA_STMT_END;
jinjaEndFor: JINJA_STMT_START JINJA_ENDFOR JINJA_STMT_END;
jinjaVariable: JINJA_NUM | jinjaId | JINJA_STRING;

jinjaId
: JINJA_ID_EXPR (JINJA_DOT_EXPR JINJA_ID_EXPR)?           #JinjaExpressionID
|JINJA_ID_STMT (JINJA_DOT_STMT JINJA_ID_STMT)?            #JinjaStatementID
;

jinjaExpr
: (JINJA_EXPR_START | DQ_JINJA_START | SQ_JINJA_START) expr* JINJA_EXPR_END
;

expr
    : functionCall                                              #JinjaExpressionFunction
    | combineHalf (JINJA_COMBINE combineHalf)+                 #JinjaExpressionCombine
    | jinjaId JINJA_EQUAL expr                                 #JinjaExpressionAssign
    | JINJA_STRING_EXPR                                         #JinjaExpressionStringBody
    | jinjaId                                                  #JinjaExpressionIDBody
    | JINJA_TEXT                                               #JinjaExpressionText
    ;

combineHalf: (JINJA_STRING_EXPR | jinjaId);

functionCall
: jinjaId JINJA_LP_EXPR (expr (JINJA_COMMA expr)*)? JINJA_RP_EXPR
;
jinjaStmt
: JINJA_STMT_START stmtBody* JINJA_STMT_END
;
stmtBody:(JINJA_TEXT_STMT | jinjaId | JINJA_STRING);


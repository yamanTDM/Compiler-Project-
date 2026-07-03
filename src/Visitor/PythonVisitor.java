package Visitor;

import AST_Python.*;
import AST_Python.compound_statements.*;
import AST_Python.expressions.*;
import AST_Python.expressions.atoms.*;
import AST_Python.expressions.compare.*;
import AST_Python.small_statements.*;
import SymbolTable.*;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class PythonVisitor extends PythonParserBaseVisitor {

    @Override
    public Program visitProg(PythonParser.ProgContext ctx) {
        int line = ctx.start.getLine();
        Program program = new Program(line);
        if (ctx.stmt() != null) {
            for (int i = 0; i < ctx.stmt().size(); i++) {
                Statement statement = (Statement) visit((ctx.stmt(i)));
                program.addStatement(statement);
            }
        }
        return program;
    }

    @Override
    public SimpleStatement visitSimpleStatement(PythonParser.SimpleStatementContext ctx) {
        return (SimpleStatement) visit(ctx.simple_stmt());
    }

    @Override
    public CompoundStatement visitCompoundStatement(PythonParser.CompoundStatementContext ctx) {
        return (CompoundStatement) visit(ctx.compound_stmt());
    }

    @Override
    public SimpleStatement visitSimple_stmt(PythonParser.Simple_stmtContext ctx) {
        int line = ctx.start.getLine();
        SmallStatement statement = (SmallStatement) visit(ctx.small_stmt());
        SimpleStatement simpleStatement = new SimpleStatement(line, statement);
        return simpleStatement;

    }

    @Override
    public ImportStatement visitImportSmall(PythonParser.ImportSmallContext ctx) {
        return (ImportStatement) visit(ctx.import_stmt());
    }

    @Override
    public GlobalStatement visitGlobalSmall(PythonParser.GlobalSmallContext ctx) {
        return (GlobalStatement) visit(ctx.global_stmt());
    }

    @Override
    public ReturnStatement visitReturnSmall(PythonParser.ReturnSmallContext ctx) {
        return (ReturnStatement) visit(ctx.return_stmt());
    }

    @Override
    public SmallStatement visitExprSmall(PythonParser.ExprSmallContext ctx) {
        return (SmallStatement) visit(ctx.expr_or_assign());
    }

    @Override
    public FromImport visitFromImport(PythonParser.FromImportContext ctx) {
        int line = ctx.start.getLine();

        DottedName dottedName = visitDotted_name(ctx.dotted_name());
        FromImport fromImport = new FromImport(line, dottedName);
        for (int i = 0; i < ctx.import_as_names().NAME().size(); i++) {
            fromImport.addAttribute(ctx.import_as_names().NAME(i).getText());

        }
        return fromImport;
    }

    @Override
    public PlainImport visitPlainImport(PythonParser.PlainImportContext ctx) {
        int line = ctx.start.getLine();
        DottedName dottedName = visitDotted_name(ctx.dotted_name());
        PlainImport plainImport = new PlainImport(line, dottedName);
        return plainImport;
    }

    @Override
    public DottedName visitDotted_name(PythonParser.Dotted_nameContext ctx) {
        int line = ctx.start.getLine();
        DottedName dottedName = new DottedName(line);
        for (int i = 0; i < ctx.NAME().size(); i++) {

            dottedName.addName(ctx.NAME(i).getText());
        }
        return dottedName;
    }

    @Override
    public GlobalStatement visitGlobal_stmt(PythonParser.Global_stmtContext ctx) {
        int line = ctx.start.getLine();
        GlobalStatement global = new GlobalStatement(line);
        for (int i = 0; i < ctx.NAME().size(); i++) {
            String name = ctx.NAME(i).getText();
            global.addVariable(name);

        }
        return global;
    }

    @Override
    public ReturnStatement visitReturn_stmt(PythonParser.Return_stmtContext ctx) {
        int line = ctx.start.getLine();
        Expression expression = null;
        if (ctx.expr() != null) {
            expression = (Expression) visit(ctx.expr());
        }
        ReturnStatement returnStatement = new ReturnStatement(line, expression);
        return returnStatement;
    }

    @Override
    public SmallStatement visitExpr_or_assign(PythonParser.Expr_or_assignContext ctx) {
        int line = ctx.start.getLine();
        Expression expression = (Expression) visit(ctx.expr().getFirst());
        if (ctx.expr().size() == 1) {
            return new ExpressionStatement(line, expression);
        }
        Expression secondExpression = (Expression) visit(ctx.expr().get(1));

        if (ctx.assign_op() instanceof PythonParser.OpAssignContext) {
            return new AssignStatement(line, expression, secondExpression);
        } else if (ctx.assign_op() instanceof PythonParser.OpPlusAssignContext) {
            return new AugmentedPlus(line, expression, secondExpression);
        } else {
            return new AugmentedMinus(line, expression, secondExpression);
        }
    }

    @Override
    public IfStatement visitCompoundIf(PythonParser.CompoundIfContext ctx) {
        return visitIf_stmt(ctx.if_stmt());
    }

    @Override
    public WithStatement visitComppundWith(PythonParser.ComppundWithContext ctx) {
        return visitWith_stmt(ctx.with_stmt());
    }

    @Override
    public FunctionStatement visitCompoundFunc(PythonParser.CompoundFuncContext ctx) {
        return visitFuncdef(ctx.funcdef());
    }

    @Override
    public DecoratedFunction visitCompoundDecorated(PythonParser.CompoundDecoratedContext ctx) {
        return visitDecorated(ctx.decorated());
    }

    @Override
    public IfStatement visitIf_stmt(PythonParser.If_stmtContext ctx) {
        int line = ctx.start.getLine();
        Expression condition = (Expression) visit(ctx.expr());
        Body ifBody = visitSuite(ctx.suite().getFirst());
        Body elseBody = null;
        if (ctx.suite().size() == 2) {
            elseBody = visitSuite(ctx.suite().get(1));
        }
        IfStatement ifStatement = new IfStatement(line, condition, ifBody, elseBody);
        if (ctx.else_if_stmt() != null) {
            for (int i = 0; i < ctx.else_if_stmt().expr().size(); i++) {
                Expression elseIfCondition = (Expression) visit(ctx.else_if_stmt().expr().get(i));
                Body elseIfBody = visitSuite(ctx.else_if_stmt().suite().get(1));
                ElseIfStatement elseIfStatement = new ElseIfStatement(line, elseIfCondition, elseIfBody);
                ifStatement.addElseIfStatement(elseIfStatement);
            }
        }
        return ifStatement;

    }

    @Override
    public WithStatement visitWith_stmt(PythonParser.With_stmtContext ctx) {
        int line = ctx.start.getLine();
        Expression expression = (Expression) visit(ctx.expr());
        String name = null;
        if (ctx.NAME() != null) {
            name = ctx.NAME().getText();
        }
        Body body = visitSuite(ctx.suite());
        WithStatement withStatement = new WithStatement(line, expression, name, body);
        return withStatement;
    }

    @Override
    public FunctionStatement visitFuncdef(PythonParser.FuncdefContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.NAME().getText();

        List<Parameter> parameters = new ArrayList<>();
        if (ctx.param_list() != null) {
            for (int i = 0; i < ctx.param_list().NAME().size(); i++) {
                Parameter parameter = new Parameter(line, ctx.param_list().NAME(i).getText());
                parameters.add(parameter);

            }
        }
        Body body = visitSuite(ctx.suite());
        FunctionStatement functionStatement = new FunctionStatement(line, name, body);
        functionStatement.setParameters(parameters);
        return functionStatement;
    }


    @Override
    public DecoratedFunction visitDecorated(PythonParser.DecoratedContext ctx) {
        int line = ctx.start.getLine();
        FunctionStatement functionStatement = visitFuncdef(ctx.funcdef());
        DecoratedFunction decoratedFunction = new DecoratedFunction(line, functionStatement);
        for (int i = 0; i < ctx.decorator().size(); i++) {
            PythonParser.DecoratorContext decoratorContext = ctx.decorator().get(i);
            DottedName dottedName = visitDotted_name(decoratorContext.dotted_name());
            Decorator decorator = new Decorator(line, dottedName);
            if (decoratorContext.arglist() != null) {
                for (int j = 0; j < decoratorContext.arglist().argument().size(); j++) {
                    Expression expression = (Expression) visit(decoratorContext.arglist().argument().get(j));
                    decorator.addArgument(expression);
                }
            }
            decoratedFunction.addDecorator(decorator);
        }
        return decoratedFunction;
    }


    @Override
    public Body visitSuite(PythonParser.SuiteContext ctx) {
        int line = ctx.start.getLine();
        Body body = new Body(line);
        for (int i = 0; i < ctx.stmt().size(); i++) {
            Statement statement = (Statement) visit(ctx.stmt().get(i));
            body.addStatement(statement);
        }
        return body;
    }

    @Override
    public Expression visitExpr(PythonParser.ExprContext ctx) {
        return (Expression) visit(ctx.or_test());
    }

    @Override
    public Expression visitOr_test(PythonParser.Or_testContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.and_test().size() == 1) {
            return (Expression) visit(ctx.and_test().get(0));
        }
        OrExpression orExpression = new OrExpression(line);
        for (int i = 0; i < ctx.and_test().size(); i++) {
            Expression expression = (Expression) visit(ctx.and_test().get(i));
            orExpression.addExpression(expression);
        }
        return orExpression;
    }

    @Override
    public Expression visitAnd_test(PythonParser.And_testContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.not_test().size() == 1) {
            return (Expression) visit(ctx.not_test().get(0));
        }
        AndExpression andExpression = new AndExpression(line);
        for (int i = 0; i < ctx.not_test().size(); i++) {
            Expression expression = (Expression) visit(ctx.not_test().get(i));
            andExpression.addExpression(expression);
        }
        return andExpression;
    }

    @Override
    public NotExpression visitNotExpr(PythonParser.NotExprContext ctx) {
        int line = ctx.start.getLine();
        Expression expression = (Expression) visit(ctx.not_test());
        NotExpression notExpression = new NotExpression(line, expression);
        return notExpression;
    }

    @Override
    public Expression visitNotPassthrough(PythonParser.NotPassthroughContext ctx) {
        return (Expression) visit(ctx.comparison());
    }

    @Override
    public Expression visitComparison(PythonParser.ComparisonContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.arith_expr().size() == 1) {
            return (NumbericExpression) visit(ctx.arith_expr().getFirst());
        }
        CompareExpression compareExpression = new CompareExpression(line);
        for (int i = 1; i < ctx.arith_expr().size(); i++) {
            NumbericExpression leftExpression = (NumbericExpression) visit(ctx.arith_expr().get(i - 1));
            NumbericExpression rightExpression = (NumbericExpression) visit(ctx.arith_expr().get(i));
            Comparision comparision;
            if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompEqContext) {
                comparision = new CompareEqual(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompNeqContext) {
                comparision = new CompareNotEqual(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompLtContext) {
                comparision = new CompareLessThan(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompGtContext) {
                comparision = new CompareGreaterThan(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompLeqContext) {
                comparision = new CompareLessThanEqual(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompGeqContext) {
                comparision = new CompareGreaterThanEqual(line, leftExpression, rightExpression);
            } else if (ctx.comp_op().get(i - 1) instanceof PythonParser.CompInContext) {
                comparision = new CompareIn(line, leftExpression, rightExpression);
            } else {
                comparision = new CompareNotIn(line, leftExpression, rightExpression);
            }
            compareExpression.addComparison(comparision);
        }
        return compareExpression;
    }


    @Override
    public NumbericExpression visitAddSub(PythonParser.AddSubContext ctx) {
        int line = ctx.start.getLine();
        NumbericExpression leftExpression = (NumbericExpression) visit(ctx.arith_expr());
        NumbericExpression rightExpression = (NumbericExpression) visit(ctx.term());
        if (ctx.PLUS() != null) {
            return new Addition(line, leftExpression, rightExpression);
        } else {
            return new Subtraction(line, leftExpression, rightExpression);
        }

    }

    @Override
    public NumbericExpression visitArithPassthrough(PythonParser.ArithPassthroughContext ctx) {
        return (NumbericExpression) visit(ctx.term());
    }

    @Override
    public NumbericExpression visitMulDiv(PythonParser.MulDivContext ctx) {
        int line = ctx.start.getLine();
        NumbericExpression leftExpression = (NumbericExpression) visit(ctx.term());
        NumbericExpression rightExpression = (NumbericExpression) visit(ctx.primary());
        if (ctx.STAR() != null) {
            return new Multiplication(line, leftExpression, rightExpression);
        } else {
            return new Division(line, leftExpression, rightExpression);
        }
    }

    @Override
    public NumbericExpression visitTermPassthrough(PythonParser.TermPassthroughContext ctx) {
        return (NumbericExpression) visit(ctx.primary());
    }

    @Override
    public AccessAttributeExpression visitAttrAccess(PythonParser.AttrAccessContext ctx) {
        int line = ctx.start.getLine();
        NumbericExpression object = (NumbericExpression) visit(ctx.primary());
        String name = ctx.NAME().getText();
        AccessAttributeExpression accessAttributeExpression = new AccessAttributeExpression(line, object, name);
        return accessAttributeExpression;
    }

    @Override
    public AccessSubscriptExpression visitSubscriptAccess(PythonParser.SubscriptAccessContext ctx) {
        int line = ctx.start.getLine();
        NumbericExpression object = (NumbericExpression) visit(ctx.primary());
        Expression index = (Expression) visit(ctx.expr());
        AccessSubscriptExpression accessSubscriptExpression = new AccessSubscriptExpression(line, object, index);
        return accessSubscriptExpression;
    }

    @Override
    public AccessFunctionExpression visitCallExpr(PythonParser.CallExprContext ctx) {
        int line = ctx.start.getLine();
        NumbericExpression object = (NumbericExpression) visit(ctx.primary());
        AccessFunctionExpression accessFunctionExpression = new AccessFunctionExpression(line, object);
        if (ctx.arglist() != null) {
            for (int j = 0; j < ctx.arglist().argument().size(); j++) {
                Expression expression = (Expression) visit(ctx.arglist().argument().get(j));
                accessFunctionExpression.addArgument(expression);
            }
        }
        return accessFunctionExpression;
    }

    @Override
    public Atom visitAtomExpr(PythonParser.AtomExprContext ctx) {
        return (Atom) visit(ctx.atom());
    }


    @Override
    public NameAtom visitNameAtom(PythonParser.NameAtomContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.NAME().getText();
        NameAtom nameAtom = new NameAtom(line, name);
        return nameAtom;
    }

    @Override
    public IntegerAtom visitIntAtom(PythonParser.IntAtomContext ctx) {
        int line = ctx.start.getLine();
        int number = Integer.parseInt(ctx.INTEGER().getText());
        IntegerAtom atom = new IntegerAtom(line, number);
        return atom;
    }

    @Override
    public FloatAtom visitFloatAtom(PythonParser.FloatAtomContext ctx) {
        int line = ctx.start.getLine();
        float number = Float.parseFloat(ctx.FLOAT_NUM().getText());
        FloatAtom floatAtom = new FloatAtom(line, number);
        return floatAtom;
    }

    @Override
    public StringAtom visitStringAtom(PythonParser.StringAtomContext ctx) {
        int line = ctx.start.getLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.STRING().size(); i++) {
            sb.append(ctx.STRING().get(i).getText());
        }
        String string = sb.toString();
        string = string.replaceAll("^['\"]|['\"]$", "");
        StringAtom stringAtom = new StringAtom(line, string);
        return stringAtom;
    }
    @Override
    public NoneAtom visitNoneAtom(PythonParser.NoneAtomContext ctx) {
        int line = ctx.start.getLine();
        NoneAtom noneAtom = new NoneAtom(line);
        return noneAtom;
    }

    @Override
    public TrueAtom visitTrueAtom(PythonParser.TrueAtomContext ctx) {
        int line = ctx.start.getLine();
        TrueAtom trueAtom = new TrueAtom(line);
        return trueAtom;
    }

    @Override
    public FalseAtom visitFalseAtom(PythonParser.FalseAtomContext ctx) {
        int line = ctx.start.getLine();
        FalseAtom falseAtom = new FalseAtom(line);
        return falseAtom;
    }

    @Override
    public Atom visitListAtom(PythonParser.ListAtomContext ctx) {
        return (Atom) visit(ctx.list_display());
    }

    @Override
    public DictionaryAtom visitDictAtom(PythonParser.DictAtomContext ctx) {
        return (DictionaryAtom) visit(ctx.dict_display());
    }

    @Override
    public Atom visitParenAtom(PythonParser.ParenAtomContext ctx) {
        return (Atom) visit(ctx.paren_form());
    }

    @Override
    public ListAtom visitEmptyList(PythonParser.EmptyListContext ctx) {
        int line = ctx.start.getLine();
        ListAtom listAtom = new ListAtom(line);
        return listAtom;
    }

    @Override
    public ListComprehensionAtom visitListComp(PythonParser.ListCompContext ctx) {
        int line = ctx.start.getLine();
        Expression output = (Expression) visit(ctx.expr());
        String name = ctx.comp_for().NAME().getText();

        Expression list = (Expression) visit(ctx.comp_for().expr().getFirst());
        Expression condition = null;
        if (ctx.comp_for().expr().size() > 1) {
            condition = (Expression) visit(ctx.comp_for().expr().get(1));
        }
        ListComprehensionAtom listComprehensionAtom = new ListComprehensionAtom(line, output, name, list, condition);
        return listComprehensionAtom;
    }

    @Override
    public ListAtom visitListLiteral(PythonParser.ListLiteralContext ctx) {
        int line = ctx.start.getLine();
        ListAtom listAtom = new ListAtom(line);
        for (int i = 0; i < ctx.expr().size(); i++) {
            Expression expression = (Expression) visit(ctx.expr().get(i));
            listAtom.addItem(expression);
        }
        return listAtom;
    }

    @Override
    public DictionaryAtom visitEmptyDict(PythonParser.EmptyDictContext ctx) {
        int line = ctx.start.getLine();
        DictionaryAtom dictionaryAtom = new DictionaryAtom(line);
        return dictionaryAtom;
    }

    @Override
    public DictionaryAtom visitDictLiteral(PythonParser.DictLiteralContext ctx) {
        int line = ctx.start.getLine();
        DictionaryAtom dictionaryAtom = new DictionaryAtom(line);
        for (int i = 0; i < ctx.kv_pair().size(); i++) {
            DictionaryEntry dictionaryEntry = visitKv_pair(ctx.kv_pair().get(i));
            dictionaryAtom.addEntry(dictionaryEntry);
        }
        return dictionaryAtom;
    }

    @Override
    public DictionaryEntry visitKv_pair(PythonParser.Kv_pairContext ctx) {
        int line = ctx.start.getLine();
        Expression key = (Expression) visit(ctx.expr().getFirst());
        Expression value = (Expression) visit(ctx.expr().getLast());
        DictionaryEntry dictionaryEntry = new DictionaryEntry(line, key, value);
        return dictionaryEntry;
    }

    @Override
    public GeneratorAtom visitGenExpr(PythonParser.GenExprContext ctx) {
        int line = ctx.start.getLine();
        Expression output = (Expression) visit(ctx.expr());
        String name = ctx.comp_for().NAME().getText();

        Expression list = (Expression) visit(ctx.comp_for().expr().getFirst());
        Expression condition = null;
        if (ctx.comp_for().expr().size() > 1) {
            condition = (Expression) visit(ctx.comp_for().expr().get(1));
        }
        GeneratorAtom generatorAtom = new GeneratorAtom(line, output, name, list, condition);
        return generatorAtom;
    }

    @Override
    public GroupingAtom visitParenExpr(PythonParser.ParenExprContext ctx) {
        int line = ctx.start.getLine();
        Expression expression = (Expression) visit(ctx.expr());
        GroupingAtom groupingAtom = new GroupingAtom(line, expression);
        return groupingAtom;
    }


    @Override
    public AssignExpression visitKeywordArg(PythonParser.KeywordArgContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.NAME().getText();
        Expression expression = (Expression) visit(ctx.expr());
        AssignExpression assignExpression = new AssignExpression(line, name, expression);
        return assignExpression;
    }

    @Override
    public Expression visitPositionalArg(PythonParser.PositionalArgContext ctx) {
        return (Expression) visit(ctx.expr());
    }
}

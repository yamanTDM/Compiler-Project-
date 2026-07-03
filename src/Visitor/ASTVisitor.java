package Visitor;

import AST_Python.*;
import AST_Python.compound_statements.*;
import AST_Python.expressions.compare.*;
import AST_Python.small_statements.*;
import AST_Python.expressions.*;
import AST_Python.expressions.atoms.*;

public interface ASTVisitor<T> {

    T visit(Program node);

    T visit(Body node);

    T visit(FunctionStatement node);

    T visit(IfStatement node);

    T visit(WithStatement node);

    T visit(AssignStatement node);

    T visit(GlobalStatement node);

    T visit(ReturnStatement node);

    T visit(NameAtom node);

    T visit(IntegerAtom node);

    T visit(FloatAtom node);

    T visit(StringAtom node);

    T visit(DecoratedFunction node);

    T visit(Decorator node);

    T visit(ElseIfStatement node);

    T visit(DictionaryAtom node);

    T visit(FalseAtom node);

    T visit(GroupingAtom node);

    T visit(ListAtom node);

    T visit(ListComprehensionAtom node);

    T visit(NoneAtom node);

    T visit(TrueAtom node);

    T visit(CompareEqual node);

    T visit(CompareGreaterThan node);

    T visit(CompareGreaterThanEqual node);

    T visit(CompareIn node);

    T visit(CompareLessThan node);

    T visit(CompareLessThanEqual node);

    T visit(CompareNotEqual node);

    T visit(CompareNotIn node);

    T visit(AccessAttributeExpression node);

    T visit(AccessFunctionExpression node);

    T visit(AccessSubscriptExpression node);

    T visit(Addition node);

    T visit(AndExpression node);

    T visit(AssignExpression node);

    T visit(Atom node);

    T visit(CompareExpression node);

    T visit(Comparision node);

    T visit(DictionaryEntry node);

    T visit(Division node);

    T visit(DottedName node);

    T visit(Multiplication node);

    T visit(NotExpression node);

    T visit(NumbericExpression node);

    T visit(OrExpression node);

    T visit(Subtraction node);

    T visit(AugmentedMinus node);

    T visit(AugmentedPlus node);

    T visit(ExpressionStatement node);

    T visit(FromImport node);

    T visit(ImportStatement node);

    T visit(PlainImport node);

    T visit(CompoundStatement node);

    T visit(Expression node);

    T visit(Node node);

    T visit(Parameter node);

    T visit(SimpleStatement node);

    T visit(SmallStatement node);

    T visit(Statement node);

    T visit(TargetExpression node);

    T visit(ValueExpression node);
    T visit(GeneratorAtom node);

}
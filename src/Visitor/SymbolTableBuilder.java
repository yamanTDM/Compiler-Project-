package Visitor;

import AST_Python.*;
import AST_Python.compound_statements.*;
import AST_Python.expressions.*;
import AST_Python.expressions.atoms.*;
import AST_Python.expressions.compare.*;
import AST_Python.small_statements.*;
import SymbolTable.SymbolTable;
import SymbolTable.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SymbolTableBuilder implements ASTVisitor<Void> {
    private final SymbolTable symbolTable = new SymbolTable();
    private final Map<String, List<Symbol>> bridge = new HashMap<>();

    public Map<String, List<Symbol>> getBridge() {
        return bridge;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visit(Program node) {
        for (Statement statement : node.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Body node) {
        for (Statement statement : node.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionStatement node) {
        symbolTable.define(node.getName(), null, null, SymbolKind.FUNCTION, node.getLine(), false);
        symbolTable.enterScope(node.getName());
        for (Parameter parameter : node.getParameters()) {
            parameter.accept(this);
        }
        node.getBody().accept(this);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(DecoratedFunction node) {
        FunctionStatement func = node.getFunctionStatement();
        symbolTable.define(func.getName(), null, null, SymbolKind.FUNCTION, func.getLine(), false);

        for (Decorator decorator : node.getDecorators()) {
            symbolTable.addParameter(func.getName(), decorator.getName().fullName());
        }

        symbolTable.enterScope(func.getName());
        for (Parameter parameter : func.getParameters()) {
            parameter.accept(this);
        }
        func.getBody().accept(this);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(Parameter node) {
        symbolTable.define(node.getParameter(), null, null, SymbolKind.PARAMETER, node.getLine(), false);
        String funcName = symbolTable.currentScope().getName();
        symbolTable.addParameter(funcName, node.getParameter());
        return null;
    }

    @Override
    public Void visit(IfStatement node) {
        node.getCondition().accept(this);
        node.getIfBody().accept(this);
        for (ElseIfStatement elseIfStatement : node.getElseIfStatements()) {
            elseIfStatement.accept(this);
        }
        if (node.getElseBody() != null) {
            node.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ElseIfStatement node) {
        node.getCondition().accept(this);
        node.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(WithStatement node) {
        node.getExpression().accept(this);

        String asName = node.getName();
        if (asName != null) {
            symbolTable.define(asName, null, null, SymbolKind.VARIABLE, node.getLine(), false);
        }

        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AssignStatement node) {
        Expression lhs = node.getLeftExpression();
        Expression rhs = node.getRightExpression();

        if (lhs instanceof NameAtom nameAtom) {
            String type = inferType(rhs);
            String value = inferValue(rhs);

            var existing = symbolTable.lookup(nameAtom.getName());
            boolean isGlobal = existing != null && existing.isGlobal();

            Symbol globalSym = null;
            Symbol localSym;

            if (isGlobal) {
                globalSym = symbolTable.defineInGlobal(nameAtom.getName(), type, value, SymbolKind.VARIABLE, nameAtom.getLine(), true);
                localSym = symbolTable.define(nameAtom.getName(), type, value, SymbolKind.VARIABLE, nameAtom.getLine(), true);
            } else {
                localSym = symbolTable.define(nameAtom.getName(), type, value, SymbolKind.VARIABLE, nameAtom.getLine(), false);
            }

            if (rhs instanceof DictionaryAtom dictAtom) {
                addDictAttributes(localSym, dictAtom);
                if (globalSym != null) {
                    addDictAttributes(globalSym, dictAtom);
                }
            }

        } else {
            lhs.accept(this);
        }
        return null;
    }

    private void addDictAttributes(Symbol parent, DictionaryAtom dictAtom) {
        for (DictionaryEntry entry : dictAtom.getEntries()) {
            if (entry.getKey() instanceof StringAtom keyAtom) {
                String attrName = keyAtom.getValue();
                String attrType = inferType(entry.getValue());
                String attrValue = inferValue(entry.getValue());
                Symbol attrSymbol = new Symbol(attrName, attrType, attrValue, SymbolKind.ATTRIBUTE, dictAtom.getLine(), false);
                parent.addAttribute(attrSymbol);
            }
        }
    }


    @Override
    public Void visit(GlobalStatement node) {
        for (String name : node.getVariables()) {
            symbolTable.defineInGlobal(name, null, null, SymbolKind.VARIABLE, node.getLine(), true);
            symbolTable.define(name, null, null, SymbolKind.VARIABLE, node.getLine(), true);
        }
        return null;
    }

    @Override
    public Void visit(AugmentedPlus node) {
        updateOnAugmentedAssign(node.getLeftExpression(), node.getLine());
        return null;
    }

    @Override
    public Void visit(AugmentedMinus node) {
        updateOnAugmentedAssign(node.getLeftExpression(), node.getLine());
        return null;
    }

    private void updateOnAugmentedAssign(Expression lhs, int line) {
        if (lhs instanceof NameAtom nameAtom) {
            var existing = symbolTable.lookup(nameAtom.getName());
            boolean isGlobal = existing != null && existing.isGlobal();
            String type = existing != null ? existing.getType() : null;

            if (isGlobal) {
                symbolTable.defineInGlobal(nameAtom.getName(), type, null, SymbolKind.VARIABLE, line, true);
                symbolTable.define(nameAtom.getName(), type, null, SymbolKind.VARIABLE, line, true);
            } else {
                symbolTable.define(nameAtom.getName(), type, null, SymbolKind.VARIABLE, line, false);
            }
        }
    }

    @Override
    public Void visit(ReturnStatement node) {
        node.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(SimpleStatement node) {
        node.getStatement().accept(this);
        return null;
    }


    @Override
    public Void visit(NameAtom node) {
        return null;
    }

    @Override
    public Void visit(IntegerAtom node) {
        return null;
    }

    @Override
    public Void visit(FloatAtom node) {
        return null;
    }

    @Override
    public Void visit(StringAtom node) {
        return null;
    }

    @Override
    public Void visit(Decorator node) {
        return null;
    }

    @Override
    public Void visit(DictionaryAtom node) {
        return null;
    }

    @Override
    public Void visit(FalseAtom node) {
        return null;
    }

    @Override
    public Void visit(GroupingAtom node) {
        return null;
    }

    @Override
    public Void visit(ListAtom node) {
        return null;
    }

    @Override
    public Void visit(ListComprehensionAtom node) {
        return null;
    }

    @Override
    public Void visit(NoneAtom node) {
        return null;
    }

    @Override
    public Void visit(TrueAtom node) {
        return null;
    }

    @Override
    public Void visit(CompareEqual node) {
        return null;
    }

    @Override
    public Void visit(CompareGreaterThan node) {
        return null;
    }

    @Override
    public Void visit(CompareGreaterThanEqual node) {
        return null;
    }

    @Override
    public Void visit(CompareIn node) {
        return null;
    }

    @Override
    public Void visit(CompareLessThan node) {
        return null;
    }

    @Override
    public Void visit(CompareLessThanEqual node) {
        return null;
    }

    @Override
    public Void visit(CompareNotEqual node) {
        return null;
    }

    @Override
    public Void visit(CompareNotIn node) {
        return null;
    }

    @Override
    public Void visit(AccessAttributeExpression node) {
        return null;
    }

    @Override
    public Void visit(AccessSubscriptExpression node) {
        return null;
    }

    @Override
    public Void visit(Addition node) {
        return null;
    }

    @Override
    public Void visit(AndExpression node) {
        return null;
    }

    @Override
    public Void visit(AssignExpression node) {
        return null;
    }

    @Override
    public Void visit(Atom node) {
        return null;
    }

    @Override
    public Void visit(CompareExpression node) {
        return null;
    }

    @Override
    public Void visit(Comparision node) {
        return null;
    }

    @Override
    public Void visit(DictionaryEntry node) {
        return null;
    }

    @Override
    public Void visit(Division node) {
        return null;
    }

    @Override
    public Void visit(DottedName node) {
        return null;
    }

    @Override
    public Void visit(Multiplication node) {
        return null;
    }

    @Override
    public Void visit(NotExpression node) {
        return null;
    }

    @Override
    public Void visit(NumbericExpression node) {
        return null;
    }

    @Override
    public Void visit(OrExpression node) {
        return null;
    }

    @Override
    public Void visit(Subtraction node) {
        return null;
    }

    @Override
    public Void visit(ExpressionStatement node) {
        return null;
    }

    @Override
    public Void visit(FromImport node) {

        String module = node.getModule() != null ? node.getModule().fullName() : null;
        List<String> imported = node.getAttribute();
        if (imported != null) {
            for (String name : imported) {
                symbolTable.define(name, "import", module, SymbolKind.IMPORT, node.getLine(), false);
            }
        }
        return null;
    }

    @Override
    public Void visit(PlainImport node) {

        DottedName module = node.getModule();
        if (module != null) {
            String boundName = module.fullName();
            symbolTable.define(boundName, "import", null, SymbolKind.IMPORT, node.getLine(), false);
        }
        return null;
    }

    @Override
    public Void visit(AccessFunctionExpression node) {
        if (node.getObject() instanceof NameAtom nameAtom
                && nameAtom.getName().equals("render_template")) {

            List<Expression> args = node.getArguments();
            if (args.isEmpty() || !(args.get(0) instanceof StringAtom templateNameAtom)) {
                return null;
            }

            String templateName = templateNameAtom.getValue();
            List<Symbol> symbols = new ArrayList<>();
            for (int i = 1; i < args.size(); i++) {
                if (args.get(i) instanceof AssignExpression kwarg) {
                    String jinjaSideName = kwarg.getName();
                    Expression pythonSideValue = kwarg.getValue();

                    if (pythonSideValue instanceof NameAtom valueRef) {
                        Symbol pythonSymbol = symbolTable.lookup(valueRef.getName());
                        if (pythonSymbol == null) {
                            continue;
                        }

                        Symbol newSymbol = new Symbol(jinjaSideName, pythonSymbol.getType(), pythonSymbol.getValue(), pythonSymbol.getKind(), pythonSymbol.getLine(), pythonSymbol.isGlobal());
                        for (Symbol attribute : pythonSymbol.getAttributes()) {
                            newSymbol.addAttribute(attribute);
                        }
                        symbols.add(newSymbol);
                    }
                }
            }

            bridge.put(templateName, symbols);
        }
        return null;
    }

    @Override
    public Void visit(ImportStatement node) {
        return null;
    }

    @Override
    public Void visit(CompoundStatement node) {
        return null;
    }

    @Override
    public Void visit(Expression node) {
        return null;
    }

    @Override
    public Void visit(Node node) {
        return null;
    }

    @Override
    public Void visit(SmallStatement node) {
        return null;
    }

    @Override
    public Void visit(Statement node) {
        return null;
    }

    @Override
    public Void visit(TargetExpression node) {
        return null;
    }

    @Override
    public Void visit(ValueExpression node) {
        return null;
    }

    @Override
    public Void visit(GeneratorAtom node) {
        return null;
    }


    private static String inferType(Expression expr) {
        if (expr instanceof IntegerAtom) return "int";
        if (expr instanceof FloatAtom) return "float";
        if (expr instanceof StringAtom) return "string";
        if (expr instanceof TrueAtom
                || expr instanceof FalseAtom) return "bool";
        if (expr instanceof NoneAtom) return "None";
        if (expr instanceof ListAtom) return "list";
        if (expr instanceof DictionaryAtom) return "dict";
        return null;
    }

    private static String inferValue(Expression expr) {
        if (expr instanceof IntegerAtom a) return String.valueOf(a.getValue());
        if (expr instanceof FloatAtom a) return String.valueOf(a.getValue());
        if (expr instanceof StringAtom a) return a.getValue();
        if (expr instanceof TrueAtom) return "True";
        if (expr instanceof FalseAtom) return "False";
        if (expr instanceof NoneAtom) return "None";
        return null;
    }

}

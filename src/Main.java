import AST.Attribute;
import AST.Program;
import SymbolTable.SymbolTable;
import Visitor.JinjaHtmlVisitor;
import Visitor.PythonVisitor;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
/*
  String source = "Tests/test.txt";
        CharStream input = CharStreams.fromFileName(source);
        PythonIndentLexer lexer = new PythonIndentLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree ast = parser.prog();
        PythonVisitor visitor = new PythonVisitor();
        AST_Python.Program program =(Program) visitor.visit(ast);
        System.out.println(program.print(""));
        SymbolTable table = visitor.getSymbolTable();
        table.print(System.out);




        String test = """
from os.path import exists, join
import json

global x, y

x = 10
y += 5

data = {"a": 1, "b": 2}
nums = [1, 2, 3]
filtered = [n for n in nums if n > 1]

result = (n for n in nums if n != 2)

def foo(a, b):
    if a > b:
        return a
    elif a == b:
        return 0
    else:
        return b

@app.route("/")
def index():
    with open("file.txt") as f:
        content = f.read()
    return content

value = foo(3, 4)

exists_flag = exists("file.txt")

config["key"] = value

obj.attr.method(1, 2, key=value)

check = x > 5 and y < 20 or not False
""";
        CharStream input = CharStreams.fromString(test);

        PythonIndentLexer lexer = new PythonIndentLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

// add error listener so failures are obvious
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("PARSE ERROR at line " + line + ":" + charPositionInLine + " -> " + msg);
            }
        });

        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));


 */
        SymbolTable symbolTable = new SymbolTable();
        for (int i = 1; i<= 4;i++) {
            String source = "Tests/test"+ i+".txt";
            CharStream input = CharStreams.fromFileName(source);
            JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JinjaHtmlParser parser = new JinjaHtmlParser(tokens);
            ParseTree ast = parser.prog();
            JinjaHtmlVisitor visitor = new JinjaHtmlVisitor(symbolTable, i);
            AST.Program program = (Program) visitor.visit(ast);
            System.out.println(program);
            symbolTable = visitor.getSymbolTable();
        }

        symbolTable.print(System.out);

// look

    }
}
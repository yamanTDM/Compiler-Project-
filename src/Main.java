import AST.Program;
import SymbolTable.*;
import Visitor.*;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {


        String source = "Tests/python.txt";
        CharStream input = CharStreams.fromFileName(source);
        PythonIndentLexer lexer = new PythonIndentLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree ast = parser.prog();
        PythonVisitor visitor = new PythonVisitor();
        AST_Python.Program program = (AST_Python.Program) visitor.visit(ast);
        System.out.println(program.print(""));

        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder();
        program.accept(symbolTableBuilder);
        symbolTableBuilder.getSymbolTable().print(System.out);


        Map<String, List< Symbol>> templateBindings = symbolTableBuilder.getBridge();


        processTemplate("index.html", "Tests/index.txt", templateBindings);
        processTemplate("add.html",   "Tests/add.txt", templateBindings);
        processTemplate("detail.html","Tests/details.txt", templateBindings); // renamed from details.txt
    }
    private static void processTemplate(String templateName, String filePath,
                                        Map<String, List<Symbol>> templateBindings) throws IOException {

        Program freshBase = parseJinjaFile("Tests/base.txt");
        Program childTree = parseJinjaFile(filePath);
        Program resolvedTree = TemplateResolver.getFullTree(freshBase, childTree);
        List<Symbol> bindings = templateBindings.get(templateName);

        JinjaSymbolTableBuilder builder = new JinjaSymbolTableBuilder(bindings);


        resolvedTree.accept(builder);

        System.out.println("=== Symbol table for " + templateName + " ===");
        builder.getSymbolTable().print(System.out);
    }

    private static Program parseJinjaFile(String path) throws IOException {
        CharStream input = CharStreams.fromFileName(path);
        JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaHtmlParser parser = new JinjaHtmlParser(tokens);
        ParseTree ast = parser.prog();
        JinjaHtmlVisitor visitor = new JinjaHtmlVisitor();
        return (Program) visitor.visit(ast);
    }
}
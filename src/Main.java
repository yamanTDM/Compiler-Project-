import AST.Program;
import Generation.ContextExtractor;
import Generation.GenerationRunner;
import Generation.HtmlGenerator;
import Generation.RouteExtractor;
import Generation.TemplateContextBuilder;
import SymbolTable.*;
import Visitor.*;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // Set to the folder that actually holds your real app.py / style.css / script.js
    // (the pass-through support files), so the generation phase can copy them into output/.
    private static final String PROJECT_SOURCE_DIR = "Tests";

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

        SemanticChecker semanticChecker = new SemanticChecker(symbolTableBuilder.getSymbolTable());
        program.accept(semanticChecker);
        semanticChecker.printErrors();

        Map<String, List< Symbol>> templateBindings = symbolTableBuilder.getBridge();

        // ---------------- Generation phase ----------------
        // Context Data: resolve module-level Python values (constant folding +
        // a whitelist of safe stdlib patterns like os.path.exists/open/json.load).
        // Deliberately does NOT consult the symbol table beyond reusing its
        // existing render_template(...) bridge to know which names each
        // template expects (per the announcement: generation uses Context
        // Data, not the symbol table used for semantic checks).
        ContextExtractor contextExtractor = new ContextExtractor(PROJECT_SOURCE_DIR);
        contextExtractor.extract(program);

        RouteExtractor routeExtractor = new RouteExtractor();
        routeExtractor.extract(program);

        HtmlGenerator htmlGenerator = new HtmlGenerator(routeExtractor);
        GenerationRunner runner = new GenerationRunner(Path.of("."));

        Map<String, String> jinjaAstDumps = new LinkedHashMap<>();
        Map<String, List<String>> jinjaErrorsByTemplate = new LinkedHashMap<>();

        processTemplate("index.html", "Tests/index.txt", templateBindings,
                contextExtractor, htmlGenerator, runner, jinjaAstDumps, jinjaErrorsByTemplate, null);
        processTemplate("add.html",   "Tests/add.txt", templateBindings,
                contextExtractor, htmlGenerator, runner, jinjaAstDumps, jinjaErrorsByTemplate, null);
        processTemplate("detail.html","Tests/details.txt", templateBindings,
                contextExtractor, htmlGenerator, runner, jinjaAstDumps, jinjaErrorsByTemplate,
                new Generation.DetailFanOutSpec("products", "product", "id", "detail_%s.html")); // renamed from details.txt

        // Pass-through support files: copied unchanged, not analyzed/generated.
        List<String> copyLog = new ArrayList<>();
        runner.copyPassThrough(Path.of(PROJECT_SOURCE_DIR, "python.txt"), copyLog); // rename to app.py yourself if needed
        runner.copyPassThrough(Path.of(PROJECT_SOURCE_DIR, "style.css"), copyLog);
        runner.copyPassThrough(Path.of(PROJECT_SOURCE_DIR, "script.js"), copyLog);

        // compiler_output/
        runner.writePythonAst(program.print(""));
        runner.writeJinjaAst(jinjaAstDumps);
        runner.writeSemanticReport(semanticChecker.getErrors(), jinjaErrorsByTemplate);

        List<String> fullLog = new ArrayList<>();
        fullLog.add("=== Context extraction (Python) ===");
        fullLog.addAll(contextExtractor.log);
        fullLog.add("");
        fullLog.add("=== HTML generation ===");
        fullLog.addAll(htmlGenerator.log);
        fullLog.add("");
        fullLog.add("=== Pass-through files ===");
        fullLog.addAll(copyLog);
        runner.writeGenerationLog(fullLog);
    }

    private static void processTemplate(String templateName, String filePath,
                                        Map<String, List<Symbol>> templateBindings,
                                        ContextExtractor contextExtractor,
                                        HtmlGenerator htmlGenerator,
                                        GenerationRunner runner,
                                        Map<String, String> jinjaAstDumps,
                                        Map<String, List<String>> jinjaErrorsByTemplate,
                                        Generation.DetailFanOutSpec fanOutSpec) throws IOException {

        Program freshBase = parseJinjaFile("Tests/base.txt");
        Program childTree = parseJinjaFile(filePath);
        Program resolvedTree = TemplateResolver.getFullTree(freshBase, childTree);
        List<Symbol> bindings = templateBindings.get(templateName);
        JinjaSymbolTableBuilder builder = new JinjaSymbolTableBuilder(bindings);


        resolvedTree.accept(builder);

        System.out.println("=== Symbol table for " + templateName + " ===");
        builder.getSymbolTable().print(System.out);

        JinjaSemanticChecker jinjaChecker = new JinjaSemanticChecker(builder.getSymbolTable());
        resolvedTree.accept(jinjaChecker);
        jinjaChecker.printErrors(templateName);
        jinjaErrorsByTemplate.put(templateName, jinjaChecker.getErrors());

        // ---- Generation: substitute Context Data into the resolved Jinja AST ----
        Map<String, Object> context = TemplateContextBuilder.build(bindings, contextExtractor.moduleContext);
        String html = htmlGenerator.generate(resolvedTree, context, templateName);
        runner.writeGeneratedPage(templateName, html);
        jinjaAstDumps.put(templateName, resolvedTree.toString());

        // ---- Fan-out: this route's variable is only known per-request (e.g. /product/<id>),
        // but if the underlying list IS resolved (e.g. products.json was found), generate one
        // real static page per item instead of leaving it at a single "not found" placeholder.
        if (fanOutSpec != null) {
            Object listValue = contextExtractor.moduleContext.get(fanOutSpec.listVariableName);
            if (listValue instanceof List<?> items) {
                for (Object item : items) {
                    if (!(item instanceof Map<?, ?> itemMap)) continue;
                    Object key = itemMap.get(fanOutSpec.keyField);
                    Map<String, Object> itemContext = new java.util.HashMap<>(context);
                    itemContext.put(fanOutSpec.itemVariableName, itemMap);
                    String fileName = String.format(fanOutSpec.outputFileNamePattern, String.valueOf(key));
                    String itemHtml = htmlGenerator.generate(resolvedTree, itemContext,
                            templateName + " (" + fanOutSpec.keyField + "=" + key + ")");
                    runner.writeGeneratedPage(fileName, itemHtml);
                    htmlGenerator.log.add("Fan-out: generated " + fileName + " with "
                            + fanOutSpec.itemVariableName + " = " + fanOutSpec.listVariableName
                            + "[" + fanOutSpec.keyField + "=" + key + "]");
                }
            } else {
                htmlGenerator.log.add("Fan-out for " + templateName + " skipped: '"
                        + fanOutSpec.listVariableName + "' is not a resolved list (no products.json?).");
            }
        }
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
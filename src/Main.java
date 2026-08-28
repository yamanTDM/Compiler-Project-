import AST.Program;
import Generation.CollectionLocator;
import Generation.ContextExtractor;
import Generation.GenerationRunner;
import Generation.HtmlGenerator;
import Generation.PageModel;
import Generation.RouteExtractor;
import Generation.TemplateRepository;
import Server.AppServer;
import SymbolTable.Symbol;
import Visitor.JinjaHtmlVisitor;
import Visitor.JinjaSemanticChecker;
import Visitor.JinjaSymbolTableBuilder;
import Visitor.PythonVisitor;
import Visitor.SemanticChecker;
import Visitor.SymbolTableBuilder;
import antlr.JinjaHtmlLexer;
import antlr.JinjaHtmlParser;
import antlr.PythonIndentLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Path DEFAULT_INPUT_DIR = Path.of("Tests");

    public static void main(String[] args) throws IOException {


        List<String> positional = new ArrayList<>();
        boolean serve = false;
        int port = 8080;
        for (String arg : args) {
            if ("--serve".equals(arg)) {
                serve = true;
            } else if (arg.startsWith("--port=")) {
                serve = true;
                port = Integer.parseInt(arg.substring("--port=".length()));
            } else {
                positional.add(arg);
            }
        }

        Path inputDir = positional.size() >= 1 ? Path.of(positional.get(0)) : DEFAULT_INPUT_DIR;
        Path projectRoot = positional.size() >= 2 ? Path.of(positional.get(1)) : Path.of(".");
        CompilationResult result = compile(inputDir, projectRoot, true);

        if (serve) {
            AppServer server = new AppServer(
                    result.outputDir(),
                    result.htmlGenerator(),
                    result.pageModels(),
                    result.baseContext(),
                    result.productsKey(),
                    result.initialProducts(),
                    port);
            server.start();
            System.out.println();
            System.out.println("Java action server running at http://localhost:" + port + "/");
        }
    }

    public static CompilationResult compile(Path inputDir, Path projectRoot, boolean verbose) throws IOException {
        Path normalizedInput = inputDir.toAbsolutePath().normalize();
        Path normalizedRoot = projectRoot.toAbsolutePath().normalize();
        validateInput(normalizedInput);
        validateLayout(normalizedInput, normalizedRoot);

        Path pythonSource = discoverPythonSource(normalizedInput);
        AST_Python.Program pythonProgram = parsePythonFile(pythonSource);

        if (verbose) {
            System.out.println("=== Python AST: " + pythonSource + " ===");
            System.out.println(pythonProgram.print(""));
        }

        SymbolTableBuilder pythonSymbols = new SymbolTableBuilder();
        pythonProgram.accept(pythonSymbols);
        if (verbose) {
            System.out.println("=== Python symbol table ===");
            pythonSymbols.getSymbolTable().print(System.out);
        }

        SemanticChecker pythonChecker = new SemanticChecker(pythonSymbols.getSymbolTable());
        pythonProgram.accept(pythonChecker);
        if (verbose) pythonChecker.printErrors();

        Map<String, List<Symbol>> templateBindings = pythonSymbols.getBridge();

        ContextExtractor contextExtractor = new ContextExtractor(normalizedInput.toString());
        contextExtractor.extract(pythonProgram);

        RouteExtractor routes = new RouteExtractor();
        routes.extract(pythonProgram);

        TemplateRepository templates = TemplateRepository.discover(
                normalizedInput, templateBindings.keySet(), Main::parseJinjaFile);


        GenerationRunner runner = new GenerationRunner(normalizedRoot);
        runner.resetOutputDirectories();

        List<String> copyLog = new ArrayList<>();
        runner.copyInputTree(normalizedInput, copyLog);
        runner.ensurePythonAppAlias(pythonSource, copyLog);

        HtmlGenerator htmlGenerator = new HtmlGenerator(routes);
        Map<String, String> jinjaAstDumps = new LinkedHashMap<>();
        Map<String, List<String>> jinjaErrorsByTemplate = new LinkedHashMap<>();
        List<String> generatedPages = new ArrayList<>();
        List<PageModel> pageModels = new ArrayList<>();

        for (TemplateRepository.Entry entry : templates.entries()) {
            TemplateRepository.Resolution resolution = templates.resolve(entry);
            processTemplate(
                    entry,
                    resolution,
                    templateBindings,
                    contextExtractor,
                    routes,
                    htmlGenerator,
                    runner,
                    jinjaAstDumps,
                    jinjaErrorsByTemplate,
                    generatedPages,
                    pageModels,
                    verbose);
        }

        String productsKey = CollectionLocator.findInitialCollectionKey(contextExtractor.moduleContext);
        Object initialProducts = CollectionLocator.findInitialCollection(contextExtractor.moduleContext);

        runner.writePythonAst(pythonProgram.print(""));
        runner.writeJinjaAst(jinjaAstDumps);
        runner.writeSemanticReport(pythonChecker.getErrors(), jinjaErrorsByTemplate);

        List<String> fullLog = new ArrayList<>();
        fullLog.add("=== Compiler input ===");
        fullLog.add("Input directory: " + normalizedInput);
        fullLog.add("Python source: " + pythonSource);
        fullLog.add("Templates discovered: " + templates.entries().size());
        for (TemplateRepository.Entry entry : templates.entries()) {
            fullLog.add("  " + entry.source() + " -> template '" + entry.templateName()
                    + "' -> " + entry.outputName());
        }
        fullLog.add("");
        fullLog.add("=== Context extraction (Python) ===");
        fullLog.add("Generator context source: Python AST ContextExtractor only.");
        fullLog.addAll(contextExtractor.log);
        fullLog.add("");
        fullLog.add("=== HTML generation ===");
        fullLog.addAll(htmlGenerator.log);
        fullLog.add("");
        fullLog.add("=== Generated pages ===");
        fullLog.addAll(generatedPages);
        fullLog.add("");
        fullLog.add("=== Copied input files ===");
        fullLog.addAll(copyLog);
        fullLog.add("");

        runner.writeGenerationLog(fullLog);

        System.out.println();
        System.out.println("Compilation completed successfully.");
        System.out.println("Generated site: " + runner.getOutputDir());
        System.out.println("Compiler reports: " + runner.getCompilerOutputDir());

        return new CompilationResult(
                runner.getOutputDir(),
                runner.getCompilerOutputDir(),
                List.copyOf(generatedPages),
                List.copyOf(pythonChecker.getErrors()),
                Map.copyOf(jinjaErrorsByTemplate),
                List.copyOf(pageModels),
                htmlGenerator,
                routes,
                new LinkedHashMap<>(contextExtractor.moduleContext),
                productsKey,
                initialProducts);
    }

    private static void processTemplate(
            TemplateRepository.Entry entry,
            TemplateRepository.Resolution resolution,
            Map<String, List<Symbol>> templateBindings,
            ContextExtractor contextExtractor,
            RouteExtractor routes,
            HtmlGenerator htmlGenerator,
            GenerationRunner runner,
            Map<String, String> jinjaAstDumps,
            Map<String, List<String>> jinjaErrorsByTemplate,
            List<String> generatedPages,
            List<PageModel> pageModels,
            boolean verbose) throws IOException {

        Program resolvedTree = resolution.program();
        List<Symbol> bindings = templateBindings.get(entry.templateName());
        JinjaSymbolTableBuilder builder = new JinjaSymbolTableBuilder(bindings);
        resolvedTree.accept(builder);

        if (verbose) {
            System.out.println("=== Jinja symbol table: " + entry.outputName() + " ===");
            builder.getSymbolTable().print(System.out);
        }

        JinjaSemanticChecker checker = new JinjaSemanticChecker(builder.getSymbolTable());
        resolvedTree.accept(checker);
        List<String> templateErrors = new ArrayList<>(resolution.errors());
        templateErrors.addAll(checker.getErrors());
        if (verbose) checker.printErrors(entry.outputName());
        jinjaErrorsByTemplate.put(entry.outputName(), templateErrors);


        Map<String, Object> context = new HashMap<>(contextExtractor.moduleContext);
        String html = htmlGenerator.generate(resolvedTree, new HashMap<>(context), entry.outputName());
        runner.writeGeneratedPage(entry.outputName(), html);
        generatedPages.add(entry.outputName());
        jinjaAstDumps.put(entry.outputName(), resolvedTree.toString());

        FanOutPlan fanOut = inferFanOut(entry.outputName(), contextExtractor.moduleContext, routes);
        pageModels.add(fanOut == null
                ? new PageModel(entry.outputName(), resolvedTree, null, null, null, null)
                : new PageModel(
                        entry.outputName(),
                        resolvedTree,
                        fanOut.endpoint(),
                        fanOut.collectionName(),
                        fanOut.itemName(),
                        fanOut.keyField()));
        if (fanOut == null) return;

        Object rawItems = contextExtractor.moduleContext.get(fanOut.collectionName());
        if (!(rawItems instanceof List<?> items)) return;

        for (Object item : items) {
            if (!(item instanceof Map<?, ?> itemMap)) continue;
            Object key = itemMap.get(fanOut.keyField());
            if (key == null) continue;

            Map<String, Object> itemContext = new HashMap<>(context);
            itemContext.put(fanOut.itemName(), itemMap);

            Map<String, String> urlValues = Map.of(fanOut.keyField(), String.valueOf(key));
            String fileName = routes.buildUrl(fanOut.endpoint(), urlValues);
            String itemHtml = htmlGenerator.generate(
                    resolvedTree,
                    itemContext,
                    entry.outputName() + " (" + fanOut.keyField() + "=" + key + ")");
            runner.writeGeneratedPage(fileName, itemHtml);
            generatedPages.add(fileName);
            htmlGenerator.log.add("Fan-out: generated " + fileName + " from "
                    + fanOut.collectionName() + " where " + fanOut.keyField() + "=" + key + ".");
        }
    }

    private static FanOutPlan inferFanOut(
            String templateName,
            Map<String, Object> moduleContext,
            RouteExtractor routes) {

        String endpoint = routes.endpointForOutput(templateName);
        if (endpoint == null) return null;

        List<String> parameters = routes.dynamicParameters(endpoint);
        if (parameters.isEmpty()) return null;
        String keyField = parameters.getFirst();

        for (Map.Entry<String, Object> candidate : moduleContext.entrySet()) {
            if (!(candidate.getValue() instanceof List<?> list) || list.isEmpty()) continue;
            Object first = list.getFirst();
            if (!(first instanceof Map<?, ?> firstMap) || !firstMap.containsKey(keyField)) continue;
            return new FanOutPlan(
                    endpoint, candidate.getKey(), singular(candidate.getKey()), keyField);
        }
        return null;
    }

    private static String singular(String value) {
        if (value != null && value.length() > 3 && value.endsWith("s")) {
            return value.substring(0, value.length() - 1);
        }
        return value;
    }

    private static void validateInput(Path inputDir) throws IOException {
        if (!Files.isDirectory(inputDir)) {
            throw new IOException("Input directory does not exist: " + inputDir);
        }
    }

    private static void validateLayout(Path inputDir, Path projectRoot) throws IOException {
        Path output = projectRoot.resolve("output").normalize();
        Path reports = projectRoot.resolve("compiler_output").normalize();
        if (inputDir.startsWith(output) || output.startsWith(inputDir)
                || inputDir.startsWith(reports) || reports.startsWith(inputDir)) {
            throw new IOException("Unsafe directory layout: input must not contain, or be contained by, "
                    + "the generated output directories. Input=" + inputDir + ", projectRoot=" + projectRoot);
        }
    }

    private static Path discoverPythonSource(Path inputDir) throws IOException {
        List<Path> candidates;
        try (var stream = Files.list(inputDir)) {
            candidates = stream
                    .filter(Files::isRegularFile)
                    .filter(path -> {
                        String name = path.getFileName().toString().toLowerCase();
                        return name.endsWith(".py") || name.equals("python.txt");
                    })
                    .sorted((a, b) -> scorePythonName(a).compareTo(scorePythonName(b)))
                    .toList();
        }
        if (candidates.isEmpty()) {
            throw new IOException("No Python source found in " + inputDir
                    + " (expected a .py file or python.txt).");
        }
        return candidates.getFirst();
    }

    private static String scorePythonName(Path path) {
        String name = path.getFileName().toString().toLowerCase();
        if (name.equals("app.py")) return "0";
        if (name.endsWith(".py")) return "1" + name;
        return "2" + name;
    }

    private static AST_Python.Program parsePythonFile(Path path) throws IOException {
        CharStream input = CharStreams.fromPath(path);
        PythonIndentLexer lexer = new PythonIndentLexer(input);
        SyntaxErrors errors = new SyntaxErrors(path);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errors);

        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errors);
        ParseTree parseTree = parser.prog();
        errors.throwIfAny();

        PythonVisitor visitor = new PythonVisitor();
        return (AST_Python.Program) visitor.visit(parseTree);
    }

    private static Program parseJinjaFile(Path path) throws IOException {
        CharStream input = CharStreams.fromPath(path);
        JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
        SyntaxErrors errors = new SyntaxErrors(path);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errors);

        JinjaHtmlParser parser = new JinjaHtmlParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errors);
        ParseTree parseTree = parser.prog();
        errors.throwIfAny();

        JinjaHtmlVisitor visitor = new JinjaHtmlVisitor();
        return (Program) visitor.visit(parseTree);
    }

    private record FanOutPlan(
            String endpoint,
            String collectionName,
            String itemName,
            String keyField) {
    }

    public record CompilationResult(
            Path outputDir,
            Path compilerOutputDir,
            List<String> generatedPages,
            List<String> pythonSemanticErrors,
            Map<String, List<String>> jinjaSemanticErrors,
            List<PageModel> pageModels,
            HtmlGenerator htmlGenerator,
            RouteExtractor routes,
            Map<String, Object> baseContext,
            String productsKey,
            Object initialProducts) {
    }

    private static final class SyntaxErrors extends BaseErrorListener {
        private final Path source;
        private final List<String> errors = new ArrayList<>();

        private SyntaxErrors(Path source) {
            this.source = source;
        }

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String message,
                RecognitionException exception) {
            errors.add("line " + line + ":" + charPositionInLine + " " + message);
        }

        private void throwIfAny() throws IOException {
            if (!errors.isEmpty()) {
                throw new IOException("Syntax errors in " + source + System.lineSeparator()
                        + String.join(System.lineSeparator(), errors));
            }
        }
    }
}

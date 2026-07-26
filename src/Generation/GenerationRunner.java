package Generation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GenerationRunner {

    private static final Pattern ANSI = Pattern.compile("\u001B\\[[;\\d]*m");

    private final Path outputDir;
    private final Path compilerOutputDir;

    public GenerationRunner(Path projectRoot) throws IOException {
        this.outputDir = projectRoot.resolve("output");
        this.compilerOutputDir = projectRoot.resolve("compiler_output");
        Files.createDirectories(outputDir);
        Files.createDirectories(compilerOutputDir);
    }

    /** Writes one generated HTML page. */
    public void writeGeneratedPage(String templateFileName, String html) throws IOException {
        Files.writeString(outputDir.resolve(templateFileName), html, StandardCharsets.UTF_8);
    }

    /** Copies a pass-through support file (app.py, style.css, script.js) unchanged, if it exists. */
    public void copyPassThrough(Path sourceFile, List<String> log) throws IOException {
        if (sourceFile == null || !Files.exists(sourceFile)) {
            if (sourceFile != null) {
                log.add("Pass-through file not found, skipped: " + sourceFile);
            }
            return;
        }
        Files.copy(sourceFile, outputDir.resolve(sourceFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        log.add("Copied pass-through file unchanged: " + sourceFile.getFileName());
    }

    public void writePythonAst(String rawPrint) throws IOException {
        String clean = stripAnsi(rawPrint);
        String json = "{\n  \"ast_dump\": \"" + MiniJson.escape(clean) + "\"\n}\n";
        Files.writeString(compilerOutputDir.resolve("ast_python.json"), json, StandardCharsets.UTF_8);
    }

    public void writeJinjaAst(Map<String, String> rawPrintByTemplate) throws IOException {
        StringBuilder sb = new StringBuilder("{\n");
        int i = 0;
        for (Map.Entry<String, String> e : rawPrintByTemplate.entrySet()) {
            sb.append("  \"").append(MiniJson.escape(e.getKey())).append("\": \"")
              .append(MiniJson.escape(stripAnsi(e.getValue()))).append('"');
            if (++i < rawPrintByTemplate.size()) sb.append(',');
            sb.append('\n');
        }
        sb.append("}\n");
        Files.writeString(compilerOutputDir.resolve("ast_jinja.json"), sb.toString(), StandardCharsets.UTF_8);
    }

    public void writeSemanticReport(List<String> pythonErrors, Map<String, List<String>> jinjaErrorsByTemplate) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Python semantic check ===\n");
        if (pythonErrors.isEmpty()) {
            sb.append("No errors found.\n");
        } else {
            for (String e : pythonErrors) sb.append(e).append('\n');
        }
        for (Map.Entry<String, List<String>> entry : jinjaErrorsByTemplate.entrySet()) {
            sb.append("\n=== Jinja semantic check: ").append(entry.getKey()).append(" ===\n");
            if (entry.getValue().isEmpty()) {
                sb.append("No errors found.\n");
            } else {
                for (String e : entry.getValue()) sb.append(e).append('\n');
            }
        }
        Files.writeString(compilerOutputDir.resolve("semantic_report.txt"), sb.toString(), StandardCharsets.UTF_8);
    }

    public void writeGenerationLog(List<String> lines) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) sb.append(line).append('\n');
        Files.writeString(compilerOutputDir.resolve("generation_log.txt"), sb.toString(), StandardCharsets.UTF_8);
    }

    private static String stripAnsi(String s) {
        return ANSI.matcher(s).replaceAll("");
    }

    public static Map<String, Object> newOrderedMap() {
        return new LinkedHashMap<>();
    }
}

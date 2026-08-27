package Generation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GenerationRunner {

    private static final Pattern ANSI = Pattern.compile("\u001B\\[[;\\d]*m");

    private final Path outputDir;
    private final Path compilerOutputDir;

    public GenerationRunner(Path projectRoot) throws IOException {
        Path normalizedRoot = projectRoot.toAbsolutePath().normalize();
        this.outputDir = normalizedRoot.resolve("output");
        this.compilerOutputDir = normalizedRoot.resolve("compiler_output");
        Files.createDirectories(outputDir);
        Files.createDirectories(compilerOutputDir);
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public Path getCompilerOutputDir() {
        return compilerOutputDir;
    }


    public void resetOutputDirectories() throws IOException {
        recreateGeneratedDirectory(outputDir, "output");
        recreateGeneratedDirectory(compilerOutputDir, "compiler_output");
    }

    private static void recreateGeneratedDirectory(Path directory, String requiredName) throws IOException {
        Path normalized = directory.toAbsolutePath().normalize();
        if (normalized.getFileName() == null
                || !requiredName.equals(normalized.getFileName().toString())) {
            throw new IOException("Refusing to clean an unsafe generated directory: " + normalized);
        }
        if (Files.exists(normalized)) {
            try (var paths = Files.walk(normalized)) {
                for (Path path : paths.sorted(Comparator.reverseOrder()).toList()) {
                    Files.delete(path);
                }
            }
        }
        Files.createDirectories(normalized);
    }

    public void writeGeneratedPage(String templateFileName, String html) throws IOException {
        Path target = safeOutputPath(templateFileName);
        if (target.getParent() != null) Files.createDirectories(target.getParent());
        Files.writeString(target, html, StandardCharsets.UTF_8);
    }


    public void copyInputTree(Path inputDir, List<String> log) throws IOException {
        Path normalizedInput = inputDir.toAbsolutePath().normalize();
        try (var paths = Files.walk(normalizedInput)) {
            for (Path source : paths.sorted().toList()) {
                Path relative = normalizedInput.relativize(source);
                if (relative.toString().isEmpty()) continue;
                Path target = outputDir.resolve(relative).normalize();
                if (!target.startsWith(outputDir)) {
                    throw new IOException("Unsafe input path while copying: " + relative);
                }
                if (Files.isDirectory(source)) {
                    Files.createDirectories(target);
                } else if (Files.isRegularFile(source)) {
                    if (target.getParent() != null) Files.createDirectories(target.getParent());
                    Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING,
                            StandardCopyOption.COPY_ATTRIBUTES);
                    log.add(relative.toString().replace('\\', '/'));
                }
            }
        }
    }


    public void ensurePythonAppAlias(Path pythonSource, List<String> log) throws IOException {
        if (pythonSource.getFileName().toString().equalsIgnoreCase("app.py")) return;
        Path target = safeOutputPath("app.py");
        Files.copy(pythonSource, target, StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES);
        log.add("app.py (unchanged alias of " + pythonSource.getFileName() + ")");
    }

    public void writePythonAst(String rawPrint) throws IOException {
        String clean = stripAnsi(rawPrint);
        String json = "{\n  \"ast_dump\": \"" + MiniJson.escape(clean) + "\"\n}\n";
        writeReport("ast_python.json", json);
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
        writeReport("ast_jinja.json", sb.toString());
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
        writeReport("semantic_report.txt", sb.toString());
    }

    public void writeGenerationLog(List<String> lines) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) sb.append(line).append('\n');
        writeReport("generation_log.txt", sb.toString());
    }

    private static String stripAnsi(String s) {
        return ANSI.matcher(s).replaceAll("");
    }

    public static Map<String, Object> newOrderedMap() {
        return new LinkedHashMap<>();
    }

    private Path safeOutputPath(String relativeName) throws IOException {
        Path target = outputDir.resolve(relativeName).normalize();
        if (!target.startsWith(outputDir)) {
            throw new IOException("Generated path escapes output directory: " + relativeName);
        }
        return target;
    }

    private void writeReport(String fileName, String content) throws IOException {
        Files.writeString(compilerOutputDir.resolve(fileName), content, StandardCharsets.UTF_8);
    }
}

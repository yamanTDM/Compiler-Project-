package Generation;

import AST.JinjaInheritance;
import AST.Node;
import AST.Program;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Discovers all Jinja templates and resolves their inheritance graph without
 * hard-coded base/child file names.
 */
public final class TemplateRepository {

    @FunctionalInterface
    public interface Parser {
        Program parse(Path path) throws IOException;
    }

    public record Entry(Path source, String templateName, String outputName) {
    }

    public record Resolution(Program program, List<String> errors) {
    }

    private final List<Entry> entries;
    private final Map<String, Entry> byOutputName;
    private final Parser parser;

    private TemplateRepository(List<Entry> entries, Parser parser) {
        this.entries = List.copyOf(entries);
        this.parser = parser;
        this.byOutputName = new LinkedHashMap<>();
        for (Entry entry : entries) {
            byOutputName.put(normalizePath(entry.outputName()), entry);
            byOutputName.put(normalizePath(entry.templateName()), entry);
        }
    }

    public static TemplateRepository discover(
            Path inputDir,
            Set<String> renderedTemplateNames,
            Parser parser) throws IOException {

        Path templatesDir = Files.isDirectory(inputDir.resolve("templates"))
                ? inputDir.resolve("templates")
                : inputDir;

        List<Path> sources;
        try (var stream = Files.walk(templatesDir)) {
            sources = stream
                    .filter(Files::isRegularFile)
                    .filter(TemplateRepository::hasTemplateExtension)
                    .filter(TemplateRepository::looksLikeTemplate)
                    .sorted()
                    .toList();
        }
        if (sources.isEmpty()) {
            throw new IOException("No Jinja/HTML templates found under " + templatesDir);
        }

        List<String> renderNames = renderedTemplateNames.stream()
                .map(TemplateRepository::normalizePath)
                .sorted()
                .toList();
        Set<String> claimedRenderNames = new LinkedHashSet<>();
        List<Entry> entries = new ArrayList<>();

        for (Path source : sources) {
            Path relative = templatesDir.relativize(source);
            String relativeName = normalizePath(relative.toString());
            String defaultTemplateName = relativeName.toLowerCase(Locale.ROOT).endsWith(".txt")
                    ? replaceExtension(relativeName, ".html")
                    : relativeName;
            String matched = bestRenderName(defaultTemplateName, renderNames, claimedRenderNames);
            String templateName = matched != null ? matched : defaultTemplateName;
            String outputName = replaceExtension(templateName, ".html");
            if (matched != null) claimedRenderNames.add(matched);
            entries.add(new Entry(source, templateName, outputName));
        }

        entries.sort(Comparator.comparing(Entry::outputName));
        return new TemplateRepository(entries, parser);
    }

    public List<Entry> entries() {
        return entries;
    }

    public Resolution resolve(Entry entry) throws IOException {
        List<String> errors = new ArrayList<>();
        Program program = resolve(entry, new LinkedHashSet<>(), errors);
        return new Resolution(program, List.copyOf(errors));
    }

    private Program resolve(Entry entry, Set<String> chain, List<String> errors) throws IOException {
        String key = normalizePath(entry.templateName());
        if (!chain.add(key)) {
            errors.add("Template inheritance cycle detected: "
                    + String.join(" -> ", chain) + " -> " + key);
            return parser.parse(entry.source());
        }

        Program child = parser.parse(entry.source());
        JinjaInheritance inheritance = findInheritance(child);
        if (inheritance == null) {
            chain.remove(key);
            return child;
        }

        String parentName = unquote(inheritance.getInheritance());
        Entry parent = findParent(entry, parentName);
        if (parent == null) {
            errors.add("Line " + inheritance.getLine() + ": inherited template '"
                    + parentName + "' was not found for " + entry.outputName() + ".");
            chain.remove(key);
            return child;
        }

        Program resolvedParent = resolve(parent, chain, errors);
        chain.remove(key);
        return TemplateResolver.getFullTree(resolvedParent, child);
    }

    private Entry findParent(Entry child, String rawParentName) {
        String parentName = normalizePath(rawParentName);
        Entry exact = byOutputName.get(parentName);
        if (exact != null) return exact;

        String childPrefix = "";
        int slash = child.outputName().lastIndexOf('/');
        if (slash >= 0) childPrefix = child.outputName().substring(0, slash + 1);
        exact = byOutputName.get(normalizePath(childPrefix + parentName));
        if (exact != null) return exact;

        String parentStem = normalizedStem(parentName);
        for (Entry candidate : entries) {
            if (normalizedStem(candidate.templateName()).equals(parentStem)
                    || normalizedStem(candidate.outputName()).equals(parentStem)) return candidate;
        }
        return null;
    }

    private static JinjaInheritance findInheritance(Program program) {
        for (Node child : program.getChildrenSearch()) {
            JinjaInheritance found = findInheritance(child);
            if (found != null) return found;
        }
        return null;
    }

    private static JinjaInheritance findInheritance(Node node) {
        if (node instanceof JinjaInheritance inheritance) return inheritance;
        for (Node child : node.getChildrenSearch()) {
            JinjaInheritance found = findInheritance(child);
            if (found != null) return found;
        }
        return null;
    }

    private static String bestRenderName(
            String defaultName,
            List<String> renderNames,
            Set<String> claimed) {

        for (String name : renderNames) {
            if (!claimed.contains(name) && name.equalsIgnoreCase(defaultName)) return name;
        }

        String defaultStem = normalizedStem(defaultName);
        for (String name : renderNames) {
            if (!claimed.contains(name) && normalizedStem(name).equals(defaultStem)) return name;
        }
        return null;
    }

    private static String normalizedStem(String name) {
        String normalized = normalizePath(name).toLowerCase(Locale.ROOT);
        int slash = normalized.lastIndexOf('/');
        if (slash >= 0) normalized = normalized.substring(slash + 1);
        int dot = normalized.lastIndexOf('.');
        if (dot >= 0) normalized = normalized.substring(0, dot);
        normalized = normalized.replace("-", "").replace("_", "");
        if (normalized.length() > 3 && normalized.endsWith("s")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private static boolean hasTemplateExtension(Path path) {
        String name = path.getFileName().toString().toLowerCase(Locale.ROOT);
        return name.endsWith(".html")
                || name.endsWith(".htm")
                || name.endsWith(".jinja")
                || name.endsWith(".jinja2")
                || name.endsWith(".j2")
                || name.endsWith(".txt");
    }

    private static boolean looksLikeTemplate(Path path) {
        String name = path.getFileName().toString().toLowerCase(Locale.ROOT);
        if (!name.endsWith(".txt")) return true;
        try {
            String text = Files.readString(path, StandardCharsets.UTF_8);
            return text.contains("<") || text.contains("{{") || text.contains("{%");
        } catch (IOException ignored) {
            return false;
        }
    }

    private static String replaceExtension(String name, String extension) {
        int slash = name.lastIndexOf('/');
        int dot = name.lastIndexOf('.');
        if (dot > slash) return name.substring(0, dot) + extension;
        return name + extension;
    }

    private static String unquote(String raw) {
        if (raw == null) return "";
        String value = raw.trim();
        if (value.length() >= 2
                && ((value.startsWith("\"") && value.endsWith("\""))
                || (value.startsWith("'") && value.endsWith("'")))) {
            return value.substring(1, value.length() - 1);
        }
        return value;
    }

    private static String normalizePath(String value) {
        return value.replace('\\', '/');
    }
}

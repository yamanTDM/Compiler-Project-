package Server;

import Generation.HtmlGenerator;
import Generation.PageModel;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;


public final class AppServer {

    private final Path outputDir;
    private final HtmlGenerator htmlGenerator;
    private final List<PageModel> pageModels;
    private final Map<String, PageModel> pageModelsByOutput = new LinkedHashMap<>();
    private final Map<String, Object> baseContext;
    private final String productsKey;
    private final ProductStore productStore;
    private final int port;

    private HttpServer server;

    public AppServer(
            Path outputDir,
            HtmlGenerator htmlGenerator,
            List<PageModel> pageModels,
            Map<String, Object> baseContext,
            String productsKey,
            Object initialProducts,
            int port) {
        this.outputDir = outputDir.toAbsolutePath().normalize();
        this.htmlGenerator = htmlGenerator;
        this.pageModels = pageModels;
        this.baseContext = baseContext;
        this.productsKey = productsKey;
        this.port = port;
        for (PageModel model : pageModels) {
            pageModelsByOutput.put(normalize(model.outputName()), model);
        }
        Path persistPath = this.outputDir.resolve("data/products.json");
        this.productStore = new ProductStore(initialProducts, persistPath);
    }

    public void start() throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new RootHandler());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    public void stop() {
        if (server != null) server.stop(0);
    }

    public int getPort() {
        return port;
    }

    private final class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                String method = exchange.getRequestMethod();
                if ("POST".equalsIgnoreCase(method)) {
                    handleAction(exchange);
                } else if ("GET".equalsIgnoreCase(method) || "HEAD".equalsIgnoreCase(method)) {
                    handleGet(exchange);
                } else {
                    sendPlain(exchange, 405, "Method not allowed");
                }
            } catch (Exception e) {
                sendPlain(exchange, 500, "Internal server error: " + e.getMessage());
            }
        }
    }

    private void handleGet(HttpExchange exchange) throws IOException {
        URI uri = exchange.getRequestURI();
        String path = uri.getPath();
        String relative = "/".equals(path) ? "index.html" : path.substring(1);
        relative = URLDecoder.decode(relative, StandardCharsets.UTF_8).replace('\\', '/');

        PageModel exact = pageModelsByOutput.get(normalize(relative));
        if (exact != null) {
            serveDynamic(exchange, exact, uri.getRawQuery(), null);
            return;
        }

        PageModel fanOut = findFanOutModel(relative);
        if (fanOut != null) {
            String idPart = extractIdPart(relative, fanOut);
            serveDynamic(exchange, fanOut, uri.getRawQuery(), idPart);
            return;
        }

        serveStaticFile(exchange, relative);
    }

    private void serveDynamic(HttpExchange exchange, PageModel model, String rawQuery, String idPart) throws IOException {
        String keyValue = idPart;
        if (keyValue == null && model.fanOutKeyField() != null) {
            Map<String, String> query = parseQuery(rawQuery);
            keyValue = query.get(model.fanOutKeyField());
            if (keyValue == null) keyValue = query.get("compiler_id");
        }
        String html = renderPage(model, keyValue);
        sendHtml(exchange, 200, html);
    }


    private String renderPage(PageModel model, String keyValue) {
        Map<String, Object> context = new LinkedHashMap<>(baseContext);
        List<Map<String, Object>> liveProducts = productStore.list();
        if (productsKey != null) {
            context.put(productsKey, liveProducts);
        }
        if (model.fanOutKeyField() != null) {
            Map<String, Object> match = null;
            if (keyValue != null) {
                for (Map<String, Object> product : liveProducts) {
                    String actual = String.valueOf(product.get(model.fanOutKeyField()));
                    if (actual.equals(keyValue) || safeFilePart(actual).equals(keyValue)) {
                        match = product;
                        break;
                    }
                }
            }
            context.put(model.fanOutItemName(), match);
        }
        return htmlGenerator.generate(model.resolvedTree(), context, model.outputName());
    }

    private void serveStaticFile(HttpExchange exchange, String relative) throws IOException {
        Path target = outputDir.resolve(relative).normalize();
        if (!target.startsWith(outputDir) || !Files.isRegularFile(target)) {
            sendPlain(exchange, 404, "Not found: " + relative);
            return;
        }
        byte[] bytes = Files.readAllBytes(target);
        exchange.getResponseHeaders().set("Content-Type", contentTypeFor(relative));
        exchange.sendResponseHeaders(200, bytes.length);
        try (OutputStream body = exchange.getResponseBody()) {
            body.write(bytes);
        }
    }


    private void handleAction(HttpExchange exchange) throws IOException {
        Map<String, String> fields = new LinkedHashMap<>(parseQuery(exchange.getRequestURI().getRawQuery()));
        String contentType = exchange.getRequestHeaders().getFirst("Content-Type");
        byte[] body = exchange.getRequestBody().readAllBytes();

        if (contentType != null && contentType.toLowerCase().startsWith("multipart/form-data")) {
            String boundary = MultipartParser.extractBoundary(contentType);
            MultipartParser.Result parsed = MultipartParser.parse(body, boundary);
            fields.putAll(parsed.fields());
            MultipartParser.FilePart file = parsed.files().get("image");
            if (file == null && !parsed.files().isEmpty()) {
                file = parsed.files().values().iterator().next();
            }
            handleAdd(fields, file);
        } else {
            if (body.length > 0) {
                fields.putAll(parseQuery(new String(body, StandardCharsets.UTF_8)));
            }
            handleDelete(fields);
        }
        redirectBack(exchange);
    }

    private void handleAdd(Map<String, String> fields, MultipartParser.FilePart file) throws IOException {
        String name = fields.getOrDefault("name", "");
        String price = fields.getOrDefault("price", "");
        String description = fields.getOrDefault("description", fields.getOrDefault("details", ""));
        String image = "";
        if (file != null && file.filename() != null && !file.filename().isBlank() && file.data().length > 0) {
            image = saveUpload(file);
        }
        Map<String, Object> product = productStore.add(name, price, description, image);
        writeStaticSnapshot(String.valueOf(product.get("id")), false);
    }

    private void handleDelete(Map<String, String> fields) throws IOException {
        String id = fields.get("id");
        if (id == null) {
            for (String value : fields.values()) {
                id = value;
                break;
            }
        }
        boolean removed = id != null && productStore.remove(id);
        writeStaticSnapshot(removed ? id : null, true);
    }


    private void writeStaticSnapshot(String changedProductId, boolean removed) throws IOException {
        for (PageModel model : pageModels) {
            if (model.fanOutKeyField() == null) {
                writeOutputFile(model.outputName(), renderPage(model, null));
                continue;
            }
            if (changedProductId == null) continue;
            if (!Objects.equals(model.fanOutCollectionKey(), productsKey)) continue;

            String fileName = stripHtml(model.outputName()) + "_" + safeFilePart(changedProductId) + ".html";
            if (removed) {
                deleteOutputFileIfExists(fileName);
            } else {
                writeOutputFile(fileName, renderPage(model, changedProductId));
            }
        }
    }

    private void writeOutputFile(String relativeName, String html) throws IOException {
        Path target = outputDir.resolve(relativeName).normalize();
        if (target.getParent() != null) Files.createDirectories(target.getParent());
        Files.writeString(target, html, StandardCharsets.UTF_8);
    }

    private void deleteOutputFileIfExists(String relativeName) throws IOException {
        Files.deleteIfExists(outputDir.resolve(relativeName).normalize());
    }

    private String saveUpload(MultipartParser.FilePart file) throws IOException {
        Path uploads = outputDir.resolve("static/uploads");
        Files.createDirectories(uploads);
        String safeName = file.filename().replaceAll("[^A-Za-z0-9._-]", "_");
        if (safeName.isBlank()) safeName = "upload";
        Path target = uploads.resolve(safeName);
        int counter = 1;
        while (Files.exists(target)) {
            target = uploads.resolve(insertBeforeExtension(safeName, "-" + counter));
            counter++;
        }
        Files.write(target, file.data());
        return target.getFileName().toString();
    }

    private static String insertBeforeExtension(String name, String suffix) {
        int dot = name.lastIndexOf('.');
        return dot >= 0 ? name.substring(0, dot) + suffix + name.substring(dot) : name + suffix;
    }

    private void redirectBack(HttpExchange exchange) throws IOException {
        String referer = exchange.getRequestHeaders().getFirst("Referer");
        String location = "/index.html";
        if (referer != null) {
            try {
                URI uri = URI.create(referer);
                String p = uri.getRawPath();
                String q = uri.getRawQuery();
                if (p != null && !p.isBlank()) location = p + (q != null ? "?" + q : "");
            } catch (IllegalArgumentException ignored) {
                // keep the default location
            }
        }
        exchange.getResponseHeaders().set("Location", location);
        exchange.sendResponseHeaders(303, -1);
        exchange.close();
    }


    private PageModel findFanOutModel(String relative) {
        String lower = normalize(relative);
        for (PageModel model : pageModels) {
            if (model.fanOutKeyField() == null) continue;
            String stem = normalize(stripHtml(model.outputName()));
            if (lower.startsWith(stem + "_") && lower.endsWith(".html")) {
                return model;
            }
        }
        return null;
    }

    private static String extractIdPart(String relative, PageModel model) {
        String stem = stripHtml(model.outputName());
        String withoutHtml = stripHtml(relative);
        return withoutHtml.substring(stem.length() + 1);
    }

    private static String stripHtml(String name) {
        int dot = name.toLowerCase().lastIndexOf(".html");
        return dot >= 0 ? name.substring(0, dot) : name;
    }

    private static String safeFilePart(String value) {
        return value.replaceAll("[^A-Za-z0-9._-]", "_");
    }

    private static String normalize(String value) {
        return value.replace('\\', '/').toLowerCase();
    }

    private static Map<String, String> parseQuery(String rawQuery) {
        Map<String, String> result = new LinkedHashMap<>();
        if (rawQuery == null || rawQuery.isBlank()) return result;
        for (String pair : rawQuery.split("&")) {
            if (pair.isBlank()) continue;
            int eq = pair.indexOf('=');
            String key = eq >= 0 ? pair.substring(0, eq) : pair;
            String value = eq >= 0 ? pair.substring(eq + 1) : "";
            result.put(
                    URLDecoder.decode(key, StandardCharsets.UTF_8),
                    URLDecoder.decode(value, StandardCharsets.UTF_8));
        }
        return result;
    }

    private static void sendHtml(HttpExchange exchange, int status, String html) throws IOException {
        byte[] bytes = html.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream body = exchange.getResponseBody()) {
            body.write(bytes);
        }
    }

    private static void sendPlain(HttpExchange exchange, int status, String message) throws IOException {
        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream body = exchange.getResponseBody()) {
            body.write(bytes);
        }
    }

    private static String contentTypeFor(String path) {
        String lower = path.toLowerCase();
        if (lower.endsWith(".html")) return "text/html; charset=utf-8";
        if (lower.endsWith(".css")) return "text/css; charset=utf-8";
        if (lower.endsWith(".js")) return "text/javascript; charset=utf-8";
        if (lower.endsWith(".json")) return "application/json; charset=utf-8";
        if (lower.endsWith(".png")) return "image/png";
        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg")) return "image/jpeg";
        if (lower.endsWith(".gif")) return "image/gif";
        if (lower.endsWith(".svg")) return "image/svg+xml";
        if (lower.endsWith(".webp")) return "image/webp";
        if (lower.endsWith(".ico")) return "image/x-icon";
        return "application/octet-stream";
    }
}

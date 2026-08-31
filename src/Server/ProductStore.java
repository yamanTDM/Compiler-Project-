package Server;

import Generation.MiniJson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ProductStore {

    private final List<Map<String, Object>> products = new ArrayList<>();
    private final Path persistPath;

    public ProductStore(Object initialCollection, Path persistPath) {
        this.persistPath = persistPath;
        if (!loadFromDisk()) {
            seed(initialCollection);
        }
    }

    private void seed(Object initialCollection) {
        if (initialCollection instanceof List<?> list) {
            for (Object item : list) {
                if (item instanceof Map<?, ?> map) {
                    products.add(copyOf(map));
                }
            }
        }
        persist();
    }

    private boolean loadFromDisk() {
        if (persistPath == null) return false;
        try {
            if (!Files.isRegularFile(persistPath)) return false;
            String text = Files.readString(persistPath, StandardCharsets.UTF_8);
            if (text.isBlank()) return false;
            Object parsed = MiniJson.parse(text);
            if (!(parsed instanceof List<?> list)) return false;
            for (Object item : list) {
                if (item instanceof Map<?, ?> map) {
                    products.add(copyOf(map));
                }
            }
            return true;
        } catch (IOException | RuntimeException e) {
            return false;
        }
    }

    private static Map<String, Object> copyOf(Map<?, ?> map) {
        Map<String, Object> copy = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            copy.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return copy;
    }
    public synchronized List<Map<String, Object>> list() {
        List<Map<String, Object>> copy = new ArrayList<>();
        for (Map<String, Object> product : products) {
            copy.add(new LinkedHashMap<>(product));
        }
        return copy;
    }

    public synchronized Map<String, Object> add(String name, String price, String description, String image) {
        long nextId = 1;
        for (Map<String, Object> product : products) {
            long candidate = asLong(product.get("id"));
            if (candidate >= nextId) nextId = candidate + 1;
        }
        Map<String, Object> product = new LinkedHashMap<>();
        product.put("id", nextId);
        product.put("name", name);
        product.put("price", price);
        product.put("details", description);
        product.put("image", image);
        products.add(product);
        persist();
        return product;
    }

    public synchronized boolean remove(String id) {
        boolean removed = products.removeIf(product -> String.valueOf(product.get("id")).equals(id));
        if (removed) persist();
        return removed;
    }

    private static long asLong(Object value) {
        if (value instanceof Number number) return number.longValue();
        try {
            return Long.parseLong(String.valueOf(value));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void persist() {
        if (persistPath == null) return;
        try {
            if (persistPath.getParent() != null) Files.createDirectories(persistPath.getParent());
            Files.writeString(persistPath, MiniJson.stringify(products), StandardCharsets.UTF_8);
        } catch (IOException ignored) {

        }
    }
}

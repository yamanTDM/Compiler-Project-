package Generation;

import java.util.List;
import java.util.Map;

public final class CollectionLocator {

    private CollectionLocator() {
    }

    public static String findInitialCollectionKey(Map<String, Object> moduleContext) {


        for (Map.Entry<String, Object> entry : moduleContext.entrySet()) {
            if (isObjectList(entry.getValue())) return entry.getKey();
        }
        return null;
    }

    public static Object findInitialCollection(Map<String, Object> moduleContext) {
        String key = findInitialCollectionKey(moduleContext);
        return key == null ? List.of() : moduleContext.get(key);
    }

    private static boolean isObjectList(Object value) {
        if (!(value instanceof List<?> list)) return false;
        return list.isEmpty() || list.getFirst() instanceof Map<?, ?>;
    }
}

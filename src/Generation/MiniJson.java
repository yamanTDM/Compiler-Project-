
package Generation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class MiniJson {

    private MiniJson() {}



    public static Object parse(String text) {
        Parser p = new Parser(text);
        p.skipWhitespace();
        Object value = p.parseValue();
        p.skipWhitespace();
        return value;
    }

    private static final class Parser {
        private final String s;
        private int pos;

        Parser(String s) { this.s = s; this.pos = 0; }

        void skipWhitespace() {
            while (pos < s.length() && Character.isWhitespace(s.charAt(pos))) pos++;
        }

        char peek() { return s.charAt(pos); }

        Object parseValue() {
            skipWhitespace();
            char c = peek();
            if (c == '{') return parseObject();
            if (c == '[') return parseArray();
            if (c == '"') return parseString();
            if (c == 't' || c == 'f') return parseBoolean();
            if (c == 'n') { pos += 4; return null; }
            return parseNumber();
        }

        Map<String, Object> parseObject() {
            Map<String, Object> map = new LinkedHashMap<>();
            pos++; // {
            skipWhitespace();
            if (peek() == '}') { pos++; return map; }
            while (true) {
                skipWhitespace();
                String key = parseString();
                skipWhitespace();
                pos++; // :
                Object value = parseValue();
                map.put(key, value);
                skipWhitespace();
                if (peek() == ',') { pos++; continue; }
                if (peek() == '}') { pos++; break; }
                break;
            }
            return map;
        }

        List<Object> parseArray() {
            List<Object> list = new ArrayList<>();
            pos++; // [
            skipWhitespace();
            if (peek() == ']') { pos++; return list; }
            while (true) {
                Object value = parseValue();
                list.add(value);
                skipWhitespace();
                if (peek() == ',') { pos++; continue; }
                if (peek() == ']') { pos++; break; }
                break;
            }
            return list;
        }

        String parseString() {
            pos++; // opening quote
            StringBuilder sb = new StringBuilder();
            while (peek() != '"') {
                char c = s.charAt(pos);
                if (c == '\\') {
                    pos++;
                    char esc = s.charAt(pos);
                    switch (esc) {
                        case 'n' -> sb.append('\n');
                        case 't' -> sb.append('\t');
                        case 'r' -> sb.append('\r');
                        case '"' -> sb.append('"');
                        case '\\' -> sb.append('\\');
                        case '/' -> sb.append('/');
                        default -> sb.append(esc);
                    }
                } else {
                    sb.append(c);
                }
                pos++;
            }
            pos++; // closing quote
            return sb.toString();
        }

        Boolean parseBoolean() {
            if (peek() == 't') { pos += 4; return Boolean.TRUE; }
            pos += 5;
            return Boolean.FALSE;
        }

        Object parseNumber() {
            int start = pos;
            while (pos < s.length() && "-+.eE0123456789".indexOf(s.charAt(pos)) >= 0) pos++;
            String numText = s.substring(start, pos);
            if (numText.contains(".") || numText.contains("e") || numText.contains("E")) {
                return Double.parseDouble(numText);
            }
            try {
                return Integer.parseInt(numText);
            } catch (NumberFormatException e) {
                return Long.parseLong(numText);
            }
        }
    }


    public static String stringify(Object value) {
        StringBuilder out = new StringBuilder();
        writeValue(value, out);
        return out.toString();
    }

    private static void writeValue(Object value, StringBuilder out) {
        if (value == null) {
            out.append("null");
        } else if (value instanceof String text) {
            out.append('"').append(escape(text)).append('"');
        } else if (value instanceof Number || value instanceof Boolean) {
            out.append(value);
        } else if (value instanceof Map<?, ?> map) {
            out.append('{');
            int index = 0;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (index++ > 0) out.append(',');
                out.append('"').append(escape(String.valueOf(entry.getKey()))).append("\":");
                writeValue(entry.getValue(), out);
            }
            out.append('}');
        } else if (value instanceof Iterable<?> iterable) {
            out.append('[');
            int index = 0;
            for (Object item : iterable) {
                if (index++ > 0) out.append(',');
                writeValue(item, out);
            }
            out.append(']');
        } else {
            out.append('"').append(escape(String.valueOf(value))).append('"');
        }
    }

    public static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"' -> sb.append("\\\"");
                case '\\' -> sb.append("\\\\");
                case '\n' -> sb.append("\\n");
                case '\r' -> sb.append("\\r");
                case '\t' -> sb.append("\\t");
                default -> {
                    if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}

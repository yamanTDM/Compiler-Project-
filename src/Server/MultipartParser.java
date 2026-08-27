package Server;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class MultipartParser {

    private MultipartParser() {
    }

    public record FilePart(String filename, String contentType, byte[] data) {
    }

    public record Result(Map<String, String> fields, Map<String, FilePart> files) {
    }

    /** Extracts the boundary token from a "Content-Type: multipart/form-data; boundary=..." header. */
    public static String extractBoundary(String contentType) {
        if (contentType == null) return null;
        for (String part : contentType.split(";")) {
            part = part.trim();
            if (part.toLowerCase().startsWith("boundary=")) {
                String boundary = part.substring("boundary=".length()).trim();
                if (boundary.length() >= 2 && boundary.startsWith("\"") && boundary.endsWith("\"")) {
                    boundary = boundary.substring(1, boundary.length() - 1);
                }
                return boundary;
            }
        }
        return null;
    }

    public static Result parse(byte[] body, String boundary) {
        Map<String, String> fields = new LinkedHashMap<>();
        Map<String, FilePart> files = new LinkedHashMap<>();
        if (boundary == null || body == null) return new Result(fields, files);

        byte[] delimiter = ("--" + boundary).getBytes(StandardCharsets.ISO_8859_1);
        byte[] blankLine = "\r\n\r\n".getBytes(StandardCharsets.ISO_8859_1);
        List<Integer> boundaryPositions = findAll(body, delimiter);

        for (int i = 0; i + 1 < boundaryPositions.size(); i++) {
            int partStart = boundaryPositions.get(i) + delimiter.length;
            int partEnd = boundaryPositions.get(i + 1);
            if (partStart >= body.length) continue;
            if (partStart + 1 < body.length && body[partStart] == '-' && body[partStart + 1] == '-') {
                continue; // terminating boundary ("--boundary--"), no part follows
            }
            partStart = skipLeadingCrlf(body, partStart);
            if (partStart >= partEnd) continue;

            int headerEnd = indexOf(body, blankLine, partStart, partEnd);
            if (headerEnd < 0) continue;
            String headerText = new String(body, partStart, headerEnd - partStart, StandardCharsets.ISO_8859_1);

            int contentStart = headerEnd + blankLine.length;
            int contentEnd = partEnd;
            if (contentEnd - 2 >= contentStart && body[contentEnd - 2] == '\r' && body[contentEnd - 1] == '\n') {
                contentEnd -= 2; // trailing CRLF just before the next boundary marker
            }
            if (contentEnd < contentStart) contentEnd = contentStart;

            String name = headerValue(headerText, "name");
            if (name == null) continue;
            String filename = headerValue(headerText, "filename");

            if (filename != null) {
                String contentType = "application/octet-stream";
                for (String line : headerText.split("\r\n")) {
                    if (line.toLowerCase().startsWith("content-type:")) {
                        contentType = line.substring(line.indexOf(':') + 1).trim();
                    }
                }
                byte[] data = new byte[contentEnd - contentStart];
                System.arraycopy(body, contentStart, data, 0, data.length);
                files.put(name, new FilePart(filename, contentType, data));
            } else {
                String value = new String(body, contentStart, contentEnd - contentStart, StandardCharsets.UTF_8);
                fields.put(name, value);
            }
        }
        return new Result(fields, files);
    }

    private static int skipLeadingCrlf(byte[] body, int index) {
        if (index + 1 < body.length && body[index] == '\r' && body[index + 1] == '\n') {
            return index + 2;
        }
        return index;
    }

    private static String headerValue(String headerText, String key) {
        for (String line : headerText.split("\r\n")) {
            if (!line.toLowerCase().contains("content-disposition")) continue;
            String marker = key + "=\"";
            int idx = line.indexOf(marker);
            if (idx < 0) continue;
            int start = idx + marker.length();
            int end = line.indexOf('"', start);
            if (end < 0) continue;
            return line.substring(start, end);
        }
        return null;
    }

    private static List<Integer> findAll(byte[] body, byte[] pattern) {
        List<Integer> positions = new ArrayList<>();
        int from = 0;
        while (true) {
            int idx = indexOf(body, pattern, from, body.length);
            if (idx < 0) break;
            positions.add(idx);
            from = idx + pattern.length;
        }
        return positions;
    }

    private static int indexOf(byte[] body, byte[] pattern, int from, int to) {
        outer:
        for (int i = from; i <= to - pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (body[i + j] != pattern[j]) continue outer;
            }
            return i;
        }
        return -1;
    }
}

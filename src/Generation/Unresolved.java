package Generation;

/**
 * Marker value meaning "the generator could not determine this value
 * statically". Deliberately distinct from {@code null}, because {@code null}
 * is itself a legal resolved value (Python's {@code None}).
 */
public final class Unresolved {
    public static final Object VALUE = new Unresolved();

    private Unresolved() {}

    @Override
    public String toString() {
        return "<unresolved>";
    }
}

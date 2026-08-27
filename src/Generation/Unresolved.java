package Generation;

public final class Unresolved {
    public static final Object VALUE = new Unresolved();

    private Unresolved() {}

    @Override
    public String toString() {
        return "<unresolved>";
    }
}

package AST;

public class JinjaText extends JinjaExpr{
    private final String text;
    public JinjaText(int line, String text) {
        super(line, "Jinja Text");
        if ((text.startsWith("\"") && text.endsWith("\"")) ||
                (text.startsWith("'") && text.endsWith("'"))) {
            this.text = text.substring(1, text.length() - 1);
        } else {
            this.text = text;
        }
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return super.name+ "- " + text + " ";
    }
}

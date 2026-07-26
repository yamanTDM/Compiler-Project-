package Generation;

/**
 * Some Flask routes (e.g. {@code /product/<int:id>}) only bind their template
 * variable (e.g. {@code product}) at request time, so a purely static
 * generator can't resolve it in general. But when the underlying collection
 * IS resolved (e.g. {@code products} from products.json), we can do what a
 * static-site generator does for a dynamic route: fan out into one real
 * output page per item, instead of a single generic "not found" page.
 */
public class DetailFanOutSpec {
    public final String listVariableName;   // e.g. "products"
    public final String itemVariableName;   // e.g. "product" (the name the template expects)
    public final String keyField;           // e.g. "id"
    public final String outputFileNamePattern; // e.g. "detail_%s.html"

    public DetailFanOutSpec(String listVariableName, String itemVariableName,
                             String keyField, String outputFileNamePattern) {
        this.listVariableName = listVariableName;
        this.itemVariableName = itemVariableName;
        this.keyField = keyField;
        this.outputFileNamePattern = outputFileNamePattern;
    }
}

package Generation;

import AST.Attribute;
import AST.AttributeJinja;
import AST.AttributeString;
import AST.AttributeValue;
import AST.BodyNode;
import AST.CSSBody;
import AST.CSSCalcFunction;
import AST.CSSDeclaration;
import AST.CSSFunction;
import AST.CSSHSLFunction;
import AST.CSSHex;
import AST.CSSNumber;
import AST.CSSRotateFunction;
import AST.CSSRule;
import AST.CSSScaleFunction;
import AST.CSSSelector;
import AST.CSSAllSelector;
import AST.CSSClassSelector;
import AST.CSSIDSelector;
import AST.CSSNormalSelector;
import AST.CSSTerm;
import AST.CSSText;
import AST.CSSTranslateFunction;
import AST.CompareCondition;
import AST.Condition;
import AST.HTMLElement;
import AST.HTMLSingleElement;
import AST.JinjaAssign;
import AST.JinjaBlock;
import AST.JinjaCombine;
import AST.JinjaElif;
import AST.JinjaExpr;
import AST.JinjaExpression;
import AST.JinjaFor;
import AST.JinjaFunction;
import AST.JinjaId;
import AST.JinjaIf;
import AST.JinjaInheritance;
import AST.JinjaStatement;
import AST.JinjaSuperBlock;
import AST.JinjaText;
import AST.LogicCondition;
import AST.NotCondition;
import AST.Node;
import AST.Program;
import AST.Text;
import AST.VariableCondition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlGenerator {

    private static final Object UNRESOLVED = Unresolved.VALUE;

    private final RouteExtractor routes;
    public final List<String> log = new ArrayList<>();

    public HtmlGenerator(RouteExtractor routes) {
        this.routes = routes;
    }

    public String generate(Program page, Map<String, Object> context, String templateName) {


        StringBuilder sb = new StringBuilder();
        for (BodyNode node : page.getBodyNodes()) {
            renderNode(node, context, sb, templateName);
        }
        return sb.toString();
    }


    private void renderNode(Node node, Map<String, Object> scope, StringBuilder out, String templateName) {
        if (node instanceof Text t) {
            out.append(t.getText());

        } else if (node instanceof HTMLElement el) {
            out.append('<').append(el.getTag());
            for (Attribute a : el.getAttributes()) renderAttribute(a, scope, out, templateName);
            out.append('>');
            for (BodyNode child : el.getChildren()) renderNode(child, scope, out, templateName);
            out.append("</").append(el.getTag()).append('>');

        } else if (node instanceof HTMLSingleElement el) {
            out.append('<').append(el.getTag());
            for (Attribute a : el.getAttributes()) renderAttribute(a, scope, out, templateName);
            out.append('>');

        } else if (node instanceof JinjaExpression expr) {
            for (JinjaExpr part : expr.getText()) {
                out.append(htmlEscape(stringify(evalJinjaExpr(part, scope, templateName))));
            }

        } else if (node instanceof JinjaFor forNode) {
            renderFor(forNode, scope, out, templateName);

        } else if (node instanceof JinjaIf ifNode) {
            renderIf(ifNode, scope, out, templateName);

        } else if (node instanceof JinjaBlock block) {
            for (BodyNode child : block.getBodys()) renderNode(child, scope, out, templateName);

        } else if (node instanceof JinjaStatement stmt) {
            for (JinjaExpr part : stmt.getText()) {
                if (part instanceof JinjaAssign assign) {
                    scope.put(assign.getName().getFullName(), evalJinjaExpr(assign.getValue(), scope, templateName));
                }
            }

        } else if (node instanceof JinjaInheritance inh) {
            for (BodyNode child : inh.getBodys()) renderNode(child, scope, out, templateName);

        } else if (node instanceof JinjaSuperBlock) {

        } else if (node instanceof CSSBody cssBody) {
            renderCssBody(cssBody, out);

        }
    }

    private void renderFor(JinjaFor forNode, Map<String, Object> scope, StringBuilder out, String templateName) {
        Object collection = resolveDotted(forNode.getCollectionName().getFullName(), scope);
        List<?> items = (collection instanceof List<?> l) ? l : null;

        if (items == null || items.isEmpty()) {
            if (items == null) {
                log.add("[" + templateName + "] for-loop over '" + forNode.getCollectionName().getFullName()
                        + "' is unresolved/not a list; rendering the else-branch (if any).");
            }
            if (forNode.getElseBody() != null) renderNode(forNode.getElseBody(), scope, out, templateName);
            return;
        }

        for (Object item : items) {
            Map<String, Object> childScope = new HashMap<>(scope);
            childScope.put(forNode.getItemName().getFullName(), item);
            if (forNode.getFilterCondition() != null
                    && !evalJinjaCondition(forNode.getFilterCondition(), childScope, templateName)) {
                continue;
            }
            if (forNode.getBody() != null) renderNode(forNode.getBody(), childScope, out, templateName);
        }
    }

    private void renderIf(JinjaIf ifNode, Map<String, Object> scope, StringBuilder out, String templateName) {
        if (evalJinjaCondition(ifNode.getCondition(), scope, templateName)) {
            if (ifNode.getIfBody() != null) renderNode(ifNode.getIfBody(), scope, out, templateName);
            return;
        }
        for (JinjaElif elif : ifNode.getElifs()) {
            if (evalJinjaCondition(elif.getCondition(), scope, templateName)) {
                if (elif.getBody() != null) renderNode(elif.getBody(), scope, out, templateName);
                return;
            }
        }
        if (ifNode.getElseBody() != null) renderNode(ifNode.getElseBody(), scope, out, templateName);
    }

    private void renderAttribute(Attribute a, Map<String, Object> scope, StringBuilder out, String templateName) {
        out.append(' ').append(a.getName());
        AttributeValue value = a.getValue();
        if (value == null) return;

        String rendered;
        if (value instanceof AttributeString s) {
            rendered = s.getValue();
        } else if (value instanceof AttributeJinja j) {
            StringBuilder buf = new StringBuilder();
            for (JinjaExpr part : j.getText().getText()) {
                buf.append(stringify(evalJinjaExpr(part, scope, templateName)));
            }
            rendered = buf.toString();
        } else {
            rendered = "";
        }
        out.append("=\"").append(htmlAttrEscape(rendered)).append('"');
    }


    private Object evalJinjaExpr(JinjaExpr expr, Map<String, Object> scope, String templateName) {
        if (expr instanceof JinjaId id) {
            return resolveDotted(id.getFullName(), scope);
        }
        if (expr instanceof JinjaText text) {
            return text.getText();
        }
        if (expr instanceof JinjaCombine combine) {
            StringBuilder sb = new StringBuilder();
            for (JinjaExpr part : combine.getParts()) {
                Object v = evalJinjaExpr(part, scope, templateName);
                if (v == UNRESOLVED) return UNRESOLVED;
                sb.append(stringify(v));
            }
            return sb.toString();
        }
        if (expr instanceof JinjaFunction fn) {
            return evalJinjaFunction(fn, scope, templateName);
        }
        if (expr instanceof JinjaAssign assign) {
            return evalJinjaExpr(assign.getValue(), scope, templateName);
        }
        return UNRESOLVED;
    }

    private Object evalJinjaFunction(JinjaFunction fn, Map<String, Object> scope, String templateName) {
        String name = fn.getName().getFullName();
        if (!"url_for".equals(name)) {
            log.add("[" + templateName + "] call to unsupported Jinja function '" + name + "(...)'.");
            return UNRESOLVED;
        }
        List<JinjaExpr> args = fn.getArguments();
        if (args.isEmpty()) return UNRESOLVED;

        String endpoint = stringify(evalJinjaExpr(args.get(0), scope, templateName));
        Map<String, String> kwargs = new HashMap<>();
        for (int i = 1; i < args.size(); i++) {
            if (args.get(i) instanceof JinjaAssign kw) {
                kwargs.put(kw.getName().getFullName(), stringify(evalJinjaExpr(kw.getValue(), scope, templateName)));
            }
        }
        return routes.buildUrl(endpoint, kwargs);
    }

    private boolean evalJinjaCondition(Condition c, Map<String, Object> scope, String templateName) {
        if (c instanceof VariableCondition vc) {
            Object v = resolveDotted(vc.getVariable(), scope);
            return v != UNRESOLVED && ContextExtractor.toBoolean(v);
        }
        if (c instanceof CompareCondition cc) {
            Object l = resolveLiteralOrVar(cc.getLeftValue(), scope);
            Object r = resolveLiteralOrVar(cc.getRightValue(), scope);
            if (l == UNRESOLVED || r == UNRESOLVED) return false;
            return switch (cc.getOperator()) {
                case "==" -> java.util.Objects.equals(String.valueOf(l), String.valueOf(r));
                case "!=" -> !java.util.Objects.equals(String.valueOf(l), String.valueOf(r));
                default -> {
                    if (l instanceof Number ln && r instanceof Number rn) {
                        int cmp = Double.compare(ln.doubleValue(), rn.doubleValue());
                        yield switch (cc.getOperator()) {
                            case ">" -> cmp > 0;
                            case ">=" -> cmp >= 0;
                            case "<" -> cmp < 0;
                            case "<=" -> cmp <= 0;
                            default -> false;
                        };
                    }
                    yield false;
                }
            };
        }
        if (c instanceof LogicCondition lc) {
            boolean left = evalJinjaCondition(lc.getLeft(), scope, templateName);
            boolean right = evalJinjaCondition(lc.getRight(), scope, templateName);
            return "or".equalsIgnoreCase(lc.getOperator()) ? (left || right) : (left && right);
        }
        if (c instanceof NotCondition nc) {
            return !evalJinjaCondition(nc.getCondition(), scope, templateName);
        }
        return false;
    }

    private Object resolveLiteralOrVar(String raw, Map<String, Object> scope) {
        if (raw == null) return UNRESOLVED;
        String trimmed = raw.trim();
        if ((trimmed.startsWith("\"") && trimmed.endsWith("\"")) || (trimmed.startsWith("'") && trimmed.endsWith("'"))) {
            return trimmed.substring(1, trimmed.length() - 1);
        }
        try {
            return Double.parseDouble(trimmed);
        } catch (NumberFormatException ignored) {
        }
        return resolveDotted(trimmed, scope);
    }

    private Object resolveDotted(String path, Map<String, Object> scope) {
        String[] parts = path.split("\\.");
        if (!scope.containsKey(parts[0])) return UNRESOLVED;
        Object current = scope.get(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            if (!(current instanceof Map<?, ?> m)) return UNRESOLVED;
            String key = parts[i];
            if (m.containsKey(key)) {
                current = m.get(key);
            }  else {
                return UNRESOLVED;
            }
        }
        return current == null ? null : current;
    }

    private static String stringify(Object v) {
        if (v == null || v == UNRESOLVED) return "";
        if (v instanceof Double d && d == Math.rint(d) && !Double.isInfinite(d)) {
            return String.valueOf(d.intValue());
        }
        return String.valueOf(v);
    }

    private static String htmlEscape(String s) {
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    private static String htmlAttrEscape(String s) {
        return htmlEscape(s).replace("\"", "&quot;");
    }



    private void renderCssBody(CSSBody body, StringBuilder out) {
        out.append("<style>\n");
        for (CSSRule rule : body.getCssRules()) {
            List<CSSSelector> sels = rule.getSelectors();
            StringBuilder selectorsOut = new StringBuilder();
            for (int i = 0; i < sels.size(); i++) {
                if (i == 0) {
                } else if (rule.isCommaBefore(i)) {
                    selectorsOut.append(", ");
                } else {
                    selectorsOut.append(" ");
                }
                selectorsOut.append(renderSelector(sels.get(i)));
            }
            out.append(selectorsOut).append(" {\n");
            for (CSSDeclaration decl : rule.getDeclarations()) {
                out.append("  ").append(decl.getName()).append(": ");
                List<CSSTerm> terms = decl.getTerms();
                for (int i = 0; i < terms.size(); i++) {
                    if (i > 0) out.append(decl.isCommaBefore(i) ? ", " : " ");
                    try {
                        out.append(renderTerm(terms.get(i)));
                    } catch (RuntimeException ex) {
                        log.add("CSS term at line " + terms.get(i).getLine() + " could not be rendered (" + ex + "); skipped.");
                    }
                }
                out.append(";\n");
            }
            out.append("}\n");
        }
        out.append("</style>");
    }

    private String renderSelector(CSSSelector sel) {
        if (sel instanceof CSSAllSelector) return "*";
        if (sel instanceof CSSClassSelector cs) return "." + cs.getName();
        if (sel instanceof CSSIDSelector is) return "#" + is.getName();
        if (sel instanceof CSSNormalSelector ns) return ns.getName();
        return "";
    }

    private static String formatCssNumber(double d) {
        if (d == Math.rint(d) && !Double.isInfinite(d)) return String.valueOf((long) d);
        return String.valueOf(d);
    }

    private String renderTerm(CSSTerm term) {
        if (term instanceof CSSNumber n) return formatCssNumber(n.getValue()) + (n.getUnit() != null ? n.getUnit() : "");
        if (term instanceof CSSHex h) return "#" + h.getNum();
        if (term instanceof CSSText t) return t.getText();
        if (term instanceof CSSHSLFunction hsl) {
            return "hsl(" + formatCssNumber(hsl.getH()) + (hsl.getUnitH() != null ? hsl.getUnitH() : "") + ", "
                    + formatCssNumber(hsl.getS()) + (hsl.getUnitS() != null ? hsl.getUnitS() : "") + ", "
                    + formatCssNumber(hsl.getL()) + (hsl.getUnitL() != null ? hsl.getUnitL() : "") + ")";
        }
        if (term instanceof CSSCalcFunction calc) {
            String left = calc.getLeft() != null ? formatCssNumber(calc.getLeft()) : calc.getLeftUnit();
            String right = calc.getRight() != null ? formatCssNumber(calc.getRight()) : calc.getRightUnit();
            return "calc(" + left + " " + calc.getOperator() + " " + right + ")";
        }
        if (term instanceof CSSRotateFunction rot) {
            return "rotate(" + formatCssNumber(rot.getAngle()) + (rot.getUnit() != null ? rot.getUnit() : "") + ")";
        }
        if (term instanceof CSSScaleFunction scale) {
            return "scale(" + formatCssNumber(scale.getX()) + (scale.isFull() ? ", " + formatCssNumber(scale.getY()) : "") + ")";
        }
        if (term instanceof CSSTranslateFunction tr) {
            String x = tr.getX() != null ? formatCssNumber(tr.getX()) + (tr.getUnitX() != null ? tr.getUnitX() : "") : "";
            String y = tr.getY() != null ? formatCssNumber(tr.getY()) + (tr.getUnitY() != null ? tr.getUnitY() : "") : "";
            return "translate(" + x + (tr.isFull() ? ", " + y : "") + ")";
        }
        if (term instanceof CSSFunction) return "";
        return "";
    }
}

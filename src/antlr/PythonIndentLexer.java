package antlr;

import antlr.PythonLexer;
import org.antlr.v4.runtime.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Custom lexer that wraps the ANTLR-generated PythonLexer and injects
 * INDENT / DEDENT tokens required by the parser's suite rule.
 *
 * <h2>How it works</h2>
 * <ol>
 *   <li>It intercepts every NEWLINE token from the underlying lexer.</li>
 *   <li>It skips consecutive blank-line NEWLINEs (they must not change
 *       the indent level).</li>
 *   <li>It reads the first real token on the next non-blank line and
 *       inspects its {@code charPositionInLine}, which equals the
 *       indentation column (spaces only; tabs count as 1).</li>
 *   <li>Compared against the top of {@code indentStack}:
 *       <ul>
 *         <li>indent increases → emit NEWLINE then INDENT</li>
 *         <li>indent decreases → emit NEWLINE then one DEDENT per level popped</li>
 *         <li>indent unchanged → emit NEWLINE only</li>
 *       </ul>
 *   </li>
 *   <li>NEWLINE tokens inside brackets/parens/braces are silently
 *       suppressed (Python's implicit line-joining rule), which makes
 *       multi-line dicts and argument lists parse without error.</li>
 *   <li>At EOF, any remaining indent levels cause DEDENT tokens to be
 *       emitted so every open suite is properly closed.</li>
 * </ol>
 *
 * <h2>Usage in Main.java</h2>
 * <pre>
 *   CharStream input = CharStreams.fromString(...);
 *   PythonIndentLexer lexer = new PythonIndentLexer(input); // ← use this
 *   CommonTokenStream tokens = new CommonTokenStream(lexer);
 *   PythonParser parser = new PythonParser(tokens);
 *   ParseTree tree = parser.prog();
 * </pre>
 */
public class PythonIndentLexer extends PythonLexer {

    // ── Indentation tracking ──────────────────────────────────────────────────

    /** Stack of indent levels, initialised with column 0 (module scope). */
    private final Deque<Integer> indentStack = new ArrayDeque<>();

    // ── Implicit line-joining ─────────────────────────────────────────────────

    /**
     * Depth of currently open brackets/parentheses/braces.
     * When > 0, NEWLINE tokens are suppressed (implicit line joining).
     */
    private int bracketDepth = 0;

    // ── Token queue ───────────────────────────────────────────────────────────

    /**
     * Tokens waiting to be returned on subsequent nextToken() calls.
     * Used when one logical event (e.g. a DEDENT sequence) must emit
     * multiple tokens.
     */
    private final Queue<Token> pending = new LinkedList<>();

    // ─────────────────────────────────────────────────────────────────────────
    //  Constructor
    // ─────────────────────────────────────────────────────────────────────────

    public PythonIndentLexer(CharStream input) {
        super(input);
        indentStack.push(0); // module scope starts at column 0
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Core override
    // ─────────────────────────────────────────────────────────────────────────

    @Override
    public Token nextToken() {

        // 1. Drain any queued tokens before pulling from the stream.
        if (!pending.isEmpty()) {
            return pending.poll();
        }

        // 2. Get the next raw token from the ANTLR-generated lexer.
        Token token = super.nextToken();

        // 3. Maintain bracket-depth for implicit line-joining.
        trackBracket(token);

        // 4. Non-NEWLINE tokens pass straight through (EOF handled separately).
        if (token.getType() != NEWLINE) {
            return token.getType() == EOF ? handleEof(token) : token;
        }

        // 5. Suppress NEWLINE when inside brackets/parens/braces.
        if (bracketDepth > 0) {
            return nextToken(); // tail-recurse: get the next meaningful token
        }

        // 6. Logical NEWLINE outside brackets.
        //    Skip consecutive blank-line NEWLINEs; they must not affect indent.
        Token lookahead = super.nextToken();
        while (lookahead.getType() == NEWLINE) {
            lookahead = super.nextToken();
        }
        // `lookahead` is now the first real token on the next non-blank line.

        // 7. Update bracket depth for the lookahead token (it was consumed
        //    from the stream, so we must track it here).
        trackBracket(lookahead);

        // 8. Handle EOF: wind down the indent stack with DEDENTs.
        if (lookahead.getType() == EOF) {
            enqueue(token); // the logical NEWLINE
            while (indentStack.peek() > 0) {
                indentStack.pop();
                enqueue(syntheticToken(DEDENT, "<DEDENT>", token));
            }
            enqueue(lookahead); // EOF
            return pending.poll();
        }

        // 9. Compute the new indent level from the lookahead's column.
        int newIndent  = lookahead.getCharPositionInLine();
        int prevIndent = indentStack.peek();

        // 10. Enqueue NEWLINE first (the parser needs it to end simple_stmt).
        enqueue(token);

        if (newIndent > prevIndent) {
            // ── Indent increased → one INDENT token ──────────────────────────
            indentStack.push(newIndent);
            enqueue(syntheticToken(INDENT, "<INDENT>", lookahead));

        } else if (newIndent < prevIndent) {
            // ── Indent decreased → one DEDENT per popped level ───────────────
            while (indentStack.size() > 1 && indentStack.peek() > newIndent) {
                indentStack.pop();
                enqueue(syntheticToken(DEDENT, "<DEDENT>", lookahead));
            }
        }
        // ── Indent unchanged → only the NEWLINE is queued (step 10) ─────────

        // 11. Finally enqueue the lookahead so it is returned on the next call.
        enqueue(lookahead);

        return pending.poll();
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Helpers
    // ─────────────────────────────────────────────────────────────────────────

    /**
     * Emits DEDENT tokens for every remaining indent level > 0, then EOF.
     * Called when EOF is encountered outside a NEWLINE context (e.g. a file
     * with no trailing newline).
     */
    private Token handleEof(Token eof) {
        while (indentStack.peek() > 0) {
            indentStack.pop();
            enqueue(syntheticToken(DEDENT, "<DEDENT>", eof));
        }
        enqueue(eof);
        return pending.poll();
    }

    /**
     * Increments/decrements {@code bracketDepth} for open/close brackets.
     * Keeps the implicit-line-joining state consistent for every token,
     * including lookahead tokens that are consumed inside nextToken().
     */
    private void trackBracket(Token t) {
        int type = t.getType();
        if (type == LPAREN || type == LBRACK || type == LBRACE) bracketDepth++;
        else if (type == RPAREN || type == RBRACK || type == RBRACE) bracketDepth--;
    }

    /** Adds {@code t} to the pending queue. */
    private void enqueue(Token t) {
        pending.add(t);
    }

    /**
     * Creates a synthetic INDENT or DEDENT token that copies source location
     * from {@code ref} so IDE / error-listener line numbers stay meaningful.
     */
    private Token syntheticToken(int type, String text, Token ref) {
        CommonToken t = new CommonToken(ref);
        t.setType(type);
        t.setText(text);
        return t;
    }
}
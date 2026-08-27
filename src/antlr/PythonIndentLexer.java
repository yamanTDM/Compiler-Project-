package antlr;

import org.antlr.v4.runtime.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PythonIndentLexer extends PythonLexer {


    private final Deque<Integer> indentStack = new ArrayDeque<>();


    private int bracketDepth = 0;


    private final Queue<Token> pending = new LinkedList<>();


    public PythonIndentLexer(CharStream input) {
        super(input);
        indentStack.push(0);
    }

    @Override
    public Token nextToken() {

        if (!pending.isEmpty()) {
            return pending.poll();
        }

        Token token = super.nextToken();

        trackBracket(token);

        if (token.getType() != NEWLINE) {
            return token.getType() == EOF ? handleEof(token) : token;
        }

        if (bracketDepth > 0) {
            return nextToken();
        }


        Token lookahead = super.nextToken();
        while (lookahead.getType() == NEWLINE) {
            lookahead = super.nextToken();
        }

        trackBracket(lookahead);

        if (lookahead.getType() == EOF) {
            enqueue(token);
            while (indentStack.peek() > 0) {
                indentStack.pop();
                enqueue(syntheticToken(DEDENT, "<DEDENT>", token));
            }
            enqueue(lookahead);
            return pending.poll();
        }

        int newIndent = lookahead.getCharPositionInLine();
        int prevIndent = indentStack.peek();

        enqueue(token);

        if (newIndent > prevIndent) {
            indentStack.push(newIndent);
            enqueue(syntheticToken(INDENT, "<INDENT>", lookahead));

        } else if (newIndent < prevIndent) {
            while (indentStack.size() > 1 && indentStack.peek() > newIndent) {
                indentStack.pop();
                enqueue(syntheticToken(DEDENT, "<DEDENT>", lookahead));
            }
        }

        enqueue(lookahead);

        return pending.poll();
    }


    private Token handleEof(Token eof) {
        enqueue(syntheticToken(NEWLINE, "<NEWLINE>", eof)); // ← add this
        while (indentStack.peek() > 0) {
            indentStack.pop();
            enqueue(syntheticToken(DEDENT, "<DEDENT>", eof));
        }
        enqueue(eof);
        return pending.poll();
    }

    private void trackBracket(Token t) {
        int type = t.getType();
        if (type == LPAREN || type == LBRACK || type == LBRACE) bracketDepth++;
        else if (type == RPAREN || type == RBRACK || type == RBRACE) bracketDepth--;
    }

    private void enqueue(Token t) {
        pending.add(t);
    }


    private Token syntheticToken(int type, String text, Token ref) {
        CommonToken t = new CommonToken(ref);
        t.setType(type);
        t.setText(text);
        return t;
    }
}
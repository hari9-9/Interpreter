package com.interpreter.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();
    private int current = 0;

    public Lexer(String source) {
        this.source = source;
    }

    public List<Token> scanTokens() {
        while (!isAtEnd()) {
            char c = advance();
            switch (c) {
                case '(':
                    tokens.add(new Token(TokenType.LEFT_PAREN, "(", null));
                    break;
                case ')':
                    tokens.add(new Token(TokenType.RIGHT_PAREN, ")", null));
                    break;
                case '{':
                    tokens.add(new Token(TokenType.LEFT_BRACE,"{",null));
                    break;
                case '}':
                    tokens.add(new Token(TokenType.RIGHT_BRACE,"}",null));
                    break;
                default:
                    // Ignore other characters for now
                    break;
            }
        }
        tokens.add(new Token(TokenType.EOF, "EOF", null)); // Append EOF token
        return tokens;
    }

    private boolean isAtEnd() {
        return current >= source.length();
    }

    private char advance() {
        return source.charAt(current++);
    }
}

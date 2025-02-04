package com.interpreter.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private final Scanner scanner;
    private final List<Token> tokens = new ArrayList<>();

    public Lexer(String source) {
        this.scanner = new Scanner(source);
    }

    private void addToken(TokenType type, String lexeme) {
        tokens.add(new Token(type, lexeme, null));
    }

    public List<Token> scanTokens() {
        while (!scanner.isAtEnd()) {
            char c = scanner.advance();
            switch (c) {
                case '(' -> addToken(TokenType.LEFT_PAREN, "(");
                case ')' -> addToken(TokenType.RIGHT_PAREN, ")");
                case '{' -> addToken(TokenType.LEFT_BRACE, "{");
                case '}' -> addToken(TokenType.RIGHT_BRACE, "}");
                default -> {} // Ignore other characters
            }
        }
        addToken(TokenType.EOF, "EOF");
        return tokens;
    }
}

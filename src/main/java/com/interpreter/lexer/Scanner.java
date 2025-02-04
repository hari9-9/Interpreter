package com.interpreter.lexer;

public class Scanner {
    private final String source;
    private int current = 0;

    public Scanner(String source) {
        this.source = source;
    }

    public boolean isAtEnd() {
        return current >= source.length();
    }

    public char advance() {
        return source.charAt(current++);
    }

    public char peek() {
        if (isAtEnd()) return '\0';
        return source.charAt(current);
    }
}

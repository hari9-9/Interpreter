package com.interpreter.lexer;

public class Token {
    private final TokenType type;
    private final String lexeme;
    private final Object literal;

    public Token(TokenType type, String lexeme, Object literal) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
    }

    @Override
    public String toString() {
        return type + " " + (lexeme != null ? lexeme : "") + " null";
    }


}

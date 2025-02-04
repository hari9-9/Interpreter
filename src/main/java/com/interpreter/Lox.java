package com.interpreter;

import com.interpreter.lexer.Lexer;
import com.interpreter.lexer.Token;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Lox {
    public static void runFile(String filename) {
        String fileContents;
        try {
            fileContents = Files.readString(Path.of(filename));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
            return;
        }

        Lexer lexer = new Lexer(fileContents);
        List<Token> tokens = lexer.scanTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}

package com.interpreter;

public class Main {
  public static void main(String[] args) {
    System.err.println("Logs from your program will appear here!");

    if (args.length < 2) {
      System.err.println("Usage: ./your_program.sh tokenize <filename>");
      System.exit(1);
    }

    if (!args[0].equals("tokenize")) {
      System.err.println("Unknown command: " + args[0]);
      System.exit(1);
    }

    Lox.runFile(args[1]);
  }
}

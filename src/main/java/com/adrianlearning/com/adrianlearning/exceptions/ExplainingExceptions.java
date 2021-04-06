package com.adrianlearning.com.adrianlearning.exceptions;

public class ExplainingExceptions {
    public static void main(String[] args) {
        levelOne();
    }

    private static void levelOne() {
        levelTwo();
    }

    private static void levelTwo() {
        try {
            levelThree();
        } catch (Exception e) {
            System.out.println("Im here");
        }
    }

    private static void levelThree() {
        int i = 0/0;
    }
}

class AdrianException extends Exception {

    public AdrianException() {
        super();
    }

    public AdrianException(String message) {
        super(message);
    }
}

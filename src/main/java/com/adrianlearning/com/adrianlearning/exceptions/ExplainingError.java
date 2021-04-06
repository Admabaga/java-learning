package com.adrianlearning.com.adrianlearning.exceptions;

public class ExplainingError {
    public static void main(String[] args) {
        error();
    }

    private static void error() {
        System.out.println("Im error");
        error();
    }
}

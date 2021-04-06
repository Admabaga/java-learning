package com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes;


public enum Currency {
    PESO ("Peso", "COP"),
    DOLAR ("Dolar", "USD"),
    EURO("Euro", "EU");

    private String value;
    private String symbol;

    Currency(String value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}

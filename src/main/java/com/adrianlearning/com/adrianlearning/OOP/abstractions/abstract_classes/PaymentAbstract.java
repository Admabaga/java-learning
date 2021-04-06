package com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes;

public abstract class PaymentAbstract {
    protected Currency currency;

    public PaymentAbstract(Currency currency) {
        this.currency = currency;
    }

    public abstract void pay(Integer amount);

    void pay(Integer amount, Currency currency) {
        System.out.println(" You're going to pay the amount of " + amount + " in the currency " + currency.getValue() + currency.getSymbol());
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
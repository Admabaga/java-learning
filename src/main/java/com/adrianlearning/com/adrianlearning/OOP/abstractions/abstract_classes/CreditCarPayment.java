package com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes;

import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.Payment;

public class CreditCarPayment extends PaymentAbstract implements Payment {

    public CreditCarPayment(Currency currency) {
        super(currency);
    }

    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying the amount of " + amount + " in the currency" + currency.getSymbol());
    }
}

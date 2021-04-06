package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public class BitcoinPayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying with bitcoins "+ amount);
    }
}

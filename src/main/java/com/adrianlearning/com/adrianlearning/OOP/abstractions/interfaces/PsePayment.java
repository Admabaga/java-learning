package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public class PsePayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying with my debit card" + amount);
    }
}

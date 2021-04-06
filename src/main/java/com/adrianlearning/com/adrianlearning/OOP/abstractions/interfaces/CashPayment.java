package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public
class CashPayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying with cash the amount of " + amount);
    }
}

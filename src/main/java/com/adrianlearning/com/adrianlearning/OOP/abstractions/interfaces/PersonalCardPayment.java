package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public class PersonalCardPayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying with your personal card " + amount);
    }
}

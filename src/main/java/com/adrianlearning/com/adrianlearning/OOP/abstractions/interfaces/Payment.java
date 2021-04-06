package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public interface Payment {
    void pay(Integer amount);
    static void pay(Integer amount, Integer discount) {
        System.out.println("This is the second payment");
    }
}





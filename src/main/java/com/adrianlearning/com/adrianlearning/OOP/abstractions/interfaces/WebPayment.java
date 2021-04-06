package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public class WebPayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying this amount web " + amount);
         }
    public void payByWeb(){
        System.out.println("web paying ");
    }
    }

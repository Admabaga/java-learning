package com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces;

public class CouponPayment implements Payment {
    @Override
    public void pay(Integer amount) {
        System.out.println("Im paying with my coupons " + amount);
    }
}

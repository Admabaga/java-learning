package com.adrianlearning.com.adrianlearning.OOPv1;

import com.adrianlearning.com.adrianlearning.OOP.inheritance.Car;

public class ToyotaCar extends Car {

    private Boolean is4x4 = true;

    public ToyotaCar(Integer size, Integer model, Integer cilindraje, Integer force, Boolean is4x4) {
       super ( size, model, cilindraje, force);
        this.is4x4 = is4x4;
    }

    public void run() {
        System.out.println("The car is running in the general Car class");
    }

    public boolean is4x4Method(){
        return is4x4;
    }

    public void checkingProtected() {
        System.out.println(super.size);
    }


}

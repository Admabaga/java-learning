package com.adrianlearning.com.adrianlearning.OOP.inheritance;

import com.adrianlearning.com.adrianlearning.OOPv1.ToyotaCar;

public class Starter {
    public static void main(String[] args) {
        Car car = new Car(500, 2010, 1500, 8);
        System.out.println(car.getSize());

        TeslaCar teslaCar = new TeslaCar(500, 2010, 1500, 8, false);

        ToyotaCar toyotaCar = new ToyotaCar(500, 2015, 15, 8, true );
        System.out.println(toyotaCar.is4x4Method());
        System.out.println(toyotaCar.getSize());

    }
}

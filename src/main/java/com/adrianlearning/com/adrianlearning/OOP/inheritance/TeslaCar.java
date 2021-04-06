package com.adrianlearning.com.adrianlearning.OOP.inheritance;

public class TeslaCar extends Car {

    private Boolean hasComputer = true;

    public TeslaCar(Integer size, Integer model, Integer cilindraje, Integer force, Boolean hasComputer) {
        super(size, model, cilindraje, force);
        this.hasComputer = hasComputer;
    }

    public void hasCumputerMethod() {
        System.out.println("This model deos not have computer");
    }

}

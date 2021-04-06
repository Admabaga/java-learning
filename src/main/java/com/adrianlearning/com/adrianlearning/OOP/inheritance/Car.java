package com.adrianlearning.com.adrianlearning.OOP.inheritance;

public class Car {
    protected Integer size;
    private Integer model;
    private Integer cilindraje;
    private Integer force;

    public Car(Integer size, Integer model, Integer cilindraje, Integer force) {
        this.size = size;
        this.model = model;
        this.cilindraje = cilindraje;
        this.force = force;
    }

    public void run() {
        System.out.println("The car is running in the general Car class");
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }
}

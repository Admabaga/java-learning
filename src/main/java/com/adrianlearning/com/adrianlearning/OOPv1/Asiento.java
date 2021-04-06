package com.adrianlearning.com.adrianlearning.OOPv1;

public class Asiento {
    String color;
    Integer size;
    Integer weight;
    Integer MAX_WEIGHT_SUPPOT = 200;

    public Asiento(String color, Integer size, Integer weight ) {
        this.color = color;
        this.size = size;
        this.weight = weight;

    }

    public void soportarPeso() {
        System.out.println("The max amount of weight that his object support is " + MAX_WEIGHT_SUPPOT);
    }
}

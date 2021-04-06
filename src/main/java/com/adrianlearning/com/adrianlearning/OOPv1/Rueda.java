package com.adrianlearning.com.adrianlearning.OOPv1;

public class Rueda {
    Integer longitud;
    Integer radio;
    Integer peso;
    String color;

    public Rueda(Integer longitud, Integer radio, Integer peso, String color) {
        this.longitud = longitud;
        this.radio = radio;
        this.peso = peso;
        this.color = color;
    }

    public void rodar() {
        System.out.println("Im roding with the next atributes lg:" + longitud + " radio: " + radio);
    }
}

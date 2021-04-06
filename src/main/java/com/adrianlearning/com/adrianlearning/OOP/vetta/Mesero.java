package com.adrianlearning.com.adrianlearning.OOP.vetta;

public class Mesero {
    private String name;

    public Mesero(String name) {
        this.name = name;
    }

    public void Saludar(){
        System.out.println("Hola soy "+name);
    }
    public Integer calcularPrecio(){
        // Escenario Real ir a la BD
        return 2000;
    }
    public Integer cobrar(){
        Integer price = calcularPrecio();
        System.out.println("la cerveza vale "+ price);
        return  price;
    }
    public void entregar(){
        System.out.println("Mira tu cerveza");
    }
    public void despedirse(){
        System.out.println("Que estes muy bien");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

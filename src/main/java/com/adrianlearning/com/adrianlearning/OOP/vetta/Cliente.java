package com.adrianlearning.com.adrianlearning.OOP.vetta;

public class Cliente {

    private String name;
    private Integer estamina;

    public Cliente(String name, Integer estamina) {
        this.name = name;
        this.estamina = estamina;
    }

    public void saludar() {
        System.out.println("Hola, Muy Buenas Tardes soyr " + name);
    }

    public void pedirCerveza() {
        System.out.println("Por favor me podrias dar una cerveza!?");
    }

    public void recibirCerveza() {
        System.out.println("Gracias por entregarme la cerveza");
    }

    public void pagar(Integer price){
        System.out.println("Aqui tienes " + price);
    }

    public void beber(){
        System.out.println("Beber");
        estamina = estamina -5;
    }

    public void despedirse() {
        System.out.println("Muchas Gracias");
    }

    public void estado(){
        if (estamina < 0) {
            System.out.println("Llevado de la chanda");
        } else {
            System.out.println("Melo bb");
        }
    }
}

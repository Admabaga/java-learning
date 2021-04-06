package com.adrianlearning.com.adrianlearning.OOP;

public class TryingDefault {

    public static void main(String[] args) {
        Perro perroWithoutParameter = new Perro();
        Perro perroWithName = new Perro("Firulais");
        Perro perroWithNameAndAge = new Perro("Firulais", 3);
        Perro perroWithAge = new Perro(3);
    }
}

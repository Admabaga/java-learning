package com.adrianlearning.com.adrianlearning.OOP.static_vs_instance;

public class Persona {
    static Boolean hasBody = true;

    static void tryingStatic() {
        System.out.println("This is a static method");
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println(Persona.hasBody);
        Persona.tryingStatic();
    }
}

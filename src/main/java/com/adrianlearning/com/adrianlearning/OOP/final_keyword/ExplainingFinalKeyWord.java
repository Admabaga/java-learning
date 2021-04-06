package com.adrianlearning.com.adrianlearning.OOP.final_keyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExplainingFinalKeyWord {
    public static void main(String[] args) {
        Persona adrian = new Persona("Adrian", new ArrayList<>());
        System.out.println(adrian.toString());
        adrian.getFriends().add("Camila");
        System.out.println(adrian.toString());
        adrian.getFriends().add("Toya");
        System.out.println(adrian.toString());
        adrian = new Persona("Adrian", Arrays.asList("Camila", "Toya"));


    }
}

class Persona {
    final String name;
    final List<String> friends;

    public Persona(String name, List<String> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return new ArrayList<>(friends);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}

class A {}
final class B extends A {}

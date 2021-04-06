package com.adrianlearning.com.adrianlearning.Collection.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExplainingHashSet {
    /**
     * You're going to create a Person Object -> That is going to have the next information, String id, String name, and Address
     * Where Address is another object with the next information -> String city, Struing, street, String Avenue
     * 1. Create a well defined HashCode and Equals Method for the person object
     *
     */

    static Comparator<Persona> orderById = (Persona p1, Persona p2) -> p1.id.compareTo(p2.id);
    static Comparator<Persona> orderByName = (Persona p1, Persona p2) -> p1.name.compareTo(p2.name);

    public static void main(String[] args) {
        playingWithSets();
    }

    private static void playingWithSets() {
        Persona persona = new Persona("16548", "Andres", new Address("Bello", "Calle 19", "59"));
        Persona person1 = new Persona("1", "123", new Address("Bello", "Calle 19", "59"));
        Persona person2 = new Persona("2", "Anssadsdres", new Address("Bello", "Calle 19", "59"));
        Persona person3 = new Persona("3", "dfsdf", new Address("Bello", "Calle 19", "59"));
        Persona persona4 = new Persona("4", "An34234dres", new Address("Bello", "Calle 19", "59"));
        Persona persona5 = new Persona("10000", "Anddsfsdfres", new Address("Bello", "Calle 19", "59"));
        Persona persona1 = new Persona("8456489184", "Adrian", new Address("Medellin", "Calle 56", "20"));
        Set<Persona> personas = new TreeSet<>(orderById);
        personas.add(persona );
        personas.add(person1 );
        personas.add(person2 );
        personas.add(person3 );
        personas.add(persona4 );
        personas.add(persona1 );
        personas.add(persona5);

        personas.stream()
                .mapToInt(x -> Integer.valueOf(x.id))
                .filter(x -> x > 100)
                .peek(x -> System.out.println(x));
    }
}

class Persona {
    String id;
    String name;
    Address address;

//    @Override
//    public int compareTo(Persona persona) {
//        return -this.id.compareTo(persona.id);
//    }

    public Persona(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Persona persona = (Persona) obj;
        return this.id.equals(persona.id) && this.name.equals(persona.name);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address{
    String city;
    String street;
    String avenue;

    public Address(String city, String street, String avenue) {
        this.city = city;
        this.street = street;
        this.avenue = avenue;
    }
}

package com.adrianlearning.com.adrianlearning.Collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class PlayingWithComparabt {

    private static Comparator<Persona> compareByName = (Persona pers1, Persona pers2) -> pers1.getName().compareTo(pers2.getName());
    private static Comparator<Persona> compareByPhone = (Persona pers1, Persona pers2) -> pers1.getPhone().compareTo(pers2.getPhone());


    public static void main(String[] args) {
        Map<Persona, Integer> personasToId = new TreeMap<>(compareByName);
        personasToId.put(new Persona("Xdrian", "123"), 45646);
        personasToId.put(new Persona("Bdrian", "123"), 789);
        personasToId.put(new Persona("Adrian", "123"), 96382);
        personasToId.forEach((k,v) -> System.out.println(k + " " + v));

        Map<Persona, Integer> personasToIdPhone = new TreeMap<>(compareByPhone);
        personasToIdPhone.put(new Persona("Xdrian", "123"), 45646);
        personasToIdPhone.put(new Persona("Bdrian", "223"), 789);
        personasToIdPhone.put(new Persona("Adrian", "323"), 96382);
        personasToIdPhone.forEach((k,v) -> System.out.println(k + " " + v));
    }
}

class Persona {
    private String name;
    private String phone;

    public Persona(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

package com.adrianlearning.com.adrianlearning.Collection;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithLists {

    public static void main(String[] args) {
        List<Mascota> mascotas = createMascotas();
        String name = "Dolphin";
        String id = "4";

        for (int i = 0; i < mascotas.size(); i++) {
            Mascota auxMascota = mascotas.get(i);
            if (auxMascota.getName() == name || auxMascota.getId() == id) {
                System.out.println("Lo encontramos");
                System.out.println(auxMascota);
            }
        }
    }

    private static List<Mascota> createMascotas() {
        List<Mascota> mascotas = new ArrayList<>();
        Mascota mascota1 = new Mascota("Lulu", "123", "Gata");
        Mascota mascota2 = new Mascota("Doggy", "1", "Perro");
        Mascota mascota3 = new Mascota("Dolphin", "2", "Delfin");
        Mascota mascota4 = new Mascota("Stampy", "3", "Elefante");
        Mascota mascota5 = new Mascota("Igol", "4", "Aguila");
        Mascota mascota6 = new Mascota("Fishe", "5", "Shark");
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);
        mascotas.add(mascota6);
        return mascotas;
    }
}

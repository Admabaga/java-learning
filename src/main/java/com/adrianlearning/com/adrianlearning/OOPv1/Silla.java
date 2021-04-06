package com.adrianlearning.com.adrianlearning.OOPv1;

import java.util.Arrays;
import java.util.List;

public class Silla {
    List<Rueda> ruedas = Arrays.asList(
            new Rueda(1,2,3,"white"),
            new Rueda(2,3,4,"black"),
            new Rueda(5,6,5,"rojo"),
            new Rueda( 4, 7,9, "amarillo" ));
    Espaldar espaldar = new Espaldar();
    String palanca = "Larga";
    Asiento asiento = new Asiento("black",36, 70);

    public void move() {
        System.out.println("The chair moves");
    }

    public void description() {
        System.out.println("The chair is composed with the next elements");
        System.out.println("It has " + ruedas.size() +" ruedas");
        System.out.println("The espaldar color is " + espaldar.color);
        System.out.println("The palanca is " + palanca);
        System.out.println("The asiento is " + asiento.color + " and also is " + asiento.weight);
    }
}

package com.adrianlearning.com.adrianlearning.OOP.vetta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente camilita = new Cliente("Camilita", 15);
        Cliente pipe = new Cliente("pipe", 20);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(camilita);
        clientes.add(pipe);

        Mesero javier = new Mesero("javier");
        Local vetta = new Local(javier, camilita);
        vetta.pedirCerveza();
        //Local vettaPipe = new Local(javier, pipe);
    }
}

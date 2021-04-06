package com.adrianlearning.com.adrianlearning.OOP.vetta;

public class Local {
    private Mesero mesero;
    private Cliente cliente;

    public Local(Mesero mesero, Cliente cliente) {
        this.mesero = mesero;
        this.cliente = cliente;
    }
    public void pedirCerveza(){
        cliente.saludar();
        mesero.Saludar();
        cliente.pedirCerveza();
        mesero.calcularPrecio();
        Integer price = mesero.cobrar();
        mesero.entregar();
        cliente.recibirCerveza();
        cliente.pagar(price );
        cliente.despedirse();
        mesero.despedirse();
    }
}

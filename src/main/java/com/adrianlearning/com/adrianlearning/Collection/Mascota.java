package com.adrianlearning.com.adrianlearning.Collection;

public class Mascota {
    private String name;
    private String id;
    private String tipo;

    public Mascota(String name, String id, String tipo) {
        this.name = name;
        this.id = id;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

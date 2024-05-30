package com.mycompany.models;

public class SuperHeroe extends Figura{
    // ATTRIBUTES
    boolean antiHeroe;

    // CONSTRUCTOR

    public SuperHeroe(String nombre, String descripcion, String codigo, double precio) {
        super(nombre, descripcion, codigo, precio);
        this.antiHeroe = false;
    }
}

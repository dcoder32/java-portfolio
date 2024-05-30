package com.mycompany.models;

import java.util.ArrayList;

public class Coleccion {
    // ATTRIBUTES
    private String nombre;
    private ArrayList<Figura> coleccion;

    // CONSTRUCTOR
    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.coleccion = new ArrayList<>();
    }

    // GETTERS AND SETTERS
    public ArrayList<Figura> getColeccion() {
        return coleccion;
    }

    // METHOD
    public void agregarFigura(Figura figura){
        coleccion.add(figura);
    }

    public ArrayList<String> conCapa() {
        ArrayList<String> heroesConCapa = new ArrayList<>();
        for( Figura heroe : coleccion) {
            if (heroe.getCapa() == true) {
                heroesConCapa.add(heroe.getNombre());
            }
        }
        return heroesConCapa;
    }


}

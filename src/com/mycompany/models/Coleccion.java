package com.mycompany.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

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

    public Optional<Figura> masValioso() {
        return coleccion.stream().max(Comparator.comparingDouble(Figura::getPrecio));
    }

    public double getValorColeccion() {
        double valorTotal = 0;
        for (Figura figu : coleccion) {
            valorTotal  += figu.getPrecio();
        }
        return valorTotal;
    }

    public double getVolumenTotal() {
        double volumenTotal = 0;
        for (Figura figu : coleccion) {
            volumenTotal += figu.getDimension().calcVol();
        }

        return volumenTotal;
    }
}

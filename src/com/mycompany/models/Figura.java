package com.mycompany.models;

import java.util.ArrayList;

public class Figura {

    // ATTRIBUTES
    private String nombre;
    private String descripcion;
    private boolean capa;
    private Dimension dimension = new Dimension();
    private String idCodigo;
    private double precio;

    // CONSTRUCTOR
    public Figura(String nombre, String descripcion, String idCodigo, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCodigo = idCodigo;
        this.precio = precio;
    }

    // METHODS

    @Override
    public String toString() {
        return """
                Figura = Nombre: %s
                         Descripcion: %s
                         Capa: %b
                         Codigo: %s
                         Precio: %.2f
                """.formatted(nombre, descripcion, capa, idCodigo, precio) + dimension.toString();
    }

    public void subirPrecio(double aumento){
        this.precio += aumento;
    }

    // GETTERS AND SETTERS

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdCodigo(String idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getIdCodigo() {
        return idCodigo;
    }

    public boolean getCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public void setDimension(Dimension dimension){
        this.dimension = dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getNombre(){
        return nombre;
    }

}

package com.mycompany.models;

public class Dimension {
    // ATTRIBUTES
    private double alto;
    private double ancho;
    private double longitud;

    // CONSTRUCTOR

    public Dimension(){}

    public Dimension(double alto, double ancho, double longitud){
        this.alto = alto;
        this.ancho = ancho;
        this.longitud = longitud;
    }

    // GETTERS AND SETTERS

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public double getLongitud() {
        return longitud;
    }

    // METHODS

    public Double calcVol(){
        return alto*ancho*longitud;
    }

    @Override
    public String toString() {
        return """
                Alto: %.2f Ancho %.2f Longitud %.2f Volumen: %.2f
                """.formatted(alto, ancho, longitud,calcVol());
    }
}

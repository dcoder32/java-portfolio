package com.mycompany.test;

import com.mycompany.models.Coleccion;
import com.mycompany.models.Dimension;
import com.mycompany.models.Figura;
import com.mycompany.models.SuperHeroe;

public class test {
    public static void main(String[] args) {

        Figura figura1 = new SuperHeroe("Spiderman", "Puede trepar en las paredes.", "0001", 3.99);
        Figura figura2 = new SuperHeroe("Iron Man", "Tiene armadura de hierro y mucho dinero.", "0002", 6.99);
        Figura figura3 = new SuperHeroe("THOR", "Es el dios del trueno.", "0004", 3.50);
        Figura figura4 = new SuperHeroe("Capitan America", "Mercenario de la segunda guerra mundial.", "0004", 7.99);
        Figura figura5 = new SuperHeroe("Vision", "Robot que traspasa paredes", "0005", 5.99);
        Figura figura6 = new SuperHeroe("Bruja Scarlata", "Una bruja muy sexy", "0006", 10.99);



        figura1.setDimension(new Dimension(1.60, 0.25, 0.12));
        figura2.setDimension(new Dimension(1.70, 0.30, 0.14));
        figura3.setDimension(new Dimension(1.80, 0.40, 0.18));
        figura4.setDimension(new Dimension(1.80, 0.40, 0.17));
        figura4.setDimension(new Dimension(1.90, 0.30, 0.15));


        figura3.setCapa(true);
        figura5.setCapa(true);
        figura6.setCapa(true);

        Coleccion coleccion = new Coleccion("Marvel Heroes");

        coleccion.agregarFigura(figura1);
        coleccion.agregarFigura(figura2);
        coleccion.agregarFigura(figura3);
        coleccion.agregarFigura(figura4);
        coleccion.agregarFigura(figura5);
        coleccion.agregarFigura(figura6);

        figura2.subirPrecio(1);

        System.out.println(coleccion.masValioso());

        System.out.println(coleccion.getValorColeccion());
        System.out.println(coleccion.getVolumenTotal());


    }
}

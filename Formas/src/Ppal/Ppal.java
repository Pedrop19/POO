package Ppal;

import java.util.*;

import Clases.*;
import Superclases.*;

public class Ppal {
    public static void main(String[] args) {

        LinkedList<Forma> formas = new LinkedList<Forma>();
        List<Double> lista = new ArrayList<Double>();

        Punto centro_1 = new Punto(15.0, 16.0);
        Punto centro_2 = new Punto(20.0, 25.0);
        Rectangulo rectangulo_1 = new Rectangulo("Amarillo", "Rectangulo_1", centro_1, 10, 20);
        formas.add(rectangulo_1);
        Cuadrado cuadrado_1 = new Cuadrado("Blanco", "Cuadrado_1", centro_1, 20);
        formas.add(cuadrado_1);
        Elipse elipse_1 = new Elipse("Rojo", "Elipse_1", centro_1, 20, 10);
        formas.add(elipse_1);
        Circulo circulo_1 = new Circulo("Gris", "Circulo_1", centro_1, 10);
        formas.add(circulo_1);

        System.out.println(rectangulo_1.area());
        System.out.println(rectangulo_1.perimetro());
        rectangulo_1.setColor("Amarillo");
        System.out.println(rectangulo_1.getColor());

        for (int i = 0; i < formas.size(); i++) {
            formas.get(i).setColor("Purpura");
            formas.get(i).setCentro(centro_2);
            System.out.println(formas.get(i).nombre);
            System.out.println(formas.get(i).color);
            System.out.println(formas.get(i).centro);

            lista.add(formas.get(i).area());
        }

        double maxArea = 0;
        Forma formaMaxima = null;
        for (int j = 0; j < lista.size(); j++) {
            if (lista.get(j) > maxArea)
                maxArea = lista.get(j);
            formaMaxima = formas.get(j);
        }

        System.out.println("El area maxima de la lista de formas es: " + maxArea +
                " Y pertenece a: " + formaMaxima.getNombre());
    }
}

package Ppal;

import java.util.*;

import Clases.*;
import Enums.Est_Civil;
import SuperClases.*;

public class Ppal {
    public static void main(String[] args) {
        
        LinkedList<Persona> personas = new LinkedList<Persona>();

        Centro centro_1 = new Centro(personas);

        Profesor p_1 = new Profesor("Jose", "Alvarez", "55x", Est_Civil.CASADO, 2000, 55, "Informatica");

        centro_1.addPersona(p_1);

        centro_1.imprimir();

    }
}

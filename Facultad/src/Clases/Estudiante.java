package Facultad.src.Clases;

import Facultad.src.Enums.*;
import Facultad.src.SuperClases.*;

public class Estudiante extends Persona {

    private String curso;

    public Estudiante(String nombre, String apellidos, String DNI, Est_Civil est_Civil, String curso) {
        super(nombre, apellidos, DNI, est_Civil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [" + super.toString() + "curso=" + curso + "]";
    }
}

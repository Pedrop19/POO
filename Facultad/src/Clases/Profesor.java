package Facultad.src.Clases;

import java.sql.Date;

import Facultad.src.Enums.*;
import Facultad.src.SuperClases.*;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(String nombre, String apellidos, String dNI, Est_Civil est_Civil, Date anio_incorporacion,
            int n_despacho, String departamento) {
        super(nombre, apellidos, dNI, est_Civil, anio_incorporacion, n_despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor [" + super.toString() + "departamento=" + departamento + "]";
    }

}

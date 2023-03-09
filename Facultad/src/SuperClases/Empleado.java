package Facultad.src.SuperClases;

import java.sql.*;

import Facultad.src.Enums.*;

public abstract class Empleado extends Persona {

    private Date anio_incorporacion;
    private int n_despacho;

    public Empleado(String nombre, String apellidos, String DNI, Est_Civil est_Civil,
            Date anio_incorporacion, int n_despacho) {
        super(nombre, apellidos, DNI, est_Civil);
        this.anio_incorporacion = anio_incorporacion;
        this.n_despacho = n_despacho;
    }

    public Date getAnio_incorporacion() {
        return anio_incorporacion;
    }

    public void setAnio_incorporacion(Date anio_incorporacion) {
        this.anio_incorporacion = anio_incorporacion;
    }

    public int getN_despacho() {
        return n_despacho;
    }

    public void setN_despacho(int n_despacho) {
        this.n_despacho = n_despacho;
    }

    @Override
    public String toString() {
        return "Empleado [" + super.toString() + "anio_incorporacion=" + anio_incorporacion + ", n_despacho="
                + n_despacho + "]";
    }

}

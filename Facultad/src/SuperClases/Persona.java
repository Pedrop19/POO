package Facultad.src.SuperClases;

import Facultad.src.Enums.*;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private Est_Civil est_Civil;

    public Persona(String nombre, String apellidos, String DNI, Est_Civil est_Civil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.est_Civil = est_Civil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public Est_Civil getEst_Civil() {
        return est_Civil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setEst_Civil(Est_Civil est_Civil) {
        this.est_Civil = est_Civil;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", est_Civil=" + est_Civil
                + "]";
    }
}

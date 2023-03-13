package SuperClases;

import Enums.*;

public abstract class Empleado extends Persona {

    private int anio_incorporacion;
    private int n_despacho;

    public Empleado(String nombre, String apellidos, String DNI, Est_Civil est_Civil,
            int anio_incorporacion, int n_despacho) {
        super(nombre, apellidos, DNI, est_Civil);
        this.anio_incorporacion = anio_incorporacion;
        this.n_despacho = n_despacho;
    }

    public int getAnio_incorporacion() {
        return anio_incorporacion;
    }
    public void setAnio_incorporacion(int anio_incorporacion) {
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
        return super.toString() + "\nAño de incorporación: " + anio_incorporacion + "\nn_despacho: "
                + n_despacho;
    }

}

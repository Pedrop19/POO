package Clases;

import java.sql.Date;

import Enums.*;
import SuperClases.*;

public class Personal_Servicio extends Empleado{

    private String seccion;

    public Personal_Servicio(String nombre, String apellidos, String DNI, Est_Civil est_Civil, int anio_incorporacion,
            int n_despacho, String seccion) {
        super(nombre, apellidos, DNI, est_Civil, anio_incorporacion, n_despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal_Servicio" + super.toString() + "\nseccion: " + seccion;
    }
    
    
}

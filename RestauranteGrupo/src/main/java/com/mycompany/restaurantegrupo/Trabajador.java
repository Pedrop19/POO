/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantegrupo;

/**
 *
 * @author mmarq
 */
public class Trabajador {
    private String dni;
    private String nombre;
    private String apellidos;
    private Rango rangos;

    public Trabajador(String dni, String nombre, String apellidos, Rango rangos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rangos = rangos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Rango getRangos() {
        return rangos;
    }

    public void setRangos(Rango rangos) {
        this.rangos = rangos;
    }
    
    
}

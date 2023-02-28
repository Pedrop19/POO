/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantegrupo;

import java.util.LinkedList;

/**
 *
 * @author mmarq
 */
public class Proveedor {
    private String dni;
    private String nombre;
    private String empresa;
    private LinkedList<Ingrediente> ingredientes;

    public Proveedor(String dni, String nombre, String empresa, Ingrediente ingredientes) {
        this.dni = dni;
        this.nombre = nombre;
        this.empresa = empresa;
        this.ingredientes = new LinkedList<Ingrediente>();
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}

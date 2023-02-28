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
public class Plato {
    private int idPlato;
    private String nombrePlato;
    private String descripcion;
    private Nivel nivelDificultad;
    private double precio;
    private Categoria menu;
    private LinkedList<Ingrediente> ingredientes;
    private LinkedList<Trabajador> trabajadores;

    public Plato(int idPlato, String nombrePlato, String descripcion, Nivel nivelDificultad, double precio, Categoria menu, Ingrediente ingredientes, Trabajador trabajadores) {
        this.idPlato = idPlato;
        this.nombrePlato = nombrePlato;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.precio = precio;
        this.menu = menu;
        this.ingredientes = new LinkedList<Ingrediente>();
        this.trabajadores = new LinkedList<Trabajador>();
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Nivel getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Nivel nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getMenu() {
        return menu;
    }

    public void setMenu(Categoria menu) {
        this.menu = menu;
    }
    
    
}

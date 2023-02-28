/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantegrupo;

/**
 *
 * @author mmarq
 */
public class Ingrediente {
    private int idIngrediente;
    private TIPO tipodealimente;
    private double precio;

    public Ingrediente(int idIngrediente, TIPO tipodealimente, double precio) {
        this.idIngrediente = idIngrediente;
        this.tipodealimente = tipodealimente;
        this.precio = precio;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public TIPO getTipodealimente() {
        return tipodealimente;
    }

    public void setTipodealimente(TIPO tipodealimente) {
        this.tipodealimente = tipodealimente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

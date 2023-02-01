/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author Pedro Lazaro
 */
public class Principal {

    public static void main(String[] args) {
        
        Persona p = new Persona();
        Persona p1 = new Persona("Pedro", "Lazaro Nevado", 27);
        
        p.mostrarInfo();
        p1.mostrarInfo();
    }
    
}

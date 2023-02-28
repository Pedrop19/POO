/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.restaurantegrupo;

/**
 *
 * @author mmarq
 */
public class RestauranteGrupo {
	
    public static void main(String[] args) {
        int opc = 0;
        do{
            System.out.println("1. AÑADIR EMPLEADO"); //MANUELF
            System.out.println("2. DESPEDIR EMPLEADO"); //MANUELF
            System.out.println("3. RECEPCIONAR PEDIDO DE PROVEEDOR"); //JORGE Y RAUL
            System.out.println("4. CREAR PLATO"); //MANUEL
            System.out.println("5. BORRAR UN PLATO"); //MANUEL
            System.out.println("6. AGREGAR PROVEEDOR"); //JORGE Y RAUL
            System.out.println("7. MOSTRAR BENEFICIO"); //PEDRO
            System.out.println("8. MOSTRAR AVISO DEL ALMACEN"); //PEDRO
            System.out.println("9. VENTA DE PLATO"); //PEDRO
            System.out.println("10. SALIR");
        }while(opc !=11);
    }
}
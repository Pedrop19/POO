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
            System.out.println("1. CREAR PLATO");
            System.out.println("2. AÑADIR EMPLEADO");
            System.out.println("3. DESPEDIR EMPLEADO");
            System.out.println("4. BORRAR UN PLATO");
            System.out.println("5. AÑADIR INGREDIENTE");
            System.out.println("6. RECEPCIONAR PEDIDO DE PROVEEDOR");
            System.out.println("7. AGREGAR PROVEEDOR");
            System.out.println("8. MOSTRAR BENEFICIO");
            System.out.println("9. MOSTRAR AVISO DEL ALMACEN");
            System.out.println("10. VENTA DE PLATO");
            System.out.println("11. SALIR");
        }while(opc !=11);
    }
}

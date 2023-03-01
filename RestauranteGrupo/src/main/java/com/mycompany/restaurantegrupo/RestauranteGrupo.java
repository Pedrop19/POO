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

        LinkedList<Plato> platos = new LinkedList<Plato>();

        int opc = 0;
        do{
            System.out.println("1. AÑADIR EMPLEADO"); //MANUELF
            System.out.println("2. DESPEDIR EMPLEADO"); //MANUELF
            System.out.println("3. RECEPCIONAR PEDIDO DE PROVEEDOR"); //JORGE Y RAUL
            System.out.println("4. CREAR PLATO"); //MANUEL
            System.out.println("5. BORRAR UN PLATO"); //MANUEL
            System.out.println("6. AGREGAR PROVEEDOR"); //JORGE Y RAUL
            System.out.println("7. MOSTRAR BENEFICIO"); //PEDRO
            System.out.println("8. VENTA DE PLATO"); //PEDRO
            System.out.println("9. SALIR");
        }while(opc !=9);
    }

    //System.out.println("9. VENTA DE PLATO");
    public void VentaPlato (LinkedList<Plato> platos){
    	Scanner enteros = new Scanner(System.in);
                
        System.out.println("--- VENTA DE PLATO ---");
        System.out.println("A continuación se mostrará una lista de los platos disponibles: ");
        mostrarPlatos(platos);
        System.out.println("Eliga mediante el identificador el plato que quiere vender: ");
        int identificador = enteros.nextInt();
            
        for (int i = 0; i < platos.size(); i++) {
            if(platos.get(i).getIdPlato() == identificador) {
                platos.remove(identificador);
            }
        }
    }

	public void mostrarPlatos(LinkedList<Plato> platos) {
		System.out.println("-- LISTA DE PLATOS --");
		for (int i = 0; i < platos.size(); i++) {
			System.out.println("Identificador: " + (i + 1) + " - " + "Nombre: " + platos.get(i).getNombrePlato()
					+ " - " + "Precio: " + platos.get(i).getPrecio());
		}
	}
	
    //System.out.println("7. MOSTRAR BENEFICIO");
	public double mostrarBeneficios(LinkedList<Plato> platos, LinkedList<Ingrediente> ingredientes) {
		
		double sumaPlato = 0;
		double sumaIng = 0;
		
		for (int i = 0; i < platos.size(); i++) {
			sumaPlato += platos.get(i).getPrecio();
		}
		
		for (int j = 0; j < ingredientes.size(); j++) {
			sumaIng += ingredientes.get(j).getPrecio();
		}
		
		return sumaPlato - sumaIng;
	}
}
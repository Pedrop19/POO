package Ppal;

import java.util.LinkedList;
import java.util.Scanner;

public class Ppal {
	
	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		LinkedList<Alimento> alimentos = new LinkedList<Alimento>();
		Alimento pepino = new Alimento(0, "Pepino", 5);
		Alimento cebolla = new Alimento(1, "Cebolla", 0);
		alimentos.add(pepino);
		alimentos.add(cebolla);
		
        int opc = 0;
        do{
        	System.out.println("Bienvenido, eliga una opción para comenzar[1-5]");
            System.out.println("1. ALQUILAR HABITACION");
            System.out.println("2. ELIMINAR HABITACION");
            System.out.println("3. SERVIR BUFFET");
            System.out.println("4. LIMPIAR HABITACION");
            System.out.println("5. SALIR");
            opc = numeros.nextInt();
            
        	switch(opc) {
        	
        		case 1:
        			break;
        		case 2:
        			break;
        		case 3:
        			servirBuffet(alimentos);
        			break;
        		case 4:
        			break;
        	}
        }while(opc !=5);
        
        
    }
	
	public static void servirBuffet(LinkedList<Alimento> alimentos) {
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("3. SERVIR BUFFET");
		System.out.println("A continuación se mostrará una lista de todos los productos disponibles: ");
		mostrarProductos(alimentos);
		System.out.println("Elige los alimentos mediante su número de serie: ");
		int n_serie = numeros.nextInt();
		for (int i = 0; i < alimentos.size(); i++) {
			if(alimentos.get(i).getN_serie() == n_serie) {
				if(alimentos.get(n_serie).getCantidad() != 0) {
				System.out.println("A continuación se muestra la cantidad del producto seleccionado: ");
				System.out.println(alimentos.get(n_serie).getCantidad());
				System.out.println("Que cantidad de alimentos quieres usar: ");
				int cantidad = numeros.nextInt();
				alimentos.get(n_serie).setCantidad(alimentos.get(n_serie).getCantidad() - cantidad);
				}else {
				System.out.println("Cantidad: " + alimentos.get(n_serie).getCantidad());
				System.out.println("ERROR: No hay alimentos");
				}
			}
		}
	}

	public static void mostrarProductos(LinkedList<Alimento> alimentos) {
		System.out.println("-- LISTA DE ALIMENTOS --");
		for (int i = 0; i < alimentos.size(); i++) {
			System.out.println("Número de Serie: " + alimentos.get(i).getN_serie() + " - " + "Nombre: " + alimentos.get(i).getNombre()
					+ " - " + "Cantidad: " + alimentos.get(i).getCantidad());
		}
	}
}

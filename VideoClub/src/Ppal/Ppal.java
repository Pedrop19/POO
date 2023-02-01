package Ppal;

import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner;


public class Ppal {
	public static void main(String[] args) {
		Menu();
	}
	
	public static void Menu() {
		
		Scanner strings = new Scanner(System.in);
		Scanner enteros = new Scanner(System.in);
		
		LinkedList<Persona> personas = new LinkedList<Persona>();
		LinkedList<Peliculas_Series> pel_ser = new LinkedList<Peliculas_Series>();
		LinkedList<Alquileres> alquileres = new LinkedList<Alquileres>();
		
		int opc = 0;
		int idPel_Ser = 0;
		int idA = 0;
		
		System.out.println("--- SISTEMA DE GESTION DEL VIDEOCLUB ---");
		do {
			
			System.out.println("Bienvenido, eliga una opción para comenzar[1-7]");
			System.out.println("1. Registrar Cliente");
			System.out.println("2. Nuevo Alquiler");
			System.out.println("3. Fin Alquiler");
			System.out.println("4. Listar Alquileres");
			System.out.println("5. Nueva Pelicula/Serie");
			System.out.println("6. Salir");
			opc = enteros.nextInt();
			
			switch(opc) {
			
				case 1:
					RegistrarCliente();
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					System.out.println("ERROR: OPCION NO VALIDA");
					break;
			}
		}while(opc != 6);
		
	}
	
	public static void RegistrarCliente() {
		
		Scanner enteros = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		
		System.out.println("-- REGISTRAR CLIENTE --");
		
		System.out.println("Introduzca el DNI: ");
	    String dni = strings.next();
	    
	    System.out.println("Introduzca el nombre: ");
	    String nombre = strings.next();
	    
	    System.out.println("Introduzca el apellido: ");
	    String apellidos = strings.next();
	    
	    System.out.println("Introduzca el telefono: ");
	    int telefono = enteros.nextInt();
	    
	    System.out.println("Introduzca el email: ");
	    String email = strings.next();
	    
	    System.out.println("Introduzca la direccion: ");
	    String direccion = strings.next();
	    
	    Persona p = new Persona(dni, nombre, apellidos, telefono, email, direccion);
	    
	    System.out.println("Cliente Registrado");
	}
	
	public static void NuevoAlquiler() {
		
		LinkedList<Persona> personas = new LinkedList<Persona>();
		Scanner enteros = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		
		System.out.println("-- Nuevo Alquiler --");
		
		int id_alquiler;
		Persona persona;
		Date fecha_inicio;
		Date fecha_fin;
		Peliculas_Series pel_ser;
		
		System.out.println("A continuación se mostraran las "
				+ "personas disponibles a las que se puede añadir el "
				+ "alquiler a crear.");
		System.out.println(personas);
		System.out.println("Introduce el dni de la persona: ");
		String dni = strings.next();
		
		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getDni() == dni) {
				
			}
		}
	}
}

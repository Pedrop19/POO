package Ppal;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ppal {
	public static void main(String[] args) {
		Menu();
	}
	
	public static void Menu() {
		
		Scanner strings = new Scanner(System.in);
		Scanner enteros = new Scanner(System.in);
		
		LinkedList<Persona> personas = new LinkedList<Persona>();
		LinkedList<Peliculas_Series> pel_ser = new LinkedList<Peliculas_Series>();
		LinkedList<Alquiler> alquileres = new LinkedList<Alquiler>();
		
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
					RegistrarCliente(enteros, strings, personas);
					break;
				case 2:
					NuevoAlquiler(enteros, strings, personas, alquileres, pel_ser);
					break;
				case 3:
					FinAlquiler(enteros, strings, alquileres);
					break;
				case 4:
					ListarAlquileres(alquileres);
					break;
				case 5:
					NuevaPel_Ser(enteros, strings, pel_ser);
					break;
				case 6:
					System.out.print("Saliendo del programa...");
					break;
				default:
					System.out.println("ERROR: OPCION NO VALIDA");
					break;
			}
		}while(opc != 6);
		
	}
	
	public static void RegistrarCliente(Scanner enteros, Scanner strings, LinkedList<Persona> personas) {
		
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
	    
	    for (int i = 0; i < personas.size(); i++) {
	    	if(personas.get(i).getDni() != dni)
	    	personas.add(new Persona(dni, nombre, apellidos, telefono, email, direccion));
	    }
	    
	    System.out.println("Cliente Registrado");
	}
	
	public static void NuevoAlquiler(Scanner enteros, Scanner strings, LinkedList<Persona> personas, LinkedList<Alquiler> alquileres, LinkedList<Peliculas_Series> pel_sers) {
		
		System.out.println("-- NUEVO ALQUILER --");
		
		int id_alquiler = 0;
		Persona persona;
		Date fecha_inicio;
		Date fecha_fin;
		Peliculas_Series pel_ser;

		 
		 
		System.out.println("Introduzca la fecha de inicio con formato dd/mm/yyyy");
		String fechainicio = strings.nextLine();
		SimpleDateFormat dfinicio = new SimpleDateFormat("dd/MM/yyyy");
		Date testDateinicio = null;
		String dateinicio = fechainicio;
		try {
			testDateinicio = dfinicio.parse(dateinicio);
			System.out.println("Fecha agregada con exito");
		} catch (ParseException e) {
			System.out.println("Formato no valido");
		}
		System.out.println("Introduzca la fecha de fin con formato dd/mm/yyyy");
		String fechafin = strings.nextLine();
		SimpleDateFormat dffin = new SimpleDateFormat("dd/MM/yyyy");
		Date testDatefin = null;
		String datefin = fechafin;
		try {
			testDatefin = dffin.parse(datefin);
			System.out.println("Fecha agregada con exito");
		} catch (ParseException e) {
			System.out.println("Formato no valido");
		}
		System.out.println("A continuación se mostraran las "
				+ "personas disponibles a las que se puede añadir el "
				+ "alquiler a crear.");
		ListarClientes(personas);
		System.out.println("Introduce el dni de la persona: ");
		String dni = strings.next();
		System.out.println("A continuación se mostraran las "
				+ "peliculas o series disponibles para alquilar.");
		ListarPel_Sers(pel_sers);
		System.out.println("Introduce el id de la pelicula o serie a alquilar");
		int id = enteros.nextInt();
		
		for (int i = 0; i < personas.size(); i++) {
			for (int j = 0; j < pel_sers.size(); j++)
			if(personas.isEmpty())
				RegistrarCliente(enteros, strings, personas);
			else {
				if(alquileres.isEmpty())
					RegistrarCliente(enteros, strings, personas);
				else {
					if(personas.get(i).getDni() == dni && pel_sers.get(j).getIdPel_Ser() == id) {
						alquileres.add(new Alquiler(id_alquiler, personas.get(i), testDateinicio, testDatefin, pel_sers.get(j)));
						id_alquiler++;
						}
					}
				}
			}
		}
	public static void FinAlquiler(Scanner strings, Scanner enteros, LinkedList<Alquiler> alquileres) {
		
		
		System.out.println("-- FIN ALQUILER --");
		System.out.println("A continuación se mostraran los "
				+ "alquileres activos.");
		System.out.println(alquileres);
		System.out.println("Introduce el id del alquiler a eliminar");
		int id = enteros.nextInt();
		for (int i = 0; i < alquileres.size(); i++) {
			if(alquileres.get(i).getId_alquiler() == id) {
				alquileres.remove(i);
			}
		}
	}
	
	public static void ListarAlquileres(LinkedList<Alquiler> alquileres) {	
		System.out.println("-- LISTA DE ALQUILERES --");
		for (int i = 0; i < alquileres.size(); i++) {
			System.out.println("ID: " + (i + 1) + " - " + 
								"Fecha de inicio: " + alquileres.get(i).getFecha_inicio() + " - " + 
								"Fecha a devolver: " + alquileres.get(i).getFecha_fin());
		}
	}
	
	public static void NuevaPel_Ser(Scanner strings, Scanner enteros, LinkedList<Peliculas_Series> pel_sers) {
		
		 int idPel_Ser = 0;
		 String titulo;
		 String nombre_director;
		 Categoria categoria;
		 
		 System.out.print("Introduce el titulo de la pelicula/serie: ");
			titulo = strings.next();
			System.out.print("Introduce el nombre del director: ");
			nombre_director = strings.next();
			System.out.println("Seleccione un rango (1-5): "
					+ "1. COMEDIA 2. TERROR 3. ACCION 4. CIENCIA_FICCION 5. AVENTURA");
			int r = enteros.nextInt();
			categoria = null;
			switch(r) {
				case 1: 
					categoria = Categoria.COMEDIA;
					break;
				case 2: 
					categoria = Categoria.TERROR;
					break;
				case 3: 
					categoria = Categoria.ACCION;
					break;
				case 4: 
					categoria = Categoria.CIENCIA_FICCION;
					break;
				case 5: 
					categoria = Categoria.AVENTURA;
					break;
				default:
					System.out.println("ERROR: Opcion no valida");
					break;
			}
		 
			for (int i = 0; i < pel_sers.size(); i++) {
				if(pel_sers.get(i).getIdPel_Ser() != idPel_Ser)
				pel_sers.add(new Peliculas_Series(idPel_Ser, titulo, nombre_director, categoria));
				idPel_Ser++;
			}
		
	}
	public static void ListarClientes(LinkedList<Persona> personas) {
		System.out.println("-- LISTA DE ALQUILERES --");
		for (int i = 0; i < personas.size(); i++) {
			System.out.println("Número de Cliente: " + (i + 1) + " - " + 
								"DNI: " + personas.get(i).getDni());
		}
	}
	
	public static void ListarPel_Sers(LinkedList<Peliculas_Series> pel_sers) {
		System.out.println("-- LISTA DE ALQUILERES --");
		for (int i = 0; i < pel_sers.size(); i++) {
			System.out.println("ID: " + (i + 1) + " - " +
						       "Título: " + pel_sers.get(i).getTitulo());
		}
	}
}

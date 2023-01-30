package Ppal;

import static Ppal.Rango.*;

import java.util.Scanner;

public class Ppal {
	
	public static void main(String[] args) {

	Bombero bombero1 = new Bombero(0, "Jose", 27, OFICIAL);
	Bombero bombero2 = new Bombero(1, "Alberto", 28, SUBOFICIAL);
	Bombero bombero3 = new Bombero(3, "Fran", 30, CABO);
	Bombero bombero4 = new Bombero(4, "Pedro", 28, OFICIAL);
	Bombero bombero5 = new Bombero(5, "Carlos", 32, SUBOFICIAL);
	Bombero bombero6 = new Bombero(6, "Maria", 50, CABO);
	Bombero bombero7 = new Bombero(7, "Ramon", 70, OFICIAL);
	Bombero bombero8 = new Bombero(8, "Paula", 19, SUBOFICIAL);
	Bombero bombero9 = new Bombero(9, "Teresa", 23, CABO);
	
	
	
	Parque parque1 = new Parque(1001, "Canada", bombero1, bombero2, bombero3);
	Parque parque2 = new Parque(1002, "España", bombero4, bombero5, bombero6);
	Parque parque3 = new Parque(1003, "Francia", bombero7, bombero8, bombero9);
	
	System.out.println(parque1.toString());
	System.out.println(parque2.toString());
	System.out.println(parque3.toString());
	
	parque1.addAviso("Aviso 1. Parque 1");
	parque2.addAviso("Aviso 2");
	parque3.addAviso("Aviso 3");
	
	parque1.mostrarAviso();
	parque2.mostrarAviso();
	parque3.mostrarAviso();
	}
	
	
	public void Menu() {
		
		Scanner scint = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		System.out.println("--- SISTEMA DE GESTION PARQUES DE BOMBEROS ---");
		System.out.println("Bienvenido, eliga una opción para comenzar[1-3]");
		System.out.println("1. Añadir Bombero");
		System.out.println("2. Añadir Parque");
		System.out.println("3. Añadir Aviso");
		System.out.println("4. Salir");
		int opc = scint.nextInt();
		
		switch(opc) {
			case 1:
				System.out.println("--- AÑADIR BOMBERO ---");
				System.out.println("Para añadir un bombero se necesita el nombre para guardar el bombero, id, el nombre"
						+ ", la edad y el rango");
				System.out.println("Indique el id");
				int id = scint.nextInt();
				System.out.println("Indique el nombre");
				String nombre = scstr.next();
				System.out.println("Indique la edad");
				int edad = scint.nextInt();
				System.out.println("Indique el rango. 1. BOMBERO 2. CABO 3. SUBOFICIAL  4. OFICIAL");
				int valor = scint.nextInt();
				Rango rango = Bombero.elegirRango(valor);
				Bombero bombero = new Bombero(id, nombre, edad, rango);

			case 2:
				System.out.println("--- AÑADIR PARQUE ---");
				System.out.println("Para añadir un parque se necesita saber "
						+ "el id del parque, la ubicacion");
				System.out.println("Introduzca el id");
				int idparque = scint.nextInt();
				System.out.println("Introduzca la ubicacion");
				String ubicacion = scstr.next();
		}
	}
}

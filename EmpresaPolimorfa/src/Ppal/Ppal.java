package Ppal;

import java.util.LinkedList;

import Clases.*;
import Superclases.*;

public class Ppal {

	public static void main(String[] args) {
		
		//LinkedList
		LinkedList <Vendedor> vendedores = new LinkedList<Vendedor>();
		LinkedList<Persona> clientes = new LinkedList<Persona>();
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		
		//Zonas
		Zona zona1 = new Zona("Zona 1");
		Zona zona2 = new Zona("Zona 2");
		Zona zona3 = new Zona("Zona 3");
		
		//Coches
		Coche coche1 = new Coche("555X", "Opel", "Corsa");
		Coche coche2 = new Coche("666X", "Opel", "Astra");
		Coche coche3 = new Coche("777X", "Peugeot", "208");
		Coche coche4 = new Coche("777X", "Peugeot", "209");
		
		//Clientes
		Persona cliente1 = new Persona("111X", "Laura", "Perez", "C/Inventada");
		Persona cliente2 = new Persona("222X", "Nuria", "Nevado", "C/Inventada");
		Persona cliente3 = new Persona("333X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente4 = new Persona("444X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente5 = new Persona("555X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente6 = new Persona("666X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente7 = new Persona("777X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente8 = new Persona("888X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente9 = new Persona("999X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente10 = new Persona("000X", "Karen", "Lazaro", "C/Inventada");
		Persona cliente11 = new Persona("0101X", "Karen", "Lazaro", "C/Inventada");

		
		//Empleados
		Secretario secretario_1 = new Secretario("555", "Pedro", "Lazaro Nevado", "C/ Inventada", 111111111, 1000.0, 11, 924111111);
		empleados.add(secretario_1);
		Secretario secretario_2 = new Secretario("666", "Jose", "Perez Reverte", "C/ Inventada", 222222222, 2000.0, 22, 924222222);
		empleados.add(secretario_2);
		Vendedor vendedor_1 = new Vendedor("777", "Alberto", "Alvarez Perez", "C/ Inventada", 333333333, 3000.0, coche1, 777777777, zona1, clientes, 0.01);
		empleados.add(vendedor_1);
		Vendedor vendedor_2 = new Vendedor("888", "Paula", "Fernandez Muñoz", "C/ Inventada", 44444444, 4000.0, coche2, 888888888, zona2, clientes, 0.02);
		empleados.add(vendedor_2);
		Jefe_zona jefe_zona_1 = new Jefe_zona("999", "Pablo", "Hernandez Gomera", "C/ Inventada", 555555555, 5000.0, 55, secretario_1, coche3, vendedores);
		empleados.add(jefe_zona_1);
		Jefe_zona jefe_zona_2 = new Jefe_zona("000", "Sara", "Gonzalez Arguello", "C/ Inventada", 666666666, 6000.0, 55, secretario_2, coche4, vendedores);
		empleados.add(jefe_zona_2);
		
		for (int i = 0; i < empleados.size(); i++) {
			Empleado e = empleados.get(i);
			e.incrementarSalario();
			System.out.println(e.imprimir(e));
			System.out.println(e.getNombre() + " - " + e.getSalario());
		}
		
		
		
		
	}

}

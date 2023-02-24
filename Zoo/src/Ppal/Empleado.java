package Ppal;

import java.util.LinkedList;
import java.util.Objects;

public class Empleado {
	private int id_empleado;
	private String nombre;
	private Rango rango;
	private LinkedList<String> avisos;
	private LinkedList<Animal> animal;
	
	public Empleado(int id_empleado, String nombre, Rango rango) {
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.rango = rango;
		this.avisos = new LinkedList<String>();
		this.animal = new LinkedList<Animal>();
	}
	
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rango getRango() {
		return rango;
	}
	public void setRango(Rango rango) {
		this.rango = rango;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return id_empleado == other.id_empleado;
	}

	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", rango=" + rango + "]";
	}
	
	 public void addAviso(String aviso) {
		 this.avisos.add(aviso);
	}
		 
	public void mostrarAviso() {
		
		if(this.avisos.isEmpty())
			System.out.println("No hay avisos");
		else
			System.out.println(avisos);	
	}
		 
	public void deleteAviso() {
		if(!this.avisos.isEmpty())
			this.avisos.removeFirst();
	}
	
	public void addAnimal(Animal animal) {
		this.animal.add(animal);
	}
	
	
	public void deleteAnimal() {
		if(!this.animal.isEmpty())
			this.animal.removeFirst();
	}		 
}

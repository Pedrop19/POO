package Ppal;

import java.util.Objects;

public class Animal {
	private int id_animal;
	private String nombre;
	private Especie especie;
	
	
	public Animal(int id_animal, String nombre, Especie especie) {
		this.id_animal = id_animal;
		this.nombre = nombre;
		this.especie = especie;
	}
	
	public int getId_animal() {
		return id_animal;
	}
	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id_animal == other.id_animal;
	}

	@Override
	public String toString() {
		return "Animal [id_animal=" + id_animal + ", nombre=" + nombre + ", especie=" + especie + "]";
	}
	
}

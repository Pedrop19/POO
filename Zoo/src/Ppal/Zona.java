package Ppal;

import java.util.Objects;

public class Zona {
	private int id_zona;
	private String nombre;
	private Empleado empleado;
	private Animal animal;
	
	public Zona(int id_zona, String nombre) {
		super();
		this.id_zona = id_zona;
		this.nombre = nombre;
	}
	
	public int getId_zona() {
		return id_zona;
	}
	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zona other = (Zona) obj;
		return id_zona == other.id_zona;
	}

	@Override
	public String toString() {
		return "Zona [id_zona=" + id_zona + ", nombre=" + nombre + "]";
	}
}

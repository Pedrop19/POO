package Superclases;

import Clases.*;

public abstract class Forma {
	
	public String color;
	public String nombre;
	public Punto centro;
	
	public Forma(String color, String nombre, Punto centro) {
		super();
		this.color = color;
		this.nombre = nombre;
		this.centro = centro;
	}

	public String getColor() {
		return color;
	}

	public String getNombre() {
		return nombre;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

}

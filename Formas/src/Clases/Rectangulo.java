package Clases;

import Superclases.Forma;

public class Rectangulo extends Forma {

	public double lado_menor;
	public double lado_mayor;

	public Rectangulo(String color, String nombre, Punto centro, double lado_menor, double lado_mayor) {
		super(color, nombre, centro);
		this.lado_mayor = lado_mayor;
		this.lado_menor = lado_menor;
	}

	public double getLado_menor() {
		return lado_menor;
	}

	public double getLado_mayor() {
		return lado_mayor;
	}

	public void setLado_menor(double lado_menor) {
		this.lado_menor = lado_menor;
	}

	public void setLado_mayor(double lado_mayor) {
		this.lado_mayor = lado_mayor;
	}

	@Override
	public String toString() {
		return "Rectangulo [lado_menor=" + lado_menor + ", lado_mayor=" + lado_mayor + super.toString();
	}

	public double area() {
		return lado_menor * lado_mayor;
	}

	public double perimetro() {
		return ((2 * lado_menor) * (2 * lado_mayor));
	}

	public void cambiarEscala(double escala) {
		setLado_mayor(getLado_mayor() + getLado_mayor() * escala);
	}
}

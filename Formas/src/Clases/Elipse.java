package Clases;

import Superclases.Forma;

public class Elipse extends Forma {

	public double radio_mayor;
	public double radio_menor;

	public Elipse(String color, String nombre, Punto centro, double radio_mayor, double radio_menor) {
		super(color, nombre, centro);
		this.radio_mayor = radio_mayor;
		this.radio_menor = radio_menor;
	}

	public double getRadio_mayor() {
		return radio_mayor;
	}

	public double getRadio_menor() {
		return radio_menor;
	}

	public void setRadio_mayor(double radio_mayor) {
		this.radio_mayor = radio_mayor;
	}

	public void setRadio_menor(double radio_menor) {
		this.radio_menor = radio_menor;
	}

	@Override
	public double area() {
		return 3.14 * (radio_mayor * radio_menor);
	}

	@Override
	public String toString() {
		return "Elipse [radio_mayor=" + radio_mayor + ", radio_menor=" + radio_menor + super.toString() + "]";
	}

}

package Clases;

public class Circulo extends Elipse {

	public Circulo(String color, String nombre, Punto centro, double radio) {
		super(color, nombre, centro, radio, 0);
	}

	@Override
	public double area() {
		return 3.14 * (getRadio_mayor() * getRadio_mayor());
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio_mayor + ", nombre=" + nombre + "]";
	}


}

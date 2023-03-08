package Clases;

public class Cuadrado extends Rectangulo {

	public Cuadrado(String color, String nombre, Punto centro, double lado) {
		super(color, nombre, centro, lado, 0);
	}

	@Override
	public double area() {
		return getLado_menor() * getLado_menor();
	}

	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado_menor + ", nombre=" + nombre + "]";
	}
}

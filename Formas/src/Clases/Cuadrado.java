package Clases;

public class Cuadrado extends Rectangulo {

	public Cuadrado(String color, String nombre, Punto centro, double lado) {
		super(color, nombre, centro, lado, lado);
	}

	public double getLado(){
		return getLado_mayor();
	}

	public void setLado(double lado){
		setLado_mayor(lado);
		setLado_menor(lado);
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado_menor + ", nombre=" + nombre + "]";
	}
}

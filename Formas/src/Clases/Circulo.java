package Clases;

public class Circulo extends Elipse {

	public Circulo(String color, String nombre, Punto centro, double radio) {
		super(color, nombre, centro, radio, radio);
	}

	public double getRadio(){
		return super.getRadio_menor();
	}

	public void setRadio(double radio){
		super.setRadio_mayor(radio);
		super.setRadio_menor(radio);
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio_mayor + ", nombre=" + nombre + "]";
	}


}

package Ppal;

public class Rectangulo extends Figuras{

	private double alto;
	private double ancho;
	
	public Rectangulo(double alto, double ancho) {
		alto = alto;
		ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double rectPerimetro(double alto, double ancho) {
		
		double perimetro;
		
		perimetro = (2 * alto) + (2 * ancho);
		
		return perimetro;
	}
	
	public double rectArea(double alto, double ancho) {
		
		double area;
		
		area = alto + ancho;
		
		return area;
	}
}

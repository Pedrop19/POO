package locales;

import inmuebles.Local;
import inmuebles.Tipo;

public class Comercial extends Local {
	
	private double valorArea;
	private String centroComercial;

	public Comercial(int idInmobiliario, int area, String direccion, Tipo tipo, double valorArea, String centroComercial) {
		super(idInmobiliario, area, direccion, tipo);
		this.valorArea = valorArea;
		this.centroComercial = centroComercial;
	}

	public double getValorArea() {
		return valorArea;
	}

	public void setValorArea(double valorArea) {
		this.valorArea = valorArea;
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}


	@Override
	public String imprimirr() {
		return "Comercial [valorArea=" + valorArea + ", centroComercial=" + centroComercial + ", Tipo=" + getTipo()
				+ ", Id=" + getIdInmobiliario() + ", Area=" + getArea() + ", Direccion="
				+ getDireccion() + "]";
	}
}

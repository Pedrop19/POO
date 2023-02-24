package locales;

import inmuebles.Local;
import inmuebles.Tipo;

public class Oficina extends Local{
	
	private double valorArea;
	private boolean esGobierno;

	public Oficina(int idInmobiliario, int area, String direccion, Tipo tipo, double valorArea, boolean esGobierno) {
		super(idInmobiliario, area, direccion, tipo);
		this.valorArea = valorArea;
		this.esGobierno = esGobierno;
	}

	public double getValorArea() {
		return valorArea;
	}

	public void setValorArea(double valorArea) {
		this.valorArea = valorArea;
	}

	public boolean isEsGobierno() {
		return esGobierno;
	}

	public void setEsGobierno(boolean esGobierno) {
		this.esGobierno = esGobierno;
	}

	@Override
	public String imprimirr() {
		return "Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + ", Tipo=" + getTipo()
				+ ", getIdInmobiliario=" + getIdInmobiliario() + ", Area=" + getArea() + ", getDireccion="
				+ getDireccion() + "]";
	}
	
	

}

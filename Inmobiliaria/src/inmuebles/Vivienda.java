package inmuebles;

public abstract class Vivienda extends Inmueble {

	private int n_Habitaciones;
	private int n_Banios;
	
	public Vivienda(int idInmobiliario, int area, String direccion, int n_Habitaciones, int n_Banios) {
		super(idInmobiliario, area, direccion);
		this.n_Habitaciones = n_Habitaciones;
		this.n_Banios = n_Banios;
	}
	
	
	public int getN_Habitaciones() {
		return n_Habitaciones;
	}



	public void setN_Habitaciones(int n_Habitaciones) {
		this.n_Habitaciones = n_Habitaciones;
	}



	public int getN_Banios() {
		return n_Banios;
	}



	public void setN_Banios(int n_Banios) {
		this.n_Banios = n_Banios;
	}



	@Override
	public String imprimir() {
		return "Vivienda [Habitaciones=" + n_Habitaciones + ", Baños=" + n_Banios + ", Id="
				+ getIdInmobiliario() + ", Area(m2)=" + getArea() + ",Direccion=" + getDireccion() + "]";
	}
	
	
	
}

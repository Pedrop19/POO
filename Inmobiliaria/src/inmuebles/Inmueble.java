package inmuebles;

import java.util.Objects;

public abstract class Inmueble {

	private int idInmobiliario;
	private int area;
	private String direccion;
	
	public Inmueble(int idInmobiliario, int area, String direccion) {
		super();
		this.idInmobiliario = idInmobiliario;
		this.area = area;
		this.direccion = direccion;
	}

	public int getIdInmobiliario() {
		return idInmobiliario;
	}

	public void setIdInmobiliario(int idInmobiliario) {
		this.idInmobiliario = idInmobiliario;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return idInmobiliario == other.idInmobiliario;
	}
	
	public abstract String imprimir();
}

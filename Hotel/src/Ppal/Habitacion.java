package Ppal;

public class Habitacion {
	
	private int n_habitacion;
	private Categoria categoria;
	private Trabajador limpiador;
	
	public Habitacion(int n_habitacion, Categoria categoria, Trabajador limpiador) {
		super();
		this.n_habitacion = n_habitacion;
		this.categoria = categoria;
		this.limpiador = limpiador;
	}
	
	public int getN_habitacion() {
		return n_habitacion;
	}
	public void setN_habitacion(int n_habitacion) {
		this.n_habitacion = n_habitacion;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Trabajador getLimpiador() {
		return limpiador;
	}
	public void setLimpiador(Trabajador limpiador) {
		this.limpiador = limpiador;
	}

	@Override
	public String toString() {
		return "Habitacion [n_habitacion=" + n_habitacion + ", categoria=" + categoria + ", limpiador=" + limpiador
				+ "]";
	}
}

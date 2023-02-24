package inmuebles;

public abstract class Local extends Inmueble{
	
	private Tipo tipo;

	public Local(int idInmobiliario, int area, String direccion, Tipo tipo) {
		super(idInmobiliario, area, direccion);
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	@Override
	public String imprimir() {
		return "Local [tipo=" + tipo + ", IdInmobiliario=" + getIdInmobiliario()
				+ ", Area=" + getArea() + ", Direccion=" + getDireccion() + "]";
	}

	public abstract String imprimirr();

}

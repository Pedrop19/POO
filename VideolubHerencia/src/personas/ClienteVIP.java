package personas;

public class ClienteVIP extends Cliente {
	
	public ClienteVIP(int idCliente, int telefono, String nombre, String apellidos, String email, String direccion) {
		super(idCliente, telefono, nombre, apellidos, email, direccion);
	}

	private	int idVip;
	private final int descuento = 15;


	public int getIdVip() {
		return idVip;
	}

	public void setIdVip(int idVip) {
		this.idVip = idVip;
	}

	public int getDescuento() {
		return descuento;
	}

	@Override
	public String toString() {
		return "ClienteVIP [descuento(%)=" + descuento + ", IdCliente=" + getIdCliente() + ", Nombre="
				+ getNombre() + ", Apellidos=" + getApellidos() + "]";
	}

	

}

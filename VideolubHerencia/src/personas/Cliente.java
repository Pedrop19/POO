package personas;

import java.util.Objects;

public class Cliente extends Persona{
   

	//1. Atributos
	private int idCliente;
    private int telefono;
    private String email;
    private String direccion;
    
    public Cliente(int idCliente, int telefono, String nombre, String apellidos, String email, String direccion) {
		super(nombre, apellidos);
    	this.idCliente = idCliente;
    	this.telefono = telefono;
    	this.email = email;
    	this.direccion = direccion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int id) {
		this.idCliente = id;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", telefono=" + telefono + ", email=" + email + ", direccion="
				+ direccion + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return idCliente == other.idCliente;
	}
    
}

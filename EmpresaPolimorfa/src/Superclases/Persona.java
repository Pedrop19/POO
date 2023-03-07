package Superclases;

public class Persona {
	
	private String DNI;
	private String nombre;
	private String apellidos;
	private String direccion;
	
	public Persona(String DNI, String nombre, String apellidos, String direccion) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}
	
	public String getDNI() {
		return DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}

}

package Superclases;

public abstract class Empleado extends Persona{
	
	private int anio_antiguedad;
	private int telefono;
	private double salario;
	private Empleado supervisor;
	
	
	
	public Empleado(String DNI, String nombre, String apellidos, String direccion, int telefono, double salario) {
		super(DNI, nombre, apellidos, direccion);
		this.telefono = telefono;
		this.salario = salario;
		this.supervisor = null;
	}
	
	
	public int getAnio_antiguedad() {
		return anio_antiguedad;
	}
	public int getTelefono() {
		return telefono;
	}
	public double getSalario() {
		return salario;
	}
	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setAnio_antiguedad(int anio_antiguedad) {
		this.anio_antiguedad = anio_antiguedad;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + getDNI() + ", nombre=" + getNombre() + ", apellidos=" + getApellidos() + ", direccion=" + getDireccion()
				+ ", años de antinguedad=" + anio_antiguedad + ", telefono=" + telefono + ", salario=" + salario
				+ ", supervisor=" + supervisor + "]";
	}
	
	public void cambiarSupervisor(Empleado e) {
		e.setSupervisor(e);
	};
	
	public String imprimir(Empleado e) {
		return "Puesto: " + e.getClass().getSimpleName() + "\n" +
		           "DNI: " + e.getDNI() + "\n" +
		           "Nombre: " + e.getNombre() + "\n" +
		           "Apellidos: " + e.getApellidos() + "\n" +
		           "Direccion: " + e.getDireccion() + "\n" +
		           "Telefono: " + e.getTelefono() + "\n" +
		           "Salario: " + e.getSalario();
	};
	
	public abstract void incrementarSalario();
}

package Clases;

import Superclases.Empleado;

public class Secretario extends Empleado {
	
	private int despacho;
	private int num_fax;
	private final double aumentoSalario = 0.05;

	public Secretario(String dNI, String nombre, String apellidos, String direccion, int telefono, double salario, int despacho, int num_fax) {
		super(dNI, nombre, apellidos, direccion, telefono, salario);
		this.despacho = despacho;
		this.num_fax = num_fax;
	}
	
	public int getDespacho() {
		return despacho;
	}


	public int getNum_fax() {
		return num_fax;
	}


	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}


	public void setNum_fax(int num_fax) {
		this.num_fax = num_fax;
	}


	@Override
	public void incrementarSalario() {
		setSalario(getSalario() + getSalario() * aumentoSalario);
	}

	@Override
	public String toString() {
		return "Secretario [getDNI()=" + getDNI() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", getSalario()=" + getSalario() + ", getClass()=" + getClass().getSimpleName() + "]";
	}
	

	@Override
	public void cambiarSupervisor(Empleado e) {
		e.setSupervisor(e);
	}


}

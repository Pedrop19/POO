package Clases;

import java.util.LinkedList;

import Superclases.Empleado;

public class Jefe_zona extends Empleado {
	
	private int despacho;
	private Secretario secretario;
	private Coche coche_empresa;
	private LinkedList<Vendedor> vendedores;
	private final double aumentoSalario = 0.2;

	public Jefe_zona(String DNI, String nombre, String apellidos, String direccion, int telefono, double salario,
			int despacho, Secretario secretario, Coche coche, LinkedList<Vendedor> vendedores) {
		super(DNI, nombre, apellidos, direccion, telefono, salario);
		this.despacho = despacho;
		this.secretario = secretario;
		this.coche_empresa = coche;
		this.vendedores = vendedores;
	}
	
	
	public int getDespacho() {
		return despacho;
	}


	public Secretario getSecretario() {
		return secretario;
	}


	public Coche getCoche_empresa() {
		return coche_empresa;
	}


	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}


	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}


	public void setCoche_empresa(Coche coche_empresa) {
		this.coche_empresa = coche_empresa;
	}


	public void cambiarCoche(Coche c) {
		setCoche_empresa(c);
	}
	
	public void cambiarSecretario(Secretario s) {
		setSecretario(s);
	}
	
	public void addVendedor(LinkedList<Vendedor> vendedores, Vendedor v, Zona zona) {
		for(int i = 0; i < vendedores.size(); i++) {
		if(!vendedores.get(i).getDNI().equals(v.getDNI())){
			v.setZona(zona);
			vendedores.add(v);
		}else
			System.out.println("El vendedor a añadir ya existe");
		}
	}
	

	public void removeVendedor(LinkedList<Vendedor> vendedores, Vendedor v) {
		if(!vendedores.isEmpty()) {
			for(int i = 0; i < vendedores.size(); i++) {
					if(vendedores.get(i).getDNI().equals(v.getDNI())){
						vendedores.remove(v);
					}else
						System.out.println("El vendedor a eliminar no existe");
			}
		}else
			System.out.println("No hay vendedores");
	}

	@Override
	public void incrementarSalario() {
		setSalario(getSalario() + getSalario() * aumentoSalario);
	}

}

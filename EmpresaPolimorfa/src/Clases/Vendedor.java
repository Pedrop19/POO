package Clases;

import java.util.LinkedList;

import Superclases.*;

public class Vendedor extends Empleado {
	
	private Coche coche_empresa;
	private int telefono_movil;
	private Zona zona;
	private LinkedList<Persona> clientes = new LinkedList<Persona>();
	private final double aumentoSalario = 0.1;
	private double comision;

	public Vendedor(String DNI, String nombre, String apellidos, String direccion, int telefono, 
			double salario, Coche coche, int telefono_movil, Zona zona, LinkedList<Persona> clientes, double comision) {
		super(DNI, nombre, apellidos, direccion, telefono, salario);
		this.coche_empresa = coche;
		this.telefono_movil = telefono_movil;
		this.zona = zona;
		this.clientes = clientes;
		this.comision = comision;
	}

	
	public Zona getZona() {
		return zona;
	}

	public double getComision() {
		return comision;
	}

	public Coche getCoche_empresa() {
		return coche_empresa;
	}

	public int getTelefono_movil() {
		return telefono_movil;
	}

	public LinkedList<Persona> getClientes() {
		return clientes;
	}

	
	public void setCoche_empresa(Coche coche_empresa) {
		this.coche_empresa = coche_empresa;
	}

	public void setTelefono_movil(int telefono_movil) {
		this.telefono_movil = telefono_movil;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public void setClientes(LinkedList<Persona> clientes) {
		this.clientes = clientes;
	}

	public void addCliente(LinkedList<Persona> clientes, Persona c) {
		
		if(clientes.size() < 10) {
			for(int i = 0; i < clientes.size(); i++) {
				if(!clientes.get(i).getDNI().equals(c.getDNI())){
					clientes.add(c);
				}else
					System.out.println("El cliente a añadir ya existe");
			}
		}else
			System.out.println("La lista de clientes de este vendedor esta llena");
	}
	

	public void removeCliente(LinkedList<Persona> clientes, Persona c) {
		
		if(!clientes.isEmpty()) {
			for(int i = 0; i < clientes.size(); i++) {
				if(clientes.get(i).getDNI().equals(c.getDNI())){
					clientes.add(c);
				}else
					System.out.println("El cliente a eliminar no existe");
			}
		}else
			System.out.println("No hay clientes");
	}

	public void cambiarCoche(Coche c) {
		setCoche_empresa(c);
	}
	
	@Override
	public void incrementarSalario() {
		setSalario(getSalario() + getSalario() * aumentoSalario);
	}

}

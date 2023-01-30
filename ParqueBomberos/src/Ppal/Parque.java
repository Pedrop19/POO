package Ppal;

import java.util.LinkedList;

public class Parque {
	
	private int idParque;
	private String ubicacion;
	private LinkedList<Bombero> bomberos;
	private LinkedList<String> avisos;
	
	//Creador basico
	public Parque(int idParque, String ubicacion, Bombero bombero) {
		this.idParque = idParque;
		this.ubicacion = ubicacion;
		this.bomberos = new LinkedList<Bombero>();
		this.bomberos.add(bombero);
		this.avisos = new LinkedList<String>();
	}
	
	//Creador de tres bomberos
	public Parque(int idParque, String ubicacion, Bombero bombero1, Bombero bombero2, Bombero bombero3) {
		this.idParque = idParque;
		this.ubicacion = ubicacion;
		this.bomberos = new LinkedList<Bombero>();
		this.bomberos.add(bombero1);
		this.bomberos.add(bombero2);
		this.bomberos.add(bombero3);
		this.avisos = new LinkedList<String>();
	}

	public int getIdParque() {
		return idParque;
	}

	public void setIdParque(int idParque) {
		this.idParque = idParque;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	 public void addAviso(String aviso) {
		this.avisos.add(aviso);
	 }
	 
	 public void mostrarAviso() {
		 System.out.println(avisos);
	 }
	
	  @Override
	    public String toString() {
	        return "Parque[id: " + this.idParque + "; Nombre: " + this.ubicacion +
	               "; Bomberos: " + this.bomberos;
	    }

	  @Override
	   public boolean equals(Object obj) {
		  boolean result = false;
	      Parque p = (Parque) obj;
	      if(this.idParque == p.getIdParque())
	    	  result = true;
	      return result;
	    }
}

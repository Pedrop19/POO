package Clases;

import SuperClases.Herviboro;

public class Oruga extends Herviboro {

	public Oruga(String nombre, String color, int cantidad) {
		super(nombre, color, cantidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer (){
		System.out.println("Soy una oruga y estoy comiendo de una hoja");
	}
}

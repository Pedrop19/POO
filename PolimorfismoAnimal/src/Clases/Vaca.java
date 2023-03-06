package Clases;

import SuperClases.Herviboro;

public class Vaca extends Herviboro{
	
	
	
	public Vaca(String nombre, String color, int cantidad) {
		super(nombre, color, cantidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer (){
		System.out.println("Soy una vaca y estoy comiendo hierba");
	}
}

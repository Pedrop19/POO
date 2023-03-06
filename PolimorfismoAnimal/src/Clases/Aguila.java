package Clases;

import SuperClases.Carnivoro;
import SuperClases.Tipo;

public class Aguila extends Carnivoro {
	
	public Aguila(String nombre, String color, Tipo tipo) {
		super(nombre, color, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer (){
		System.out.println("Soy un águila y estoy comiendo de un animal");
	}
	
	@Override
	public void buscarPresa() {
		System.out.println("Estoy buscando una presa por el aire");
	}
}

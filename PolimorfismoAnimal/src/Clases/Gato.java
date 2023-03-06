package Clases;

import SuperClases.Carnivoro;
import SuperClases.Tipo;

public class Gato extends Carnivoro {
	
	public Gato(String nombre, String color, Tipo tipo) {
		super(nombre, color, tipo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void comer (){
		System.out.println("Soy un gato y estoy comiendo un ratón");
	}

	@Override
	public void buscarPresa() {
		System.out.println("Estoy buscando una presa por el suelo");
	}
}

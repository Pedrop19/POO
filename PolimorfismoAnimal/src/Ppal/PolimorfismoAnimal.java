package Ppal;

import java.util.LinkedList;

import Clases.*;
import SuperClases.*;

public class PolimorfismoAnimal {
	
	public static void main(String[] args) {
		
		LinkedList<Animal> animales = new LinkedList<Animal>();
		
		animales.add(new Vaca("Vaca_1", "Marron", 4000));
		animales.add(new Oruga("Oruga_1", "Verde", 2));
		animales.add(new Gato("Gato_1", "Naranja", Tipo.DEPREDADOR));
		animales.add(new Aguila("Aguila_1", "Negro", Tipo.CARRONIERO));
		animales.add(new Vaca("Vaca_2", "Blanco", 4000));
		animales.add(new Oruga("Oruga_2", "Blanco", 2));
		animales.add(new Gato("Gato_2", "Negro", Tipo.DEPREDADOR));
		animales.add(new Aguila("Aguila_2", "Blanco", Tipo.CARRONIERO));
		
		for (int i = 0; i < animales.size(); i++) {
			
			Animal a = animales.get(i);
			a.comer();
			
			if(a instanceof Carnivoro)
				((Carnivoro) a).buscarPresa();
		}
	}


}

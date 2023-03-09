package Clases;

import java.util.*;

import SuperClases.*;

public class Centro {

	private LinkedList<Persona> personas;

	public Centro(LinkedList<Persona> personas) {
		this.personas = personas;
	}

	public LinkedList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(LinkedList<Persona> personas) {
		this.personas = personas;
	}

	public void addPersona(Persona p) {
		if (!personas.isEmpty()) {
			for (int i = 0; i < personas.size(); i++) {
				if (!personas.get(i).getDNI().equals(p.getDNI()) && personas.size() <= 10)
					personas.add(p);
				else {
					if (personas.get(i).getDNI().equals(p.getDNI()))
						System.out.println("La persona ya existe");
					else {
						if (personas.size() > 10)
							System.out.println("La lista de personas esta completa");
					}
				}
			}
		} else
			personas.add(p);
	}

	public void removePersona(String dni) {
		boolean existe = false;
		int i = 0;
		while(i < personas.size() && !existe){
			if (personas.get(i).getDNI().equals(dni)) {
				personas.remove(i);
				existe = true;
			}else
				i++;
			if(!existe)
				System.out.println("La persona no existe");
		}
	}

	public void imprimir() {
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i).toString());
		}
	}
}

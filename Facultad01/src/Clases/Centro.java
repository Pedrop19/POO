package Clases;

import java.util.*;

import SuperClases.*;

public class Centro {
    
    private LinkedList<Persona> personas;

    public Centro(LinkedList<Persona> personas){
        this.personas = personas;
    }
    
    public LinkedList<Persona> getPersonas() {
		return personas;
	}
    
	public void setPersonas(LinkedList<Persona> personas) {
		this.personas = personas;
	}

	public void addPersona(Persona p){
		for (int i = 0; i < personas.size(); i++) {
			if(!personas.get(i).getDNI().equals(p.getDNI()) && personas.size() <= 10)
				personas.add(p);
			else {
				if(personas.get(i).getDNI().equals(p.getDNI()))
					System.out.println("La persona ya existe");
				else {
					if(personas.size() > 10)
						System.out.println("La lista de personas esta completa");
				}
			}
		}
    }
	
	public void removePersona(Persona p){
		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getDNI().equals(p.getDNI()) && !personas.isEmpty())
				personas.remove(p);
			else {
				if(!personas.get(i).getDNI().equals(p.getDNI()))
					System.out.println("La persona no existe");
			}
		}
	}

	public String Imprimir(){
		for (int i = 0; i < personas.size(); i++) {
			return personas.get(i).toString();
		}
		return "";
	}
}

package Ppal;

public class Espectaculo {
	
	private int hora;
	private Animal animal;
	private Empleado empleado;
	private int aforo;
	private Zona zona;
	
	public Espectaculo(int hora, Animal animal, Empleado empleado, int aforo, Zona zona) {
		this.hora = hora;
		this.animal = animal;
		this.empleado = empleado;
		this.aforo = aforo;
		this.zona = zona;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Espectaculo [hora=" + hora + ", animal=" + animal + ", empleado=" + empleado + ", aforo=" + aforo
				+ ", zona=" + zona + "]";
	}
	
}

package Ppal;

public class Repartidor extends Empleado {

	
	private String zona;
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	
	public String MostrarDatos() {
		return "-- Repartidor --" + super.MostrarDatos() + "\nZona: " + zona + " ";
	}
	
	public double aplicarPlus() {
		
		double salarionuevo = getSalario();
		
		if(getEdad() < 25 && zona.equals("3")) {
			salarionuevo = getSalario() + getPLUS();
			setSalario(salarionuevo);
		}
		else 
			System.out.println(getNombre() + " es mayor de 25 años o "
					+ " su zona no es la 3");
		return salarionuevo;
	}

	

}

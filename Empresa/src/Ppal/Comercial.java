package Ppal;

public class Comercial extends Empleado {

	private double comision;
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public String MostrarDatos() {
		return "-- Comercial --" + super.MostrarDatos() + "\nComision: " + comision + " ";
	}
	
	public double aplicarPlus() {
		
		double salarionuevo = getSalario();
		
		if(getEdad() > 30 && this.comision > 200) {
			salarionuevo = getSalario() + getPLUS();
			setSalario(salarionuevo);
		}
		else 
			System.out.println("La edad de " + getNombre() + " es menor de 30 años o "
					+ " su comision es inferior a 200 euros");
		
		return salarionuevo;
	}

}

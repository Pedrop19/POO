package Ppal;

public class Ppal {

	public static void main(String[] args) {
		
		Comercial c = new Comercial("Jose", 35, 1000, 250);
		Repartidor d = new Repartidor("Juan", 20, 1000, "3");
		Comercial c1 = new Comercial("Alberto", 25, 1000, 250);
		Repartidor d1 = new Repartidor("Maria", 30, 1000, "3");
		
		System.out.println(c.MostrarDatos());
		System.out.println(d.MostrarDatos());
		System.out.println(c1.MostrarDatos());
		System.out.println(d1.MostrarDatos());
		
		System.out.println("Nuevo Salario: " + c.aplicarPlus());
		System.out.println("Nuevo Salario: " + d.aplicarPlus());
		System.out.println("Nuevo Salario: " + c1.aplicarPlus());
		System.out.println("Nuevo Salario: " + d1.aplicarPlus());
		
		System.out.println(c.MostrarDatos());
		System.out.println(d.MostrarDatos());
		System.out.println(c1.MostrarDatos());
		System.out.println(d1.MostrarDatos());
	}

}

package SuperClases;

public abstract class Animal {
	
	private String nombre;
	private String color;
	
	public Animal(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}



	public String getColor() {
		return color;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setColor(String color) {
		this.color = color;
	}

	public abstract void comer();

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", color=" + color + "]";
	}
}

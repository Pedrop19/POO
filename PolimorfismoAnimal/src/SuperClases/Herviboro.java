package SuperClases;

public abstract class Herviboro extends Animal {

	private int cantidad;

	
	public Herviboro(String nombre, String color, int cantidad) {
		super(nombre, color);
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public abstract void comer ();
}

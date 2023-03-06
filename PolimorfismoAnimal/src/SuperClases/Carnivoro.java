package SuperClases;

public abstract class Carnivoro extends Animal {
	
	private Tipo tipo;
	
	public Carnivoro(String nombre, String color, Tipo tipo) {
		super(nombre, color);
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public abstract void comer();

	@Override
	public String toString() {
		return "Carnivoro [tipo=" + tipo + "]";
	}
	
	public abstract void buscarPresa();
	
}

package Ppal;

public class Hospedaje {
	
	private Cliente persona;
	private int n_hab;
		
	public Hospedaje(Cliente persona, int n_hab) {
		this.persona = persona;
		this.n_hab = n_hab;
	}
	
	public Cliente getPersona() {
		return persona;
	}
	public void setPersona(Cliente persona) {
		this.persona = persona;
	}
	public int getN_hab() {
		return n_hab;
	}
	public void setN_hab(int n_hab) {
		this.n_hab = n_hab;
	}

	@Override
	public String toString() {
		return "Hospedaje [persona=" + persona + ", n_hab=" + n_hab + "]";
	}
}

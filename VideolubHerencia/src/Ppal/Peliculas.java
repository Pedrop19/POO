package Ppal;

import java.util.Objects;

import personas.Director;
import personas.Protagonista;

public class Peliculas extends Productos {

	Protagonista protagonista;
	
	public Peliculas(int id, String titulo, Director director, Categoria categoria, Protagonista protagonista) {
		super(id, titulo, director, categoria);
		this.protagonista = protagonista;
	}

	public Protagonista getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(Protagonista protagonista) {
		this.protagonista = protagonista;
	}

	@Override
	public String toString() {
		return "Serie [Protagonista=" + protagonista + ", Id=" + getId() + ", Titulo=" + getTitulo()
				+ ", Director=" + getDirector() + ", Categoria=" + getCategoria() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(protagonista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getId() != ((Productos) obj).getId())
			return false;
		Peliculas other = (Peliculas) obj;
		return protagonista == other.protagonista;
	}
	
	
	
	

}

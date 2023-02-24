package Ppal;

import java.util.Objects;

import personas.Director;

public class Serie extends Productos {

	private int nTemporadas;
	
	public Serie(int id, String titulo, Director director, Categoria categoria, int nTemporadas) {
		super(id, titulo, director, categoria);
		this.nTemporadas = nTemporadas;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	@Override
	public String toString() {
		return "Serie [Número de Temporadas=" + nTemporadas + ", Id=" + getId() + ", Titulo=" + getTitulo()
				+ ", Director=" + getDirector() + ", Categoria=" + getCategoria() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nTemporadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getId() != ((Productos) obj).getId())
			return false;
		Serie other = (Serie) obj;
		return nTemporadas == other.nTemporadas;
	}
	
	
	
	

}

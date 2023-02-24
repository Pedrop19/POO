package Ppal;

import personas.Director;

public class Productos {

	private int id;
	private String titulo;
	private Director director;
	private Categoria categoria;
	
	public Productos(int id, String titulo, Director director, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.categoria = categoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}

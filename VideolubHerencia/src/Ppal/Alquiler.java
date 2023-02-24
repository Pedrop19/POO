package Ppal;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import personas.Persona;

public class Alquiler {
	private int id_alquiler;
	private Persona persona;
	private LocalDate fecha_inicio;
	private Date fecha_fin;
	private Productos producto;
	
	public Alquiler(int id_alquiler, Persona persona, LocalDate fecha_inicio, Date fecha_fin, Productos producto) {
		this.id_alquiler = id_alquiler;
		this.persona = persona;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.producto = producto;
	}

	public int getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Alquiler [id_alquiler=" + id_alquiler + ", persona=" + persona + ", fecha_inicio=" + fecha_inicio
				+ ", fecha_fin=" + fecha_fin + ", producto=" + producto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_alquiler);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return id_alquiler == other.id_alquiler;
	}	
}

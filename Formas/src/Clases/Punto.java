package Clases;

public class Punto {

	public double coord_X;
	public double coord_Y;
	
	public Punto(double coord_X, double coord_Y) {
		super();
		this.coord_X = coord_X;
		this.coord_Y = coord_Y;
	}
	
	public double getCoord_X() {
		return coord_X;
	}
	public double getCoord_Y() {
		return coord_Y;
	}
	public void setCoord_X(double coord_X) {
		this.coord_X = coord_X;
	}
	public void setCoord_Y(double coord_Y) {
		this.coord_Y = coord_Y;
	}

	@Override
	public String toString() {
		return "Punto [X =" + coord_X + ", Y =" + coord_Y + "]";
	}

}

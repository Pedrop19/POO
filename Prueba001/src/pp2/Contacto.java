package pp2;

import java.util.ArrayList;


public class Contacto {
    private int codigo;
    private int DNI;
    private String nombre;
    private String apellido;
    private ArrayList<Numero> numeros;

    public Contacto() {
        numeros = new ArrayList();
    }

    public Contacto(int codigo, String nombre, String apellido, ArrayList<Numero> numeros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeros = numeros;
    }

    public Contacto(int codigo, int DNI, String nombre, String apellido) {
        this.codigo = codigo;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        numeros = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }
    
    
    
    
}


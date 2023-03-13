public class Monitor extends Persona {

    private int experiencia;
    private Seccion seccion;

    public Monitor(String DNI, String nombreCompleto, int edad,
    int experiencia, Seccion seccion) {
        super(DNI, nombreCompleto, edad);
        this.experiencia = experiencia;
        this.seccion = seccion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public void entrenar() {
        experiencia += 1;
    }

    @Override
    public String toString() {
        return "Monitor [" + super.toString() + "experiencia=" + experiencia + ", seccion=" + seccion + "]";
    }
    
    
}

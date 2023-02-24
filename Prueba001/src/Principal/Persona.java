package Principal;

public class Persona {
    //1. Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private String edad;
    
    //2. Métodos
    //2.1 Constructor/es  
    public Persona(String dni, String nombre, String apellidos, String edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //2.2 Otros

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Persona[dni: " + dni + "; nombre: " + this.nombre + "; apellidos: " + this.apellidos + "; edad: " + this.edad + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        Persona per = (Persona) obj;
        if(this.dni.equals(per.getDni())){
            iguales = true;
        }
        return iguales;
    }
}

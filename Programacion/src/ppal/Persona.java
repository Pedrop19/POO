package ppal;

public class Persona {
    
    //1. Atributos
    
    private String dni;
    private String nombre;
    private String apellidos;
    
    //2.Metodos
        //2.1 Constructor
       
        public Persona (String dni, String nombre, String apellidos){
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
        }
    
    //2.2 Otros

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellidos);
    }
    
    @Override
    public String toString(){
        return " Nombre" + this.nombre + " Apellidos" + this.apellidos;
    }
    
    //@Override
    public boolean equals(Object obj){
       boolean iguales = false;
       Persona p = (Persona) obj;
        if(this.dni.equals(p.getDni())){
          iguales = true;
        }        
        return iguales;
    }
}

package com.mycompany.poo;

/**
 *
 * @author Pedro Lazaro
 */
public class Persona {
    
    //1. Atributos
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    //2.Metodos
        //2.1 Constructor/es
        
        public Persona(){
            this.nombre = "";
            this.apellidos = "";
            this.edad =  -12;
        }
        
        public Persona (String nombre, String apellidos, int edad){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }
    
    //2.2 Otros

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
    }
    
    @Override
    public String toString(){
        return " Nombre" + this.nombre + " Apellidos" + this.apellidos + " Edad" + this.edad;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean iguales = false;
        Persona p = (Persona) obj;
        if(this.nombre.equals(p.getNombre()) && this.apellidos.equals(p.getApellidos()) && this.edad == p.getEdad()){
            iguales = true;
        }
        
        return true;
    }
}

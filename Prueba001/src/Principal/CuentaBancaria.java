package Principal;

import java.util.LinkedList;

public class CuentaBancaria {
    
    private String id;
    private double saldo;
    private LinkedList<Persona> titulares;
    private int Tam;
    
    public CuentaBancaria(String id, Persona titular){
        this.id = id;
        this.saldo = 0;
        this.titulares = new LinkedList<Persona>();
        this.titulares.add(titular);
    }
    
    public CuentaBancaria(String id, double saldo, Persona titular){
        this.id = id;
        this.saldo = saldo;
        this.titulares = new LinkedList<Persona>();
        this.titulares.add(titular);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public double ingresar(double importe){
        this.saldo += importe;
        return this.saldo;
    }
    
    public double retirar(double importe){
        this.saldo -= importe;
        return this.saldo;
    }
    
    public boolean esMorosa(){
        return this.saldo < 0;
    }
    
    public void aniadirTitular(Persona p){
        if(!titulares.contains(p))
            titulares.add(titulares.size() - 1, p);
    }
    
    public void eliminarTitular(Persona p){
        if(titulares.contains(p))
            titulares.remove(p);
    }
    
    public void cambioTitular(Persona actual, Persona nuevo){
        if(titulares.size() == 1 && titulares.get(0).equals(actual)){
            titulares.remove(actual);
            titulares.add(nuevo);
            System.out.println("Cambio de titular efectuado");
        }else
            System.out.println("No se puede realizar el cambio de titular");
    }
    
    public void mostrarTitulares(){
        System.out.println(titulares);
    }

    @Override
    public String toString() {
        return "Cuenta_Bancaria[id: " + this.id + "; saldo: " + this.saldo + "; titular: " + this.titulares + "]";
    }

    @Override
    public boolean equals(Object obj) {
        
        return this.id.equals(((CuentaBancaria)obj).getId());
    }
    
    
    
}


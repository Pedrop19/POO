package ppal;

/**
 *
 * @author Pedro Lazaro
 */
public class Cuenta {
    private String id_cuenta;
    private double saldo;
    private Persona titular;
    
        
    public Cuenta (String id_cuenta, double saldo, Persona titular){
        this.id_cuenta = id_cuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta (String id_cuenta, Persona titular){
        this.id_cuenta = id_cuenta;
        this.saldo = 0;
        this.titular = titular;
    }

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        String result = "Cuenta[Número de cuenta: " + this.id_cuenta + "; Saldo: " + this.saldo +
               "; titular: " + this.titular;
        if(this.titular != null)
            result += "; propietario: " + this.titular.toString();
        else
            result += "; no hay propietario asignado";
        
        result += "]";
        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        Cuenta c = (Cuenta) obj;
        if(this.id_cuenta.equals(c.getId_cuenta()))
            result = true;
        return result;
    }
    
    public double ingresar(double importe){
        this.saldo += importe;
        return this.saldo;
    }
    
    public double retirar(double importe){
        this.saldo -= importe;
        return this.saldo;
    }
    
    public String esMoroso(){
        if (this.saldo < 0){
            return "El titular es un moroso";
        }
        return "El titular no es un moroso";
    }
    
    public String cambioTitular(Persona titularActual, Persona nuevoTitular){
                
        if (titularActual.equals(this.titular)) {
            this.titular = nuevoTitular;
            return "El titular ha sido cambiado";
        }
        
        return "El titular no ha sido cambiado";
    }
    
    public double transferencia(Cuenta cuentaTransfiere, Cuenta cuentaRecibe, int importe){     
        if(importe > 0){
            cuentaTransfiere.saldo -= importe;
            cuentaRecibe.saldo += importe;
        }
        return cuentaRecibe.saldo;
    }
    
}

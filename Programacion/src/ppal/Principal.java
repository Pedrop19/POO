package ppal;

public class Principal {
	
    public static void main(String[] args) {
    	
        
        Persona propietario1 = new Persona("75264547X", "Pedro", "Lazaro");
        Persona propietario2 = new Persona("75264527X", "Lucas", "Perez");
        Cuenta cuenta1 = new Cuenta("ES75458454", 2000, propietario1);
        Cuenta cuenta2 = new Cuenta("ES7543258454", 2000, propietario2);
        
        System.out.println(cuenta1.ingresar(2000));
        System.out.println(cuenta1.retirar(6000));
        System.out.println(cuenta1.cambioTitular(propietario1, propietario2));
        System.out.println(cuenta1.esMoroso());
    }
    
    
}

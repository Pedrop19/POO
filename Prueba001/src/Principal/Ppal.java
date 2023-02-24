package Principal;


public class Ppal {

    public static void main(String[] args) {
        Persona p = new Persona("12345678A", "Carlos", "Collado Garrido", "27");
        Persona p1 = new Persona("87654321B", "Marina", "Preciado", "30");
        
        CuentaBancaria cb = new CuentaBancaria("ES890343856438765", p1);
        /*
        cb.retirar(300);
        if(cb.esMorosa())
            System.out.println("CUENTA MOROSA");
        else
            System.out.println("CUENTA LIBRE");
        
        cb.ingresar(600);
        
        if(cb.esMorosa())
            System.out.println("CUENTA MOROSA");
        else
            System.out.println("CUENTA LIBRE");
        */
        
        cb.mostrarTitulares();
        
        cb.cambioTitular(p, p1);
        cb.aniadirTitular(p1);
        
        cb.mostrarTitulares();
        
        cb.cambioTitular(p1, p);
        
        cb.mostrarTitulares();
        
        cb.aniadirTitular(p1);
        cb.mostrarTitulares();
                
    }
}


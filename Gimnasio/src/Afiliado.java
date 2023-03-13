public class Afiliado extends Persona {

    private int numAfiliado;
    private int bono;
    private int saldo;
    private int sesiones;

    public Afiliado(String DNI, String nombreCompleto, int edad,
            int numAfiliado, int bono, int saldo, int sesiones) {
        super(DNI, nombreCompleto, edad);
        this.numAfiliado = numAfiliado;
        this.bono = bono;
        this.saldo = saldo;
        this.sesiones = sesiones;
    }

    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    public void cargarBono() {
        if (bono == 1 && saldo >= 20)
            sesiones += 10;
        else {
            if (bono == 1 && saldo < 20)
                System.out.println("No tienes suficiente saldo");
        }
        if (bono == 2 && saldo >= 25)
            sesiones += 15;
        else {
            if (bono == 2 && saldo < 25)
                System.out.println("No tienes suficiente saldo");
        }
        if (bono == 3 && saldo >= 30)
            sesiones += 25;
        else {
            if (bono == 3 && saldo < 30)
                System.out.println("No tienes suficiente saldo");
        }
    }

    @Override
    public String toString() {
        return "Afiliado [" + super.toString() + "numAfiliado=" + numAfiliado + "]";
    }

    @Override
    public void entrenar() {
        if (sesiones > 0)
            sesiones -= 1;
        else
            System.out.println("No te quedan sesiones");
    }

}

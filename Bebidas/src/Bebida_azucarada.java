public class Bebida_azucarada extends Producto{

    private int azucar;
    private boolean descuento;

    public Bebida_azucarada(int id, int cant_litro, double precio, String marca,
            int azucar, boolean descuento) {
        super(id, cant_litro, precio, marca);
        this.azucar = azucar;
        this.descuento = descuento;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "bebida_azucarada [" + super.toString() + ", azucar: " + azucar + ", descuento: " + descuento + "]";
    }

    public void descuento(){
        double desc = getPrecio() * 0.1;
        if(descuento)
            setPrecio(getPrecio() - desc);
    }
    
}

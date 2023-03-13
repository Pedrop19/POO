import java.util.LinkedList;

public class Estanteria {

    private int id;
    private int capacidad;
    private LinkedList<Producto> productos;

    public Estanteria(int id, LinkedList<Producto> productos) {
        this.id = id;
        this.productos = productos;
        this.capacidad = 20;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LinkedList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addProducto(Producto p){
        if(!productos.isEmpty()){
            if (productos.size() != capacidad)
                    productos.add(p);
            else
                System.out.println("La estanteria esta llena");
        }
        else
            productos.add(p);
    }

    public void removeProducto(Producto p){
        if(!productos.isEmpty()){
            productos.remove(p);
        }
    }


    @Override
    public String toString() {
        return "Estanteria [id=" + id + ", productos=" + productos + "]";
    }

}

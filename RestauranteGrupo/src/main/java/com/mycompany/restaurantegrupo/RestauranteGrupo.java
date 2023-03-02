
public class RestauranteGrupo {
	
	public static void main(String[] args) {
		
        LinkedList<Plato> platos = new LinkedList<Plato>();

        int opc = 0;
        do{
            System.out.println("1. AÑADIR EMPLEADO"); //MANUELF
            System.out.println("2. DESPEDIR EMPLEADO"); //MANUELF
            System.out.println("3. RECEPCIONAR PEDIDO DE PROVEEDOR"); //JORGE Y RAUL
            System.out.println("4. CREAR PLATO"); //MANUEL
            System.out.println("5. BORRAR UN PLATO"); //MANUEL
            System.out.println("6. AGREGAR PROVEEDOR"); //JORGE Y RAUL
            System.out.println("7. MOSTRAR BENEFICIO"); //PEDRO
            System.out.println("8. MOSTRAR AVISO DEL ALMACEN"); //PEDRO
            System.out.println("9. VENTA DE PLATO"); //PEDRO
            System.out.println("10. SALIR");
        }while(opc !=11);
    }
	

    //System.out.println("9. VENTA DE PLATO");
    public void Venta (){
        System.out.println("--- VENTA DE PLATO ---");
        System.out.println("A continuación se mostrará una lista de los platos disponibles: ")

    }

	public static void MostrarPlatos(LinkedList<Plato> platos) {
		System.out.println("-- LISTA DE CLIENTES --");
		for (int i = 0; i < platos.size(); i++) {
			System.out.println("Número de Cliente: " + (i + 1) + " - " + "DNI: " + personas.get(i).getDni());
		}
	}
}
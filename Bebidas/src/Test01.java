import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class Test01 {
    
    @Test
	public void test01() {

        LinkedList <Producto> productos = new LinkedList<Producto>();
        LinkedList <Estanteria> estanterias = new LinkedList<Estanteria>();

		double valorEsperado = 22.0;
		Agua_mineral agua_mineral_01 = new Agua_mineral(0, 1, 20, "Fontvella", "Su casa");
        Agua_mineral agua_mineral_02 = new Agua_mineral(1, 2, 2, "Aquabona", "Tenerife");
        Estanteria estanteria_01 = new Estanteria(0, productos);
        estanterias.add(estanteria_01);
        estanteria_01.addProducto(agua_mineral_01);
        estanteria_01.addProducto(agua_mineral_02);
        Almacen almacen_01 = new Almacen(estanterias);

		double resultado = almacen_01.precioEstanteria(0);
		assertEquals(valorEsperado, resultado, 0);
	}
}

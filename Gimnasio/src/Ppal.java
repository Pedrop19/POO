import java.util.LinkedList;

public class Ppal {
    public static void main(String[] args) {

        LinkedList<Persona> personas = new LinkedList<Persona>();

        Seccion seccion_01 = new Seccion(0, "Piscina");
        Seccion seccion_02 = new Seccion(1, "Fitness");
        Seccion seccion_03 = new Seccion(2, "Pesas");

        Afiliado afiliado_01 = new Afiliado("555X", "Pedro Lazaro", 30, 255, 1, 200, 5);
        Afiliado afiliado_02 = new Afiliado("666X", "Jose Alvarez", 27, 256, 2, 10, 1);

        Monitor monitor_01 = new Monitor("777X", "Pablo Lopez", 40, 10, seccion_01);
        Monitor monitor_02 = new Monitor("888X", "Laura Gomez", 20, 5, seccion_02);
        Monitor monitor_03 = new Monitor("999X", "Luis Fernandez", 50, 20, seccion_03);

        personas.add(afiliado_01);
        personas.add(afiliado_02);
        personas.add(monitor_01);
        personas.add(monitor_02);
        personas.add(monitor_03);

        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).entrenar();
        }
        
        System.out.println("Afiliado_01");
        System.out.println(afiliado_01.getSesiones());
        System.out.println("Afiliado_02");
        System.out.println(afiliado_02.getSesiones());
        System.out.println("Monitor_01");
        System.out.println(monitor_01.getExperiencia());
        System.out.println("Monitor_02");
        System.out.println(monitor_02.getExperiencia());
        System.out.println("Monitor_03");
        System.out.println(monitor_03.getExperiencia());

        afiliado_01.cargarBono();
        afiliado_02.entrenar();
        afiliado_02.cargarBono();

        System.out.println("Afiliado_01");
        System.out.println(afiliado_01.getSesiones());
        System.out.println("Afiliado_02");
        System.out.println(afiliado_02.getSesiones());
    }
}

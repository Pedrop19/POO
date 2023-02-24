package graficos;

// Importamos el paquete swing para trabajar con interfaces gráficas
import javax.swing.*;
 
/**
 * ESTA CLASE DEBE HEREDAR DE JFRAME PARA PODER
 * CREAR LA VENTANA DE NUESTRA INTERFAZ
 */
public class Graficos extends JFrame{
     
    /* Esta variable no es necesaria, pero si
     * muy recomendable, ya que nos evitará problemas
     * si hay futuras actualizaciones de la aplicacion*/
    private static final long serialVersionUID = 1L;
    
    // Creamos una lámina para colocar encima del JFrame
    public JPanel lamina = new JPanel(); 
     
    /**
     * EL CONSTRUCTOR CREA LA VENTANA, LE DA UNAS PROPIEDADES
     * Y ADEMÁS EN EL, SE INDICA QUE SE LE AGREGUE UN JPANEL
     * O LO QUE ES LO MISMO, UNA LAMINA PARA PODER AGREGAR
     * LOS CONTROLES NECESARIOS
     */
    public Graficos() {
          
        // Le damos un tamaño a la ventana
        this.setSize(450, 300);
         
        // Agregamos un tículo
        this.setTitle("Colorear ventanas");
          
        // Lo centramos en pantalla
        this.setLocationRelativeTo(null);
          
        /* Le decimos que no se puede redimensionar*/
        this.setResizable(false);
          
        // Le decimos que al cerrar la ventana, acabe el programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        // Agregamos una lámina a la ventana
        this.getContentPane().add(lamina);
    }
}

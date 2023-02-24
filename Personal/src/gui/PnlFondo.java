package gui;

import java.awt.*;
import javax.swing.*;


public class PnlFondo extends JPanel  {
    
	public PnlFondo() {
		this.setSize(400, 200);
    }
	
	@Override
	public void paintComponent(Graphics g) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagen/fondo.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g); 
	}
}

package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal frame = new Ventana_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Principal() {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setTitle("Videoclub Mérida");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pedro Lazaro\\Downloads\\634938a4e59ee47b356f80bc_Group 3731.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 574);
		contentPane = new PnlFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(376, 11, 360, 486);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Registrar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 102, 153));
		btnNewButton.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnNewButton.setActionCommand("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setBounds(67, 74, 232, 49);
		panel.add(btnNewButton);
		
		JButton btnNuevoAlquiler = new JButton("Nuevo Alquiler");
		btnNuevoAlquiler.setForeground(new Color(0, 102, 153));
		btnNuevoAlquiler.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnNuevoAlquiler.setActionCommand("Registrar Cliente");
		btnNuevoAlquiler.setBounds(67, 139, 232, 49);
		panel.add(btnNuevoAlquiler);
		
		JButton btnFinAlquiler = new JButton("Fin Alquiler");
		btnFinAlquiler.setForeground(new Color(0, 102, 153));
		btnFinAlquiler.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnFinAlquiler.setActionCommand("Registrar Cliente");
		btnFinAlquiler.setBounds(67, 210, 232, 49);
		panel.add(btnFinAlquiler);
		
		JButton btnListarAlquileres = new JButton("Listar Alquileres");
		btnListarAlquileres.setForeground(new Color(0, 102, 153));
		btnListarAlquileres.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnListarAlquileres.setActionCommand("Registrar Cliente");
		btnListarAlquileres.setBounds(67, 281, 232, 49);
		panel.add(btnListarAlquileres);
		
		JButton btnNuevaPeliculaserie = new JButton("Nueva Pelicula/Serie");
		btnNuevaPeliculaserie.setForeground(new Color(0, 102, 153));
		btnNuevaPeliculaserie.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnNuevaPeliculaserie.setActionCommand("Registrar Cliente");
		btnNuevaPeliculaserie.setBounds(67, 359, 232, 49);
		panel.add(btnNuevaPeliculaserie);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(204, 0, 0));
		btnSalir.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnSalir.setActionCommand("Registrar Cliente");
		btnSalir.setBounds(609, 475, 143, 49);
		contentPane.add(btnSalir);
		
		JTextArea txtrNuevoAlquiler = new JTextArea();
		txtrNuevoAlquiler.setEditable(false);
		txtrNuevoAlquiler.setOpaque(false);
		txtrNuevoAlquiler.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		txtrNuevoAlquiler.setBounds(212, 11, 367, 38);
		contentPane.add(txtrNuevoAlquiler);
		txtrNuevoAlquiler.setText("BIENVENIDO A VIDEOCLUB MÉRIDA");
	}
}

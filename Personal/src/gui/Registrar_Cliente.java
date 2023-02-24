package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Registrar_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar_Cliente frame = new Registrar_Cliente();
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
	public Registrar_Cliente () {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setTitle("Registrando a Cliente...");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pedro Lazaro\\Downloads\\634938a4e59ee47b356f80bc_Group 3731.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 574);
		contentPane = new PnlFondo2();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.setForeground(new Color(204, 0, 0));
		btnSalir.setFont(new Font("Lucida Blackletter", Font.PLAIN, 22));
		btnSalir.setActionCommand("Registrar Cliente");
		btnSalir.setBounds(10, 494, 106, 30);
		contentPane.add(btnSalir);
		
		JTextArea txtrNuevoAlquiler = new JTextArea();
		txtrNuevoAlquiler.setForeground(Color.MAGENTA);
		txtrNuevoAlquiler.setEditable(false);
		txtrNuevoAlquiler.setOpaque(false);
		txtrNuevoAlquiler.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		txtrNuevoAlquiler.setBounds(258, 32, 218, 38);
		contentPane.add(txtrNuevoAlquiler);
		txtrNuevoAlquiler.setText("REGISTRAR CLIENTE");
		
		JTextArea txtrNuevoAlquiler_1 = new JTextArea();
		txtrNuevoAlquiler_1.setOpaque(false);
		txtrNuevoAlquiler_1.setText("DNI");
		txtrNuevoAlquiler_1.setForeground(new Color(102, 255, 153));
		txtrNuevoAlquiler_1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrNuevoAlquiler_1.setEditable(false);
		txtrNuevoAlquiler_1.setBounds(101, 112, 218, 38);
		contentPane.add(txtrNuevoAlquiler_1);
		
		JTextArea txtrNuevoAlquiler_2 = new JTextArea();
		txtrNuevoAlquiler_2.setOpaque(false);
		txtrNuevoAlquiler_2.setText("NOMBRE");
		txtrNuevoAlquiler_2.setForeground(new Color(102, 255, 153));
		txtrNuevoAlquiler_2.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrNuevoAlquiler_2.setEditable(false);
		txtrNuevoAlquiler_2.setBounds(101, 161, 218, 38);
		contentPane.add(txtrNuevoAlquiler_2);
		
		JTextArea txtrNuevoAlquiler_3 = new JTextArea();
		txtrNuevoAlquiler_3.setOpaque(false);
		txtrNuevoAlquiler_3.setText("APELLIDOS");
		txtrNuevoAlquiler_3.setForeground(new Color(102, 255, 153));
		txtrNuevoAlquiler_3.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrNuevoAlquiler_3.setEditable(false);
		txtrNuevoAlquiler_3.setBounds(101, 210, 218, 38);
		contentPane.add(txtrNuevoAlquiler_3);
		
		JTextArea txtrNuevoAlquiler_4 = new JTextArea();
		txtrNuevoAlquiler_4.setOpaque(false);
		txtrNuevoAlquiler_4.setText("TELÉFONO");
		txtrNuevoAlquiler_4.setForeground(new Color(102, 255, 153));
		txtrNuevoAlquiler_4.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrNuevoAlquiler_4.setEditable(false);
		txtrNuevoAlquiler_4.setBounds(101, 259, 218, 38);
		contentPane.add(txtrNuevoAlquiler_4);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setOpaque(false);
		txtrEmail.setText("EMAIL");
		txtrEmail.setForeground(new Color(102, 255, 153));
		txtrEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrEmail.setEditable(false);
		txtrEmail.setBounds(101, 308, 218, 38);
		contentPane.add(txtrEmail);
		
		JTextArea txtrDireccin = new JTextArea();
		txtrDireccin.setOpaque(false);
		txtrDireccin.setText("DIRECCIÓN");
		txtrDireccin.setForeground(new Color(102, 255, 153));
		txtrDireccin.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrDireccin.setEditable(false);
		txtrDireccin.setBounds(101, 357, 218, 38);
		contentPane.add(txtrDireccin);
		
		txta = new JTextField();
		txta.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txta.setForeground(new Color(0, 0, 0));
		txta.setName("DNI");
		txta.setToolTipText("99999999A");
		txta.setBounds(415, 112, 233, 38);
		contentPane.add(txta);
		txta.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Julio");
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setName("NOMBRE");
		textField_1.setColumns(10);
		textField_1.setBounds(415, 161, 233, 38);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Prieto");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setName("APELLIDOS");
		textField_2.setColumns(10);
		textField_2.setBounds(415, 210, 233, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("666666666");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setName("TELEFONO");
		textField_3.setColumns(10);
		textField_3.setBounds(415, 259, 233, 38);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("email@email.com");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setName("EMAIL");
		textField_4.setColumns(10);
		textField_4.setBounds(415, 308, 233, 38);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("C/ Inventada, 6");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_5.setForeground(new Color(0, 0, 0));
		textField_5.setName("DIRECCION");
		textField_5.setColumns(10);
		textField_5.setBounds(415, 357, 233, 38);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.setFont(new Font("Lucida Blackletter", Font.PLAIN, 18));
		btnNewButton.setBounds(449, 421, 169, 44);
		contentPane.add(btnNewButton);
	}
}

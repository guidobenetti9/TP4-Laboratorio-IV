package Ejercicios;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

public class VentanaEjercicio1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public VentanaEjercicio1() {
		setTitle("Contactos");
		setBounds(50,400,500,300);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 70, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(54, 95, 46, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(54, 120, 46, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha Nac.");
		lblFechaDeNacimiento.setBounds(54, 146, 89, 14);
		getContentPane().add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setBounds(169, 67, 195, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 92, 195, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 117, 195, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 143, 195, 20);
		getContentPane().add(textField_3);
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

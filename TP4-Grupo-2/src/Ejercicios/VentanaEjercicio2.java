package Ejercicios;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNota_2;

	public VentanaEjercicio2() {
		setBounds(600,50,531,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(157, 66, 100, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 121, 100, 25);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 173, 100, 25);
		getContentPane().add(textField_2);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(44, 66, 46, 14);
		getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(44, 121, 46, 14);
		getContentPane().add(lblNota2);
		
		JLabel	lblNota3 = new JLabel("Nota 3:");
			lblNota3.setBounds(44, 173, 46, 14);
			getContentPane().add(lblNota3);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(44, 215, 46, 14);
		getContentPane().add(lblTps);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(329, 58, 117, 41);
		getContentPane().add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevo.setBounds(329, 113, 117, 41);
		getContentPane().add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(329, 165, 117, 41);
		getContentPane().add(btnSalir);
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

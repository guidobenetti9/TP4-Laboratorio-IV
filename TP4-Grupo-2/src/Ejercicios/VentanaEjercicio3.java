package Ejercicios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;

public class VentanaEjercicio3 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField txtCantHoras;

	public VentanaEjercicio3() {
		setTitle("Selecci\u00F3n m\u00FAltiple");
		setBounds(600,400,535,362);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblElijeUnSistema.setBounds(42, 44, 148, 14);
		getContentPane().add(lblElijeUnSistema);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblElijeUnaEspecialidad.setBounds(57, 135, 133, 14);
		getContentPane().add(lblElijeUnaEspecialidad);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(206, 41, 89, 23);
		getContentPane().add(rdbtnWindows);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(28, 24, 445, 58);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(360, 17, 79, 23);
		panel.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(278, 17, 69, 23);
		panel.add(rdbtnMac);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setBounds(219, 109, 133, 23);
		getContentPane().add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setBounds(219, 135, 133, 23);
		getContentPane().add(chckbxAdministracion);
		
		JCheckBox chckbxDisenioGrafico = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxDisenioGrafico.setBounds(219, 161, 133, 23);
		getContentPane().add(chckbxDisenioGrafico);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(28, 100, 445, 99);
		getContentPane().add(panel_1);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidadDeHoras.setBounds(57, 234, 203, 14);
		getContentPane().add(lblCantidadDeHoras);
		
		txtCantHoras = new JTextField();
		txtCantHoras.setBounds(281, 232, 86, 20);
		getContentPane().add(txtCantHoras);
		txtCantHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(186, 283, 89, 29);
		getContentPane().add(btnAceptar);
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

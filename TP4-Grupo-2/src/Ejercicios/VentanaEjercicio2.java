package Ejercicios;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

public class VentanaEjercicio2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	public VentanaEjercicio2() {
		setTitle("Promedio");
		setBounds(600,50,531,513);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(157, 66, 100, 25);
		getContentPane().add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(157, 121, 100, 25);
		getContentPane().add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(157, 173, 100, 25);
		getContentPane().add(txtNota3);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(44, 66, 46, 14);
		getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(44, 121, 46, 14);
		getContentPane().add(lblNota2);
		
		JLabel	lblNota3 = new JLabel("Nota 3:");
			lblNota3.setBounds(44, 173, 46, 14);
			getContentPane().add(lblNota3);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(329, 113, 117, 41);
		getContentPane().add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				ventanaActual.dispose();
				
			}
		});
		btnSalir.setBounds(329, 165, 117, 41);
		getContentPane().add(btnSalir);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel1.setBounds(27, 31, 279, 238);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JComboBox<String> cbTPS = new JComboBox<>();
		cbTPS.setModel(new DefaultComboBoxModel<> (new String[] {"Aprobado", "Desaprobado"}));
		cbTPS.setSelectedIndex(0);
		cbTPS.setBounds(129, 186, 102, 20);
		panel1.add(cbTPS);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(24, 189, 46, 14);
		panel1.add(lblTps);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p2.setBounds(27, 293, 279, 143);
		getContentPane().add(p2);
		p2.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(10, 53, 71, 14);
		p2.add(lblPromedio);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(118, 48, 100, 25);
		p2.add(txtPromedio);
		
		JLabel lblCondicin = new JLabel("Condici\u00F3n:");
		lblCondicin.setBounds(10, 100, 71, 14);
		p2.add(lblCondicin);
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(118, 95, 100, 25);
		p2.add(txtCondicion);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(329, 58, 117, 41);
		getContentPane().add(btnCalcular);
		
		JLabel lblErrorFormatoNumber = new JLabel("");
		lblErrorFormatoNumber.setBounds(58, 213, 180, 14);
		panel1.add(lblErrorFormatoNumber);
		lblErrorFormatoNumber.setForeground(Color.RED);
		
		btnCalcular.addActionListener(new EventoButtonCalcular(txtNota1, txtNota2, txtNota3, cbTPS, txtPromedio, txtCondicion,lblErrorFormatoNumber));
		btnNuevo.addActionListener(new EventoButtonNuevo(txtNota1, txtNota2, txtNota3));
		
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

class EventoButtonNuevo implements ActionListener{
		private JTextField txtNota1;
		private JTextField txtNota2;
		private JTextField txtNota3;
		
	    public EventoButtonNuevo(JTextField txtNota1, JTextField txtNota2, JTextField txtNota3) {
	        this.txtNota1 = txtNota1;
	        this.txtNota2 = txtNota2;
	        this.txtNota3 = txtNota3;
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
			}
			catch (NullPointerException npe) {
			    System.out.println("Error exepcion nullpoint");
			}
		}
		
	}

class EventoButtonCalcular implements ActionListener{

	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JComboBox<String> cbTPS;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private JLabel lblErrorFormatoNumber;
	
	EventoButtonCalcular() {};

	EventoButtonCalcular (JTextField n1, JTextField n2, JTextField n3, JComboBox<String> tp, JTextField prom, JTextField condicion,JLabel lblErrorFormatoNumber){
		txtNota1 = n1;
		txtNota2 = n2;
		txtNota3 = n3;
		cbTPS = tp;
		txtPromedio = prom;
		txtCondicion = condicion;
		this.lblErrorFormatoNumber=lblErrorFormatoNumber;
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		////PRIMER ITEM => SI EL TP ESTÁ DESAPROBADO, EL ALUMNO ESTÁ LIBRE.
		if(cbTPS.getSelectedIndex() == 1) {
			txtCondicion.setText("Libre");
		}
		///CALCULAR EL PROMEDIO:
		try {
			float nota1 = Float.parseFloat(txtNota1.getText());
			float nota2 = Float.parseFloat(txtNota2.getText());
			float nota3 = Float.parseFloat(txtNota3.getText());
			float promedio = (nota1 + nota2 + nota3)/3;
			txtPromedio.setText(Float.toString(promedio));
			lblErrorFormatoNumber.setText("");
		}
		catch (NumberFormatException enf) {
			lblErrorFormatoNumber.setText("Ingrese numeros en las notas");
		}
	}
}



package Ejercicios;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaEjercicio1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	//private JLabel lblInformacion;

	public VentanaEjercicio1() {
		setTitle("Contactos");
		setBounds(50,400,505,337);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 70, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(54, 95, 46, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(54, 120, 60, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha Nac.");
		lblFechaDeNacimiento.setBounds(54, 146, 89, 14);
		getContentPane().add(lblFechaDeNacimiento);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Color color = Color.white;
				
				txtNombre.setBackground(color);
			}
		});
		txtNombre.setBounds(169, 67, 195, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Color color = Color.white;
				
				txtApellido.setBackground(color);
			}
		});
		txtApellido.setBounds(169, 92, 195, 20);
		txtApellido.setColumns(10);
		getContentPane().add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Color color = Color.white;
				
				txtTelefono.setBackground(color);
			}
		});
		txtTelefono.setBounds(169, 117, 195, 20);
		txtTelefono.setColumns(10);
		getContentPane().add(txtTelefono);
		
		txtFechaNac = new JTextField();
		txtFechaNac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Color color = Color.white;
				
				txtFechaNac.setBackground(color);
			}
		});
		txtFechaNac.setBounds(169, 143, 195, 20);
		txtFechaNac.setColumns(10);
		getContentPane().add(txtFechaNac);
		
		JLabel lblTextoDatos = new JLabel("Los datos ingresados fueron: ");
		lblTextoDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTextoDatos.setBounds(10, 234, 168, 14);
		getContentPane().add(lblTextoDatos);
		
		JLabel lblInformacion = new JLabel("");
		lblInformacion.setBounds(188, 234, 291, 53);
		getContentPane().add(lblInformacion);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(275, 189, 89, 23);
		getContentPane().add(btnMostrar);
		btnMostrar.addActionListener(new EventoButtonMostrar(txtNombre, txtApellido, txtTelefono, txtFechaNac, lblInformacion));
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

class EventoButtonMostrar implements ActionListener{
		
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JLabel lblInformacion;
	
	public EventoButtonMostrar() {};
	
	//Metodos 
	public static Boolean verificarTextoValido(String campo) {
		if(!campo.matches("[0-9]+")) {
			return true;
		}
		else return false;
	}
	
	public static Boolean verificarFechaValida(String campo) {
		if(campo.matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")) {
			return true;
		}
		else return false;
	}
	
	public EventoButtonMostrar (JTextField txtN, JTextField txtA, JTextField txtT, JTextField txtFN, JLabel lblInfo) {
		txtNombre = txtN;
		txtApellido = txtA;
		txtTelefono = txtT;
		txtFechaNac = txtFN;
		lblInformacion = lblInfo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color colorRojo = Color.RED;
		Color colorBlanco = Color.WHITE;
				
		if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtFechaNac.getText().isEmpty()) {
				
			if(txtNombre.getText().isEmpty()) {
				txtNombre.setBackground(colorRojo);
			}
			else {
				txtNombre.setBackground(colorBlanco);
			}
			
			if(txtApellido.getText().isEmpty()) {
				txtApellido.setBackground(colorRojo);
			}
			else {
				txtApellido.setBackground(colorBlanco);
			}
				
			if(txtTelefono.getText().isEmpty()) {
				txtTelefono.setBackground(colorRojo);
			}
			else {
				txtTelefono.setBackground(colorBlanco);
			}
			
			if(txtFechaNac.getText().isEmpty()){
				txtFechaNac.setBackground(colorRojo);
			}
			else {
				txtFechaNac.setBackground(colorBlanco);
			}
	
			lblInformacion.setText("");
		}
		else {
			txtNombre.setBackground(colorBlanco);
			txtApellido.setBackground(colorBlanco);
			txtTelefono.setBackground(colorBlanco);
			txtFechaNac.setBackground(colorBlanco);
			String mensaje = "";
			lblInformacion.setVisible(true);
			lblInformacion.setForeground(Color.RED);
			if (verificarTextoValido(txtNombre.getText())) {
				mensaje = txtNombre.getText() + " ";
				
				if (verificarTextoValido(txtApellido.getText())) {
					mensaje += txtApellido.getText() + " ";
					
					if (!verificarTextoValido(txtTelefono.getText())) {
						mensaje += txtTelefono.getText() + " ";
						
						if(verificarFechaValida(txtFechaNac.getText())) {
							mensaje += txtFechaNac.getText() + " ";
							lblInformacion.setForeground(Color.black);
							lblInformacion.setText(mensaje);
							txtNombre.setText("");
							txtApellido.setText("");
							txtTelefono.setText("");
							txtFechaNac.setText("");
						}
						else lblInformacion.setText("La fecha debe tener el formato dd/mm/aaaa");
					}
					else lblInformacion.setText("El telefono debe contener solo numeros");
				}
				else lblInformacion.setText("El apellido debe contener solo letras");
			}
			else lblInformacion.setText("El nombre debe contener solo letras");
		}
	}
		
	public JLabel getLblInformacion() {
		return lblInformacion;
	}

	public void setLblInformacion(JLabel lblInformacion) {
		this.lblInformacion = lblInformacion;
	}
}

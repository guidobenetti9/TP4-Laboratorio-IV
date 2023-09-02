package Ejercicios;

import javax.swing.JFrame;

public class VentanaEjercicio2 extends JFrame{

	private static final long serialVersionUID = 1L;

	public VentanaEjercicio2() {
		setBounds(600,50,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

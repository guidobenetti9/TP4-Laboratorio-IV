package Ejercicios;

import javax.swing.JFrame;

public class VentanaEjercicio1 extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public VentanaEjercicio1() {
		setBounds(50,400,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}
	
	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

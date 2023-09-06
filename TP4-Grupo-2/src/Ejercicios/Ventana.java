package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton buttonEj1;
	private JButton buttonEj2;
	private JButton buttonEj3;
	private JLabel labelGrupo;
	
	public Ventana() {
		
		setBounds(50,50,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("TP 4 - Grupo 2");
		getContentPane().setLayout(null);
		
		buttonEj1 = new JButton();
		buttonEj1.setText("Ejercicio 1");
		buttonEj1.setBounds(180,80,140,30);
		buttonEj1.addActionListener(new EventoButton(1));
		getContentPane().add(buttonEj1);
		
		buttonEj2 = new JButton();
		buttonEj2.setText("Ejercicio 2");
		buttonEj2.setBounds(180,120,140,30);
		buttonEj2.addActionListener(new EventoButton(2));
		getContentPane().add(buttonEj2);
		
		buttonEj3 = new JButton();
		buttonEj3.setText("Ejercicio 3");
		buttonEj3.setBounds(180,160,140,30);
		buttonEj3.addActionListener(new EventoButton(3));
		getContentPane().add(buttonEj3);
		
		labelGrupo = new JLabel();
		labelGrupo.setText("GRUPO NRO: 2");
		labelGrupo.setBounds(110,40,140,30);
		getContentPane().add(labelGrupo);
	}

	public void cambiarVisibilidad(Boolean estado) { 
		setVisible(estado);
	}
}

class EventoButton implements ActionListener{
	
	private int num;
	
	public EventoButton(int num) {
		this.num = num;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(num == 1) {
			VentanaEjercicio1 ejercicio1 = new VentanaEjercicio1();
			ejercicio1.setVisible(true);
		}
		else if(num == 2) {
			VentanaEjercicio2 ejercicio2 = new VentanaEjercicio2();
			ejercicio2.setVisible(true);
		}
		else {
			VentanaEjercicio3 ejercicio3 = new VentanaEjercicio3();
			ejercicio3.setVisible(true);
		}
	}
}

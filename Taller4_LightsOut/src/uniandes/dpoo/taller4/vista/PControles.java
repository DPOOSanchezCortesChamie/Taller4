package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;
import uniandes.dpoo.taller4.modelo.Top10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PControles extends JPanel implements ActionListener{
	private ControladorJuego controlador;
	
	private JButton nuevo;
	
	public PControles(ControladorJuego controlador) {
		this.controlador = controlador;
		iniAcciones();
		

		JPanel panel = new JPanel(new GridLayout(4, 1, HEIGHT ,WIDTH ));
		panel.setBackground(new Color(30,144,255));
		panel.setBounds(550, 160, 60, 70);

		nuevo = new JButton("Nuevo");
		nuevo.setBackground(new Color(30,144,255));
		nuevo.setForeground(Color.white);
		nuevo.setBounds(550,100,300,400);
		nuevo.addActionListener(this);

		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBackground(new Color(30,144,255));
		reiniciar.setForeground(Color.white);
		reiniciar.setBounds(150,100,300,400);
		reiniciar.addActionListener(this);
		
		JButton top = new JButton("Top 10");
		top.setBackground(new Color(30,144,255));
		top.setForeground(Color.white);
		top.setBounds(150,100,300,400);
		
		JButton cambiarJuegador = new JButton("Cambiar Jugador");
		cambiarJuegador.setBackground(new Color(30,144,255));
		cambiarJuegador.setForeground(Color.white);
		cambiarJuegador.setBounds(150,100,300,400);
		
		ButtonGroup grupoBotones = new ButtonGroup();
		
		grupoBotones.add(nuevo);
		grupoBotones.add(reiniciar);
		grupoBotones.add(top);
		grupoBotones.add(cambiarJuegador);

		panel.add(nuevo);
		panel.add(reiniciar);
		panel.add(top);
		panel.add(cambiarJuegador);
		
		this.add(panel);
		
	}

	private void iniAcciones() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText().equals("Nuevo")) {
			this.controlador.crearTablero();
		} else if (b.getText().equals("Reiniciar")) {
			this.controlador.reiniciar();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

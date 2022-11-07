package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class POpciones extends JPanel implements ActionListener,ItemListener{
	private ControladorJuego controlador;
	
	private JComboBox<String> seleccionDificultad;
	JRadioButton botonFacil;
	JRadioButton botonMedio;
	JRadioButton botonDificil;
	
	public POpciones(ControladorJuego controlador) {
		this.controlador = controlador;
		
		this.setBackground(new Color(30,144,255));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));
		panel.setBackground(new Color(30,144,255));
		
		JLabel lblTamano = new JLabel("Tamaño:");
		JLabel lblDificultad = new JLabel("Dificultad:");
		lblTamano.setForeground(Color.white);
		lblTamano.setFont(new Font("ARIAL", Font.PLAIN, 15));
		lblDificultad.setForeground(Color.white);
		lblDificultad.setFont(new Font("ARIAL", Font.PLAIN, 15));
		
		seleccionDificultad = new JComboBox<String>();
		
		seleccionDificultad.addItem("5x5");
		seleccionDificultad.addItem("7x7");
		seleccionDificultad.addItem("9x9");
		
		seleccionDificultad.addActionListener(this);
	
		JRadioButton botonFacil = new JRadioButton("Facil");
		JRadioButton botonMedio = new JRadioButton("Medio");
		JRadioButton botonDificil = new JRadioButton("Dificil");
		
		
		botonFacil.setForeground(Color.white);
		botonMedio.setForeground(Color.white);
		botonDificil.setForeground(Color.white);
		
		botonFacil.setBackground(new Color(30,144,255));
		botonMedio.setBackground(new Color(30,144,255));
		botonDificil.setBackground(new Color(30,144,255));
		
		botonFacil.addItemListener(this);
		botonMedio.addItemListener(this);
		botonDificil.addItemListener(this);
		
		ButtonGroup grupoBotones = new ButtonGroup();
		
		grupoBotones.add(botonFacil);
		grupoBotones.add(botonMedio);
		grupoBotones.add(botonDificil);
		
		panel.add(lblTamano);
		panel.add(seleccionDificultad);
		panel.add(lblDificultad);
		panel.add(botonFacil);
		panel.add(botonMedio);
		panel.add(botonDificil);
		
		this.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.seleccionDificultad)) {
			String s = this.seleccionDificultad.getSelectedItem().toString();
			this.controlador.setTamano(Integer.parseInt(s.substring(0,1)));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton button = (JRadioButton) e.getSource();
		if(button.equals(this.botonFacil)) {
			System.out.println("siii");
		}
	}
}

package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class POpciones extends JPanel{
	private ControladorJuego controlador;
	
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
		
		JComboBox seleccionDificultad = new JComboBox<>();
		
		seleccionDificultad.addItem("5x5");
		
	
		JRadioButton botonFacil = new JRadioButton("Fácil");
		JRadioButton botonMedio = new JRadioButton("Medio");
		JRadioButton botonDificil = new JRadioButton("Díficil");
		
		botonFacil.setForeground(Color.white);
		botonMedio.setForeground(Color.white);
		botonDificil.setForeground(Color.white);
		
		botonFacil.setBackground(new Color(30,144,255));
		botonMedio.setBackground(new Color(30,144,255));
		botonDificil.setBackground(new Color(30,144,255));
		
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
}

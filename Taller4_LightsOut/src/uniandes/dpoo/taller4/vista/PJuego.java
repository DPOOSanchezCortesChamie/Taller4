package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PJuego extends JPanel {
	
	private ControladorJuego controlador;
	
	public PJuego(ControladorJuego controlador) {
		this.controlador = controlador;
	}
	
	public void pintarTablero(Graphics g) {
		Dimension d = this.getSize();
		
	}
	

}

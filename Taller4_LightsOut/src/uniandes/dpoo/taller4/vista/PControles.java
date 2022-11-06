package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import javax.swing.JPanel;

public class PControles extends JPanel{
	private ControladorJuego controlador;
	
	public PControles(ControladorJuego controlador) {
		this.controlador = controlador;
	}
}

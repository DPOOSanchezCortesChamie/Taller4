package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PJuego extends JPanel implements Observer{
	private ControladorJuego controlador;
	public PJuego(ControladorJuego controlador) {
		this.controlador = controlador;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}

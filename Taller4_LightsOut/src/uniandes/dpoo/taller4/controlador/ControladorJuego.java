package uniandes.dpoo.taller4.controlador;

import uniandes.dpoo.taller4.modelo.Tablero;

public class ControladorJuego {
	Tablero tablero;
	public ControladorJuego() {
		
	}
	
	public void crearTablero(int tamano) {
		this.tablero = new Tablero(tamano);
	}
	
}

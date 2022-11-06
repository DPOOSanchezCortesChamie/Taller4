package uniandes.dpoo.taller4.controlador;

import uniandes.dpoo.taller4.modelo.Tablero;

public class ControladorJuego {
	Tablero tablero;
	
	public ControladorJuego() {

	}
	
	public void crearTablero(int tamano) {
		this.tablero = new Tablero(tamano);
	}
	
	public void jugar(int fila, int columna) {
		tablero.jugar(fila, columna);
	}
	
	public boolean tableroIluminado() {
		return tablero.tableroIluminado();
	}
	
	public boolean[][] darTablero()
	{
		return tablero.darTablero();
	}
}

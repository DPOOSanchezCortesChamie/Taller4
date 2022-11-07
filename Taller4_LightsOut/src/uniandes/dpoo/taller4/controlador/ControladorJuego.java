package uniandes.dpoo.taller4.controlador;

import uniandes.dpoo.taller4.modelo.Tablero;

public class ControladorJuego {
	Tablero tablero;
	int tamano;
	
	public ControladorJuego() {
		tamano = 6;
	}
	
	public void crearTablero() {
		this.tablero = new Tablero(this.tamano);
	}
	
	public void jugar(int fila, int columna) {
		tablero.jugar(fila, columna);
	}
	
	public boolean tableroIluminado() {
		return tablero.tableroIluminado();
	}
	
	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public boolean[][] darTablero()
	{
		return tablero.darTablero();
	}
}

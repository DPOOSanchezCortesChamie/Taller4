package uniandes.dpoo.taller4.controlador;

import uniandes.dpoo.taller4.modelo.Tablero;

public class ControladorJuego {
	Tablero tablero;
	int tamano;
	int tamanoActual;
	String dificultad;
	
	public ControladorJuego() {
		tamanoActual = 5;
		tamano = 5;
		dificultad = "Facil";
	}
	
	public void crearTablero() {
		this.tablero = new Tablero(this.tamano);
		if(this.dificultad.equals("Facil"))
			this.tablero.desordenar(5);
		else if(this.dificultad.equals("Medio"))
			this.tablero.desordenar(10);
		else if(this.dificultad.equals("Dificil"))
			this.tablero.desordenar(20);
		this.tamanoActual = this.tamano;
		this.tablero.salvar_tablero();
	}
	
	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public void jugar(int fila, int columna) {
		tablero.jugar(fila, columna);
	}
	
	public boolean tableroIluminado() {
		return tablero.tableroIluminado();
	}
	
	public int getTamano() {
		return tamanoActual;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public boolean[][] darTablero()
	{
		return tablero.darTablero();
	}
	public void reiniciar() {
		this.tablero.reiniciar();
	}
}

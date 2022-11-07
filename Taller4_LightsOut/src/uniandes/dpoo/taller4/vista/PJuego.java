package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PJuego extends JPanel implements MouseListener{
	
	private ControladorJuego controlador;
	
	public PJuego(ControladorJuego controlador) {
		this.controlador = controlador;
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		int size = controlador.getTamano();
		Dimension d = this.getSize();
		int anchoBloque = (int)d.getWidth()/size;
		int largoBloque = (int)d.getHeight()/size;
		boolean[][] tablero = controlador.darTablero();
		for(int i = 0; i < size; i++) {
			for (int j = 0; j<size; j++) {
				if(tablero[j][i]) {
					g.setColor(Color.YELLOW);
					g.fillRect(anchoBloque*i, largoBloque*j,anchoBloque, largoBloque);
				} else {
					g.setColor(Color.BLACK);
					g.fillRect(anchoBloque*i, largoBloque*j,anchoBloque, largoBloque);
				}
			}
		}
	}

	public void componentResized(ComponentEvent e) {
		this.repaint();
		
	}
	public void mousePressed(MouseEvent e)
	{
		int click_x = e.getX();
		int click_y = e.getY();
		int[] casilla = convertirCoordenadasACasilla(click_x, click_y);
		this.controlador.jugar(casilla[0], casilla[1]);
		this.repaint();
	}
	private int[] convertirCoordenadasACasilla(int x, int y)
	{
		int ladoTablero = controlador.getTamano();
		int altoPanelTablero = getHeight();
		int anchoPanelTablero = getWidth();
		int altoCasilla = altoPanelTablero / ladoTablero;
		int anchoCasilla = anchoPanelTablero / ladoTablero;
		int fila = (int) (y / altoCasilla);
		int columna = (int) (x / anchoCasilla);
		return new int[] { fila, columna };
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

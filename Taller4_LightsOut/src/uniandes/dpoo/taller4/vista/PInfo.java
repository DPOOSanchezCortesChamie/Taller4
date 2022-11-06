package uniandes.dpoo.taller4.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PInfo extends JPanel implements Observer{
	public PInfo() {
		this.setLayout(new FlowLayout());
		
		JPanel pJugadas = new JPanel();
		JPanel pJugador = new JPanel();
		this.add(pJugadas);
		this.add(pJugador);
		this.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
		
		
		JLabel jugadas = new JLabel("Jugadas:");
		JLabel jugador = new JLabel("Jugador:");
		JLabel lblJugadas = new JLabel("0");
		JLabel lblJugador = new JLabel();
		pJugadas.add(jugadas);
		pJugadas.add(lblJugadas);
		
		pJugador.add(jugador);
		pJugador.add(lblJugador);
		jugadas.setOpaque(true);
		jugadas.setBackground(Color.WHITE);
		
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}

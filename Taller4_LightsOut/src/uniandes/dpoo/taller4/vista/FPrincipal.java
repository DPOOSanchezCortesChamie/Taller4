package uniandes.dpoo.taller4.vista;

import uniandes.dpoo.taller4.controlador.ControladorJuego;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FPrincipal extends JFrame implements ActionListener{
	
	public FPrincipal() {
		
		ControladorJuego cntrl = new ControladorJuego();
		cntrl.crearTablero();
		
		this.setLayout(new BorderLayout());
		this.setTitle("LightsOut");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500,500);
	    //Toolkit.getDefaultToolkit().getScreenSize()
		POpciones pOpciones = new POpciones(cntrl);
		PControles pControles = new PControles(cntrl);
		PJuego pJuego = new PJuego(cntrl);
		PInfo pInfo = new PInfo();
			
		this.add(pOpciones, BorderLayout.NORTH);
		this.add(pControles, BorderLayout.WEST);
		this.add(pJuego, BorderLayout.CENTER);
		this.add(pInfo, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		FPrincipal fPrincipal = new FPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

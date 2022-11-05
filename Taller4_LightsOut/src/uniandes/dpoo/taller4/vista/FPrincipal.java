package uniandes.dpoo.taller4.vista;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FPrincipal extends JFrame implements ActionListener{

	public FPrincipal() {
		
		this.setLayout(new BorderLayout());
		this.setTitle("LightsOut");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	    
		POpciones pOpciones = new POpciones();
		PControles pControles = new PControles();
		PJuego pJuego = new PJuego();
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
		// TODO Auto-generated method stub
		
	}

}

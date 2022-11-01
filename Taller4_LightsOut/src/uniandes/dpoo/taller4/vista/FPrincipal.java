package uniandes.dpoo.taller4.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FPrincipal extends JFrame implements ActionListener{

	public FPrincipal() {
		
		this.setLayout(new BorderLayout());
		
		JLabel PAGE_START = new JLabel();
		JLabel LINE_START = new JLabel();
		JLabel CENTER = new JLabel();
		JLabel PAGE_END = new JLabel();
		
		this.add(LINE_START, BorderLayout.WEST);
		this.add(CENTER, BorderLayout.CENTER);
		this.add(PAGE_START, BorderLayout.NORTH);
		this.add(PAGE_END, BorderLayout.SOUTH);
		
		
		
		this.setTitle("LigthsOut");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,400);
		
		
	}
	
	public static void main(String[] args) {
		FPrincipal fPrincipal = new FPrincipal();
		fPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

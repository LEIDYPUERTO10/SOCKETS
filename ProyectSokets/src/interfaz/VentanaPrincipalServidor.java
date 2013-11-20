package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VentanaPrincipalServidor extends JFrame {

	private PnlIzquierdoPrincipalServidor pnlIzquierdo;
	private PnlDerechoServidor pnlDerecho;
	
	public VentanaPrincipalServidor() {
		// TODO Auto-generated constructor stub
		setSize(1000, 350);
		setLocationRelativeTo(null);
		setLayout(null);
		
		pnlIzquierdo = new PnlIzquierdoPrincipalServidor();
		pnlIzquierdo.setSize(220, 350);
		pnlIzquierdo.setLocation(0, 0);
		this.add(pnlIzquierdo);
		
		pnlDerecho = new PnlDerechoServidor();
		pnlDerecho.setSize(220, 350);
		pnlDerecho.setLocation(780, 0);
		this.add(pnlDerecho);
		
	}
	
	public static void main(String[] args) {
		VentanaPrincipalServidor servidor = new VentanaPrincipalServidor();
		servidor.setVisible(true);
	}
}

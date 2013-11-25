package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Servidor;

public class VentanaPrincipalServidor extends JFrame {

	PnlIzquierdoPrincipalServidor pnlIzquierdo;
	PnlDerechoServidor pnlDerecho;
	private Servidor servidorLogica;
	private JLabel lblCanciones;
	private JList listaCanciones;
	private DefaultListModel modeloListaCanciones;
	
	public VentanaPrincipalServidor() {
		
		// TODO Auto-generated constructor stub
		setSize(1000, 350);
		setLocationRelativeTo(null);
		setLayout(null);
		
		servidorLogica = new Servidor();
		
		pnlIzquierdo = new PnlIzquierdoPrincipalServidor(this);
		pnlIzquierdo.setSize(220, 350);
		pnlIzquierdo.setLocation(0, 0);
		this.add(pnlIzquierdo);
		
		pnlDerecho = new PnlDerechoServidor();
		pnlDerecho.setSize(220, 350);
		pnlDerecho.setLocation(780, 0);
		this.add(pnlDerecho);
		
		JPanel pnlCentral = new JPanel();
		pnlCentral.setBackground(Color.BLACK);
		pnlCentral.setSize(660, 350);
		pnlCentral.setLocation(220, 0);
		pnlCentral.setLayout(null);
		add(pnlCentral);
		
		lblCanciones = new JLabel("CANCIONES DISPONIBLES");
		lblCanciones.setBackground(Color.BLACK);
		lblCanciones.setForeground(new Color(072, 061,139));
		lblCanciones.setSize(150, 20);
		lblCanciones.setLocation(200, 20);
		pnlCentral.add(lblCanciones);
				
		listaCanciones = new JList();
		listaCanciones.setBackground(Color.BLACK);
		listaCanciones.setForeground(Color.WHITE);
		listaCanciones.setSize(540, 240);
		listaCanciones.setLocation(10, 50);
		modeloListaCanciones = new DefaultListModel();
		
		for(int i = 0; i < servidorLogica.getListaCanciones().length; i++ ){
			System.out.println(servidorLogica.getListaCanciones()[i].getName());
			modeloListaCanciones.addElement(servidorLogica.getListaCanciones()[i].getName());
		}		
		listaCanciones.setModel(modeloListaCanciones);
		pnlCentral.add(listaCanciones);
	}
	
	public static void main(String[] args) {
		VentanaPrincipalServidor servidor = new VentanaPrincipalServidor();
		servidor.setVisible(true);
	}

	/**
	 * @return the servidorLogica
	 */
	
	public Servidor getServidorLogica() {
		return servidorLogica;
	}

	/**
	 * @param servidorLogica the servidorLogica to set
	 */
	
	public void setServidorLogica(Servidor servidorLogica) {
		this.servidorLogica = servidorLogica;
	}
}

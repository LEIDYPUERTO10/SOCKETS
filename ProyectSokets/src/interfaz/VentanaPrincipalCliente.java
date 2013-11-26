/**
 * En la clase VentanaPrincipalCliente.java se encuentra lo necesario para
 * crear la ventana que le aparecera como primera pantalla al cliente
 */

package interfaz;

import java.awt.Color;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logic.Cancion;
import logic.Cliente;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear un frame que le aparecera al cliente cuando ejecute
 * el programa
 */

public class VentanaPrincipalCliente extends JFrame{
	
	private PnlIzquierdoCliente pnlIzquierdo;
//	private Cliente cliente;
	public JTextArea txtLetraCancion;
	private Cancion cancion;
	public VentanaPuertoCliente ventanaPuerto;

	/**
	 * 
	 * Este es el contructor de la clase VentanaPrincipalCliente.java
	 * @param ventanaPuertoCliente 
	 * @throws UnknownHostException 
	 */

	public VentanaPrincipalCliente(VentanaPuertoCliente ventanaPuertoCliente) throws UnknownHostException {
		// TODO Auto-generated constructor stub
		setSize(800, 350);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle(Inet4Address.getLocalHost().getHostAddress());
		this.ventanaPuerto = ventanaPuertoCliente;

		pnlIzquierdo = new PnlIzquierdoCliente(this);
		pnlIzquierdo.setSize(200, 320);
		pnlIzquierdo.setLocation(0, 0);
		add(pnlIzquierdo);
		
		
		JPanel pnlDerecho = new JPanel();
		pnlDerecho.setBackground(Color.WHITE);
		pnlDerecho.setLayout(null);
		pnlDerecho.setSize(600, 320);
		pnlDerecho.setLocation(205, 0);
		add(pnlDerecho);
		
		txtLetraCancion = new JTextArea();
		txtLetraCancion.setSize(570,300);
		txtLetraCancion.setLocation(10, 10);
		pnlDerecho.add(txtLetraCancion);
		
		cancion = new Cancion(this,"mientes tan bien.txt");
	}
}

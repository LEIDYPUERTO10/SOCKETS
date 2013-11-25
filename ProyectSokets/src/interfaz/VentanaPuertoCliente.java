/**
 * En la clase VentanaPuertoCliente.java se encuentra lo necesario para que un 
 * cliente ingrese el puerto por el que se desea conectar a un servidor
 */

package interfaz;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear una ventana para que cliente pueda ingresar
 * la direccion del puerto por el que se desea conectar y la ip deñ servidor
 */

public class VentanaPuertoCliente extends JFrame{
	private JLabel lblPuerto;
	private JLabel lblIP;
	private JTextField txtPuerto;
	private JTextField txtIP;
	private JButton btnAceptar;
	private JButton btnIPServidor;
	private JButton btnPuerto;
	
	/**
	 * 
	 * Este es el contructor de la clase VentanaPuertoCliente.java
	 */

	public VentanaPuertoCliente() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(new Color(072, 061,139));
		
	}
}

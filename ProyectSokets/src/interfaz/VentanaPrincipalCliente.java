/**
 * En la clase VentanaPrincipalCliente.java se encuentra lo necesario para
 * crear la ventana que le aparecera como primera pantalla al cliente
 */

package interfaz;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import logic.Cliente;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear un frame que le aparecera al cliente cuando ejecute
 * el programa
 */

public class VentanaPrincipalCliente extends JFrame{
	
	private PnlIzquierdoCliente pnlIzquierdo;
	private Cliente cliente;

	/**
	 * @return the cliente
	 */
	
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * 
	 * Este es el contructor de la clase VentanaPrincipalCliente.java
	 * @throws UnknownHostException 
	 */

	public VentanaPrincipalCliente() throws UnknownHostException {
		// TODO Auto-generated constructor stub
		setSize(800, 350);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle(Inet4Address.getLocalHost().getHostAddress());

		pnlIzquierdo = new PnlIzquierdoCliente(this);
		pnlIzquierdo.setSize(200, 320);
		pnlIzquierdo.setLocation(0, 0);
		add(pnlIzquierdo);
		
		try {		
			cliente = new Cliente();
			this.setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "NO HAY UN SERVIDOR ACTIVO");
			this.setVisible(false);
		}
		
		
	}
	
	public static void main(String[] args) throws UnknownHostException {
		VentanaPrincipalCliente cliente = new VentanaPrincipalCliente();
//		cliente.setVisible(true);
	}
}

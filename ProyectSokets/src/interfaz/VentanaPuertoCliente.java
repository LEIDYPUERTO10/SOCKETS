/**
 * En la clase VentanaPuertoCliente.java se encuentra lo necesario para que un 
 * cliente ingrese el puerto por el que se desea conectar a un servidor
 */

package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logic.Cliente;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear una ventana para que cliente pueda ingresar
 * la direccion del puerto por el que se desea conectar y la ip deñ servidor
 */

public class VentanaPuertoCliente extends JFrame implements ActionListener{
	private JLabel lblPuerto;
	private JLabel lblIP;
	private JTextField txtPuerto;
	private JTextField txtIP;
	private JButton btnAceptar;
	private JButton btnIPServidor;
	private JButton btnPuerto;
	private Cliente clienteLogica;
	
	public Cliente getClienteLogica() {
		return clienteLogica;
	}

	public void setClienteLogica(Cliente clienteLogica) {
		this.clienteLogica = clienteLogica;
	}

	/**
	 * 
	 * Este es el contructor de la clase VentanaPuertoCliente.java
	 */

	public VentanaPuertoCliente() {
		// TODO Auto-generated constructor stub
		setSize(320, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(new Color(072, 061,139));
		
		lblPuerto = new JLabel("PUERTO CONEXION");
		lblPuerto.setBackground(new Color(072, 061,139));
		lblPuerto.setForeground(Color.WHITE);
		lblPuerto.setSize(130, 20);
		lblPuerto.setLocation(10, 10);
		add(lblPuerto);
		
		txtPuerto = new JTextField();
		txtPuerto.setSize(130, 20);
		txtPuerto.setLocation(150, 10);
		add(txtPuerto);
		
		lblIP = new JLabel("IP SERVIDOR");
		lblIP.setBackground(new Color(072, 061,139));
		lblIP.setForeground(Color.WHITE);
		lblIP.setSize(130, 20);
		lblIP.setLocation(10, 50);
		add(lblIP);
		
		txtIP = new JTextField();
		txtIP.setSize(130, 20);
		txtIP.setLocation(150, 50);
		add(txtIP);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setActionCommand("ACEPTAR");
		btnAceptar.addActionListener(this);
		btnAceptar.setSize(100, 20);
		btnAceptar.setLocation(10, 90);
		add(btnAceptar);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("ACEPTAR")){
			
			clienteLogica = new Cliente(Integer.parseInt(txtPuerto.getText()),txtIP.getText());
			try {
				VentanaPrincipalCliente ventanaPrincipal = new VentanaPrincipalCliente(this);
				ventanaPrincipal.setVisible(true);
				System.out.println(clienteLogica.getPuertoCliente());
				System.out.println(clienteLogica.getDireccionIP());
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR EN LA CREACION DEL CLIENTE");
			}
		}
		
	}
	public static void main(String[] args) {
		VentanaPuertoCliente v = new VentanaPuertoCliente();
		v.setVisible(true);
	}
}

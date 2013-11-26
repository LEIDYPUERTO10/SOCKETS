package logic;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.JOptionPane;


/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite administrar el cliente del programa, implementa 
 * Runnable ya que se transmitira hilos
 */
public class Cliente implements Runnable {


	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private String direccionIP;
	private int puertoCliente;
	private boolean ejecutar;
	private int opcion;

		/**
	 * @return the puertoCliente
	 */
	
	public int getPuertoCliente() {
		return puertoCliente;
	}

	/**
	 * @param puertoCliente the puertoCliente to set
	 */
	
	public void setPuertoCliente(int puertoCliente) {
		this.puertoCliente = puertoCliente;
	}

	/**
	 * 
	 * Este es el contructor de la clase Cliente.java
	 */
	public Cliente(int puerto, String ip)  {
		puertoCliente = puerto;
		direccionIP = ip;
		try {
			socket = new Socket(direccionIP, puertoCliente);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO CLIENTE");
		}

		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO CANAL DE ENTRADA");
		}

		try {
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("ERROR CREANDO CANAL DE SALIDA");
		}
		
		Thread hilo = new Thread(this);
		hilo.start();
		
	}

	/**
	 * 
	 * Este es el contructor de la clase Cliente.java
	 */

	public Cliente() {
		// TODO Auto-generated constructor stub
		try {
			socket = new Socket("10.0.32.180", puertoCliente);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO CLIENTE");
		}

		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO CANAL DE ENTRADA");
		}

		try {
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("ERROR CREANDO CANAL DE SALIDA");
		}
		
		Thread hilo = new Thread(this);
		hilo.start();
		

	}

	@Override
	public void run() {
		while (!ejecutar) {

			try {

				opcion = dataInputStream.readInt();

			} catch (IOException e) {
				e.printStackTrace();
			} 
			switch (opcion) {
			case 1:
				try {
					
//					JOptionPane.showMessageDialog(null, dataInputStream.readUTF());
					System.out.println(dataInputStream.readUTF());
					
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:

				break;

			case 3:

				break;
				
			default:
				
				break;
			}
		}	
	}		

	/**
	 * 
	 * Este metodo permite detener el hilo que cree el cliente
	 */
	public void detenerHiloCliente (){
		ejecutar = false;
	}


	/**
	 * 
	 * Este metodo permite cerrar la conexion; primero cierra la entrada
	 * de datos, luego la salida y por ultimo cierra el socket 
	 */
	public void cerrarConexion(){
		try {
			dataInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR CERRANDO CANLA DE ENTRADA");
		}
		try {
			dataOutputStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR CERRANDO CANAL DE SALIDA");
		}
		try {
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR CERRANDO SOCKET");
		}
	}



	/**
	 * @return the direccionIP
	 */
	
	public String getDireccionIP() {
		return direccionIP;
	}



	/**
	 * @param direccionIP the direccionIP to set
	 */
	
	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}

}
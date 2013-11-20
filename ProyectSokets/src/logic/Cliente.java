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



public class Cliente implements Runnable {


	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private String direccionIP;
	private int puertoCliente;
	private boolean ejecutar;
	private int opcion;

	public Cliente()  {
		puertoCliente = 4900;
		try {
			socket = new Socket("10.0.32.56", puertoCliente);
			
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
					
					JOptionPane.showMessageDialog(null, dataInputStream.readUTF());
					
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
			System.out.println("Esperando Conexiones...");

		}	
	}		

	public void cerrarCliente (){
		ejecutar = false;
	}


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

}

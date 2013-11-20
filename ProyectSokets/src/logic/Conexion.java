package logic;

import java.awt.HeadlessException;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;



public class Conexion implements Runnable{

	private Socket socketConex;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private boolean ejecutar;
	private int opcion;



	public Conexion(Socket socketNew) {

		this.socketConex = socketNew;

		try {
			dataInputStream = new DataInputStream(socketConex.getInputStream());
			

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO");
		}
		try {
			dataOutputStream = new DataOutputStream(socketConex.getOutputStream());
			

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR CREANDO SOCKET");
		}
		iniciarConexion();
		
	}

	public  void run() {
		while (!ejecutar) {

			try {

				opcion = dataInputStream.readInt();

			} catch (IOException e) {
				e.printStackTrace();
			} 
			switch (opcion) {
			case 1:
				try {
					System.out.println(dataInputStream.readUTF());
					
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
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

	public void iniciarConexion (){
		try {
			dataOutputStream.writeInt(1);
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		try {
			
			dataOutputStream.writeUTF("HOLA");
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}	
	}

	public void cerrarConexion(){
		try {
			dataInputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error cerrando canal de entrada");
		}
		try {
			dataOutputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error cerrando canal de salida");
		}
		try {
			socketConex.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error cerrando socket");
		}
	}
}

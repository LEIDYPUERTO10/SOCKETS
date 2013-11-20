package logic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Servidor implements Runnable{
	private ServerSocket serverSocket;
	private ArrayList<Conexion> listConexion;
	private Socket conexionEntrante;
	private String direcionIP;
	private int puerto;
	private boolean ejecutar;


	public Servidor() {
		puerto = 4900;
		listConexion = new ArrayList<Conexion>();
		Thread hilo = new Thread(this);
		hilo.start();
		
	}

	@Override
	public void run() {
		while (!ejecutar) {
			
			System.out.println("Esperando Conexiones...");
			
			try {
				
				conexionEntrante = serverSocket.accept();
				
				listConexion.add(new Conexion(conexionEntrante));
				System.out.println("conexiones : "+ listConexion.size());
				
				System.out.println("CONEXION ACEPTADA");
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
		}		
	}
	
	public void iniciarServidor() throws IOException{
		if (serverSocket==null) {
			serverSocket  = new ServerSocket(puerto);
		}
	}
	public void cerrarConexion(){
		for (int i = 0; i < listConexion.size(); i++) {
			listConexion.get(i).cerrarConexion();
		}
		ejecutar = false;
	}
}

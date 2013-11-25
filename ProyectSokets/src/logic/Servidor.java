package logic;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear un servidor 
 */
public class Servidor implements Runnable{
	private ServerSocket serverSocket;
	private ArrayList<Conexion> listConexion;
	private Socket conexionEntrante;
	private String direcionIP;
	private int puerto;
	private boolean ejecutar;
	private ArrayList<Concierto> listaConciertos;
	private File[] listaCanciones;

	/**
	 * @return the serverSocket
	 */
	
	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	/**
	 * @param serverSocket the serverSocket to set
	 */
	
	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	/**
	 * @return the listConexion
	 */
	
	public ArrayList<Conexion> getListConexion() {
		return listConexion;
	}

	/**
	 * @param listConexion the listConexion to set
	 */
	
	public void setListConexion(ArrayList<Conexion> listConexion) {
		this.listConexion = listConexion;
	}

	/**
	 * @return the conexionEntrante
	 */
	
	public Socket getConexionEntrante() {
		return conexionEntrante;
	}

	/**
	 * @param conexionEntrante the conexionEntrante to set
	 */
	
	public void setConexionEntrante(Socket conexionEntrante) {
		this.conexionEntrante = conexionEntrante;
	}

	/**
	 * @return the direcionIP
	 */
	
	public String getDirecionIP() {
		return direcionIP;
	}

	/**
	 * @param direcionIP the direcionIP to set
	 */
	
	public void setDirecionIP(String direcionIP) {
		this.direcionIP = direcionIP;
	}

	/**
	 * @return the puerto
	 */
	
	public int getPuerto() {
		return puerto;
	}

	/**
	 * @param puerto the puerto to set
	 */
	
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	/**
	 * @return the ejecutar
	 */
	
	public boolean isEjecutar() {
		return ejecutar;
	}

	/**
	 * @param ejecutar the ejecutar to set
	 */
	
	public void setEjecutar(boolean ejecutar) {
		this.ejecutar = ejecutar;
	}

	/**
	 * @return the listaConciertos
	 */
	
	public ArrayList<Concierto> getListaConciertos() {
		return listaConciertos;
	}

	/**
	 * @param listaConciertos the listaConciertos to set
	 */
	
	public void setListaConciertos(ArrayList<Concierto> listaConciertos) {
		this.listaConciertos = listaConciertos;
	}

	/**
	 * 
	 * Este es el contructor de la clase Servidor.java
	 */
	public Servidor(int puerto) {
		this.puerto = puerto;
		listConexion = new ArrayList<Conexion>();
		listaConciertos = new ArrayList<Concierto>();
		Thread hilo = new Thread(this);
		hilo.start();
		try {
			iniciarServidor(puerto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR AL INCIAR SERVIDOR");
		}
	}
	
	/**
	 * 
	 * Este es el contructor de la clase Servidor.java
	 */

	public Servidor() {
		// TODO Auto-generated constructor stub
		listConexion = new ArrayList<Conexion>();
		listaConciertos = new ArrayList<Concierto>();
		Thread hilo = new Thread(this);
		hilo.start();
		try {
			iniciarServidor(puerto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR AL INCIAR SERVIDOR");
		}
	}

	//@Override
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
	
	/**
	 * @throws IOException
	 * Este metodo permite iniciar el servidor 
	 */
	
	public void iniciarServidor(int puertoIniciar) throws IOException{
		
		if (serverSocket==null) {
			serverSocket  = new ServerSocket(puertoIniciar);
			File archivoCanciones = new File("./src/persistence");
			listaCanciones = new File[archivoCanciones.list().length];
//			listaCanciones.add(archivoCanciones.list())
			listaCanciones = archivoCanciones.listFiles();
		}
		new Exception("EL SERVIDOR NO SE PUEDE INCIAR");
	}
	
	/**
	 * 
	 * Este metodo permite cerrar la conexion desde el servidor 
	 */
	
	public void cerrarConexion(){
		for (int i = 0; i < listConexion.size(); i++) {
			listConexion.get(i).cerrarConexion();
		}
		ejecutar = false;
	}
	/**
	 * @param maximoEspectadores
	 * @param valor
	 * @param nombre
	 * Este metodo permite crear un concierto por parametro ingresa los datos
	 * necesarios a conocer del concierto
	 */
	public void crearConcierto(int maximoEspectadores, int valor, String nombre){
		listaConciertos.add(new Concierto(maximoEspectadores, valor, nombre));
	}
	
	public boolean comprobarIpServidor(String ipServidor){
		try {
			if(Inet4Address.getLocalHost().getHostAddress().equalsIgnoreCase(ipServidor)){
				return true;
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @return the listaCanciones
	 */
	
	public File[] getListaCanciones() {
		return listaCanciones;
	}

	/**
	 * @param listaCanciones the listaCanciones to set
	 */
	
	public void setListaCanciones(File[] listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
}
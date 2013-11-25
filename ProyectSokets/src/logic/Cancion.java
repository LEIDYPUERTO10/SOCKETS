package logic;

import interfaz.VentanaPrincipalCliente;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear una cancion, aca se tendra en cuenta el año en que salio,
 * el nombre, el autor y la letra 
 */

public class Cancion implements Runnable{
	
	private String nombre;
	private int año;
	private String autor;
	private ArrayList<String> letra;
	private VentanaPrincipalCliente ventanaCliente;
	
	/**
	 * @return the nombre
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the año
	 */
	
	public int getAño() {
		return año;
	}
	
	/**
	 * @param año the año to set
	 */
	
	public void setAño(int año) {
		this.año = año;
	}
	
	/**
	 * @return the autor
	 */
	
	public String getAutor() {
		return autor;
	}
	
	/**
	 * @param autor the autor to set
	 */
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * @return the letra
	 */
	
	public ArrayList<String> getLetra() {
		return letra;
	}
	
	/**
	 * @param letra the letra to set
	 */
	
	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}
	
	/**
	 * @param nombre
	 * @param año
	 * @param autor
	 * @param letra
	 * Este es el contructor de la clase Cancion.java
	 */
	public Cancion(String nombre, int año, String autor,
			ArrayList<String> letra) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.autor = autor;
		this.letra = letra;
	}
		
	/**
	 * @param nombre
	 * @param año
	 * @param autor
	 * Este es el contructor de la clase Cancion.java
	 */
	
	public Cancion(String nombre, int año, String autor) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.autor = autor;
		letra = new ArrayList<String>();
	}

	
	public Cancion(VentanaPrincipalCliente ventanaCliente, String nombreCancion) {
		super();
		letra = new ArrayList<String>();
		this.ventanaCliente = ventanaCliente;
		leerCancion(nombreCancion);
		Thread hilo = new Thread(this);
		hilo.start();
	}

	public ArrayList<String> leerCancion(String nombreCancion){
		File archivo = new File("./src/persistence",nombreCancion);
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(archivo));
				while(br.ready()){
					letra.add(br.readLine());
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "LA CANCION NO SE ENCUENTRA");
			}
			for (int i = 0; i < letra.size(); i++) {
				System.out.println(letra.get(i));
			}
			return letra;
		}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int tamanio = 0;
		while(tamanio < letra.size()){
			ventanaCliente.txtLetraCancion.setText(ventanaCliente.txtLetraCancion.getText()+"\n"+letra.get(tamanio));
			tamanio++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

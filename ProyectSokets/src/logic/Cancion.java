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
 * Esta clase permite crear una cancion, aca se tendra en cuenta el a�o en que salio,
 * el nombre, el autor y la letra 
 */

public class Cancion implements Runnable{
	
	private String nombre;
	private int a�o;
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
	 * @return the a�o
	 */
	
	public int getA�o() {
		return a�o;
	}
	
	/**
	 * @param a�o the a�o to set
	 */
	
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
	 * @param a�o
	 * @param autor
	 * @param letra
	 * Este es el contructor de la clase Cancion.java
	 */
	public Cancion(String nombre, int a�o, String autor,
			ArrayList<String> letra) {
		super();
		this.nombre = nombre;
		this.a�o = a�o;
		this.autor = autor;
		this.letra = letra;
	}
		
	/**
	 * @param nombre
	 * @param a�o
	 * @param autor
	 * Este es el contructor de la clase Cancion.java
	 */
	
	public Cancion(String nombre, int a�o, String autor) {
		super();
		this.nombre = nombre;
		this.a�o = a�o;
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

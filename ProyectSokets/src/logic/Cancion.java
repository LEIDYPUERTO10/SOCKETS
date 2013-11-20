package logic;

import java.util.ArrayList;

public class Cancion {
	private String nombre;
	private int a�o;
	private String autor;
	private ArrayList<String> letra;
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
	 */
	public Cancion(String nombre, int a�o, String autor, ArrayList<String> letra) {
		super();
		this.nombre = nombre;
		this.a�o = a�o;
		this.autor = autor;
		this.letra = letra;
	}
	
	
}

package logic;

import java.util.ArrayList;

public class Cancion {
	private String nombre;
	private int año;
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
	 */
	public Cancion(String nombre, int año, String autor, ArrayList<String> letra) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.autor = autor;
		this.letra = letra;
	}
	
	
}

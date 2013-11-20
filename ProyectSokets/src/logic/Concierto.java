package logic;

import java.util.ArrayList;

public class Concierto {
	private ArrayList<Cancion> canciones;
	private int maximoEspectadores;
	private int costoPorSegundo;
	private String nombre;
	/**
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	/**
	 * @return the maximoEspectadores
	 */
	public int getMaximoEspectadores() {
		return maximoEspectadores;
	}
	/**
	 * @param maximoEspectadores the maximoEspectadores to set
	 */
	public void setMaximoEspectadores(int maximoEspectadores) {
		this.maximoEspectadores = maximoEspectadores;
	}
	/**
	 * @return the costoPorSegundo
	 */
	public int getCostoPorSegundo() {
		return costoPorSegundo;
	}
	/**
	 * @param costoPorSegundo the costoPorSegundo to set
	 */
	public void setCostoPorSegundo(int costoPorSegundo) {
		this.costoPorSegundo = costoPorSegundo;
	}
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
	 * @param canciones
	 * @param maximoEspectadores
	 * @param costoPorSegundo
	 * @param nombre
	 */
	public Concierto(ArrayList<Cancion> canciones, int maximoEspectadores,
			int costoPorSegundo, String nombre) {
		super();
		this.canciones = canciones;
		this.maximoEspectadores = maximoEspectadores;
		this.costoPorSegundo = costoPorSegundo;
		this.nombre = nombre;
	}
	
	private void agregarCancion(Cancion cancion){
		if(cancion != null){
			
			canciones.add(cancion);
		}
	}
	public void ensayo(){
		
	}
}

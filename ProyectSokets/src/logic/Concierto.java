package logic;

import java.util.ArrayList;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite administrar el concierto, en el arrayList se 
 * almacenaran las canciones propias de cada concierto, el maximo de espectadores,
 * el costo por segundo que administrara el seridor, y el nombre del concierto 
 */
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
	 * Este es el contructor de la clase Concierto.java
	 */
	public Concierto(ArrayList<Cancion> canciones, int maximoEspectadores,
			int costoPorSegundo, String nombre) {
		super();
		this.canciones = canciones;
		this.maximoEspectadores = maximoEspectadores;
		this.costoPorSegundo = costoPorSegundo;
		this.nombre = nombre;
	}
	
	
	
	/**
	 * @param maximoEspectadores
	 * @param costoPorSegundo
	 * @param nombre
	 * Este es el contructor de la clase Concierto.java
	 */
	
	public Concierto(int maximoEspectadores, int costoPorSegundo, String nombre) {
		super();
		this.maximoEspectadores = maximoEspectadores;
		this.costoPorSegundo = costoPorSegundo;
		this.nombre = nombre;
	}
	

	/**
	 * 
	 * Este es el contructor de la clase Concierto.java
	 */
	
	public Concierto() {
		// TODO Auto-generated constructor stub
		canciones = new ArrayList<Cancion>();
	}
	
	/**
	 * @param cancion
	 * Este metodo permite agregar una cancion al concierto, por parametro 
	 * ingresara la cancion 
	 */
	
	private void agregarCancion(Cancion cancion){
		if(cancion != null){
			canciones.add(cancion);
		}
	}
}

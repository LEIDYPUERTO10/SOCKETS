/**
 * En la clase MainCancion.java se encuentra lo necesario para
 */

package trial;

import java.util.Date;

import logic.Cancion;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite 
 */

public class MainCancion {
	public static void main(String[] args) {
		Cancion c= new Cancion("adasda", 1222, "asdasda");
		c.leerCancion("mientes tan bien.txt");
		System.out.println("duracion "+c.calcularDuracion(3, 5));
	}
}

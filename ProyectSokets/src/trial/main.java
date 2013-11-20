package trial;

import java.io.IOException;

import logic.Servidor;

public class main {

	public static void main(String[] args) throws IOException {

		Servidor servidor = new Servidor();
		servidor.iniciarServidor();
		
	}
}

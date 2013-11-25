package trial;

import java.io.IOException;
import java.net.Inet4Address;
import java.text.SimpleDateFormat;
import java.util.Date;

import logic.Servidor;

public class main {

	public static void main(String[] args) throws IOException {

		Servidor servidor = new Servidor(4900);
//		System.out.println(servidor.comprobarIpServidor("10.0.32.180"));
//		servidor.setPuerto(4900);
//		servidor.iniciarServidor();
		System.out.println("IP "+Inet4Address.getLocalHost().getHostAddress());
//		System.out.println("NOMBRE HOST "+Inet4Address.getLocalHost().getHostName());
//		Date f= new Date();
//		SimpleDateFormat sa= new SimpleDateFormat("hh:mm:ss");
//		System.out.println(f.getTime());
//		System.out.println(sa.format(f).getClass());
//		System.out.println("localhost");
		
	}
}

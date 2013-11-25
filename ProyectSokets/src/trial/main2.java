package trial;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import logic.Cliente;

public class main2 {

	public static void main(String[] args) throws UnknownHostException {
//		Cliente cliente = new Cliente(4900);
		Cliente cliente = new Cliente();
		cliente.setPuertoCliente(4900);;
//		System.out.println(cliente.getPuertoCliente());
		System.out.println("dsdasas"+cliente.getPuertoCliente());
//		cliente.setPuertoCliente(4900);
		cliente.setDireccionIP("10.0.32.180");
//		System.out.println(Inet4Address.getLocalHost());
//		cliente.setDireccionIP("190.90.98.246");
	}
}
/**
 * En la clase VentanaConcierto.java se encuentra lo necesario para visualizar
 * datos de un concierto en especifico
 */

package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear un frame en donde se podran visualizar datos
 * propios de un concierto como la cantidad de usuarios, los usuarios 
 * conectados y las canciones, a su vez permite pausar y reanudar una cancion 
 */

public class VentanaConcierto extends JFrame implements ActionListener{
	
	private JLabel lblNombreConcierto;
	private JLabel lblNumeroUsuarios;
	private JLabel txtNumeroUsuarios;
	private JLabel lblUsuarios;
	private JLabel lblHoraInicio;
	private JLabel lblHoraFin;
	private JList listaUsuarios;
	private JList listaHoraInicio;
	private JList listaHoraFin;
	private JList listaCanciones;
	private JButton btnAceptar;
	private JButton btnPausar;
	private JButton btnReanudar;
	
	/**
	 * 
	 * Este es el contructor de la clase VentanaConcierto.java
	 */

	public VentanaConcierto() {
		// TODO Auto-generated constructor stub
		setSize(1075, 650);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		lblNombreConcierto = new JLabel("sfsfsfsdf");
		lblNombreConcierto.setSize(150, 20);
		lblNombreConcierto.setLocation(380, 10);
		add(lblNombreConcierto);
		
		lblNumeroUsuarios = new JLabel("N° USUARIOS: ");
		lblNumeroUsuarios.setSize(100, 20);
		lblNumeroUsuarios.setLocation(340, 50);
		add(lblNumeroUsuarios);
		
		txtNumeroUsuarios = new JLabel();
		txtNumeroUsuarios.setSize(150, 20);
		txtNumeroUsuarios.setLocation(430, 50);
		add(txtNumeroUsuarios);
		
		lblUsuarios = new JLabel("USUARIOS");
		lblUsuarios.setSize(150, 20);
		lblUsuarios.setLocation(85, 80);
		add(lblUsuarios);
		
		lblHoraInicio = new JLabel("HORA INICIO");
		lblHoraInicio.setSize(150, 20);
		lblHoraInicio.setLocation(335, 80);
		add(lblHoraInicio);
		
		lblHoraFin = new JLabel("HORA FIN");
		lblHoraFin.setSize(150, 20);
		lblHoraFin.setLocation(585, 80);
		add(lblHoraFin);
		
		listaUsuarios = new JList();
		listaUsuarios.setSize(240, 450);
		listaUsuarios.setLocation(10, 100);
		add(listaUsuarios);
		
		listaHoraInicio = new JList();
		listaHoraInicio.setSize(240, 450);
		listaHoraInicio.setLocation(260, 100);
		add(listaHoraInicio);
		
		listaHoraFin = new JList();
		listaHoraFin.setSize(240, 450);
		listaHoraFin.setLocation(510, 100);
		add(listaHoraFin);
		
		listaCanciones = new JList();
		listaCanciones.setBackground(new Color(072, 061,139));
		listaCanciones.setSize(300, 650);
		listaCanciones.setLocation(760, 0);
		add(listaCanciones);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setActionCommand("ACEPTAR");
		btnAceptar.addActionListener(this);
		btnAceptar.setSize(100, 20);
		btnAceptar.setLocation(100, 570);
		add(btnAceptar);
		
		btnPausar = new JButton("PAUSAR");
		btnPausar.setActionCommand("PAUSAR");
		btnPausar.addActionListener(this);
		btnPausar.setSize(100, 20);
		btnPausar.setLocation(310, 570);
		add(btnPausar);
		
		btnReanudar = new JButton("REANUDAR");
		btnReanudar.setActionCommand("REANUDAR");
		btnReanudar.addActionListener(this);
		btnReanudar.setSize(100, 20);
		btnReanudar.setLocation(520, 570);
		add(btnReanudar);
	}
	
	public static void main(String[] args) {
		VentanaConcierto concierto = new VentanaConcierto();
		concierto.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

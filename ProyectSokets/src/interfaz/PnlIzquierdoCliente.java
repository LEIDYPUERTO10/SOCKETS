/**
 * En la clase PnlIzquierdoCliente.java se encuentra lo necesario que aparecera
 * en el frame del cliente
 */

package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author LEIDY CAROLINA PUERTO GALINDO
 * Esta clase permite crear el panel izquierdo del frame principal del 
 * cliente, aca se encuentran las funciones propias que puede tener el
 * cliente
 */

public class PnlIzquierdoCliente extends JPanel implements ActionListener{
	
	private JLabel lblIP;
	private JTextField txtIP;
	private JButton btnEscogerConcierto;
	private JButton btnIPServidor;
	private JLabel lblHoraInicio;
	private JLabel lblCanciones;
	private JLabel lblValor;
	private JLabel lblSegundos;
	private JLabel txtHoraInicio;
	private JLabel txtCanciones;
	private JLabel txtValor;
	private JLabel txtSegundos;
	private JLabel lblTiempo;
	private ButtonGroup btnGroup;
	private JRadioButton btnTiempoLibre;
	private JRadioButton btnTiempoDeterminado;
	private JLabel lblRdBtnLibre;
	private JLabel lblRdBtnDeterminado;
	private VentanaPrincipalCliente ventanaCliente;
	
	/**
	 * 
	 * Este es el contructor de la clase PnlIzquierdoCliente.java
	 */

	public PnlIzquierdoCliente(VentanaPrincipalCliente ventanaCliente) {
		// TODO Auto-generated constructor stub
		setBackground(new Color(072, 061,139));
		setLayout(null);
		this.ventanaCliente = ventanaCliente;
		
		lblHoraInicio = new JLabel("HORA INICIO: ");
		lblHoraInicio.setBackground(new Color(072, 061,139));
		lblHoraInicio.setForeground(Color.WHITE);
		lblHoraInicio.setSize(80, 20);
		lblHoraInicio.setLocation(10, 10);
		add(lblHoraInicio);
		
		txtHoraInicio = new JLabel();
		txtHoraInicio.setBackground(new Color(072, 061,139));
		txtHoraInicio.setForeground(Color.WHITE);
		txtHoraInicio.setSize(80, 20);
		txtHoraInicio.setLocation(100, 10);
		add(txtHoraInicio);
		
		lblCanciones = new JLabel("N° CANCIONES: ");
		lblCanciones.setBackground(new Color(072, 061,139));
		lblCanciones.setForeground(Color.WHITE);
		lblCanciones.setSize(100, 20);
		lblCanciones.setLocation(10, 40);
		add(lblCanciones);
		
		txtCanciones = new JLabel();
		txtCanciones.setBackground(new Color(072, 061,139));
		txtCanciones.setForeground(Color.WHITE);
		txtCanciones.setSize(80, 20);
		txtCanciones.setLocation(100, 40);
		add(txtCanciones);
		
		lblSegundos = new JLabel("SEGUNDOS: ");
		lblSegundos.setBackground(new Color(072, 061,139));
		lblSegundos.setForeground(Color.WHITE);
		lblSegundos.setSize(80, 20);
		lblSegundos.setLocation(10, 70);
		add(lblSegundos);
		
		txtSegundos = new JLabel();
		txtSegundos.setBackground(new Color(072, 061,139));
		txtSegundos.setForeground(Color.WHITE);
		txtSegundos.setSize(80, 20);
		txtSegundos.setLocation(100, 70);
		add(txtSegundos);
		
		lblValor = new JLabel("VALOR: ");
		lblValor.setBackground(new Color(072, 061,139));
		lblValor.setForeground(Color.WHITE);
		lblValor.setSize(80, 20);
		lblValor.setLocation(10, 100);
		add(lblValor);
		
		txtValor = new JLabel();
		txtValor.setBackground(new Color(072, 061,139));
		txtValor.setForeground(Color.WHITE);
		txtValor.setSize(80, 20);
		txtValor.setLocation(100, 100);
		add(txtValor);
		
		lblTiempo = new JLabel("TIEMPO");
		lblTiempo.setBackground(new Color(072, 061,139));
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setSize(80, 20);
		lblTiempo.setLocation(60, 130);
		add(lblTiempo);
		
		btnTiempoLibre = new JRadioButton();
		btnTiempoLibre.setBackground(new Color(072, 061,139));
		btnTiempoLibre.setSize(20, 10);
		btnTiempoLibre.setLocation(30, 156);
		btnTiempoLibre.setSelected(true);
		add(btnTiempoLibre);
		
		btnTiempoDeterminado = new JRadioButton();
		btnTiempoDeterminado.setBackground(new Color(072, 061,139));
		btnTiempoDeterminado.setSize(20, 10);
		btnTiempoDeterminado.setLocation(30, 176);
		add(btnTiempoDeterminado);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(btnTiempoLibre);
		btnGroup.add(btnTiempoDeterminado);
		
		lblRdBtnLibre = new JLabel("LIBRE");
		lblRdBtnLibre.setBackground(new Color(072, 061,139));
		lblRdBtnLibre.setForeground(Color.WHITE);
		lblRdBtnLibre.setSize(80, 20);
		lblRdBtnLibre.setLocation(75, 150);
		add(lblRdBtnLibre);
		
		lblRdBtnDeterminado = new JLabel("DETERMINADO");
		lblRdBtnDeterminado.setBackground(new Color(072, 061,139));
		lblRdBtnDeterminado.setForeground(Color.WHITE);
		lblRdBtnDeterminado.setSize(100, 20);
		lblRdBtnDeterminado.setLocation(75, 170);
		add(lblRdBtnDeterminado);
		
		btnEscogerConcierto = new JButton("ESCOGER CONCIERTO");
		btnEscogerConcierto.setBackground(Color.BLACK);
		btnEscogerConcierto.setActionCommand("ESCOGER");
		btnEscogerConcierto.addActionListener(this);
		btnEscogerConcierto.setForeground(Color.WHITE);
		btnEscogerConcierto.setSize(175, 20);
		btnEscogerConcierto.setLocation(5, 200);
		add(btnEscogerConcierto);
		
		btnIPServidor = new JButton("SERVIDOR ACTIVO");
		btnIPServidor.setBackground(Color.BLACK);
		btnIPServidor.setActionCommand("IP");
		btnIPServidor.addActionListener(this);
		btnIPServidor.setForeground(Color.WHITE);
		btnIPServidor.setSize(175, 20);
		btnIPServidor.setLocation(5, 230);
		add(btnIPServidor);
		
		lblIP = new JLabel("IP SERVIDOR");
		lblIP.setBackground(new Color(072, 061,139));
		lblIP.setForeground(Color.WHITE);
		lblIP.setSize(100, 20);
		lblIP.setLocation(10, 270);
		add(lblIP);
		
		txtIP = new JTextField();
		txtIP.setSize(80, 20);
		txtIP.setLocation(95, 270);
		add(txtIP);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		if(e.getActionCommand().equalsIgnoreCase("ESCOGER")){
////
//			if(txtIP.getText() == null){
//				System.out.println(txtIP.getText());
//			}
//			else{
//				System.out.println("sdadad"+txtIP.getText());
//			}
			try {
				ventanaCliente.getCliente().setDireccionIP(txtIP.getText());
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println("error");
				}
//				System.out.println(ventanaCliente.getCliente().getDireccionIP());
		}
}

package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearConcierto extends JFrame implements ActionListener{
	private JLabel lblNombre;
	private JLabel lblMaxEspectadores;
	private JLabel lblValor;
	private JTextField txtNombre;
	private JTextField txtMaxEspectadores;
	private JTextField txtValor;
	private JButton btnAgregarCancion;
	private JButton btnEmpezar;
	
	public VentanaCrearConcierto() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(new Color(072, 061,139));
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setBackground(new Color(072, 061,139));
		lblNombre.setForeground(Color.WHITE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

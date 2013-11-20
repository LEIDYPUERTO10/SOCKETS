package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PnlIzquierdoPrincipalServidor extends JPanel implements ActionListener {
	

	private JLabel lblPuerto;
	private JTextField txtPuerto;
	private JButton btnCrearConcierto;
	
	public PnlIzquierdoPrincipalServidor() {
		// TODO Auto-generated constructor stub
		setBackground(new Color(072, 061,139));
		setLayout(null);
		
	
		btnCrearConcierto = new JButton("CREAR CONCIERTO");
		btnCrearConcierto.setSize(200, 20);
		btnCrearConcierto.setActionCommand("CREAR");
		btnCrearConcierto.addActionListener(this);
		btnCrearConcierto.setLocation(10, 20);
		add(btnCrearConcierto);
		
		lblPuerto = new JLabel("PUERTO");
		lblPuerto.setSize(70, 30);
		lblPuerto.setBackground(new Color(072, 061,139));
		lblPuerto.setForeground(Color.WHITE);
		lblPuerto.setLocation(70, 50);
		add(lblPuerto);
		
		txtPuerto = new JTextField();
		txtPuerto.setSize(90, 20);
		txtPuerto.setLocation(50, 90);
		add(txtPuerto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

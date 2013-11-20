package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PnlDerechoServidor extends JPanel implements ActionListener {
	
	private JButton btnIncial;
	private JLabel lblConcierto;
	
	public PnlDerechoServidor() {
		// TODO Auto-generated constructor stub
		setBackground(new Color(072, 061,139));
		setLayout(null);
		
		lblConcierto = new JLabel("CONCIERTOS");
		lblConcierto.setSize(80, 20);
		lblConcierto.setBackground(new Color(072, 061,139));
		lblConcierto.setForeground(Color.WHITE);
		lblConcierto.setLocation(65, 10);
		add(lblConcierto);
		
		btnIncial = new JButton();
		btnIncial.setSize(150, 20);
		btnIncial.setLocation(30, 50);
		add(btnIncial);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PnlDerechoServidor extends JPanel implements ActionListener {
	
	JButton btnIncial;
	private JLabel lblConcierto;
	private int posicionX = 30;
	private int posicionY = 50;
		
	/**
	 * @return the posocionX
	 */
	
	public int getPosicionX() {
		return posicionX;
	}
	/**
	 * @param posocionX the posocionX to set
	 */
	
	public void setPosicionX(int posocionX) {
		this.posicionX = posocionX;
	}
	/**
	 * @return the posicionY
	 */
	
	public int getPosicionY() {
		return posicionY;
	}
	/**
	 * @param posicionY the posicionY to set
	 */
	
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
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
		btnIncial.setLocation(posicionX, posicionY);
		btnIncial.setVisible(false);
		add(btnIncial);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

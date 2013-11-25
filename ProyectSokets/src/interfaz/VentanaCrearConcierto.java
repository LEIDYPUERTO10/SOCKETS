package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logic.Concierto;

public class VentanaCrearConcierto extends JFrame implements ActionListener{
	private JLabel lblNombre;
	private JLabel lblMaxEspectadores;
	private JLabel lblValor;
	private JTextField txtNombre;
	private JTextField txtMaxEspectadores;
	private JTextField txtValor;
	private JButton btnAgregarCancion;
	private JButton btnEmpezar;
	private VentanaPrincipalServidor servidor;
	JButton [] btnConciertos;
	
	public VentanaCrearConcierto(VentanaPrincipalServidor servidor) {
		// TODO Auto-generated constructor stub
		setSize(360, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(new Color(072, 061,139));
		this.servidor = servidor;
		
		btnConciertos = new JButton[servidor.getServidorLogica().getListConexion().size()];
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setBackground(new Color(072, 061,139));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setSize(150, 20);
		lblNombre.setLocation(10, 10);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setSize(150, 20);
		txtNombre.setLocation(180, 10);
		add(txtNombre);
		
		lblMaxEspectadores = new JLabel("MAX ESPECTADORES");
		lblMaxEspectadores.setBackground(new Color(072, 061,139));
		lblMaxEspectadores.setForeground(Color.WHITE);
		lblMaxEspectadores.setSize(150, 20);
		lblMaxEspectadores.setLocation(10, 40);
		add(lblMaxEspectadores);
		
		txtMaxEspectadores = new JTextField();
		txtMaxEspectadores.setSize(150, 20);
		txtMaxEspectadores.setLocation(180, 40);
		add(txtMaxEspectadores);
		
		lblValor = new JLabel("VALOR SEGUNDO");
		lblValor.setBackground(new Color(072, 061,139));
		lblValor.setForeground(Color.WHITE);
		lblValor.setSize(150, 20);
		lblValor.setLocation(10, 70);
		add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setSize(150, 20);
		txtValor.setLocation(180, 70);
		add(txtValor);
		
		
		btnAgregarCancion = new JButton("AGREGAR CANCION");
		btnAgregarCancion.setActionCommand("AGREGAR");
		btnAgregarCancion.addActionListener(this);
		btnAgregarCancion.setSize(150, 20);
		btnAgregarCancion.setLocation(10, 110);
		add(btnAgregarCancion);
		
		btnEmpezar = new JButton("EMPEZAR");
		btnEmpezar.setActionCommand("EMPEZAR");
		btnEmpezar.addActionListener(this);
		btnEmpezar.setSize(150, 20);
		btnEmpezar.setLocation(180, 110);
		add(btnEmpezar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
			try {
				servidor.getServidorLogica().crearConcierto
				(Integer.parseInt(txtMaxEspectadores.getText()),
						Integer.parseInt(txtValor.getText()), txtNombre.getText());
				for(int i = 0; i<servidor.getServidorLogica().getListaConciertos().size(); i++){
					System.out.println("lista "+servidor.getServidorLogica().
							getListaConciertos().get(i).getNombre());
				}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS");
			}
		}
		
		if(e.getActionCommand().equalsIgnoreCase("EMPEZAR")){
			servidor.pnlDerecho.btnIncial.setText
			(servidor.getServidorLogica().getListaConciertos().get(0).getNombre());
			servidor.pnlDerecho.btnIncial.setVisible(true);
			
			for(int i = 0 ; i < btnConciertos.length ; i++){
				btnConciertos [i] = new JButton(txtNombre.getText());
				btnConciertos[i].setSize(100, 20);
				btnConciertos[i].setLocation(servidor.pnlDerecho.getPosicionX(), 
						servidor.pnlDerecho.getPosicionY());
				btnConciertos[i].setVisible(true);
				servidor.pnlDerecho.add(btnConciertos[i]);
			}
			if((servidor.pnlDerecho.getHeight()) >
				servidor.pnlDerecho.getPosicionY()){
				servidor.pnlDerecho.setPosicionY(servidor.pnlDerecho.getPosicionY()+30);
				}

			this.setVisible(false);
		}
	}
	
}

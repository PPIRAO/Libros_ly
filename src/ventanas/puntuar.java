package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import bbdd.basedatos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class puntuar {

	private JFrame frame;
	private JLabel lblPuntua;
	private JTextField pun;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puntuar window = new puntuar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public puntuar() {
		initialize(0, 0, null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize(int idlibro, int idUsuario, basedatos Base) {
		frame = new JFrame();
		frame.setBounds(100, 100, 318, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblPuntua = new JLabel("Puntua "+idlibro);
		lblPuntua.setBounds(55, 69, 73, 29);
		frame.getContentPane().add(lblPuntua);
		
		pun = new JTextField();
		pun.setBounds(155, 65, 73, 36);
		frame.getContentPane().add(pun);
		pun.setColumns(10);
		
		lblError = new JLabel("Error");
		lblError.setForeground(new Color(255, 0, 0));
		lblError.setBounds(165, 112, 73, 29);
		frame.getContentPane().add(lblError);
		lblError.setVisible(false);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					double punt=Double.parseDouble(pun.getText());
					Base.abrir();
					if(bbdd.librosbbdd.puntuar(idlibro, punt, idUsuario, Base))//te sales
					puntuar.setVisible(false);
					else{
						lblError.setVisible(true);
					}
					
					
					
				}catch(Exception es){
					lblError.setVisible(true);
				}
				
				
				
			}
		});
		btnEnviar.setBounds(76, 167, 139, 36);
		frame.getContentPane().add(btnEnviar);
	}

}

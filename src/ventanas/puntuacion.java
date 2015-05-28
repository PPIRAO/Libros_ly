package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import bbdd.basedatos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class puntuacion extends JFrame {

	private JPanel contentPane;
	private JTextField pun;
	private JButton enviar;
	private JLabel titulo;
	private JLabel lblPuntuacion;
	private JLabel lblPuntuado;
	private JLabel lblError;
	private JLabel titulolibro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puntuacion frame = new puntuacion(0, "", 0, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public puntuacion(int idlibro, String titulo, int idUsuario, basedatos Base ) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 429, 230);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pun = new JTextField();
		pun.setBounds(153, 68, 119, 29);
		contentPane.add(pun);
		pun.setColumns(10);
		
		lblPuntuacion = new JLabel("Puntuacion: ");
		lblPuntuacion.setBackground(new Color(105, 105, 105));
		lblPuntuacion.setBounds(60, 68, 83, 29);
		contentPane.add(lblPuntuacion);
		
		enviar = new JButton("Enviar");
		enviar.setBackground(new Color(169, 169, 169));
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					double punt=Double.parseDouble(pun.getText());
					if(punt<10) {
					Base.abrir();
					if(bbdd.librosbbdd.puntuar(idlibro, punt, idUsuario, Base)){
						lblPuntuado.setVisible(true);
					lblError.setVisible(false);}
					else{
						lblError.setVisible(true);
						lblPuntuado.setVisible(false);
					}
					}else{
						
						lblError.setVisible(true);
						lblPuntuado.setVisible(false);
					}
					
					
					
				}catch(Exception es){
					lblError.setVisible(true);
				}
				
				
			}
		});
		enviar.setBounds(146, 135, 137, 29);
		contentPane.add(enviar);
		
		
		
		lblPuntuado = new JLabel("Puntuado");
		lblPuntuado.setForeground(Color.GREEN);
		lblPuntuado.setBounds(303, 75, 83, 14);
		contentPane.add(lblPuntuado);
		
		lblError = new JLabel("Error");
		lblError.setForeground(Color.RED);
		lblError.setBounds(299, 75, 87, 14);
		contentPane.add(lblError);
		lblPuntuado.setVisible(false);
		
		titulolibro = new JLabel(titulo);
		titulolibro.setBackground(new Color(218, 165, 32));
		titulolibro.setBounds(41, 11, 345, 29);
		contentPane.add(titulolibro);
		lblError.setVisible(false);
		
	}
}

package ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import bbdd.basedatos;

import java.awt.Color;

import libros.Comentarios;

public class nombreLibro extends JFrame {

	private JPanel contentPane;
	private JTextField com;
	private JLabel lblNewLabel;
	private JButton enviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nombreLibro frame = new nombreLibro(0, 0, null);
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
	public nombreLibro(int idLibro,int idUsuario, basedatos Base) {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 619, 322);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		com = new JTextField();
		com.setBounds(56, 45, 465, 157);
		contentPane.add(com);
		com.setColumns(10);
		
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(314, 228, 100, 23);
		
		btnCancelar.setName("JBotonCancelar");
		contentPane.add(btnCancelar);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(56, 11, 512, 23);
		contentPane.add(lblNewLabel);
		
		enviar = new JButton("ENVIAR");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Base.abrir();
				Comentarios ct=new Comentarios(com.getText(),idLibro,idUsuario);
				bbdd.BBDDComentarios.añadir(ct, Base);
				Base.cerrar();
				
			}
		});
		enviar.setBounds(162, 228, 100, 23);
		contentPane.add(enviar);
	}

	public void actionPerformed(ActionEvent arg0) {
	
		
		Component fuente = (Component) arg0.getSource();
		if (fuente.getName().equalsIgnoreCase("JBotonEnviar"))
		{
			//Aqui codigo del boton enviar
			JButton boton = (JButton)fuente;
			boton.setText("ENVIADO");
			boton.setEnabled(false);
			
		}
		else if(fuente.getName().equalsIgnoreCase("JBotonCancelar"))
		{
			int confirmado = JOptionPane.showConfirmDialog( this, "¿Quieres salir?");
			if (JOptionPane.OK_OPTION == confirmado)
				System.exit(0);
		}
	}
}

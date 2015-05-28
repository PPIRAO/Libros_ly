package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import bbdd.BBDDComentarios;
import bbdd.basedatos;
import java.awt.Color;

public class VentanaBorrar extends JFrame implements ActionListener{

	
	
	//El administrador tendra la opcion de borrar un libro//
	private JPanel contentPane;
	private JTextField textidCliente;
	private JTextField textidLibro;
	private JLabel borrado;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		basedatos miBase=new basedatos("libros_ly");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBorrar frame = new VentanaBorrar();
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
	public VentanaBorrar() {
		this.setTitle("Borrar comentario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textidCliente = new JTextField();
		textidCliente.setBounds(113, 64, 259, 20);
		contentPane.add(textidCliente);
		textidCliente.setColumns(10);
		
		textidLibro = new JTextField();
		textidLibro.setBounds(113, 118, 259, 20);
		contentPane.add(textidLibro);
		textidLibro.setColumns(10);
		
		JLabel lblIdcliente = new JLabel("Nick");
		lblIdcliente.setForeground(new Color(128, 128, 128));
		lblIdcliente.setBounds(48, 64, 86, 20);
		contentPane.add(lblIdcliente);
		
		JLabel lblIdlibro = new JLabel("Libro");
		lblIdlibro.setForeground(new Color(128, 128, 128));
		lblIdlibro.setBounds(48, 121, 86, 14);
		contentPane.add(lblIdlibro);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(165, 177, 103, 30);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
		
		lblError = new JLabel("Error");
		lblError.setForeground(Color.RED);
		lblError.setBounds(291, 182, 94, 20);
		contentPane.add(lblError);
		lblError.setVisible(false);
		
		borrado = new JLabel("Borrado");
		borrado.setForeground(Color.GREEN);
		borrado.setBounds(276, 182, 109, 20);
		contentPane.add(borrado);
		borrado.setVisible(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!textidCliente.getText().equals("") && !textidLibro.getText().equals(""))
		{
			basedatos miBase=new basedatos("libros_ly");
			miBase.abrir();
			
			int confirmado = JOptionPane.showConfirmDialog( this, "¿Quieres borrar?");
			if (JOptionPane.OK_OPTION == confirmado)
			{
				BBDDComentarios.borrarComentarios(textidCliente.getText(), textidLibro.getText(), miBase);
				JOptionPane.showMessageDialog( this, "Se ha borrado");
			}
			
			miBase.cerrar();
		}
		
	}
}

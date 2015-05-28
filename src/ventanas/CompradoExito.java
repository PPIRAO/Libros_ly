package ventanas;

//package librosEntornosComrprar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import ventanas.tarjeta;
import libros.tarjetaLY;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.font.NumericShaper;

import libros.*;

import javax.swing.JTextPane;
import javax.swing.JTextField;

import bbdd.basedatos;
import java.awt.Color;

public class CompradoExito extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDni;
	private JTextField textFieldNumeroTarjeta;
	private JTextField textFieldHora;
	private JTextField textFieldPrecio;
	private JTextField textFieldDescuento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompradoExito frame = new CompradoExito(" ", " ", " ", " ",
							0, false,0,0);
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
	basedatos miBase = new basedatos("Libros_ly");

	public CompradoExito(String nombreTar, String apellidoTar, String DniTar,
			String tarjetaTar, double precioTar, boolean descuentoTar, int id, int usu) {

		String nombre = tarjeta.class.getName();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 533, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setForeground(new Color(105, 105, 105));
		lblFactura.setBounds(50, 11, 46, 14);
		contentPane.add(lblFactura);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(105, 105, 105));
		lblNombre.setBounds(50, 50, 146, 14);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setForeground(new Color(105, 105, 105));
		lblApellidos.setBounds(50, 75, 133, 14);
		contentPane.add(lblApellidos);

		JLabel lblDni = new JLabel("Dni: ");
		lblDni.setForeground(new Color(105, 105, 105));
		lblDni.setBounds(50, 100, 133, 14);
		contentPane.add(lblDni);

		JLabel lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta: ");
		lblNumeroDeTarjeta.setForeground(new Color(105, 105, 105));
		lblNumeroDeTarjeta.setBounds(50, 132, 133, 14);
		contentPane.add(lblNumeroDeTarjeta);

		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setForeground(new Color(105, 105, 105));
		lblHora.setBounds(50, 158, 133, 14);
		contentPane.add(lblHora);

		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setForeground(new Color(105, 105, 105));
		lblPrecio.setBounds(50, 183, 133, 14);
		contentPane.add(lblPrecio);

		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setForeground(new Color(105, 105, 105));
		lblDescuento.setBounds(50, 208, 133, 14);
		contentPane.add(lblDescuento);

		
		

		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(205, 133, 63));
		textFieldNombre.setEditable(false);
		textFieldNombre.setBounds(229, 47, 226, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setForeground(new Color(205, 133, 63));
		textFieldApellidos.setEditable(false);
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(229, 72, 226, 20);
		contentPane.add(textFieldApellidos);

		textFieldDni = new JTextField();
		textFieldDni.setForeground(new Color(205, 133, 63));
		textFieldDni.setEditable(false);
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(229, 97, 226, 20);
		contentPane.add(textFieldDni);

		textFieldNumeroTarjeta = new JTextField();
		textFieldNumeroTarjeta.setForeground(new Color(205, 133, 63));
		textFieldNumeroTarjeta.setEditable(false);
		textFieldNumeroTarjeta.setColumns(10);
		textFieldNumeroTarjeta.setBounds(229, 129, 226, 20);
		contentPane.add(textFieldNumeroTarjeta);

		textFieldHora = new JTextField();
		textFieldHora.setForeground(new Color(205, 133, 63));
		textFieldHora.setEditable(false);
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(229, 155, 226, 20);
		contentPane.add(textFieldHora);

		textFieldPrecio = new JTextField();
		textFieldPrecio.setForeground(new Color(205, 133, 63));
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(229, 180, 226, 20);
		contentPane.add(textFieldPrecio);

		textFieldDescuento = new JTextField();
		textFieldDescuento.setForeground(new Color(205, 133, 63));
		textFieldDescuento.setEditable(false);
		textFieldDescuento.setColumns(10);
		textFieldDescuento.setBounds(229, 205, 226, 20);
		contentPane.add(textFieldDescuento);
		
		
		
		
		
		miBase.abrir();
		String horaTar="";
		horaTar=bbdd.BBDDUsuario.verHora(horaTar, miBase,id,usu); 
		
		miBase.cerrar();
		
		textFieldNombre.setText(nombreTar);
		textFieldApellidos.setText(apellidoTar);
		textFieldDni.setText(DniTar);
		textFieldNumeroTarjeta.setText(tarjetaTar);
		
		
		textFieldHora.setText(String.valueOf(horaTar));
	
		textFieldPrecio.setText(String.valueOf(precioTar));   //se relleneran todos los datos automaticamente
		if (descuentoTar==true)
		textFieldDescuento.setText("10");
		else
		{
			textFieldDescuento.setText("0");      //si es premiun obtendra un descuento de 10 y si no tendra un descuento(0)
		}
	}
}
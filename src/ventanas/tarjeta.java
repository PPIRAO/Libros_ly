package ventanas;

//package librosEntornosComrprar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import bbdd.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import libros.libros;
import usuario.Usuario;
import libros.tarjetaLY;
import java.awt.Font;

public class tarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFielDni;
	private JTextField textFieldNumeroTarjeta;
	private JButton btnPagar;
	private JTextField textFieldCodigo;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblTipoTarjeta;
	private JLabel lblNumeroDeTarjeta;
	private JLabel lblCodigo;
	private JLabel labelNombre;
	private JLabel labelApellidos;
	private JLabel labelBotones;
	private JLabel labelDni;
	private JLabel labelNNumTarjeta;
	private JLabel labelCodigo;
	private JLabel labelPagarFallido;
	private JLabel labelPagoRealizadoCon;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tarjeta frame = new tarjeta(0, 0,0,false);
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

	public tarjeta(int idLibro, int idUsu, double precio, boolean descuento) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 503, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel txtpnDatosDeLa = new JLabel();
		txtpnDatosDeLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnDatosDeLa.setForeground(new Color(205, 133, 63));
		txtpnDatosDeLa.setText("Datos de la tarjeta"
		// +numero
				);
		txtpnDatosDeLa.setBounds(167, 11, 160, 28);
		contentPane.add(txtpnDatosDeLa);

		JLabel txtpnNombre = new JLabel();
		txtpnNombre.setForeground(new Color(105, 105, 105));
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(29, 60, 94, 20);
		contentPane.add(txtpnNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(167, 60, 187, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(167, 91, 187, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);

		textFielDni = new JTextField();
		textFielDni.setBounds(167, 122, 187, 20);
		contentPane.add(textFielDni);
		textFielDni.setColumns(10);

		textFieldNumeroTarjeta = new JTextField();
		textFieldNumeroTarjeta.setBounds(167, 184, 187, 20);
		contentPane.add(textFieldNumeroTarjeta);
		textFieldNumeroTarjeta.setColumns(10);

		JRadioButton rdbtnNewRadioButtonVisa = new JRadioButton("Visa");
		rdbtnNewRadioButtonVisa.setBackground(new Color(250,250,250));
		rdbtnNewRadioButtonVisa.setForeground(new Color(105, 105, 105));
		buttonGroup.add(rdbtnNewRadioButtonVisa);
		rdbtnNewRadioButtonVisa.setBounds(194, 149, 53, 23);
		contentPane.add(rdbtnNewRadioButtonVisa);

		JRadioButton rdbtnNewRadioButtonMastercard = new JRadioButton(
				"Mastercard");
		rdbtnNewRadioButtonMastercard.setBackground(new Color(250,250,250));
		rdbtnNewRadioButtonMastercard.setForeground(new Color(105, 105, 105));
		buttonGroup.add(rdbtnNewRadioButtonMastercard);
		rdbtnNewRadioButtonMastercard.setBounds(249, 149, 128, 23);
		contentPane.add(rdbtnNewRadioButtonMastercard);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(167, 215, 187, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);

		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(new Color(105, 105, 105));
		lblApellidos.setBounds(29, 91, 94, 14);
		contentPane.add(lblApellidos);

		lblDni = new JLabel("DNI");
		lblDni.setForeground(new Color(105, 105, 105));
		lblDni.setBounds(29, 125, 94, 14);
		contentPane.add(lblDni);

		lblTipoTarjeta = new JLabel("Tipo tarjeta");
		lblTipoTarjeta.setForeground(new Color(105, 105, 105));
		lblTipoTarjeta.setBounds(29, 154, 110, 14);
		contentPane.add(lblTipoTarjeta);

		lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
		lblNumeroDeTarjeta.setForeground(new Color(105, 105, 105));
		lblNumeroDeTarjeta.setBounds(29, 187, 128, 14);
		contentPane.add(lblNumeroDeTarjeta);

		lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(new Color(105, 105, 105));
		lblCodigo.setBounds(29, 218, 46, 14);
		contentPane.add(lblCodigo);

		labelNombre = new JLabel("Rellene campo");
		labelNombre.setForeground(Color.RED);
		labelNombre.setBounds(383, 63, 104, 14);
		contentPane.add(labelNombre);
		labelNombre.setVisible(false);

		labelApellidos = new JLabel("Rellene campo");
		labelApellidos.setForeground(Color.RED);
		labelApellidos.setBounds(383, 94, 89, 14);
		contentPane.add(labelApellidos);
		labelApellidos.setVisible(false);

		labelBotones = new JLabel("Rellene campo");
		labelBotones.setForeground(Color.RED);
		labelBotones.setBounds(383, 154, 89, 14);
		contentPane.add(labelBotones);
		labelBotones.setVisible(false);

		labelDni = new JLabel("Rellene campo");
		labelDni.setForeground(Color.RED);
		labelDni.setBounds(383, 125, 89, 14);
		contentPane.add(labelDni);
		labelDni.setVisible(false);

		labelNNumTarjeta = new JLabel("Rellene campo");
		labelNNumTarjeta.setForeground(Color.RED);
		labelNNumTarjeta.setBounds(383, 187, 104, 14);
		labelNNumTarjeta.setVisible(false);
		contentPane.add(labelNNumTarjeta);

		labelCodigo = new JLabel("Rellene campo");
		labelCodigo.setForeground(Color.RED);
		labelCodigo.setBounds(383, 218, 89, 14);
		contentPane.add(labelCodigo);
		labelCodigo.setVisible(false);

		labelPagarFallido = new JLabel("Pagar Fallido");
		labelPagarFallido.setForeground(Color.RED);
		labelPagarFallido.setBounds(194, 316, 75, 14);
		contentPane.add(labelPagarFallido);
		labelPagarFallido.setVisible(false);

		labelPagoRealizadoCon = new JLabel("Pago Realizado con exito");
		labelPagoRealizadoCon.setForeground(Color.GREEN);
		labelPagoRealizadoCon.setBounds(180, 316, 147, 14);
		contentPane.add(labelPagoRealizadoCon);
		labelPagoRealizadoCon.setVisible(false);
		btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String Nombre = textFieldNombre.getText();
				String Apellido = textFieldApellido.getText();
				String Dni = textFielDni.getText();
				String Codigo = textFieldCodigo.getText();
				String Numero_Tarjeta = textFieldNumeroTarjeta.getText();
				
				
				/*
				 * String numero_Tar, String dni, String idCompra, String
				 * idUsuario
				 */

				int longi = Numero_Tarjeta.length();
				int codi = Codigo.length();
				int dniTar =Dni.length();

				if (Nombre.equals("") || Apellido.equals("") || dniTar >9

				|| codi != 3 || longi != 16

				|| rdbtnNewRadioButtonMastercard.isSelected() == false // Cuando
																		// cualquier
																		// campo
																		// este
																		// vacio
																		// no se
																		// podra
																		// pagar.
																		// si la
																		// tarjeta
																		// no
																		// tiene
																		// 16
																		// caracteres
																		// no se
																		// pondra
																		// como
																		// valida

						&& rdbtnNewRadioButtonVisa.isSelected() == false) {

					if (Nombre.equals("")) {
						labelNombre.setVisible(true);

					}

					if (Apellido.equals("")) {
						labelApellidos.setVisible(true);
					}else{
						labelApellidos.setVisible(false);
						
					}

					if (Dni.equals("") || dniTar>=9) {
						labelDni.setVisible(true);
						labelDni.setText(String.valueOf(dniTar+" "+"menor que 9"));
					}
					else{
						labelDni.setVisible(false);
						
					}

					if (codi != 3) {
						labelCodigo.setText(String.valueOf(codi+" "+"necesitas 3")

						);
						labelCodigo.setVisible(true);
					}else{
						labelCodigo.setVisible(false);
						
					}

					if (longi != 16) {
						labelNNumTarjeta.setText(String.valueOf(longi+" "+"necesitas 16"));
						labelNNumTarjeta.setVisible(true);

					}

					if (rdbtnNewRadioButtonMastercard.isSelected() == false			//si los dos estan sin selecionar no se podra, hay que selecionar una de ellos
							&& rdbtnNewRadioButtonVisa.isSelected() == false) {

						labelBotones.setVisible(true);
					}
					labelPagarFallido.setVisible(true);
					labelPagoRealizadoCon.setVisible(false);
				} else {
					labelPagarFallido.setVisible(false);

					labelNombre.setVisible(false);
					labelApellidos.setVisible(false);
					labelNNumTarjeta.setVisible(false);
					labelCodigo.setVisible(false);
					labelDni.setVisible(false);
					labelBotones.setVisible(false);
					labelPagoRealizadoCon.setVisible(true);

					// tarjetabbdd tarjetabd = new tarjetabbdd();

					// libros Ly=new libros(idlibro, precio_sin_descuento);

					tarjetaLY tar = new tarjetaLY(Numero_Tarjeta, Dni,
							idLibro, idUsu);
					//libros ly =new libros();
					miBase.abrir();
					
					if(bbdd.BBDDUsuario.compra(tar, miBase, idLibro, idUsu)){
						
						bbdd.BBDDUsuario.compra(tar, miBase, idLibro, idUsu);
						
					}
					// tarjetabd.compra(tar, miBase, Ly); //Se guardara la
					// informacion en la base de datos
					// idcompra, idusuario, idlibro, fecha,
					// precio_sin_descuento,
					// descuento, numero_tarjeta, dni, puntuacion
					boolean premium;
					premium=bbdd.BBDDUsuario.isPremiun(idUsu, miBase);  //comprobaremos si es premiun para obtener descuento o no
					miBase.cerrar();

					CompradoExito CompradoExi = new CompradoExito(Nombre, Apellido, Dni, Numero_Tarjeta, precio, premium, idLibro, idUsu); //se pasara esto para hacer la factura
					CompradoExi.setVisible(true);

				}

			}
		});
		btnPagar.setBounds(187, 257, 104, 34);
		contentPane.add(btnPagar);

	}
}
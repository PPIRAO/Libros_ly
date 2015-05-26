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
import libros.tarjetaLY;

public class tarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFielDni;
	private JTextField textFieldNumeroTarjeta;
	private JButton btnPagar;
	private JTextField textFieldCodigo;
	private JButton btnSalir;
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
					tarjeta frame = new tarjeta();
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

	public tarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel txtpnDatosDeLa = new JLabel();
		txtpnDatosDeLa.setText("Datos de la tarjeta");
		txtpnDatosDeLa.setBounds(120, 11, 129, 20);
		contentPane.add(txtpnDatosDeLa);

		JLabel txtpnNombre = new JLabel();
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(24, 42, 70, 20);
		contentPane.add(txtpnNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(160, 42, 134, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(159, 73, 135, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);

		textFielDni = new JTextField();
		textFielDni.setBounds(160, 104, 134, 20);
		contentPane.add(textFielDni);
		textFielDni.setColumns(10);

		textFieldNumeroTarjeta = new JTextField();
		textFieldNumeroTarjeta.setBounds(160, 166, 134, 20);
		contentPane.add(textFieldNumeroTarjeta);
		textFieldNumeroTarjeta.setColumns(10);

		JRadioButton rdbtnNewRadioButtonVisa = new JRadioButton("Visa");
		buttonGroup.add(rdbtnNewRadioButtonVisa);
		rdbtnNewRadioButtonVisa.setBounds(161, 132, 53, 23);
		contentPane.add(rdbtnNewRadioButtonVisa);

		JRadioButton rdbtnNewRadioButtonMastercard = new JRadioButton(
				"Mastercard");
		buttonGroup.add(rdbtnNewRadioButtonMastercard);
		rdbtnNewRadioButtonMastercard.setBounds(216, 132, 89, 23);
		contentPane.add(rdbtnNewRadioButtonMastercard);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(159, 197, 135, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(161, 228, 89, 23);
		contentPane.add(btnSalir);

		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(24, 73, 46, 14);
		contentPane.add(lblApellidos);

		lblDni = new JLabel("DNI");
		lblDni.setBounds(24, 107, 46, 14);
		contentPane.add(lblDni);

		lblTipoTarjeta = new JLabel("Tipo tarjeta");
		lblTipoTarjeta.setBounds(24, 136, 70, 14);
		contentPane.add(lblTipoTarjeta);

		lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
		lblNumeroDeTarjeta.setBounds(24, 169, 104, 14);
		contentPane.add(lblNumeroDeTarjeta);

		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(24, 200, 46, 14);
		contentPane.add(lblCodigo);

		labelNombre = new JLabel("Rellene campo");
		labelNombre.setForeground(Color.RED);
		labelNombre.setBounds(323, 45, 104, 14);
		contentPane.add(labelNombre);
		labelNombre.setVisible(false);

		labelApellidos = new JLabel("Rellene campo");
		labelApellidos.setForeground(Color.RED);
		labelApellidos.setBounds(323, 76, 89, 14);
		contentPane.add(labelApellidos);
		labelApellidos.setVisible(false);

		labelBotones = new JLabel("Rellene campo");
		labelBotones.setForeground(Color.RED);
		labelBotones.setBounds(323, 136, 89, 14);
		contentPane.add(labelBotones);
		labelBotones.setVisible(false);

		labelDni = new JLabel("Rellene campo");
		labelDni.setForeground(Color.RED);
		labelDni.setBounds(323, 107, 89, 14);
		contentPane.add(labelDni);
		labelDni.setVisible(false);

		labelNNumTarjeta = new JLabel("Rellene campo");
		labelNNumTarjeta.setForeground(Color.RED);
		labelNNumTarjeta.setBounds(323, 169, 104, 14);
		contentPane.add(labelNNumTarjeta);

		labelCodigo = new JLabel("Rellene campo");
		labelCodigo.setForeground(Color.RED);
		labelCodigo.setBounds(323, 200, 89, 14);
		contentPane.add(labelCodigo);
		labelCodigo.setVisible(false);

		labelPagarFallido = new JLabel("Pagar Fallido");
		labelPagarFallido.setForeground(Color.RED);
		labelPagarFallido.setBounds(170, 262, 75, 14);
		contentPane.add(labelPagarFallido);
		labelPagarFallido.setVisible(false);

		labelPagoRealizadoCon = new JLabel("Pago Realizado con exito");
		labelPagoRealizadoCon.setForeground(Color.GREEN);
		labelPagoRealizadoCon.setBounds(24, 262, 147, 14);
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
				String idCompra = "";
				String idUsuario = "";
				/*
				 * String numero_Tar, String dni, String idCompra, String
				 * idUsuario
				 */
				//tarjetaLY compra = new tarjetaLY(Numero_Tarjeta, Dni, idCompra,
				//		idUsuario);

				int longi = Numero_Tarjeta.length();
				int codi = Codigo.length();
				
				
				labelCodigo.setText(String.valueOf(longi)
						
					);
				labelCodigo.setVisible(true);

				if (Nombre.equals("") || Apellido.equals("") || Dni.equals("")

				|| codi !=3 || longi != 16

				|| rdbtnNewRadioButtonMastercard.isSelected() == false              //Cuando cualquier campo este vacio no se podra pagar.
																					// si la tarjeta no tiene 16 caracteres no se pondra como valida

				&& rdbtnNewRadioButtonVisa.isSelected() == false) {

					if (Nombre.equals("")) {
						labelNombre.setVisible(true);

					}

					if (Apellido.equals("")) {
						labelApellidos.setVisible(true);
					}

					if (Dni.equals("")) {
						labelDni.setVisible(true);
					}

					if (codi !=3) {
						labelCodigo.setVisible(true);
					}

					if (longi != 16) {

						labelNNumTarjeta.setVisible(true);

					}

					if (rdbtnNewRadioButtonMastercard.isSelected() == false
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

			//		tarjetabbdd tarjetabd = new tarjetabbdd();
					
					//libros Ly=new libros(idlibro, precio_sin_descuento);
				//	tarjetaLY tar = new tarjetaLY(Numero_Tarjeta, Dni,
				//			idCompra, idUsuario);
					miBase.abrir();											
					// tarjetabd.compra(tar, miBase, Ly);							//Se guardara la informacion en la base de datos
																					//idcompra, idusuario, idlibro, fecha, precio_sin_descuento, 
																					//descuento, numero_tarjeta, dni, puntuacion
					miBase.cerrar();

					CompradoExito CompradoExi = new CompradoExito();
					CompradoExi.setVisible(true);

				}

			}
		});
		btnPagar.setBounds(34, 228, 89, 23);
		contentPane.add(btnPagar);

	}
}
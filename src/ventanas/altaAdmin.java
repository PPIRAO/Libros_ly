package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import ventanas.menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import bbdd.basedatos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class altaAdmin extends JFrame {
	basedatos Base=new basedatos("libros_ly");
	private JPanel altaAd;
	private JTextField txtFldMail;
	private JPasswordField txtContra1;
	private JPasswordField txtContra2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaAdmin frame = new altaAdmin();
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
	public altaAdmin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 300);
		altaAd = new JPanel();
		altaAd.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(altaAd);
		altaAd.setLayout(null);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(40, 37, 46, 14);
		altaAd.add(lblMail);
		
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setBounds(40, 89, 66, 14);
		altaAd.add(lblContra);
		
		JLabel lblContra2 = new JLabel("Repite contrase\u00F1a");
		lblContra2.setBounds(40, 136, 94, 14);
		altaAd.add(lblContra2);
		
		txtFldMail = new JTextField();
		txtFldMail.setBounds(144, 35, 188, 17);
		altaAd.add(txtFldMail);
		txtFldMail.setColumns(10);
		
		txtContra1 = new JPasswordField();
		txtContra1.setBounds(144, 87, 188, 17);
		altaAd.add(txtContra1);
		txtContra1.setColumns(10);
		
		txtContra2 = new JPasswordField();
		txtContra2.setBounds(144, 132, 188, 17);
		altaAd.add(txtContra2);
		txtContra2.setColumns(10);
		
		JLabel lblExist = new JLabel("EXISTE");
		lblExist.setForeground(Color.RED);
		lblExist.setBounds(264, 197, 46, 14);
		altaAd.add(lblExist);
		
		JLabel lblDiferente = new JLabel("DIFERENTES");
		lblDiferente.setForeground(Color.RED);
		lblDiferente.setBounds(198, 115, 75, 14);
		altaAd.add(lblDiferente);
		
		JLabel lblLong = new JLabel("Min 8 caracteres");
		lblLong.setForeground(Color.RED);
		lblLong.setBounds(342, 89, 89, 14);
		altaAd.add(lblLong);
		
		JLabel lblError = new JLabel("La contrase\u00F1a debe tener al menos 3 de los 4 tipos(caracter,minuscula,mayuscula o numero)");
		lblError.setForeground(Color.RED);
		lblError.setBounds(40, 161, 450, 14);
		altaAd.add(lblError);
		
		//btnAlta.setBounds(144, 193, 89, 23);
		//altaAd.add(btnAlta);
		
		JLabel lblMailError = new JLabel("ERROR");
		lblMailError.setForeground(Color.RED);
		lblMailError.setBounds(342, 37, 46, 14);
		altaAd.add(lblMailError);
		
		JLabel lblCreado = new JLabel("CREADO");
		lblCreado.setForeground(Color.GREEN);
		lblCreado.setBounds(264, 197, 46, 14);
		altaAd.add(lblCreado);
		
		lblExist.setVisible(false);
		lblDiferente.setVisible(false);
		lblLong.setVisible(false);
		lblError.setVisible(false);
		lblMailError.setVisible(false);
		lblCreado.setVisible(false);
		JButton btnReg = new JButton("ALTA");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail=txtFldMail.getText();
				String contra1=txtContra1.getText();
				String contra2=txtContra2.getText();
				Base.abrir();
				int id=bbdd.BBDDUsuario.consultarTotal(mail, contra1, Base);
				Base.cerrar();
				if(id>1){
					lblExist.setVisible(true);
					lblDiferente.setVisible(false);
					lblLong.setVisible(false);
					lblError.setVisible(false);
					lblMailError.setVisible(false);
					lblCreado.setVisible(false);
				}
				else{
					if(!contra1.equals(contra2)){
						lblExist.setVisible(false);
						lblDiferente.setVisible(true);
						lblLong.setVisible(false);
						lblError.setVisible(false);
						lblMailError.setVisible(false);
						lblCreado.setVisible(false);
					}
					else{
						int validar=ventanas.menu.validacion(contra1);
						switch(validar){
						case 0:
							lblExist.setVisible(false);
							lblDiferente.setVisible(false);
							lblLong.setVisible(true);
							lblError.setVisible(false);
							lblMailError.setVisible(false);
							lblCreado.setVisible(false);
							break;
						case -1:
							lblExist.setVisible(false);
							lblDiferente.setVisible(false);
							lblLong.setVisible(false);
							lblError.setVisible(true);
							lblMailError.setVisible(false);
							lblCreado.setVisible(false);
							break;
						case 1:
							boolean emailRep=ventanas.menu.validarEmail(mail);
							if(emailRep==false){
								lblExist.setVisible(false);
								lblDiferente.setVisible(false);
								lblLong.setVisible(false);
								lblError.setVisible(false);
								lblMailError.setVisible(true);
								lblCreado.setVisible(false);
							}
							else{
								Base.abrir();
								bbdd.BBDDUsuario.nuevoAdmin(mail, contra1, Base);//cambiar longitud del mail en la base de datos
								Base.cerrar();
								lblExist.setVisible(false);
								lblDiferente.setVisible(false);
								lblLong.setVisible(false);
								lblError.setVisible(false);
								lblMailError.setVisible(false);
								lblCreado.setVisible(true);
								break;
							}
						}
					}
				}
			}
		});
		btnReg.setBounds(165, 193, 89, 23);
		altaAd.add(btnReg);
		
	}

}

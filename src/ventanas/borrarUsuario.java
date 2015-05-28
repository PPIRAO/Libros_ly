package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import bbdd.basedatos;
import bbdd.BBDDUsuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class borrarUsuario extends JFrame {
	basedatos Base=new basedatos("libros_ly");
	private JPanel NickUsu;
	private JTextField txtNickUsu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					borrarUsuario frame = new borrarUsuario();
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
	public borrarUsuario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		NickUsu = new JPanel();
		NickUsu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(NickUsu);
		NickUsu.setLayout(null);
		
		JLabel lblNickUsu = new JLabel("Nick");
		lblNickUsu.setBounds(66, 49, 46, 14);
		NickUsu.add(lblNickUsu);
		
		txtNickUsu = new JTextField();
		txtNickUsu.setBounds(151, 46, 143, 20);
		NickUsu.add(txtNickUsu);
		txtNickUsu.setColumns(10);
		
		JLabel lblBorrado = new JLabel("BORRADO");
		lblBorrado.setForeground(Color.GREEN);
		lblBorrado.setBounds(151, 145, 89, 20);
		NickUsu.add(lblBorrado);
		
		JLabel lblNoBorrado = new JLabel("ERROR");
		lblNoBorrado.setForeground(Color.RED);
		lblNoBorrado.setBounds(151, 148, 46, 14);
		NickUsu.add(lblNoBorrado);
		
		lblBorrado.setVisible(false);
		lblNoBorrado.setVisible(false);
		JButton btnNickUsu = new JButton("BORRAR");
		btnNickUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nick=txtNickUsu.getText();
				Base.abrir();
				boolean borrado=bbdd.BBDDUsuario.borrar(nick, Base);
				Base.cerrar();
				if(borrado=false){
					lblBorrado.setVisible(false);
					lblNoBorrado.setVisible(true);
				}
				else{
					lblBorrado.setVisible(true);
					lblNoBorrado.setVisible(false);
				}
			}
		});
		btnNickUsu.setBounds(151, 99, 89, 23);
		NickUsu.add(btnNickUsu);
	}

}

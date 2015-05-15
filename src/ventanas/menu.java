package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class menu {

	private JFrame frame;
	private JPanel panel;
	private JPanel logo;
	private JPanel contenido;
	private JTextField nick;
	private JPanel menu;
	private JPasswordField passwordField;
	private JLabel todavia;
	private JButton btnIniciarSesin;
	private JPanel INICIAL;
	private JPanel BORDE;
	private JButton mejoresly;
	private JButton ultimos;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1025, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1009, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		BORDE = new JPanel();
		BORDE.setBorder(new LineBorder(Color.LIGHT_GRAY));
		BORDE.setBounds(786, 123, 1, 422);
		panel.add(BORDE);
		
		logo = new JPanel();
		logo.setBorder(null);
		logo.setBackground(SystemColor.text);
		logo.setBounds(0, 0, 1009, 63);
		panel.add(logo);
		logo.setLayout(null);
		
		menu = new JPanel();
		menu.setBackground(SystemColor.text);
		menu.setBounds(786, 62, 223, 538);
		panel.add(menu);
		menu.setLayout(null);
		
		INICIAL = new JPanel();
		INICIAL.setBackground(SystemColor.text);
		INICIAL.setBounds(0, 0, 223, 538);
		menu.add(INICIAL);
		INICIAL.setLayout(null);
		
		nick = new JTextField();
		nick.setBounds(55, 70, 126, 26);
		INICIAL.add(nick);
		nick.setForeground(Color.GRAY);
		nick.setText("Usuario");
		nick.setFont(new Font("Segoe UI Light", Font.ITALIC, 14));
		nick.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(55, 107, 126, 26);
		INICIAL.add(passwordField);
		passwordField.setToolTipText("");
		
		btnIniciarSesin = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesin.setBounds(55, 154, 126, 32);
		INICIAL.add(btnIniciarSesin);
		
		todavia = new JLabel("\u00BFTodav\u00EDa no tienes cuenta?\r\n\u00A1Haztela ya!");
		todavia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		todavia.setBounds(10, 246, 203, 126);
		INICIAL.add(todavia);
		
		JButton btnRegistrateAqu = new JButton("Registrate aqu\u00ED");
		btnRegistrateAqu.setBounds(55, 368, 126, 32);
		INICIAL.add(btnRegistrateAqu);
		
		contenido = new JPanel();
		contenido.setBorder(null);
		contenido.setBackground(SystemColor.text);
		contenido.setBounds(-1, 62, 788, 538);
		panel.add(contenido);
		contenido.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 788, 538);
		contenido.add(panel_1);
		panel_1.setLayout(null);
		
		mejoresly = new JButton("Echale un vistazo a nuestros mejores libros");
		mejoresly.setBounds(205, 277, 435, 57);
		panel_1.add(mejoresly);
		mejoresly.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		ultimos = new JButton("Enterate de cuales son los ultimos libros subidos");
		ultimos.setBounds(205, 170, 435, 57);
		panel_1.add(ultimos);
		ultimos.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
}

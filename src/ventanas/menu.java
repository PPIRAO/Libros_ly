package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.EtchedBorder;

import java.awt.SystemColor;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import bbdd.basedatos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JTextPane;
import javax.swing.JTextArea;

import libros.libros;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.List;


public class menu {

	private JFrame frame;
	private JPanel panel;
	private JPanel logo;
	private JPanel contenido;
	private JTextField nick;
	private JPanel menu;
	private JPasswordField passwordField;
	private JLabel todavia;
	private JButton iniciar;
	private JPanel INICIAL;
	private JPanel BORDE;
	private JButton mejoresly;
	private JButton ultimos;
	private JPanel menu1;
	private JPanel ver;
	private JTextField busly;
	private JButton btnConoceTodosNuestros;
	private JLabel lblBienvenidosANuestra;
	private JLabel hora;
	private JButton inicio;
	private JLabel error;
	private int idlibro;
	basedatos Base=new basedatos("libros_ly");
	private JPanel libro;
	private JPanel panel_1;
	private JLabel titulo;
	private JLabel autor;
	private JLabel precio;
	private JLabel lblhaztelaYa;
	private JTextPane sinopsis;
	private JTextArea comentarios;
	private JLabel genero;
	private JLabel puntuacion;
	private JTextArea textArea;

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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1025, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1009, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		logo = new JPanel();
		logo.setBorder(null);
		logo.setBackground(SystemColor.text);
		logo.setBounds(0, 0, 1009, 60);
		panel.add(logo);
		logo.setLayout(null);
		
		
		
		
		BORDE = new JPanel();
		BORDE.setBorder(new LineBorder(Color.LIGHT_GRAY));
		BORDE.setBounds(786, 123, 1, 422);
		panel.add(BORDE);
		
		menu = new JPanel();
		menu.setBackground(SystemColor.text);
		menu.setBounds(786, 62, 223, 538);
		panel.add(menu);
		menu.setLayout(null);
		
		INICIAL = new JPanel();
		INICIAL.setBackground(SystemColor.text);
		INICIAL.setBounds(10, 0, 213, 538);
		menu.add(INICIAL);
		INICIAL.setLayout(null);
		
		nick = new JTextField();
		nick.setBounds(45, 66, 126, 26);
		INICIAL.add(nick);
		nick.setForeground(Color.GRAY);
		nick.setText("Usuario");
		nick.setFont(new Font("Segoe UI Light", Font.ITALIC, 14));
		nick.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(45, 103, 126, 26);
		INICIAL.add(passwordField);
		passwordField.setToolTipText("");
		
		iniciar = new JButton("Iniciar sesi\u00F3n");
		iniciar.setBackground(new Color(255, 255, 255));
		iniciar.setBounds(45, 151, 126, 32);
		INICIAL.add(iniciar);
		
		todavia = new JLabel("   \u00BFTodav\u00EDa no tienes cuenta?\r\n");
		todavia.setForeground(new Color(128, 128, 128));
		todavia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		todavia.setBounds(10, 217, 193, 42);
		INICIAL.add(todavia);
		
		JButton btnRegistrateAqu = new JButton("Registrate aqu\u00ED");
		btnRegistrateAqu.setBounds(45, 296, 126, 32);
		INICIAL.add(btnRegistrateAqu);
		
		inicio = new JButton("Inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ver.setVisible(false);
				menu1.setVisible(true);
				libro.setVisible(false);
			}
		});
		inicio.setBounds(30, 398, 159, 32);
		INICIAL.add(inicio);
		
		lblhaztelaYa = new JLabel("\u00A1Haztela ya!");
		lblhaztelaYa.setForeground(new Color(205, 133, 63));
		lblhaztelaYa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblhaztelaYa.setBounds(66, 251, 86, 26);
		INICIAL.add(lblhaztelaYa);
		
	
		
		
		contenido = new JPanel();
		contenido.setBorder(null);
		contenido.setBackground(SystemColor.text);
		contenido.setBounds(-1, 62, 788, 538);
		panel.add(contenido);
		contenido.setLayout(null);
		
		
		
		
		libro = new JPanel();
		libro.setBackground(Color.WHITE);
		libro.setBounds(0, 0, 778, 538);
		contenido.add(libro);
		libro.setLayout(null);
		
		JButton comprar = new JButton("\u00A1Comprar!");
		comprar.setBounds(51, 280, 105, 30);
		libro.add(comprar);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(200, 26, 1, 422);
		libro.add(panel_1);
		
		puntuacion = new JLabel("7.8");
		puntuacion.setForeground(new Color(128, 128, 128));
		puntuacion.setFont(new Font("Tahoma", Font.BOLD, 40));
		puntuacion.setBounds(651, 42, 69, 60);
		libro.add(puntuacion);
		
		titulo = new JLabel("La guerra de los cielos: volumen 1");
		titulo.setForeground(new Color(210, 105, 30));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo.setBounds(222, 42, 419, 30);
		libro.add(titulo);
		
		autor = new JLabel("New label");
		autor.setForeground(new Color(128, 128, 128));
		autor.setFont(new Font("Tahoma", Font.BOLD, 12));
		autor.setBounds(222, 68, 396, 30);
		libro.add(autor);
		
		sinopsis = new JTextPane();
		sinopsis.setText("Sinopsis");
		sinopsis.setBounds(222, 152, 515, 147);
		libro.add(sinopsis);
		
		comentarios = new JTextArea();
		comentarios.setBackground(new Color(245, 245, 245));
		comentarios.setText("comentarios");
		comentarios.setBounds(222, 320, 515, 138);
		libro.add(comentarios);
		
		genero = new JLabel("Ficcci\u00F3n");
		genero.setForeground(new Color(128, 128, 128));
		genero.setBounds(222, 98, 358, 24);
		libro.add(genero);
		
		
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.setBounds(417, 479, 120, 23);
		libro.add(btnComentar);
		
		JButton puntua = new JButton("Punt\u00FAa");
		puntua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		puntua.setBounds(644, 113, 83, 23);
		libro.add(puntua);
		
		precio = new JLabel("e");
		precio.setForeground(new Color(205, 133, 63));
		precio.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		precio.setBounds(66, 234, 83, 30);
		libro.add(precio);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				libro.setVisible(false);
				
				ver.setVisible(true);
				
				
			}
		});
		btnVolver.setBounds(66, 479, 83, 23);
		libro.add(btnVolver);
		libro.setVisible(false);
		
		ver = new JPanel();
		ver.setBackground(Color.WHITE);
		ver.setBounds(0, 0, 778, 538);
		contenido.add(ver);
		ver.setLayout(null);
		ver.setVisible(false);
		
		busly = new JTextField();
		busly.setForeground(Color.BLACK);
		busly.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		busly.setColumns(10);
		busly.setBounds(336, 406, 230, 35);
		ver.add(busly);
		
		JLabel lblNewLabel = new JLabel("Escriba el titulo del libro que quieras ver: ");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(93, 407, 256, 35);
		ver.add(lblNewLabel);
		
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Base.abrir();
				idlibro=bbdd.librosbbdd.buscarly(busly.getText(),Base);
				Base.cerrar();
				if(idlibro==0){
					error.setVisible(true);
				}
				else{
					error.setVisible(false);
					libro.setVisible(true);
					
					JLabel imagen = new JLabel("Sin imagen");
					imagen.setIcon(null);
					imagen.setIcon(new ImageIcon(menu.class.getResource("/imagenes/"+idlibro+".jpg")));
					imagen.setBounds(44, 42, 119, 175);
					libro.add(imagen);
					
					Base.abrir();
					libros ly=bbdd.librosbbdd.libroly(idlibro,Base);
					
					titulo.setText(null);
					autor.setText(null);
					genero.setText(null);
					sinopsis.setText(null);
					precio.setText(null);
					puntuacion.setText(null);
					comentarios.setText(null);
					
					titulo.setText(ly.getTitulo());
					autor.setText(ly.getAutor());
					genero.setText(ly.getAutor());
					sinopsis.setText(ly.getSinopsis());
					precio.setText(String.valueOf(ly.getPrecio())+"€");
					
					puntuacion.setText(String.valueOf(ly.getPuntuacion()));
					
					comentarios.setText(bbdd.librosbbdd.comly(idlibro, Base)+idlibro);
					Base.cerrar();
					ver.setVisible(false);
					
				}
				
			}
		});
		enviar.setBounds(401, 452, 102, 35);
		ver.add(enviar);
		
		error = new JLabel("Debes de escribir el nombre exacto");
		error.setForeground(Color.RED);
		error.setBounds(576, 416, 169, 19);
		ver.add(error);
		error.setVisible(false);
		
		menu1 = new JPanel();
		menu1.setBackground(Color.WHITE);
		menu1.setBounds(0, 0, 778, 538);
		contenido.add(menu1);
		menu1.setLayout(null);
		
		mejoresly = new JButton("Echale un vistazo a nuestros mejores libros");
		mejoresly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.setVisible(false);
				ver.setVisible(true);
				
				
			}
		});
		mejoresly.setBounds(205, 309, 435, 57);
		menu1.add(mejoresly);
		mejoresly.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		ultimos = new JButton("Enterate de cuales son los ultimos libros subidos");
		ultimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.setVisible(false);
				
				
				
				
				
				
				ver.setVisible(true);
			}
		});
		ultimos.setBounds(205, 230, 435, 57);
		menu1.add(ultimos);
		ultimos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnConoceTodosNuestros = new JButton("Conoce todos nuestros libros");
		btnConoceTodosNuestros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menu1.setVisible(false);
				ver.setVisible(true);
				
			}
		});
		btnConoceTodosNuestros.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConoceTodosNuestros.setBounds(205, 387, 435, 57);
		menu1.add(btnConoceTodosNuestros);
		
		lblBienvenidosANuestra = new JLabel(" \u00A1Bienvenidos a nuestra Libros Ly_ !");
		lblBienvenidosANuestra.setForeground(new Color(128, 128, 128));
		lblBienvenidosANuestra.setFont(new Font("Vani", Font.BOLD, 18));
		lblBienvenidosANuestra.setBounds(246, 11, 375, 57);
		menu1.add(lblBienvenidosANuestra);
		
		/*
		 * Para poner la hora
		 * 
		 * hora = new JLabel("");
		hora.setBounds(161, 11, 52, 14);
		INICIAL.add(hora);
		
		
		while{
			GregorianCalendar calendario = new GregorianCalendar();
			int h=calendario.get(Calendar.HOUR);
			int m=calendario.get(Calendar.MINUTE);
			hora.setText(h+" : "+m);
		}*/
	}
}

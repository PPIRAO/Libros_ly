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
import javax.swing.ScrollPaneConstants;

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

import javax.swing.JScrollBar;


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
	private JLabel lblPortada;
	private JTextArea verly;
	private JLabel lblpremium;
	private JPanel descargas;
	private JTextField desly;
	private JTextArea desc;
	private JLabel lblRutaDeLa;
	private JTextField ruta;
	private JLabel lblPongaElNombre;
	private JLabel lblErrorEnLa;
	private JPanel InUsuario;
	private JButton btnCambiarContrasea;
	private JButton btnHaztePremium;
	private JPanel menu2;
	private JLabel hola;
	private JButton btnModificarLibro;
	private JButton btnBorrarComentario;
	private JButton btnAadirAdministrador;
	private JButton btnBorrarUsuario;
	private JButton btnCopiaDeSeguridad;
	private JButton button;
	private JPanel InAdmin;
	private int idAdmin=0;
	private int idUsuario=0;
	private JPanel modly;
	private JTextField modti;
	private JTextField modau;
	private JTextField modge;
	private JTextField modpre;
	private JTextField textField;

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
		frame.getContentPane().setBackground(new Color(250, 250, 250));
		frame.setBounds(100, 100, 1025, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(250, 250, 250));
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
		menu.setBackground(new Color(250, 250, 250));
		menu.setBounds(786, 62, 223, 538);
		panel.add(menu);
		menu.setLayout(null);
		
		InAdmin = new JPanel();
		InAdmin.setBackground(new Color(250,250,250));
		InAdmin.setBounds(10, 0, 213, 538);
		menu.add(InAdmin);
		InAdmin.setLayout(null);
		InAdmin.setVisible(false);
		
		JButton button_1 = new JButton("Inicio");
		button_1.setBounds(30, 54, 159, 32);
		InAdmin.add(button_1);
		
		JLabel lblBienvenidonombreDel = new JLabel("Bienvenido (nombre del admin)");
		lblBienvenidonombreDel.setBounds(0, 11, 203, 32);
		InAdmin.add(lblBienvenidonombreDel);
		
		JButton button_3 = new JButton("Cerrar sesi\u00F3n");
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(30, 469, 159, 32);
		InAdmin.add(button_3);
		
		JButton verlyadmin = new JButton("Ver libros");
		verlyadmin.setBounds(30, 110, 159, 32);
		InAdmin.add(verlyadmin);
		
		InUsuario = new JPanel();
		InUsuario.setLayout(null);
		InUsuario.setBackground(new Color(250, 250, 250));
		InUsuario.setBounds(0, 0, 213, 538);
		menu.add(InUsuario);
		InUsuario.setVisible(false);
		
		btnHaztePremium = new JButton("\u00A1Hazte premium!");
		btnHaztePremium.setForeground(new Color(68,68,68));
		btnHaztePremium.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHaztePremium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHaztePremium.setBackground(new Color(205, 133, 63));
		btnHaztePremium.setBounds(33, 289, 159, 32);
		InUsuario.add(btnHaztePremium);
		
		JButton button_2 = new JButton("Inicio");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(33, 75, 159, 32);
		InUsuario.add(button_2);
		
		lblpremium = new JLabel("\u00BFA que esperas?");
		lblpremium.setForeground(new Color(205, 133, 63));
		lblpremium.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpremium.setBounds(55, 252, 132, 26);
		InUsuario.add(lblpremium);
		
		JLabel lblBienVenidonombre = new JLabel("Bienvenido (nombre del usuario)");
		lblBienVenidonombre.setBounds(10, 11, 203, 32);
		InUsuario.add(lblBienVenidonombre);
		
		JButton btnDescargarLibro = new JButton("Descargar libro");
		btnDescargarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.setVisible(false);
				Base.abrir();
				desc.setText(bbdd.librosbbdd.compradosly(Base));
				Base.cerrar();
			}
		});
		btnDescargarLibro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDescargarLibro.setBounds(33, 118, 159, 32);
		InUsuario.add(btnDescargarLibro);
		
		JButton cerrar = new JButton("Cerrar sesi\u00F3n");
		cerrar.setForeground(new Color(255, 255, 255));
		cerrar.setBounds(33, 471, 159, 32);
		InUsuario.add(cerrar);
		cerrar.setBackground(new Color(128, 128, 128));
		
		btnCambiarContrasea = new JButton("Cambiar contrase\u00F1a");
		btnCambiarContrasea.setForeground(new Color(255, 255, 255));
		btnCambiarContrasea.setBackground(new Color(128, 128, 128));
		btnCambiarContrasea.setBounds(33, 429, 159, 32);
		InUsuario.add(btnCambiarContrasea);
		
		INICIAL = new JPanel();
		INICIAL.setBackground(new Color(250, 250, 250));
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
		iniciar.setBackground(new Color(211, 211, 211));
		iniciar.setBounds(45, 151, 126, 32);
		INICIAL.add(iniciar);
		
		todavia = new JLabel("   \u00BFTodav\u00EDa no tienes cuenta?\r\n");
		todavia.setForeground(new Color(128, 128, 128));
		todavia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		todavia.setBounds(10, 217, 193, 42);
		INICIAL.add(todavia);
		
		JButton btnRegistrateAqu = new JButton("Registrate aqu\u00ED");
		btnRegistrateAqu.setBackground(new Color(255, 165, 0));
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
		contenido.setBackground(new Color(250, 250, 250));
		contenido.setBounds(-1, 62, 788, 538);
		panel.add(contenido);
		contenido.setLayout(null);
		
		ver = new JPanel();
		ver.setBackground(new Color(250, 250, 250));
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
		lblNewLabel.setForeground(new Color(80, 80, 80));
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
					//if(idUsuario>0){
					libro.setVisible(true);
					
				
					lblPortada.setIcon(null);
					lblPortada.setIcon(new ImageIcon(menu.class.getResource("/imagenes/"+idlibro+".jpg")));
					lblPortada.setBounds(44, 42, 119, 175);
				
					
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
					genero.setText(ly.getGenero());
					sinopsis.setText("\n"+ly.getSinopsis());
					precio.setText(String.valueOf(ly.getPrecio())+"€");
					
					puntuacion.setText(String.valueOf(ly.getPuntuacion()));
					
					comentarios.setText(bbdd.librosbbdd.comly(idlibro, Base)+idlibro);
					Base.cerrar();
					ver.setVisible(false);
					/*}else{
						modly.setVisible(true);
						ver.setVisible(false);
						
						
						
					}*/
				}
				
			}
		});
		enviar.setBounds(401, 452, 102, 35);
		ver.add(enviar);
		
		error = new JLabel("Debes de escribir el nombre exacto");
		error.setForeground(Color.RED);
		error.setBounds(576, 416, 169, 19);
		ver.add(error);
		
		verly = new JTextArea();
		verly.setFont(new Font("Rockwell", Font.PLAIN, 18));
		verly.setBackground(new Color(240, 240, 240));
		verly.setEditable(false);
		verly.setBounds(70,38, 698, 340);
		ver.add(verly);
		error.setVisible(false);
		
		/*JScrollPane scrollPane = new JScrollPane(verly);
		scrollPane.setBounds(100,75, 698, 340);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
		frame.getContentPane().add(scrollPane);*/
		
		
		modly = new JPanel();
		modly.setBounds(0, 0, 778, 538);
		contenido.add(modly);
		modly.setBackground(new Color(250,250,250));
		modly.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(25, 27, 88, 25);
		modly.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(25, 63, 65, 25);
		modly.add(lblAutor);
		
		modti = new JTextField();
		modti.setBounds(123, 29, 538, 23);
		modly.add(modti);
		modti.setColumns(10);
		
		modau = new JTextField();
		modau.setBounds(123, 65, 538, 25);
		modly.add(modau);
		modau.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(25, 99, 65, 25);
		modly.add(lblGenero);
		
		modge = new JTextField();
		modge.setText("");
		modge.setBounds(123, 101, 538, 25);
		modly.add(modge);
		modge.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(25, 135, 65, 25);
		modly.add(lblPrecio);
		
		modpre = new JTextField();
		modpre.setText("");
		modpre.setColumns(10);
		modpre.setBounds(123, 137, 538, 25);
		modly.add(modpre);
		
		JLabel lblNewLabel_1 = new JLabel("Sinopsis");
		lblNewLabel_1.setBounds(25, 171, 88, 25);
		modly.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(123, 173, 538, 140);
		modly.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrComentarios = new JTextArea();
		txtrComentarios.setEditable(false);
		txtrComentarios.setText("Comentarios");
		txtrComentarios.setBounds(123, 343, 538, 154);
		modly.add(txtrComentarios);
		modly.setVisible(false);
		
		menu2 = new JPanel();
		menu2.setBackground(new Color(250,250,250));
		menu2.setBounds(0, 0, 778, 538);
		contenido.add(menu2);
		menu2.setLayout(null);
		menu2.setVisible(false);
		
		hola = new JLabel("Opciones de Administarador");
		hola.setFont(new Font("Tahoma", Font.BOLD, 22));
		hola.setForeground(new Color(105, 105, 105));
		hola.setBounds(237, 29, 347, 59);
		menu2.add(hola);
		
		btnModificarLibro = new JButton("Modificar libro");
		btnModificarLibro.setBounds(107, 124, 223, 53);
		menu2.add(btnModificarLibro);
		
		btnBorrarComentario = new JButton("Borrar comentario");
		btnBorrarComentario.setBounds(437, 124, 223, 53);
		menu2.add(btnBorrarComentario);
		
		btnAadirAdministrador = new JButton("A\u00F1adir Administrador");
		btnAadirAdministrador.setBounds(107, 219, 223, 53);
		menu2.add(btnAadirAdministrador);
		
		btnBorrarUsuario = new JButton("Borrar usuario");
		btnBorrarUsuario.setBounds(437, 219, 223, 53);
		menu2.add(btnBorrarUsuario);
		
		btnCopiaDeSeguridad = new JButton("Copia de seguridad");
		btnCopiaDeSeguridad.setBounds(107, 317, 223, 53);
		menu2.add(btnCopiaDeSeguridad);
		
		button = new JButton("Borrar comentario");
		button.setBounds(437, 317, 223, 53);
		menu2.add(button);
		
		menu1 = new JPanel();
		menu1.setBackground(new Color(250, 250, 250));
		menu1.setBounds(0, 0, 778, 538);
		contenido.add(menu1);
		menu1.setLayout(null);
		
		mejoresly = new JButton("Descubre los libros mejor puntuados");
		mejoresly.setForeground(new Color(205, 133, 63));
		mejoresly.setBackground(new Color(211, 211, 211));
		mejoresly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.setVisible(false);
				Base.abrir();
				verly.setText(bbdd.librosbbdd.valoradosly(Base));
				
				ver.setVisible(true);
				
				
			}
		});
		mejoresly.setBounds(205, 309, 435, 57);
		menu1.add(mejoresly);
		mejoresly.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		
		ultimos = new JButton("Ojea todos nuestros libros");
		ultimos.setBackground(new Color(211, 211, 211));
		ultimos.setForeground(new Color(205, 133, 63));
		ultimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.setVisible(false);
				
				Base.abrir();
				verly.setText(bbdd.librosbbdd.todosly(Base));
				Base.cerrar();
				
				
				
				ver.setVisible(true);
			}
		});
		ultimos.setBounds(205, 230, 435, 57);
		menu1.add(ultimos);
		ultimos.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		
		btnConoceTodosNuestros = new JButton("Nuestros libros m\u00E1s comprados");
		btnConoceTodosNuestros.setBackground(new Color(211, 211, 211));
		btnConoceTodosNuestros.setForeground(new Color(205, 133, 63));
		btnConoceTodosNuestros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menu1.setVisible(false);
				Base.abrir();
				verly.setText(bbdd.librosbbdd.compradosly(Base));
				Base.cerrar();
				ver.setVisible(true);
				
			}
		});
		btnConoceTodosNuestros.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		btnConoceTodosNuestros.setBounds(205, 387, 435, 57);
		menu1.add(btnConoceTodosNuestros);
		
		lblBienvenidosANuestra = new JLabel(" \u00A1Bienvenidos a nuestra Libros Ly_ !");
		lblBienvenidosANuestra.setForeground(new Color(128, 128, 128));
		lblBienvenidosANuestra.setFont(new Font("Vani", Font.BOLD, 18));
		lblBienvenidosANuestra.setBounds(246, 11, 375, 57);
		menu1.add(lblBienvenidosANuestra);
		
		descargas = new JPanel();
		descargas.setBackground(new Color(250,250,250));
		descargas.setBounds(0, 0, 778, 538);
		contenido.add(descargas);
		descargas.setLayout(null);
		descargas.setVisible(false);
		
		JLabel lblEscribaElTitulo = new JLabel("Escriba el titulo del libro que quieras descargar: ");
		lblEscribaElTitulo.setForeground(SystemColor.controlDkShadow);
		lblEscribaElTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribaElTitulo.setBounds(66, 364, 275, 35);
		descargas.add(lblEscribaElTitulo);
		
		desly = new JTextField();
		desly.setForeground(Color.BLACK);
		desly.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		desly.setColumns(10);
		desly.setBounds(333, 363, 230, 35);
		descargas.add(desly);
		
		JButton decargar = new JButton("Descargar");
		decargar.setBounds(402, 453, 102, 35);
		descargas.add(decargar);
		
		JLabel lblLibrosComprados = new JLabel("Libros comprados");
		lblLibrosComprados.setForeground(new Color(210, 105, 30));
		lblLibrosComprados.setBackground(new Color(204, 153, 0));
		lblLibrosComprados.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLibrosComprados.setBounds(61, 11, 180, 26);
		descargas.add(lblLibrosComprados);
		
		desc = new JTextArea();
		desc.setForeground(new Color(205, 133, 63));
		desc.setFont(new Font("Rockwell", Font.PLAIN, 18));
		desc.setEditable(false);
		desc.setBackground(SystemColor.menu);
		desc.setBounds(61, 48, 698, 286);
		descargas.add(desc);
		
		lblRutaDeLa = new JLabel("Ruta de la carpeta de destino:");
		lblRutaDeLa.setForeground(SystemColor.controlDkShadow);
		lblRutaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRutaDeLa.setBounds(155, 410, 180, 35);
		descargas.add(lblRutaDeLa);
		
		ruta = new JTextField();
		ruta.setForeground(Color.BLACK);
		ruta.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		ruta.setColumns(10);
		ruta.setBounds(333, 410, 230, 35);
		descargas.add(ruta);
		
		lblPongaElNombre = new JLabel("Ponga el nombre correcto");
		lblPongaElNombre.setForeground(new Color(255, 0, 0));
		lblPongaElNombre.setBounds(581, 375, 178, 14);
		descargas.add(lblPongaElNombre);
		
		lblErrorEnLa = new JLabel("Error en la ruta");
		lblErrorEnLa.setForeground(new Color(255, 0, 0));
		lblErrorEnLa.setBounds(581, 421, 125, 14);
		descargas.add(lblErrorEnLa);
		
		
		
		
		libro = new JPanel();
		libro.setBackground(new Color(250, 250, 250));
		libro.setBounds(0, 0, 778, 538);
		contenido.add(libro);
		libro.setLayout(null);
		
		JButton comprar = new JButton("\u00A1Comprar!");
		comprar.setBounds(47, 280, 105, 30);
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
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setBounds(233, 41, 423, 36);
		libro.add(titulo);
		
		autor = new JLabel("New label");
		autor.setForeground(new Color(128, 128, 128));
		autor.setFont(new Font("Tahoma", Font.BOLD, 12));
		autor.setBounds(247, 73, 396, 30);
		libro.add(autor);
		
		sinopsis = new JTextPane();
		sinopsis.setEditable(false);
		sinopsis.setBackground(new Color(250, 250, 250));
		sinopsis.setText("Sinopsis");
		sinopsis.setBounds(222, 152, 515, 147);
		libro.add(sinopsis);
		
		comentarios = new JTextArea();
		comentarios.setEditable(false);
		comentarios.setBackground(new Color(245, 245, 245));
		comentarios.setText("comentarios");
		comentarios.setBounds(222, 320, 515, 138);
		libro.add(comentarios);
		
		genero = new JLabel("Ficcci\u00F3n");
		genero.setForeground(new Color(128, 128, 128));
		genero.setBounds(247, 98, 358, 24);
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
		precio.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		precio.setBounds(77, 224, 94, 30);
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
		
		lblPortada = new JLabel("Sin imagen");
		lblPortada.setBounds(26, 26, 153, 211);
		libro.add(lblPortada);
		libro.setVisible(false);
		
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

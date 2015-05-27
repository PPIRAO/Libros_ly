package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Window;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JTextPane;
import javax.swing.JTextArea;

import libros.libros;

import javax.swing.UIManager;
import javax.swing.JScrollPane;

import java.awt.List;

import javax.swing.JScrollBar;

import usuario.Usuario;


public class menu {

	private JFrame frame;
	private JPanel panel;
	private JPanel logo;
	private JPanel contenido;
	private JTextField mail;
	private JPanel menu;
	private JPasswordField contraini;
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
	private JLabel ernom;
	private JLabel erruta;
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
	private JButton dale;
	private boolean solover;
	private JTextArea moddesc;
	private boolean solomod;
	private JLabel Copiado;
	private JPanel veradmin;
	private JTextArea controlad;
	private JLabel erespre;
	private JLabel librosly;
	private boolean premium;
	private JButton button_1;
	private JScrollPane controladscroll;
	private JScrollPane verlyscroll;
	private JScrollPane comentariosscroll;
	private JLabel idly;
	private JButton newly;
	private JLabel exito;
	private JLabel fallo;
	private JPanel Registrar;
	private JTextField txtFldNick;
	private JLabel lblPass;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField2;
	private JTextField txtMail;
	private JLabel lblLong;
	private JLabel lblNick;
	private JLabel lblPass2;
	private JLabel lblMail;
	private JButton btnRegistrarse;
	private JButton btnCancelar;
	private JLabel lblValido;
	private JLabel lblError;
	private JLabel lblExiste;
	private JLabel lblCorrecto;
	private JLabel lblDiferentes;
	private JLabel mailIncorrecto;
	private JLabel benef;
	private JLabel errorini;
	private JLabel bienadmin;
	private JLabel bienusu;
	private JButton btnDescargarLibro;
	private JTextArea modsin;
	private JButton button_2;
	private JPanel modificontra;
	private JTextField txtFldoldPass;
	private JTextField txtFldnewPass;
	private JLabel secambio;
	private JLabel nocambio;
	private JLabel notienes;
	private JLabel primerocompra;
	private JLabel repe;

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
		
		librosly = new JLabel("Libros ly_");
		librosly.setFont(new Font("Nyala", Font.BOLD | Font.ITALIC, 42));
		librosly.setForeground(new Color(139, 69, 19));
		librosly.setBounds(35, 0, 485, 60);
		panel.add(librosly);
		
		logo = new JPanel();
		logo.setBorder(null);
		logo.setBackground(new Color(250,240,220));
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
				if(premium)
					erespre.setVisible(true);;
			}
		});
		btnHaztePremium.setBackground(new Color(205, 133, 63));
		btnHaztePremium.setBounds(33, 289, 159, 32);
		InUsuario.add(btnHaztePremium);
		
		button_2 = new JButton("Inicio");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				erruta.setVisible(false);
                ernom.setVisible(false);
                Copiado.setVisible(false);
                notienes.setVisible(false);
				ver.setVisible(false);
				menu1.setVisible(true);
				libro.setVisible(false);
				Registrar.setVisible(false);
				descargas.setVisible(false);
				modificontra.setVisible(false);
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(33, 75, 159, 32);
		InUsuario.add(button_2);
		
		lblpremium = new JLabel("\u00BFA que esperas?");
		lblpremium.setForeground(new Color(205, 133, 63));
		lblpremium.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpremium.setBounds(55, 252, 132, 26);
		InUsuario.add(lblpremium);
		
		bienusu = new JLabel("Bienvenido (nombre del usuario)");
		bienusu.setForeground(new Color(105, 105, 105));
		bienusu.setBounds(10, 11, 203, 32);
		InUsuario.add(bienusu);
		
		btnDescargarLibro = new JButton("Descargar libro");
		btnDescargarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desc.setText(null);
				menu1.setVisible(false);
				ver.setVisible(false);
				libro.setVisible(false);
				Base.abrir();
				desc.setText(bbdd.librosbbdd.usuly(idUsuario,Base));
				Base.cerrar();
				descargas.setVisible(true);
				modificontra.setVisible(false);
			}
		});
		btnDescargarLibro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDescargarLibro.setBounds(33, 118, 159, 32);
		InUsuario.add(btnDescargarLibro);
		
		JButton cerrar = new JButton("Cerrar sesi\u00F3n");
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idUsuario=0;
				erruta.setVisible(false);
                ernom.setVisible(false);
                Copiado.setVisible(false);
                notienes.setVisible(false);
				ver.setVisible(false);
				libro.setVisible(false);
				descargas.setVisible(false);
				menu1.setVisible(true);
				INICIAL.setVisible(true);
				InUsuario.setVisible(false);
				modificontra.setVisible(false);
			}
		});
		cerrar.setForeground(new Color(255, 255, 255));
		cerrar.setBounds(33, 471, 159, 32);
		InUsuario.add(cerrar);
		cerrar.setBackground(new Color(128, 128, 128));
		
		btnCambiarContrasea = new JButton("Cambiar contrase\u00F1a");
		btnCambiarContrasea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				erruta.setVisible(false);
                ernom.setVisible(false);
                Copiado.setVisible(false);
                notienes.setVisible(false);
				txtFldoldPass.setText(null);
				txtFldnewPass.setText(null);
				secambio.setVisible(false);
				nocambio.setVisible(false);
				ver.setVisible(false);
				menu1.setVisible(false);
				libro.setVisible(false);
				Registrar.setVisible(false);
				descargas.setVisible(false);
				modificontra.setVisible(true);
			}
		});
		btnCambiarContrasea.setForeground(new Color(255, 255, 255));
		btnCambiarContrasea.setBackground(new Color(128, 128, 128));
		btnCambiarContrasea.setBounds(33, 429, 159, 32);
		InUsuario.add(btnCambiarContrasea);
		
		erespre = new JLabel("Ya lo eres");
		erespre.setForeground(new Color(255, 0, 0));
		erespre.setBounds(86, 332, 87, 26);
		InUsuario.add(erespre);
		erespre.setVisible(false);
		
		InAdmin = new JPanel();
		InAdmin.setBackground(new Color(250,250,250));
		InAdmin.setBounds(10, 0, 213, 538);
		menu.add(InAdmin);
		InAdmin.setLayout(null);
		InAdmin.setVisible(false);
		
		button_1 = new JButton("Inicio");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veradmin.setVisible(false);
				modly.setVisible(false);
				ver.setVisible(false);
				libro.setVisible(false);
				menu2.setVisible(true);
				solover=false;
				solomod=false;
			}
		});
		button_1.setBounds(30, 54, 159, 32);
		InAdmin.add(button_1);
		
		bienadmin = new JLabel("Bienvenido (nombre del admin)");
		bienadmin.setBounds(0, 11, 203, 32);
		InAdmin.add(bienadmin);
		
		JButton button_3 = new JButton("Cerrar sesi\u00F3n");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu2.setVisible(false);
				menu1.setVisible(true);
				InAdmin.setVisible(false);
				INICIAL.setVisible(true);
				modly.setVisible(false);
				ver.setVisible(false);
				modly.setVisible(false);
				libro.setVisible(false);
				idAdmin=0;
				
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(30, 469, 159, 32);
		InAdmin.add(button_3);
		
		JButton verlyadmin = new JButton("Ver libros");
		verlyadmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Con este codigo permite ver a los administradores los libros
				solover=true;
				menu2.setVisible(false);
				modly.setVisible(false);
				libro.setVisible(false);
				Base.abrir();
				verly.setText(bbdd.librosbbdd.todosly(Base));
				Base.cerrar();
				ver.setVisible(true);
			}
		});
		verlyadmin.setBounds(30, 110, 159, 32);
		InAdmin.add(verlyadmin);
		
		INICIAL = new JPanel();
		INICIAL.setBackground(new Color(250, 250, 250));
		INICIAL.setBounds(10, 0, 213, 538);
		menu.add(INICIAL);
		INICIAL.setLayout(null);
		
		mail = new JTextField();
		mail.setBounds(45, 66, 126, 26);
		INICIAL.add(mail);
		mail.setForeground(Color.GRAY);
		mail.setText("Mail");
		mail.setFont(new Font("Segoe UI Light", Font.ITALIC, 14));
		mail.setColumns(10);
		
		contraini = new JPasswordField();
		contraini.setBounds(45, 103, 126, 26);
		INICIAL.add(contraini);
		contraini.setToolTipText("");
		
		iniciar = new JButton("Iniciar sesi\u00F3n");
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Con este pedazo codigo diferenciamos quien ha iniciado sesion tanto un cliente o un administrador mostrando los correspondientes menús
				Usuario usu=new Usuario(mail.getText(),contraini.getText());
				
				Base.abrir();
				idUsuario=bbdd.BBDDUsuario.LoginCliente(usu, Base);
				Base.cerrar();
				if (idUsuario<1){
					Base.abrir();
					idAdmin=bbdd.BBDDUsuario.LoginAdmin(usu, Base);
					Base.cerrar();
						if(idAdmin<1){
							errorini.setVisible(true);
						}
						else{
							InAdmin.setVisible(true);
							menu2.setVisible(true);
							menu1.setVisible(false);
							INICIAL.setVisible(false);
							errorini.setVisible(false);
							ver.setVisible(false);
							libro.setVisible(false);
							descargas.setVisible(false);
							bienadmin.setText("Bienvenido "+mail.getText());
							bienusu.setText(null);
						}
				}
				else{
					ver.setVisible(false);
					libro.setVisible(false);
					descargas.setVisible(false);
					errorini.setVisible(false);
					InUsuario.setVisible(true);
					INICIAL.setVisible(false);
					bienusu.setText("Bienvenido "+mail.getText());
					
			}}}
		);
		
		iniciar.setBackground(new Color(211, 211, 211));
		iniciar.setBounds(45, 151, 126, 32);
		INICIAL.add(iniciar);
		
		todavia = new JLabel("   \u00BFTodav\u00EDa no tienes cuenta?\r\n");
		todavia.setForeground(new Color(128, 128, 128));
		todavia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		todavia.setBounds(10, 217, 193, 42);
		INICIAL.add(todavia);
		
		JButton btnRegistrateAqu = new JButton("Registrate aqu\u00ED");
		btnRegistrateAqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registrar.setVisible(true);
				menu1.setVisible(false);
			}
		});
		btnRegistrateAqu.setBackground(new Color(255, 165, 0));
		btnRegistrateAqu.setBounds(45, 296, 126, 32);
		INICIAL.add(btnRegistrateAqu);
		
		inicio = new JButton("Inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Con la barra de inicio tanto aqui como en los demas nos sirva para volver al menu principal, dependiendo si es cliente o administrador
				ver.setVisible(false);
				menu1.setVisible(true);
				libro.setVisible(false);
				Registrar.setVisible(false);
			}
		});
		inicio.setBounds(30, 398, 159, 32);
		INICIAL.add(inicio);
		
		lblhaztelaYa = new JLabel("\u00A1Haztela ya!");
		lblhaztelaYa.setForeground(new Color(205, 133, 63));
		lblhaztelaYa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblhaztelaYa.setBounds(66, 251, 86, 26);
		INICIAL.add(lblhaztelaYa);
		
		errorini = new JLabel("No existe esa cuenta");
		errorini.setForeground(Color.RED);
		errorini.setBounds(55, 194, 124, 14);
		INICIAL.add(errorini);
		errorini.setVisible(false);
		
	
		
		
		
		contenido = new JPanel();
		contenido.setBorder(null);
		contenido.setBackground(new Color(250, 250, 250));
		contenido.setBounds(-1, 62, 788, 538);
		panel.add(contenido);
		contenido.setLayout(null);
		
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
		decargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Con este metodo descargas el libro en la ruta escrita por el cliente

				Base.abrir();
				idlibro=bbdd.librosbbdd.buscarly(desly.getText(),Base);
				Base.cerrar();
				if(idlibro==0){
					ernom.setVisible(true);
					Copiado.setVisible(false);
				}else{
					if(bbdd.librosbbdd.comprobarcompra(idlibro, idUsuario, Base)){
				 File directorio=new File(ruta.getText());
	                
	                if(directorio.isDirectory()){
	                    FileInputStream registro2;
	                    FileOutputStream copiar;
	                    File registro=new File("Libros", desly.getText()+".epub");
	                    int d;
	                    byte datos[]=new byte[100];
	                    try{
	                         
	                     registro2=new FileInputStream(registro );
	                     directorio=new File(ruta.getText(), desly.getText()+".epub");
	                     copiar=new FileOutputStream(directorio);
	                      
	                     while((d=registro2.read(datos))!=-1){
	                         copiar.write(datos,0,d);
	                         d=registro2.read();
	                          
	                          
	                     }
	                     ernom.setVisible(false);
	                     erruta.setVisible(false);
	                     Copiado.setVisible(true);
	                    }catch(Exception es){
	                        erruta.setVisible(true);
	                        ernom.setVisible(true);
	                        Copiado.setVisible(false);
	                        notienes.setVisible(false);
	                        System.exit(0);
	                    }
	                }
	                else{
	                    erruta.setVisible(true);
	                    notienes.setVisible(false);
	                    Copiado.setVisible(false);}
				
				}else{
					
					ernom.setVisible(false);
                    erruta.setVisible(false);
					notienes.setVisible(true);
				}
				}}
		});
		decargar.setBounds(402, 453, 102, 35);
		descargas.add(decargar);
		
		JLabel lblLibrosComprados = new JLabel("Libros comprados");
		lblLibrosComprados.setForeground(new Color(210, 105, 30));
		lblLibrosComprados.setBackground(new Color(204, 153, 0));
		lblLibrosComprados.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLibrosComprados.setBounds(61, 11, 180, 26);
		descargas.add(lblLibrosComprados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(128, 128, 128)));
		scrollPane.setBounds(61, 47, 698, 287);
		descargas.add(scrollPane);
		
		desc = new JTextArea();
		scrollPane.setViewportView(desc);
		desc.setForeground(new Color(205, 133, 63));
		desc.setFont(new Font("Rockwell", Font.PLAIN, 18));
		desc.setEditable(false);
		desc.setBackground(SystemColor.menu);
		
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
		
		ernom = new JLabel("Ponga el nombre correcto");
		ernom.setForeground(new Color(255, 0, 0));
		ernom.setBounds(581, 375, 178, 14);
		descargas.add(ernom);
		ernom.setVisible(false);
		
		erruta = new JLabel("Error en la ruta");
		erruta.setForeground(new Color(255, 0, 0));
		erruta.setBounds(581, 421, 125, 14);
		descargas.add(erruta);
		erruta.setVisible(false);
		
		Copiado = new JLabel("Copiado");
		Copiado.setForeground(Color.GREEN);
		Copiado.setBounds(542, 463, 149, 26);
		descargas.add(Copiado);
		
		notienes = new JLabel("No lo tienes pill\u00EDn");
		notienes.setForeground(new Color(255, 0, 0));
		notienes.setBackground(new Color(255, 0, 0));
		notienes.setBounds(542, 463, 102, 20);
		notienes.setVisible(false);
		
		descargas.add(notienes);
		Copiado.setVisible(false);
		
		
		
		
		libro = new JPanel();
		libro.setBackground(new Color(250, 250, 250));
		libro.setBounds(0, 0, 778, 538);
		contenido.add(libro);
		libro.setLayout(null);
		
		JButton comprar = new JButton("\u00A1Comprar!");
		comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//con este boton abrimos el menu de compra, solo podran acceder a el aquellos usuarios que hayan iniciado sesion y no lo hayan comprado ya
				if(bbdd.librosbbdd.comprobarcompra(idlibro, idUsuario, Base)){
					repe.setVisible(true);
				}
				else{
					tarjeta compra=new tarjeta();
					compra.setVisible(true);
					
				}
				
				
			}
		});
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
		
		genero = new JLabel("Ficcci\u00F3n");
		genero.setForeground(new Color(128, 128, 128));
		genero.setBounds(247, 98, 358, 24);
		libro.add(genero);
		
		
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(bbdd.librosbbdd.comprobarcompra(idlibro, idUsuario, Base)){
					nombreLibro anivia=new nombreLibro(idlibro,idUsuario,Base);
					anivia.setVisible(true);
				}
				else{
					primerocompra.setVisible(true);
				}
			}
		});
		btnComentar.setBounds(417, 479, 120, 23);
		libro.add(btnComentar);
		
		JButton puntua = new JButton("Punt\u00FAa");
		puntua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(bbdd.librosbbdd.comprobarcompra(idlibro, idUsuario, Base)){
					puntuacion venga=new puntuacion(idlibro, titulo.getText(),idUsuario,  Base );
					venga.setVisible(true);
				}
				else{
					primerocompra.setVisible(true);
					
				}
				
				
				
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
		
		comentariosscroll = new JScrollPane();
		comentariosscroll.setViewportBorder(new LineBorder(Color.LIGHT_GRAY));
		comentariosscroll.setBounds(222, 320, 515, 138);
		libro.add(comentariosscroll);
		
		comentarios = new JTextArea();
		comentariosscroll.setViewportView(comentarios);
		comentarios.setEditable(false);
		comentarios.setBackground(new Color(245, 245, 245));
		comentarios.setText("comentarios");
		
		primerocompra = new JLabel("\u00A1ANTES DEBES DE COMPRARLO!");
		primerocompra.setForeground(new Color(255, 0, 0));
		primerocompra.setBounds(386, 11, 206, 24);
		libro.add(primerocompra);
		primerocompra.setVisible(false);
		
		repe = new JLabel("\u00BFLO COMPRAS OTRA VEZ?");
		repe.setForeground(new Color(255, 0, 0));
		repe.setBackground(new Color(255, 0, 0));
		repe.setBounds(36, 321, 154, 30);
		libro.add(repe);
		libro.setVisible(false);
		
		modificontra = new JPanel();
		modificontra.setBackground(new Color(250,250,250));
		modificontra.setBounds(0, 0, 778, 538);
		contenido.add(modificontra);
		modificontra.setLayout(null);
		modificontra.setVisible(false);
		
		JLabel lblTitContra = new JLabel("CAMBIO DE CONTRASE\u00D1A");
		lblTitContra.setForeground(new Color(205, 133, 63));
		lblTitContra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitContra.setBackground(new Color(205, 133, 63));
		lblTitContra.setBounds(273, 70, 326, 14);
		modificontra.add(lblTitContra);
		
		JLabel lbloldPass = new JLabel("Antigua contrase\u00F1a");
		lbloldPass.setForeground(new Color(105, 105, 105));
		lbloldPass.setBounds(152, 191, 106, 14);
		modificontra.add(lbloldPass);
		
		txtFldoldPass = new JTextField();
		txtFldoldPass.setBounds(293, 188, 249, 20);
		modificontra.add(txtFldoldPass);
		txtFldoldPass.setColumns(10);
		
		
		JLabel lblnewPass = new JLabel("Nueva contrase\u00F1a");
		lblnewPass.setForeground(new Color(105, 105, 105));
		lblnewPass.setBounds(152, 261, 106, 14);
		modificontra.add(lblnewPass);
		
		txtFldnewPass = new JTextField();
		txtFldnewPass.setBounds(293, 258, 249, 20);
		modificontra.add(txtFldnewPass);
		txtFldnewPass.setColumns(10);
		

		JButton btncambiar = new JButton("CAMBIAR");
		btncambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//BOTON DE CAMBIAR CONTRASEÑA
				
				String oldpass=txtFldoldPass.getText();
				String newpass=txtFldnewPass.getText();
				Usuario usu=new Usuario("nick",oldpass,newpass,false);
				Base.abrir();
				if(bbdd.BBDDUsuario.CambiarContra(usu,idUsuario,Base)){
					secambio.setVisible(true);
					nocambio.setVisible(false);
					
				}else{
					secambio.setVisible(false);
					nocambio.setVisible(true);
				}
				Base.cerrar();
			}
		});
		btncambiar.setBounds(263, 372, 200, 50);
		modificontra.add(btncambiar);
		
		secambio = new JLabel("Cambiado");
		secambio.setForeground(new Color(0, 128, 0));
		secambio.setBounds(293, 453, 128, 42);
		modificontra.add(secambio);
		secambio.setVisible(false);
		
		nocambio = new JLabel("Error");
		nocambio.setForeground(new Color(255, 0, 0));
		nocambio.setBounds(293, 453, 128, 42);
		modificontra.add(nocambio);
		nocambio.setVisible(false);
		
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
		btnModificarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				solover=false;
				solomod=true;
				menu2.setVisible(false);
				Base.abrir();
				verly.setText(bbdd.librosbbdd.todosly(Base));
				Base.cerrar();
				ver.setVisible(true);
				
			}
		});
		btnModificarLibro.setBounds(107, 124, 223, 53);
		menu2.add(btnModificarLibro);
		
		btnBorrarComentario = new JButton("Borrar comentario");
		btnBorrarComentario.setBounds(437, 408, 223, 53);
		menu2.add(btnBorrarComentario);
		
		btnAadirAdministrador = new JButton("A\u00F1adir Administrador");
		btnAadirAdministrador.setBounds(107, 215, 223, 53);
		menu2.add(btnAadirAdministrador);
		
		btnBorrarUsuario = new JButton("Borrar usuario");
		btnBorrarUsuario.setBounds(437, 215, 223, 53);
		menu2.add(btnBorrarUsuario);
		
		btnCopiaDeSeguridad = new JButton("Copia de seguridad");
		btnCopiaDeSeguridad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				copias copiar=new copias();
				copiar.setVisible(true);
			}
		});
		btnCopiaDeSeguridad.setBounds(107, 313, 223, 53);
		menu2.add(btnCopiaDeSeguridad);
		
		button = new JButton("Borrar comentario");
		button.setBounds(437, 313, 223, 53);
		menu2.add(button);
		
		newly = new JButton("Nuevo libro");
		newly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modti.setText(null);
				modau.setText(null);
				modge.setText(null);
				modsin.setText(null);
				modpre.setText(null);
				moddesc.setText(null);
				
				solomod=false;
				menu2.setVisible(false);
				modly.setVisible(true);
			}
		});
		newly.setBounds(436, 124, 224, 53);
		menu2.add(newly);
		
		JButton verad = new JButton("Ver historial de administradores");
		verad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Base.abrir();
				
				
				Base.cerrar();
				
				
			}
		});
		verad.setBounds(107, 408, 223, 53);
		menu2.add(verad);
		
		//////////////////////////////////////////////////////
		
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
		
		dale = new JButton("Enviar");
		dale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exito.setVisible(false);
				fallo.setVisible(false);
				double din=Double.parseDouble(modpre.getText());
				libros ly=new libros(modti.getText(),modsin.getText(),modge.getText(),din,modau.getText());
				Base.abrir();
			if(solomod){
				if(bbdd.librosbbdd.modly(ly, idAdmin, idlibro, moddesc.getText(), Base)){
					exito.setVisible(true);
					fallo.setVisible(false);
				}else{
					fallo.setVisible(true);
					exito.setVisible(false);
				}
				
				
				
				
			}else{
				if(bbdd.librosbbdd.añadirLibro(ly, idAdmin, moddesc.getText(), Base)){
					exito.setVisible(true);
					fallo.setVisible(false);
				}else{
					fallo.setVisible(true);
					exito.setVisible(false);
				}
			}
				
				
			}
		});
		dale.setBounds(357, 492, 89, 23);
		modly.add(dale);
		
		moddesc = new JTextArea();
		moddesc.setBounds(123, 331, 538, 140);
		modly.add(moddesc);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(25, 331, 80, 25);
		modly.add(lblDescripcion);
		
		idly = new JLabel("Id: ");
		idly.setBounds(696, 27, 57, 41);
		modly.add(idly);
		
		exito = new JLabel("\u00C9xito");
		exito.setForeground(Color.GREEN);
		exito.setBounds(469, 491, 134, 25);
		modly.add(exito);
		
		fallo = new JLabel("Fall\u00F3");
		fallo.setForeground(Color.RED);
		fallo.setBounds(469, 496, 88, 14);
		modly.add(fallo);
		
		benef = new JLabel("Beneficios");
		benef.setBounds(21, 496, 252, 19);
		modly.add(benef);
		
		modsin = new JTextArea();
		modsin.setBounds(123, 173, 538, 140);
		modly.add(modsin);
		modly.setVisible(false);
		exito.setVisible(false);
		fallo.setVisible(false);
		////////////////////////////////////////////////////luis
		
		Registrar = new JPanel();
		Registrar.setBackground(new Color(250,250,250));
		Registrar.setBounds(0, 0, 778, 538);
		contenido.add(Registrar);
		Registrar.setVisible(false);
		Registrar.setLayout(null);
		
		lblNick = new JLabel("Nick");
		lblNick.setForeground(new Color(105, 105, 105));
		lblNick.setBounds(146, 111, 46, 25);
		Registrar.add(lblNick);
		
		txtFldNick = new JTextField();
		txtFldNick.setBounds(252, 113, 180, 20);
		Registrar.add(txtFldNick);
		txtFldNick.setColumns(10);
		
		lblPass = new JLabel("Contrase\u00F1a");
		lblPass.setForeground(new Color(105, 105, 105));
		lblPass.setBounds(146, 162, 68, 14);
		Registrar.add(lblPass);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(252, 159, 180, 20);
		Registrar.add(passwordField_1);
		
		lblPass2 = new JLabel("Repite contrase\u00F1a");
		lblPass2.setForeground(new Color(105, 105, 105));
		lblPass2.setBounds(146, 210, 88, 14);
		Registrar.add(lblPass2);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(252, 207, 180, 20);
		Registrar.add(passwordField2);
		
		lblMail = new JLabel("Mail");
		lblMail.setForeground(new Color(105, 105, 105));
		lblMail.setBounds(146, 256, 46, 14);
		Registrar.add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setBounds(252, 253, 180, 20);
		Registrar.add(txtMail);
		txtMail.setColumns(10);
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.addActionListener(new ActionListener() {//BOTON DE REGISTRAR
			public void actionPerformed(ActionEvent e) {
				String nick=txtFldNick.getText();
				String psswrd=passwordField_1.getText();
				String psswrd2=passwordField2.getText();
				String mail2=txtMail.getText();	
				Usuario usu=new Usuario(nick,psswrd,mail2);
				Base.abrir();
				int id=bbdd.BBDDUsuario.consultarUsuario(usu, Base);
				Base.cerrar();
				if (id>=1){
					lblExiste.setVisible(true);
					lblDiferentes.setVisible(false);
					mailIncorrecto.setVisible(false);
					lblValido.setVisible(false);
					lblLong.setVisible(false);
					lblCorrecto.setVisible(false);
					lblError.setVisible(false);
				}
				else{
					if(!psswrd.equals(psswrd2)){
						lblExiste.setVisible(false);
						lblDiferentes.setVisible(true);
						mailIncorrecto.setVisible(false);
						lblValido.setVisible(false);
						lblLong.setVisible(false);
						lblCorrecto.setVisible(false);
						lblError.setVisible(false);
					}
					else{
						int respuesta=validacion(psswrd);
						switch(respuesta){
						case 0:
							lblExiste.setVisible(false);
							lblDiferentes.setVisible(false);
							mailIncorrecto.setVisible(false);
							lblValido.setVisible(false);
							lblLong.setVisible(true);
							lblCorrecto.setVisible(false);
							lblError.setVisible(false);
							break;
						case -1:
							lblExiste.setVisible(false);
							lblDiferentes.setVisible(false);
							mailIncorrecto.setVisible(false);
							lblValido.setVisible(false);
							lblLong.setVisible(false);
							lblCorrecto.setVisible(false);
							lblError.setVisible(true);
							break;
						case 1:
							boolean emailRep=validarEmail(mail2);
							if(emailRep==false){
								lblExiste.setVisible(false);
								lblDiferentes.setVisible(false);
								mailIncorrecto.setVisible(true);
								lblValido.setVisible(false);
								lblLong.setVisible(false);
								lblCorrecto.setVisible(false);
								lblError.setVisible(false);
							}
							else{
								Base.abrir();
								bbdd.BBDDUsuario.nuevoUsuario(usu, Base);
								Base.cerrar();
								lblExiste.setVisible(false);
								lblDiferentes.setVisible(false);
								mailIncorrecto.setVisible(false);
								lblValido.setVisible(true);
								lblLong.setVisible(false);
								lblCorrecto.setVisible(false);
								lblError.setVisible(false);
								break;
							}
						}
						
						
					}
					
				}
			}
		});
		
		btnRegistrarse.setBounds(146, 409, 145, 39);
		Registrar.add(btnRegistrarse);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(521, 409, 132, 39);
		Registrar.add(btnCancelar);
		
		lblValido = new JLabel("V\u00C1LIDO");
		lblValido.setForeground(Color.GREEN);
		lblValido.setBounds(386, 429, 46, 14);
		Registrar.add(lblValido);
		
		lblError = new JLabel("La contrase\u00F1a debe tener al menos 3 de los 4 tipos(caracter,minuscula,mayuscula o numero)");
		lblError.setForeground(Color.RED);
		lblError.setBounds(146, 349, 507, 14);
		Registrar.add(lblError);
		
		lblExiste = new JLabel("EL nick o el mail existen");
		lblExiste.setForeground(Color.RED);
		lblExiste.setBounds(261, 324, 267, 14);
		Registrar.add(lblExiste);
		
		lblLong = new JLabel("LONGITUD");
		lblLong.setForeground(Color.RED);
		lblLong.setBounds(521, 159, 62, 14);
		Registrar.add(lblLong);
		
		lblCorrecto = new JLabel("CORRECTO");
		lblCorrecto.setForeground(Color.GREEN);
		lblCorrecto.setBounds(515, 162, 68, 14);
		Registrar.add(lblCorrecto);
		
		lblDiferentes = new JLabel("DIFERENTES");
		lblDiferentes.setForeground(Color.RED);
		lblDiferentes.setBounds(521, 207, 62, 14);
		Registrar.add(lblDiferentes);
		
		mailIncorrecto = new JLabel("INCORRECTO");
		mailIncorrecto.setForeground(Color.RED);
		mailIncorrecto.setBounds(521, 256, 68, 14);
		Registrar.add(mailIncorrecto);
		
		lblExiste.setVisible(false);
		lblDiferentes.setVisible(false);
		mailIncorrecto.setVisible(false);
		lblValido.setVisible(false);
		lblLong.setVisible(false);
		lblCorrecto.setVisible(false);
		lblError.setVisible(false);
		
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
				primerocompra.setVisible(false);
				repe.setVisible(false);
				Base.abrir();
				idlibro=bbdd.librosbbdd.buscarly(busly.getText(),Base);
				Base.cerrar();
				if(idlibro==0){
					error.setVisible(true);
				}
				else{
					error.setVisible(false);
					if(solover || idAdmin==0){
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
					
					comentarios.setText(bbdd.librosbbdd.comly(idlibro, Base));
					Base.cerrar();
					}
					else{
					  if(solomod){
					  Base.abrir();
					libros ly=bbdd.librosbbdd.libroly(idlibro,Base);
					Base.cerrar();
					modti.setText(null);
					modau.setText(null);
					modge.setText(null);
					modsin.setText(null);
					modpre.setText(null);
					moddesc.setText(null);
					
					modti.setText(ly.getTitulo());
					modau.setText(ly.getAutor());
					modge.setText(ly.getGenero());
					modsin.setText("\n"+ly.getSinopsis());
					modpre.setText(String.valueOf(ly.getPrecio()));
					idly.setText("Id: "+idlibro);
						modly.setVisible(true);
						benef.setText("Recaudado: "+ly.getBeneficios()+"€");
						
						}
					
					
						
						
						
						
						
					}
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
		
		verlyscroll = new JScrollPane();
		verlyscroll.setViewportBorder(new LineBorder(Color.LIGHT_GRAY));
		verlyscroll.setBounds(35, 32, 733, 340);
		ver.add(verlyscroll);
		
		verly = new JTextArea();
		verly.setFont(new Font("Rockwell", Font.PLAIN, 18));
		verly.setBackground(new Color(240, 240, 240));
		verly.setEditable(false);
		verly.setBounds(35,32, 733, 340);
		verlyscroll.setViewportView(verly);
		error.setVisible(false);
		
		veradmin = new JPanel();
		veradmin.setBackground(new Color(250,250,250));
		veradmin.setBounds(0, 0, 778, 538);
		contenido.add(veradmin);
		veradmin.setLayout(null);
		veradmin.setVisible(false);
		
		controladscroll = new JScrollPane();
		controladscroll.setBounds(50, 27, 681, 477);
		veradmin.add(controladscroll);
		
		controlad = new JTextArea();
		controlad.setBounds(50, 27, 681, 477);
		controladscroll.add(controlad);
		
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
		
		/*JScrollPane scrollPane = new JScrollPane(verly);
		scrollPane.setBounds(100,75, 698, 340);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
		frame.getContentPane().add(scrollPane);*/
		
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
	private static int validacion(String pass){  
		char[] cadenaChars =pass.toCharArray();
		
		int minus=0;
		int may=0;
		int esp=0;
		int num=0;
		int sum=0;
		if(pass.length()<8)
			return 0;
		else{
	        for (int i=0; i<cadenaChars.length;i++){
	        	if (Character.isDigit(cadenaChars[i]))//es digito
	        		num=1;
	        	else{
		        	if (Character.isLetter(cadenaChars[i])){
		        		if(Character.isLowerCase(cadenaChars[i]))
		        			minus=1;
		        		else
		        			may=1;
		        	}
		        	else{
		        		esp=1;
		        	}
	        	}	
	        }
	        sum=num+minus+may+esp;
	        if(sum>=3)
	        	return 1;
	        else
	        	return -1;
		}
	}
	public static boolean validarEmail(String mail) {
		char arroba='@';
		int cont=0;
		if(mail.length()<6)
		return false;
		else{
			if(!mail.endsWith(".com"))
				return false;
			else{
				char [] email=mail.toCharArray();
				for(int i=0; i<email.length;i++){
					if(email[i]==arroba){
						cont++;
					}
				 }
				if(cont==1)
					return true;
				else
					return false;
			}
		}
			
 
    }
}

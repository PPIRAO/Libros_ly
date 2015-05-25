package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copiaseguridad {

	private JFrame frame;
	private JTextField ruta;
	private JLabel lblCopiado;
	private JLabel lblError;
	private JButton btnVolver;
	private JButton btnNewButton;
	private JLabel lblRuta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					copiaseguridad window = new copiaseguridad();
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
	public copiaseguridad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblRuta = new JLabel("Ruta:");
		lblRuta.setBounds(56, 63, 70, 29);
		frame.getContentPane().add(lblRuta);
		
		ruta = new JTextField();
		ruta.setBounds(100, 63, 455, 29);
		frame.getContentPane().add(ruta);
		ruta.setColumns(10);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 File directorio=new File(ruta.getText());
	                
	                if(directorio.isDirectory()){
	                	  File destino=new File(directorio, "Copia Libros ly");
	                    FileInputStream registro2;
	                    FileOutputStream copiar;
	                    File registro=new File("..'\'Libros_ly");
	                    int d;
	                    byte datos[]=new byte[100];
	                    try{
	                         
	                     registro2=new FileInputStream(registro );
	                    
	                     copiar=new FileOutputStream(destino);
	                      
	                     while((d=registro2.read(datos))!=-1){
	                         copiar.write(datos,0,d);
	                         d=registro2.read();
	                          
	                          
	                     }
	                     lblError.setVisible(false);
	                     lblCopiado.setVisible(true);
	                    }catch(Exception es){
	                    	lblError.setVisible(true);
		                     lblCopiado.setVisible(false);
	                    }
	                }
	                else{
	                	lblError.setVisible(true);
	                     lblCopiado.setVisible(false);}
				
				
			}
			}
		);
		btnNewButton.setBounds(146, 154, 140, 40);
		frame.getContentPane().add(btnNewButton);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setBounds(364, 154, 140, 40);
		frame.getContentPane().add(btnVolver);
		
		lblCopiado = new JLabel("Copiado");
		lblCopiado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCopiado.setForeground(new Color(50, 205, 50));
		lblCopiado.setBounds(264, 103, 112, 21);
		frame.getContentPane().add(lblCopiado);
		lblCopiado.setVisible(false);
		
		lblError = new JLabel("Error");
		lblError.setForeground(new Color(255, 0, 0));
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblError.setBounds(264, 103, 112, 21);
		frame.getContentPane().add(lblError);
		lblError.setVisible(false);
		}
}

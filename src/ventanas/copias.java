package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copias extends JFrame {

	private JPanel contentPane;
	private JTextField ruta;
	private JLabel lblCopiado;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					copias frame = new copias();
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
	public copias() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 562, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ruta = new JTextField();
		ruta.setBounds(109, 40, 395, 41);
		contentPane.add(ruta);
		ruta.setColumns(10);
		
		JLabel lblRuta = new JLabel("Ruta:");
		lblRuta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta.setBounds(34, 38, 105, 41);
		contentPane.add(lblRuta);
		
		JButton btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File directorio=new File(ruta.getText());
                
                if(directorio.isDirectory()){
                	  File destino=new File(directorio, "Copia Libros ly");
                    FileInputStream registro2;
                    FileOutputStream copiar;
                    File registro=new File("Libros_ly.sql");
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
				
			
		});
		btnNewButton.setBounds(218, 137, 164, 46);
		contentPane.add(btnNewButton);
		
		lblError = new JLabel("Error");
		lblError.setForeground(Color.RED);
		lblError.setBounds(229, 92, 105, 20);
		contentPane.add(lblError);
		lblError.setVisible(false);
		
		lblCopiado = new JLabel("Copiado");
		lblCopiado.setForeground(Color.GREEN);
		lblCopiado.setBounds(229, 92, 105, 20);
		contentPane.add(lblCopiado);
		lblCopiado.setVisible(false);
	}
}

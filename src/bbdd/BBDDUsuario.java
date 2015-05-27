package bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ventanas.menu;//prueba
import usuario.Usuario;


public class BBDDUsuario {
	
	private static Statement s;
	private static Connection c;
	private static ResultSet registros;
	
	
	public static void nuevoUsuario(Usuario usu, basedatos bd){
		
		String cadena="INSERT INTO cliente(nik,Contraseña,mail) VALUES('" + usu.getNick() + "','" + usu.getPsswrd()+"','" + usu.getMail()+"')"; 
		try{
		c=bd.getConexion();
		s=c.createStatement();
		s.executeUpdate(cadena);
		s.close();
		}
		catch ( SQLException e){
		System.out.println(e.getMessage());
		}
	}
	
	public static int consultarUsuario(Usuario usu,basedatos bd){
		String cadena="SELECT idCliente FROM cliente WHERE nik='"+usu.getNick()+"' or mail='" + usu.getMail()+"' ";
		try{
			int id=0;
			c=bd.getConexion();	
			s=c.createStatement();
			registros=s.executeQuery(cadena);
			if(registros.next()){
			
				id=registros.getInt(1);
				
			}
			
			s.close();
			return id;
		}
		catch ( SQLException e){
			return -1;
//			System.out.println(e.getMessage());
			
		}
				
		

	}
	public static int LoginCliente(Usuario usu,basedatos bd){
		String cadena2="SELECT idCliente FROM cliente where mail='"+usu.getMail()+"'and Contraseña='"+usu.getPsswrd()+"' ";
		try{
			int id=0;
			c=bd.getConexion();	
			s=c.createStatement();
			registros=s.executeQuery(cadena2);
			if(registros.next()){
			
				id=registros.getInt(1);
				
			}
			
			s.close();
			return id;
		}
		catch ( SQLException e){
			return -1;
//			System.out.println(e.getMessage());
			
		}
	}
	
	public static int LoginAdmin(Usuario usu,basedatos bd){
		String cadena2="SELECT idAdministrador FROM administrador where mail='"+usu.getMail()+"'and contraseña='"+usu.getPsswrd()+"' ";
		try{
			int id2=0;
			c=bd.getConexion();	
			s=c.createStatement();
			registros=s.executeQuery(cadena2);
			if(registros.next()){
			
				id2=registros.getInt(1);
				
			}
			
			s.close();
			return id2;
		}
		catch ( SQLException e){
			return -1;
//			System.out.println(e.getMessage());
			
		}
	}
	
	public static boolean CambiarContra(Usuario usu,int idUsuario,basedatos bd){
		
		String cadena1="SELECT idCliente FROM cliente WHERE Contraseña='" +usu.getOldpsswrd()+"' and idCliente="+idUsuario;
		String cadena2="UPDATE cliente SET Contraseña='"+usu.getNewpsswrd()+"' where idCliente ="+idUsuario;
		try{
			c=bd.getConexion();	
			s=c.createStatement();
			registros=s.executeQuery(cadena1);
			if(registros.next()){	
				s=c.createStatement();
				s.executeUpdate(cadena2);
				s.close();
			}
			else{
				s.close();
				return false;
			}
		}catch ( SQLException e){
			System.out.println(e);
				return false;
			}
		return true;
	}
			
		

	}



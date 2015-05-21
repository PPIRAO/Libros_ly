package bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.basedatos;
import libros.Administrador;

public class BBDDadmin {
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;

	public static void añadir(Administrador ct, basedatos bd)
	{
		String cadena = "INSERT INTO administrador (idAdmin, mail, fecha_ingreso, contrasena) VALUES (" + ct.getIdAdmin()+",'"+ct.getMail()+"',CURDATE() ,'"+ct.getContrasena()+"')";
		
		try{
			c=bd.getConexion();
			s=c.createStatement();
			s.executeUpdate(cadena);
			s.close();
		}
		catch( SQLException e){
			System.out.println(e.getMessage());
			
		}
	}
		
		public static boolean logearcomentarios(String texto, String pass , basedatos bd)
		{
			String cadena = "SELECT texto FROM comentarios WHERE mail = '" + texto + "' AND contrasena = '" + pass + "'" ;
			
			try{
				c=bd.getConexion();	
				s=c.createStatement();
				reg=s.executeQuery(cadena);
				if ( reg.next()){
					s.close();
					return true;
				}
				s.close();
			}
			catch( SQLException e){
				System.out.println(e.getMessage());
			}
			return false;
		}
		
		public static void borrarAdmin(String email, basedatos bd)
		{
			String cadena = "DELETE FROM administrador WHERE mail = '"+email+"'";
			try{
				c=bd.getConexion();
				s=c.createStatement();
				s.executeUpdate(cadena);
				s.close();
			}
			catch( SQLException e){
				System.out.println(e.getMessage());
			}
		}
	

}




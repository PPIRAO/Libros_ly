package libros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.basedatos;

public class librosbbdd {
	
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;
	
	public static void crearUsuario( libros ly, basedatos bd){
		String cadena="INSERT INTO libro VALUES('" +ly.getTitulo() + "','" +ly.getSinopsis()+"',"+ ly.getAutor() +"'," +ly.getGenero()+"'," +ly.getPrecio()+")"; 	
		
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
	
	public static void puntuar(int idlibro, int num, int idusu, basedatos bd){
		
		String cadena="update compra set puntuacion="+num+" where idusuario='"+idusu+"' and idlibro='"+idlibro+"')"; 	
		String cadena2="update libro set puntuacion=(select avg(puntuacion) from compra where idlibro="+idlibro+") where idlibro="+idlibro+")";
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		s.executeUpdate(cadena);
		s.executeUpdate(cadena2);
		s.close();
		}
		catch ( SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	
}

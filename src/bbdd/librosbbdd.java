package bbdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import libros.libros;

public class librosbbdd {
	
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;
	
	
	public static boolean añadirLibro( libros ly, basedatos bd){
		
		String cadena2="Select titulo from libro where titulo='"+ly.getTitulo()+"'";
		String cadena="INSERT INTO libro VALUES('" +ly.getTitulo() + "','" +ly.getSinopsis()+"',"+ ly.getAutor() +"'," +ly.getGenero()+"'," +ly.getPrecio()+")"; 	
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		int ver=s.executeUpdate(cadena2);
		if(ver<1)
		
		s.executeUpdate(cadena);
		else{
			s.close();
			return false;
		}
		s.close();
		
		}
		catch ( SQLException e){
			return false;
		}
		return true;
		
	}
	
	public static boolean puntuar(int idlibro, int num, int idusu, basedatos bd){
		
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
			return false;
		}
		return true;
	}
	
public static int buscarly( String nom, basedatos bd){
		
		String cadena2="Select idLibro from libro where titulo='"+nom+"'";
		int id=0;
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		s.executeUpdate(cadena2);
		s.close();
		while( reg.next()){
			id=Integer.parseInt(reg.getString(1));
			s.close();
			return id;
		}
		
		}
		catch ( SQLException e){
			return 0;
		}
		return 0;
		
	}

public static void mostrarly( int id, basedatos bd){
	
	String cadena2="Select titulo, sinopsis, genero, autor from libro where idlibro="+id+"";
	String cadena="Select avg(puntuacion) from compras where idlibro="+id+"";
	String cadena3="Select texto, nik from comentarios c, usuarios u where u.idCliente=c.idCliente and idlibro="+id;
	
	try{
	c=bd.getConexion();
	s=c.createStatement();
	s.executeUpdate(cadena2);
	
	s.executeUpdate(cadena);
	s.executeUpdate(cadena3);
	s.close();
	while( reg.next()){
		
		
		s.close();
	}
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	
}
}
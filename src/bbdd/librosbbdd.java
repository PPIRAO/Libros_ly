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
		reg=s.executeQuery(cadena2);
		
		if( reg.next()){
			id=Integer.parseInt(reg.getString(1));
			s.close();
			return id;
		}
		s.close();
		}
		catch ( SQLException e){
			return 0;
		}
		
		return 0;
		
	}

public static libros libroly( int idly, basedatos bd){
	libros ly1 = null;
	String cadena="Select idLibro,titulo,sinopsis,genero,precio,autor,puntuacion from libro where idLibro="+idly;
	
	
	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	if( reg.next()){
		int id=Integer.parseInt(reg.getString(1));
		String tit=reg.getString(2);
		String sin=reg.getString(3);
		String gen=reg.getString(4);
		double pre=Double.parseDouble(reg.getString(5));
		String aut=reg.getString(6);
		String puntuacion=reg.getString(7);
		ly1=new libros(tit,sin,gen,pre,aut);
		ly1.setIdlibro(id);
		ly1.setPuntuacion(puntuacion);
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ly1;
	
	
}

public static String comly( int id, basedatos bd){
	
	
	
	String cadena="Select nik,texto from comentar c, Cliente u where u.idCliente=c.idCliente and idlibro="+id;
	String comentarios="";
	int i=1;
	try{
	c=bd.getConexion();
	s=c.createStatement();
	
	s.executeQuery(cadena);
	s.close();
	while( reg.next()){
		comentarios=comentarios+reg.getString(i)+"\n";
		i++;
		comentarios=comentarios+reg.getString(i)+"\n-------------------------------------------------\n";
		i++;
	}

	s.close();
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return comentarios;
}
public static double punly(int id, basedatos bd){// de momento no sirve
	String cadena="Select avg(puntuacion) from compras where idlibro="+id+"";
	
	double pun=0;

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	if( reg.next()){
		pun=Integer.parseInt(reg.getString(1));
		
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return pun;
}

public static String todosly( basedatos bd){
	String cadena="Select titulo,autor,genero from libro";
	String ver="";
	int i=1;

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	if( reg.next()){
		
		ver=ver+reg.getString(i)+"\n";
		i++;
		ver=ver+"Autor: "+reg.getString(i)+"\n";
		i++;
		ver=ver+"Genero: "+reg.getString(i)+"\n-------------------------------------------------------\n";
		i++;
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}

public static String valoradosly( basedatos bd){
	String cadena="Select titulo,autor from libro, compras where ";
	String ver="";
	int i=1;

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	while( reg.next()){
		ver=reg.getString(i)+"\n";
		i++;
		ver=reg.getString(i)+"\n-------------------------------------------------------\n";
		
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}

}
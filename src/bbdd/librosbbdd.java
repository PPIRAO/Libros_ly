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
	
	
	public static boolean añadirLibro( libros ly,int idadmin, String desc, basedatos bd){
		int idLibro=0;
		String cadena2="Select titulo from libro where titulo='"+ly.getTitulo()+"'";
		String cadena="INSERT INTO libro (titulo,Sinopsis,Autor,genero,precio) VALUES('" +ly.getTitulo() + "','" +ly.getSinopsis()+"','"+ ly.getAutor() +"','" +ly.getGenero()+"'," +ly.getPrecio()+")"; 	
		
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		reg=s.executeQuery(cadena2);
		if(reg.next()){
			s.close();
			return false;
		
		}
		else{
			s=c.createStatement();
			s.executeUpdate(cadena);
			s=c.createStatement();
			String cadena4="Select idLibro from libro where titulo='"+ly.getTitulo()+"'";
			reg=s.executeQuery(cadena4);
			if(reg.next()){
				idLibro=Integer.parseInt(reg.getString("idLibro"));
				s=c.createStatement();
				String cadena3="insert into modificar(descripcion,Administrador_idAdministrador,idLibro) values('"+desc+"',"+idadmin+","+idLibro+")";
			s.executeUpdate(cadena3);
			}
		}
		s.close();
		
		}
		catch ( SQLException e){
			System.out.println(e);
			return false;
		}
		return true;
		
	}
	
	public static boolean puntuar(int idlibro, double num, int idusu, basedatos bd){
		
		String cadena="update compra set puntuacion="+num+" where idusuario='"+idusu+"' and idlibro='"+idlibro+"'"; 	
		String cadena2="update libro set puntuacion=(select avg(puntuacion) from compra where idlibro="+idlibro+" and puntuacion is not null) where idlibro="+idlibro;
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		int ver=s.executeUpdate(cadena);
		if(ver==0)return false;

		s=c.createStatement();
		s.executeUpdate(cadena2);
		s.close();
		}
		catch ( SQLException e){
			System.out.println(e);
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
			System.out.println(e);
			return 0;
		}
		
		return 0;
		
	}

public static libros libroly( int idly, basedatos bd){
	libros ly1 = null;
	String cadena="Select idLibro,titulo,sinopsis,genero,precio,autor,puntuacion,beneficios from libro where idLibro="+idly;
	
	
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
		String beneficios=reg.getString(8);
		ly1=new libros(tit,sin,gen,pre,aut);
		ly1.setIdlibro(id);
		ly1.setPuntuacion(puntuacion);
		ly1.setBeneficios(beneficios);
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ly1;
	
	
}

public static String comly( int id, basedatos bd){
	
	
	
	String cadena="Select nik,texto from comentar c, cliente u where u.idCliente=c.idCliente and idLibro="+id+" order by fecha desc";
	String comentarios="";
	
	try{
	c=bd.getConexion();
	s=c.createStatement();
	
	reg=s.executeQuery(cadena);
	
	while( reg.next()){
		comentarios=comentarios+" "+reg.getString("nik")+"\n";
		
		comentarios=comentarios+" "+reg.getString("texto")+"\n________________________________________________________________________\n";
		
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
	String cadena="Select titulo,autor,genero from libro order by titulo";
	String ver="";

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	while( reg.next()){
		ver=ver+" "+reg.getString("titulo")+"\n";
		ver=ver+" Autor: "+reg.getString("autor")+"\n";
		
		ver=ver+" Genero: "+reg.getString("genero")+"\n\n";
		
		
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}

public static String valoradosly( basedatos bd){
	String cadena="Select titulo,autor,genero,puntuacion from libro order by puntuacion desc ";
	String ver="";
	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	
		for(int c=0;c<10;c++){
			if( reg.next()){
				
		ver=ver+" "+reg.getString("titulo")+"\n";
		ver=ver+" Autor: "+reg.getString("autor")+"\n";
		
		ver=ver+" Genero: "+reg.getString("genero")+"\n";
		ver=ver+" Puntuación: "+reg.getString("puntuacion")+"\n\n";
		}
		
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}
public static String compradosly( basedatos bd){
	String cadena="Select c.idLibro, titulo, autor, genero, count(*) from compra c, libro l where c.idLibro=l.idLibro group by c.idLibro, titulo, autor, genero order by count(*) desc";
	String ver="";
	

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
	
		for(int c=0;c<10;c++){
			if( reg.next()){
		ver=ver+" "+reg.getString("titulo")+"\n";
		ver=ver+" Autor: "+reg.getString("autor")+"\n";
		
		ver=ver+" Genero: "+reg.getString("genero")+"\n";
		ver=ver+" Comprado: "+reg.getString("count(*)")+"\n\n";
		}
		
		
	}
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}
public static String usuly(int id, basedatos bd){
	String cadena="Select  titulo, autor, genero  from libro l, compra c where l.idLibro=c.idlibro and idusuario="+id;
	String ver="";
	

	try{
	c=bd.getConexion();
	s=c.createStatement();
	reg=s.executeQuery(cadena);
	
			while( reg.next()){
		ver=ver+" "+reg.getString("titulo")+"\n";
		ver=ver+" Autor: "+reg.getString("autor")+"\n";
		
		ver=ver+" Genero: "+reg.getString("genero")+"\n\n";
		}
		
		
	
	
	s.close();
	
	}
	catch ( SQLException e){
		System.out.println(e);
	}
	return ver;
}
public static boolean modly(libros ly, int idadmin, int idLibro, String desc, basedatos bd){

String cadena="update libro set titulo='" +ly.getTitulo() + "', sinopsis='" +ly.getSinopsis()+"', autor='"+ ly.getAutor() +"', genero='" +ly.getGenero()+"', precio=" +ly.getPrecio()+" where"
		+ " idLibro="+idLibro; 	

String cadena3="insert into modificar (descripcion,Administrador_idAdministrador,idLibro) values('"+desc+"',"+idadmin+","+idLibro+")";
try{
c=bd.getConexion();
s=c.createStatement();

s.executeUpdate(cadena);
s=c.createStatement();
s.executeUpdate(cadena3);


s.close();

}
catch ( SQLException e){
	System.out.println(e);
	return false;
}
return true;

}


	public static boolean comprobarcompra(int idLibro, int idUsuario, basedatos bd){
		//Este metodo nos sirve para verficar que un usuario ha comprado el libro para no poder comprarlo, descargarlo o valorarlo si lo ha comprado en los ultimos casos
	
	String cadena="Select * from compra where idlibro="+idLibro+" and idusuario="+idUsuario;
	
	
	try{
	c=bd.getConexion();
	s=c.createStatement();
	
	reg=s.executeQuery(cadena);
	if(reg.next()){
		s.close();
		return true;
	}
	else{ 
		s.close();
		return false;
	}
	
	
	
	}
	catch ( SQLException e){
		System.out.println(e);
		return false;
	}
	
	}
	public static String historialadmin( basedatos bd){
		String cadena="Select fecha,mail,titulo,descripcion from modificar m, libro l, administrador a where m.Administrador_idAdministrador=a.idAdministrador and l.idLibro=m.idLibro order by fecha desc";
		String ver="";
		

		try{
		c=bd.getConexion();
		s=c.createStatement();
		reg=s.executeQuery(cadena);
		
				while( reg.next()){
			ver=ver+" Fecha: "+reg.getString("fecha")+"\n";
			ver=ver+" "+reg.getString("mail")+"\n";
			ver=ver+" Titulo: "+reg.getString("titulo")+"\n";
			ver=ver+" Descripcion:\n "+reg.getString("descripcion")+"\n\n";
			}
			
			
		
		
		s.close();
		
		}
		catch ( SQLException e){
			System.out.println(e);
		}
		return ver;
	}
	}



















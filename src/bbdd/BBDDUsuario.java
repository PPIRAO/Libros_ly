package bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import libros.tarjetaLY;
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
			
	public static boolean borrar(String nick, basedatos bd){
		String cadena="DELETE FROM cliente WHERE nik ='" + nick + "'";	
		
		try{
		c=bd.getConexion();	
		s=c.createStatement();
		int resul=s.executeUpdate(cadena);//devuelve uno si encuentra y 0 si no.
		if (resul==0)
			return false;
		else
			s.close();
			return true;
		
		}
		catch ( SQLException e){
			System.out.println(e.getMessage());
			return false;
		}
	}	
	public static int consultarTotal(String mail,String contra,basedatos bd){
		String cadena="SELECT idCliente FROM cliente WHERE mail='"+mail+"' and Contraseña='" +contra+"' ";
		String cadena2="SELECT idAdministrador FROM administrador WHERE mail='"+mail+"' and contraseña='" +contra+"' ";
		try{
			int id=0;
			c=bd.getConexion();	
			s=c.createStatement();
			registros=s.executeQuery(cadena);
				if(registros.next()){
					id=registros.getInt(1);
				}
				else{
					s=c.createStatement();
					registros=s.executeQuery(cadena2);
					if(registros.next()){
						id=registros.getInt(1);
					}
					else
						return 0;
					
				}
				
				s.close();
				return id;
			}
		catch ( SQLException e){
			
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
public static void nuevoAdmin(String mail,String contra, basedatos bd){
		
		String cadena="INSERT INTO administrador(mail,contraseña) VALUES('" + mail + "','" + contra +"')"; 
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
/*
*miraremos el precio en la base de datos
*/
public static double verPrecio(double precioTar, basedatos bd, int id, int usu ){
	
	String cadena2 = "select precio_sin_descuento from compra where idlibro=" +id+" and idusuario="+usu;
	try {
		c = bd.getConexion();
		s = c.createStatement();
		registros = s.executeQuery(cadena2);
		registros.next();
		 return registros.getDouble("precio_sin_descuento");
		
	} catch (SQLException e) {
		System.out.println(e);
		return -2;
	}
	
}
/*
*Miraremos en la base de datos la hora de la compra
*/
public static String verHora(String horaTar, basedatos bd, int id, int usu){
	
	String cadena2 = "select fecha from compra where idlibro=" +id+" and idusuario="+usu;
	try {
		c = bd.getConexion();
		s = c.createStatement();
		registros = s.executeQuery(cadena2);
		registros.next();
		 return registros.getString("fecha");
		
	} catch (SQLException e) {
		System.out.println(e);
		return "error";
	}
	
	
}
/*
*Miraremos si el ususario es premium para aplicar el descuento
*/
public static boolean isPremiun(int usu ,basedatos bd){
	String cadena2 = "select premium from cliente where idCliente=" + usu;
	try {
		c = bd.getConexion();
		s = c.createStatement();
		registros = s.executeQuery(cadena2);
		registros.next();
		 return registros.getBoolean("premium");
		
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
	
}
/*
*Se realizara la compra y se agregaran los campos pertinentes a las tablas
*/
public static boolean compra(tarjetaLY ly, basedatos bd, int id, int usu) {

	double descuento = 0;
	String cadena2 = "select premium from cliente where idCliente=" + usu;
	// + ly.getIdUsuario();

	try {
		c = bd.getConexion();
		s = c.createStatement();
		registros = s.executeQuery(cadena2);
		registros.next();
		if (registros.getBoolean("premium") == true)
			descuento = 10;

		cadena2 = "select * from libro where idlibro="
				+ /* ly.getIdLibro(); */id;
		s.close();
		s = c.createStatement();
		registros = s.executeQuery(cadena2);
		registros.next();

		String cadena = "INSERT INTO compra( idusuario, idlibro,  precio_sin_descuento, descuento, numero_tarjeta, dni)"
				+ "VALUES("
				+ /*ly.getIdUsuario()*/usu
				+ ","
				+ ly.getIdLibro()
				+ ","
				+ /* l.getPrecio() */registros.getDouble("precio")
				+ ","
				+ 10
				+ ",'"
				+ ly.getNumero_Tar()
				+ "','"
				+ ly.getDni()
			

				+ "')";
		s.close();
		s = c.createStatement();
		s.executeUpdate(cadena);
		
		String cadena3;

		cadena3 = "UPDATE libro set beneficios= benficios"
				+ 0.9
				* /* l.getPrecio() */registros
						.getDouble("precio_sin_descuento");
		
		//Te falta poner en que libro le metes los beneficios, where idLibro=ly.getIdLibro

		s.executeUpdate(cadena3);
			
		
		s.close();
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}

	return false;

}
public static void hacerpremium(int usu ,basedatos bd){
	String cadena = "update cliente set premium=1 where idCliente=" + usu;
	try {
		c = bd.getConexion();
		s = c.createStatement();
		 s.executeUpdate(cadena);
		
	} catch (SQLException e) {
		System.out.println(e);
	}
	
}



}



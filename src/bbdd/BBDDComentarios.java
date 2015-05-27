package bbdd;


import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bbdd.basedatos;
import libros.Comentarios;


public class BBDDComentarios {
	
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;
	
	public static void añadir(Comentarios ct, basedatos bd)	
	{
		String cadena = "INSERT INTO comentar (idLibro, texto, idCliente) VALUES (" + ct.getIdLibro()+", '"+ct.getTexto()+"','"+ct.getIdCliente()+"')";

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
		
		public static boolean borrarComentarios(String Cliente, String Libro, basedatos bd)
		{
			String selectidLibro = "SELECT idLibro from libro WHERE titulo = '" + Libro + "'";
			
			
			try{
				c=bd.getConexion();
				s=c.createStatement();
				reg=s.executeQuery(selectidLibro);
				if(reg.next()){
					s=c.createStatement();
					String selectidCliente = "SELECT idCliente from cliente WHERE nik = '" + Cliente + "'";
					reg=s.executeQuery(selectidCliente);
					if(reg.next()){
						String cadena = "Update comentar set texto='Mensaje borrado' WHERE idLibro = (" + selectidLibro + ") and idCliente = (" +selectidCliente +")";
						s=c.createStatement();
						s.executeUpdate(cadena);
					}else
						return false;
				}else
					return false;
					
				s.close();
			}
			catch( SQLException e){
				System.out.println(e.getMessage());
				return false;
			}
			return true;
		}
		
	public static List<Comentarios> getComentariosLibro (int idLibro, basedatos bd)
	{
		List<Comentarios> comentarios = new ArrayList<Comentarios>();
		
		String cadena = "SELECT * FROM comentar WHERE idLibro = " + idLibro;
		try{
			c=bd.getConexion();	
			s=c.createStatement();
			reg=s.executeQuery(cadena);
			while (reg.next())
			{
				String texto = reg.getString("texto");
				Date fecha = reg.getDate("fecha");
				int idCliente = reg.getInt("idCliente");
				comentarios.add(new Comentarios(texto, idLibro, idCliente));
			}
			s.close();
		}
		catch( SQLException e){
			System.out.println(e.getMessage());
		}
		
		return comentarios;
	}

	

}

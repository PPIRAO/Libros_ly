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
		String cadena = "INSERT INTO comentar (idLibro, texto, fecha, Cliente_idCliente) VALUES (" + ct.getIdLibro()+", '"+ct.getTexto()+"',CURDATE() ,'"+ct.getIdCliente()+"')";

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
		
		public static void borrarComentarios(int idCliente, int idLibro, basedatos bd)
		{
			String cadena = "DELETE FROM comentar WHERE idLibro = " + idLibro + " and Cliente_idCliente = " + idCliente;
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
				int idCliente = reg.getInt("Cliente_idCliente");
				comentarios.add(new Comentarios(fecha, texto, idLibro, idCliente));
			}
			s.close();
		}
		catch( SQLException e){
			System.out.println(e.getMessage());
		}
		
		return comentarios;
	}

	

}

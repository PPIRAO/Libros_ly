package libros;

import java.sql.Date;
public class Administrador {
	
	private int idAdmin;
	private String mail;
	private String contrasena;
	private Date fecha_ingreso;
	
	public Administrador(int id, String email, String pass, Date fechaIngreso) {
		idAdmin=id;
		mail=email;
		contrasena=pass;
		fecha_ingreso=fechaIngreso;	

}
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	
}


package libros;

public class tarjetaLY {

	


String numero_Tar;
String Dni;
String idCompra;
String idUsuario;//luis


public tarjetaLY(String numero_Tar, String dni, String idCompra,
		String idUsuario) {
	super();
	this.numero_Tar = numero_Tar;
	Dni = dni;
	this.idCompra = idCompra;
	this.idUsuario = idUsuario;
}
public String getNumero_Tar() {
	return numero_Tar;
}
public void setNumero_Tar(String numero_Tar) {
	this.numero_Tar = numero_Tar;
}
public String getDni() {
	return Dni;
}
public void setDni(String dni) {
	Dni = dni;
}
public String getIdCompra() {
	return idCompra;
}
public void setIdCompra(String idCompra) {
	this.idCompra = idCompra;
}
public String getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(String idUsuario) {
	this.idUsuario = idUsuario;
}









}

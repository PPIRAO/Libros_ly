package libros;

public class tarjetaLY {

	


String numero_Tar;
String Dni;
int idLibro;
int idUsuario;//luis


public tarjetaLY(String numero_Tar, String dni, int idLibro,
		int idUsuario) {
	super();
	this.numero_Tar = numero_Tar;
	Dni = dni;
	this.idLibro=idLibro;
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

public int getIdLibro() {
	return idLibro;
}
public void setIdLibro(int idLibro) {
	this.idLibro = idLibro;
}
public int getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}









}

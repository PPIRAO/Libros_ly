package libros;

import java.sql.Date;
public class Comentarios {
	
	private int idLibro;
	private int idCliente;
	private String texto;
	
	public Comentarios(String texto, int idLibro, int idCliente) {
		this.setIdLibro(idLibro);
		this.setTexto(texto);
		this.setIdCliente(idCliente);

}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	


}

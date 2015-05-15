package libros;

public class libros {

	private String titulo;
	private String sinopsis;
	private String genero;
	private double precio;
	private String autor;
	
	public libros(String titulo, String sinopsis, String genero, double precio,
			String autor) {
		
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.precio = precio;
		this.autor = autor;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
	
	
}

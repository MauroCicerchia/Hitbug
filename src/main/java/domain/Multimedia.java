package domain;

public class Multimedia extends Contenido {

	private String descripcion;
	private String url;
	
	public Multimedia(String titulo, String descripcion, String url) {
		super(titulo);
		this.descripcion = descripcion;
		this.url = url;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

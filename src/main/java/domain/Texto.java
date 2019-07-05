package domain;

public class Texto extends Contenido {

	private String texto;
	
	public Texto(String titulo, String texto) {
		super(titulo);
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}

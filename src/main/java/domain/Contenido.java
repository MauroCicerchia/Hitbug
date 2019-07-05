package domain;

import java.util.Arrays;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Contenido {
	String titulo;
	
	public Contenido(String titulo) {
		this.titulo = titulo;
	}
	
	public List<Contenido> getContenido() {
		return Arrays.asList(this);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
}

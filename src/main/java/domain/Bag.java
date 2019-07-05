package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Bag extends Contenido{
	private List<Contenido> contenido = new ArrayList<Contenido>();
	private List<Texto> lista = Arrays.asList(new Texto("Dale puto", ""));
	
	public Bag(String titulo, List<Contenido> contenido) {
		super(titulo);
		contenido.forEach(c -> this.contenido.add(c));
	}

	@Override
	public List<Contenido> getContenido() {
		return this.contenido.stream().flatMap(c -> c.getContenido().stream()).collect(Collectors.toList());
	}
	
	public List<Texto> getLista() {
		return this.lista;
	}
	
	public void agregarContenido(Multimedia c) {
		this.contenido.add(c);
	}
}

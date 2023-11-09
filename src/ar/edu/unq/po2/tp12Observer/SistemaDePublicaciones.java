package ar.edu.unq.po2.tp12Observer;

import java.util.List;
import java.util.ArrayList;

public class SistemaDePublicaciones {

	private List<Persona> miembros;
	private List<Articulo> articulos;

	SistemaDePublicaciones() {
		this.setMiembros(new ArrayList<Persona>());
		this.setArticulos(new ArrayList<Articulo>());
	}

	private List<Persona> getMiembros() {
		return miembros;
	}

	private void setMiembros(List<Persona> miembros) {
		this.miembros = miembros;
	}

	private List<Articulo> getArticulos() {
		return articulos;
	}

	private void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	public void agregarMiembro(Persona miembro) {
		if(this.getArticulos().stream().anyMatch(m -> m.getTitulo().contains("Java") || m.getTitulo().contains("Smalltalks"))) {
			this.getMiembros().add(miembro);
			}
	}

	public void cargarArticulo(Articulo articulo) {
		this.getArticulos().add(articulo);
		this.notificar(articulo);
	}
	
	private void notificar(Articulo articulo) {
		if(articulo.getTitulo().contains("Smalltalks") ||
		   articulo.getTitulo().contains("Java")       ||
		   articulo.getLugarDePublicacion().contains("Quilmes")) {			
			this.getMiembros().stream().forEach(m -> m.mandarMail(articulo)); 
		}
	}
	
}

package ar.edu.unq.po2.tp12Observer;

import java.util.List;
import java.util.ArrayList;

public class SistemaDePublicaciones {

	private List<Interes> intereses;
	private List<Articulo> articulos;
	
	SistemaDePublicaciones() {
		this.setIntereses(new ArrayList<Interes>());
		this.setArticulos(new ArrayList<Articulo>());
	}
	
	public List<Interes> getIntereses() {
		return intereses;
	}
	
	private void setIntereses(List<Interes> intereses) {
		this.intereses = intereses;
	}
	
	private List<Articulo> getArticulos() {
		return articulos;
	}
	
	private void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	public void cargarArticulo(Articulo articulo) {
		this.intereses.stream().forEach(i -> i.llegoArticulo(articulo));
		this.getArticulos().add(articulo);
	}

}
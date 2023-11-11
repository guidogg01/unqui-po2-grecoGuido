package ar.edu.unq.po2.tp12Observer;

import java.util.List;

public abstract class Interes {

	protected String valor;
	private List<Persona> miembros;
	
	public Interes(List<Persona> miembros, String valor) {
		this.miembros = miembros;
		this.valor = valor;
	}
	
	public List<Persona> getMiembros() {
		return miembros;
	}

	
	public void setMiembros(List<Persona> miembros) {
		this.miembros = miembros;
	}

	public void agregarPersona(Persona p) {
		this.getMiembros().add(p);		
	}
	
	protected void llegoArticulo(Articulo articulo) {

		if(this.esDeMiInteres(articulo)) {
			this.getMiembros().forEach(m -> m.mandarMail(articulo));
		}
	}

	public abstract boolean esDeMiInteres(Articulo articulo);

}
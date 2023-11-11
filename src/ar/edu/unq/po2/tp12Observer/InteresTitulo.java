package ar.edu.unq.po2.tp12Observer;

import java.util.List;

public class InteresTitulo extends Interes{

	public InteresTitulo(List<Persona> miembros, String valor) {
		super(miembros, valor);	
	}

	@Override
	public boolean esDeMiInteres(Articulo articulo) {
		return articulo.getTitulo() == this.valor;
	}
}

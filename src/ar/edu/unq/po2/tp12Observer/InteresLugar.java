package ar.edu.unq.po2.tp12Observer;

import java.util.List;

public class InteresLugar extends Interes{

	public InteresLugar(List<Persona> miembros, String valor) {
		super(miembros, valor);
	}

	@Override
	public boolean esDeMiInteres(Articulo articulo) {
		return false;
	}

}
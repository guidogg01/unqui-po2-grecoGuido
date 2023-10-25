package ar.edu.unq.po2.tp10Composite.ej3;

import java.util.List;
import java.util.ArrayList;

public class Ejercito extends Personaje {

	private List<Personaje> personajes;
	
	Ejercito() {
		this.setPersonajes(new ArrayList<Personaje>());
	}

	public List<Personaje> getPersonajes() {
		return personajes;
	}

	private void setPersonajes(List<Personaje> ejercito) {
		this.personajes = ejercito;
	}

	@Override
	public void caminar(Point punto) {
		this.getPersonajes()
		    .stream()
		    .forEach(p -> p.caminar(punto));
		this.getUbicacion().setX(punto.getX());
		this.getUbicacion().setY(punto.getY());
	}
	
	public void agregarPersonaje(Personaje personaje) {
		this.getPersonajes().add(personaje);
	}
	
	public void eliminarPersonaje(Personaje personaje) {
		this.getPersonajes().remove(personaje);
	}

}

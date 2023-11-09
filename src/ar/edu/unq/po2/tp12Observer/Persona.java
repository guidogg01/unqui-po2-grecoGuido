package ar.edu.unq.po2.tp12Observer;

public class Persona {

	private String nombre;

	Persona(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mandarMail(Articulo articulo) {
		// Se envia un mail a la persona.
	}
	
}

package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Trabajador> trabajadores;
	
	EquipoDeTrabajo(String nombre) {
		super();
		this.setNombre(nombre);
		this.setTrabajadores(new ArrayList<Trabajador>());
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	private void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	public double promedioDeEdadDeIntegrantes() {
		return this.getTrabajadores().stream()
				                     .mapToDouble(Trabajador::getEdad)
				                     .average()
				                     .orElse(0f);
	}
	
	public void agregarTrabajador(Trabajador trabajador) {
		this.getTrabajadores().add(trabajador);
	}
	
}

package ar.edu.unq.po2.tp10Composite.ej4;

import java.time.LocalDate;

public class Archivo implements FyleSystem {

	private String nombre;
	private int espacioOcupado;
	private LocalDate fechaUltimaModificacion;
	
	Archivo(String nombre, int espacioOcupado, LocalDate fechaUltimaModificacion) {
		this.setNombre(nombre);
		this.setEspacioOcupado(espacioOcupado);
		this.setFechaUltimaModificacion(fechaUltimaModificacion);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	private void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}

	public LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	private void setFechaUltimaModificacion(LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}

	@Override
	public int totalSize() {
		return this.getEspacioOcupado();
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
	}

	@Override
	public FyleSystem lastModified() {
		return null;
	}

	@Override
	public FyleSystem oldestElement() {
		return null;
	}

}

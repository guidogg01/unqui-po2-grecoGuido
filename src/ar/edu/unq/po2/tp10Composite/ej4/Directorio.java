package ar.edu.unq.po2.tp10Composite.ej4;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Directorio implements FyleSystem {

	private String nombre;
	private LocalDate fechaDeCreacion;
	private List<FyleSystem> archivos; // Contenido.
	
	Directorio(String nombre, LocalDate fechaDeCreacion) {
		this.setNombre(nombre);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setArchivos(new ArrayList<FyleSystem>());
	}

	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	private void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	private List<FyleSystem> getArchivos() {
		return archivos;
	}

	private void setArchivos(List<FyleSystem> archivos) {
		this.archivos = archivos;
	}
	
	public void agregarArchivo(FyleSystem archivo) {
		
		this.getArchivos().add(archivo);
		
	}

	@Override
	public int totalSize() {
		return this.getArchivos().stream().mapToInt(a -> a.totalSize()).sum();
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());		
	}

	@Override
	public FyleSystem lastModified() {
		return this.getArchivos().get(this.getArchivos().size() - 1);
	}

	@Override
	public FyleSystem oldestElement() {
		return this.getArchivos().get(0);
	}

}

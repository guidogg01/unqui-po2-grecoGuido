package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	private void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		
		return Period.between(fechaDeNacimiento, fechaActual).getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
}

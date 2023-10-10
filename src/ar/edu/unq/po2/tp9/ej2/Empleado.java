package ar.edu.unq.po2.tp9.ej2;

public abstract class Empleado {

	public final double sueldoFinal() {
		return (this.sueldo() + this.sueldoBasico()) - this.descuentosDeAportes();
	}
	
	public abstract double sueldo();
	
	//Método Hook
	public double sueldoBasico() { return 0; }
	
	private double descuentosDeAportes() {
		return (this.sueldo() + this.sueldoBasico()) * 0.13;
	}
	
}

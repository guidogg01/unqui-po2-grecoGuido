package ar.edu.unq.po2.tp9.ej2;

public class EmpleadoPlanta extends Empleado {

	private int cantHijos;
	
	EmpleadoPlanta(int cantHijos) {
		this.setCantHijos(cantHijos);
	}

	private int getCantHijos() {
		return cantHijos;
	}

	private void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	@Override
	public double sueldo() {
		return this.sueldoBasico() + bonoPorHijo();
	}

	private int bonoPorHijo() {
		return this.getCantHijos() * 150;
	}

	@Override
	public double sueldoBasico() {
		return 3000;
	}
	
}

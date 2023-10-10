package ar.edu.unq.po2.tp9.ej2;

public class EmpleadoPasante extends Empleado {

	private int cantHorasQueTrabaja;
	
	EmpleadoPasante(int cantHorasQueTrabaja) {
		this.setCantHorasQueTrabaja(cantHorasQueTrabaja);
	}
	
	private int getCantHorasQueTrabaja() {
		return cantHorasQueTrabaja;
	}

	private void setCantHorasQueTrabaja(int cantHorasQueTrabaja) {
		this.cantHorasQueTrabaja = cantHorasQueTrabaja;
	}

	@Override
	public double sueldo() {
		return this.getCantHorasQueTrabaja() * 40;
	}

}

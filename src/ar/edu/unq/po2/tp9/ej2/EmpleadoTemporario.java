package ar.edu.unq.po2.tp9.ej2;

public class EmpleadoTemporario extends Empleado{

	private int cantHorasQueTrabaja;
	private boolean esCasado;
	private boolean tieneHijos;

	EmpleadoTemporario(int cantHorasQueTrabaja, boolean esCasado, boolean tieneHijos) {
		this.setCantHorasQueTrabaja(cantHorasQueTrabaja);
		this.setEsCasado(esCasado);
		this.setTieneHijos(tieneHijos);
	}

	private int getCantHorasQueTrabaja() {
		return cantHorasQueTrabaja;
	}

	private void setCantHorasQueTrabaja(int cantHorasQueTrabaja) {
		this.cantHorasQueTrabaja = cantHorasQueTrabaja;
	}

	private boolean isEsCasado() {
		return esCasado;
	}

	private void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	private boolean isTieneHijos() {
		return tieneHijos;
	}

	private void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	@Override
	public double sueldo() {
		
		return 5*this.getCantHorasQueTrabaja() + this.sueldoBasico() + this.bonoFamiliar();
		
	}
	
	@Override
	public double sueldoBasico() {
		return 1000;
	}

	private double bonoFamiliar() {
		int resultado = 0;
		
		if(this.isEsCasado() || this.isTieneHijos()) {
			resultado = 100;
		}
		
		return resultado;
	}
	
}

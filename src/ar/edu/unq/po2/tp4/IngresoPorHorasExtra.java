package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso{

	private int cantidadHorasExtra;
	
	IngresoPorHorasExtra(String mesDePercepcion, String concepto, double montoPercibido, int cantidadHorasExtra) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.setCantidadHorasExtra(cantidadHorasExtra);
	}

	private int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	private void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	@Override
	public double getMontoPercibido() {
		return super.getMontoPercibido() * this.getCantidadHorasExtra();
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}
	
}

package ar.edu.unq.po2.tp4;

public class Ingreso {

	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		this.setMesDePercepcion(mesDePercepcion);
		this.setConcepto(concepto);
		this.setMontoPercibido(montoPercibido);
	}
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	private void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	private void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public double montoImponible() {
		return this.getMontoPercibido();
	}
	
}

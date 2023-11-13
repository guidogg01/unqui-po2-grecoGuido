package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

import java.time.LocalDate;

public class Compra {

	private LocalDate fecha;
	private Double    montoDePago;
	private String    medioDePago;
	
	Compra(LocalDate fecha, Double montoDePago, String medioDePago) {
		this.fecha = fecha;
		this.montoDePago = montoDePago;
		this.medioDePago = medioDePago;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getMontoDePago() {
		return montoDePago;
	}

	public void setMontoDePago(Double montoDePago) {
		this.montoDePago = montoDePago;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
}

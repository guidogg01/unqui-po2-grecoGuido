package ar.edu.unq.po2.tp5;

public abstract class Factura {

	private Agencia emisor;

	//El constructor no se pone porque es una clase abstracta.
	
	private Agencia getEmisor() {
		return emisor;
	}

	public void registrar() {
		this.getEmisor().registrarPago(this);
	}
	
	public abstract double costo();
	
}

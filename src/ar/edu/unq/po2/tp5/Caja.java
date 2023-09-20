package ar.edu.unq.po2.tp5;

public class Caja {

	private double montoAPagar;
	
	//No se hace constructor ya que siempre arranca con 0.

	private double getMontoAPagar() {
		return montoAPagar;
	}

	private void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	public void registrarPagoCliente(Producto producto) {
		this.agregarPrecioAlMonto(producto);
		this.reducirStockDe(producto);
	}
	
	public double informarMontoTotal() {
		return this.getMontoAPagar(); //Se hace de esta manera para que sea mas legible y no exponer el get.
	}
	
	//Se hacen dos refactors así queda mas legible.
	
	private void agregarPrecioAlMonto(Producto producto) {
		this.setMontoAPagar(this.getMontoAPagar() + producto.costo());
	}
	
	private void reducirStockDe(Producto producto) {
		producto.disminuirStock();	
	}
	
}

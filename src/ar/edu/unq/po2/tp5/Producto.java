package ar.edu.unq.po2.tp5;

public class Producto implements Pagable{

	private int stock;
	private double precio;
	
	Producto(int stock, double precio) {
		this.setStock(stock);
		this.setPrecio(precio);
	}

	public int getStock() {
		return stock;
	}

	private void setStock(int stock) {
		this.stock = stock;
	}

	private double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void disminuirStock() {
		this.setStock(this.getStock() - 1);
	}
	
	@Override
	public double costo() {
		return this.getPrecio(); //Se hace de esta manera para que sea mas legible y poder implementar la interfaz Pagable.
	}

	@Override
	public void registrar() {
		this.disminuirStock();
	}
	
}

package ar.edu.unq.po2.tp5;

public class Producto {

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

	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void disminuirStock() {
		this.setStock(this.getStock() - 1);
	}
	
}

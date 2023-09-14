package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	ProductoCooperativa(int stock, double precio) {
		super(stock, precio);
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() + super.getPrecio() * 0.1;
	}
	
}

package ar.edu.unq.po2.tp10Composite.ej5;

public class SpecialProduct extends Product {

	private double priceSpecial;
	
	SpecialProduct(double price, String name) {
		super(price, name);
	}

	@Override
	public double getPrice() {
		return this.priceSpecial;
	}
	
}

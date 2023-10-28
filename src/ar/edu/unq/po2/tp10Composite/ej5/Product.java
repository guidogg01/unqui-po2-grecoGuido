package ar.edu.unq.po2.tp10Composite.ej5;

public class Product {

	private double price;
	private String name;
	
	Product(double price, String name) {
		this.setPrice(price);
		this.setName(name);
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
}

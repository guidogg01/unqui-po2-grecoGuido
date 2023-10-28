package ar.edu.unq.po2.tp10Composite.ej5;

import java.util.List;
import java.util.ArrayList;

public class CarroDeCompras {

	private List<Product> products;

	CarroDeCompras() {
		this.setProducts(new ArrayList<Product>());
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public int totalRouned() {
		return (int) Math.round(this.getProducts().stream()
                                                  .mapToDouble(p -> p.getPrice())
                                                  .sum());
	}
	
	public double total() {
		return this.getProducts()
				   .stream()
				   .mapToDouble(p -> p.getPrice()).sum();
	}
	
}

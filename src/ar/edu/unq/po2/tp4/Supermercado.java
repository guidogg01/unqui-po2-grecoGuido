package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	Supermercado(String nombre, String direccion) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setProductos(new ArrayList<Producto>());
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private List<Producto> getProductos() {
		return productos;
	}

	private void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double getPrecioTotal() {
		return this.getProductos().stream().mapToDouble(Producto::getPrecio).sum();
	}

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);	
	}
	
}

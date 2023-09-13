package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	Producto(String nombre, double precio, boolean esProductoCuidado) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esProductoCuidado);
	}
	
	Producto(String nombre, double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	private void setEsPrecioCuidado(boolean esProductoCuidado) {
		this.esPrecioCuidado = esProductoCuidado;
	}
	
	public void aumentarPrecio(double precio) {
		this.setPrecio(this.getPrecio() + precio);
	}
	
}

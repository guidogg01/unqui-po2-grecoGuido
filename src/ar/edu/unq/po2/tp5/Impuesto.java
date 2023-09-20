package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{

	private int tasaDeServicio;
	
	Impuesto(int tasaDeServicio) {
		this.setTasaDeServicio(tasaDeServicio);
	}
	
	private int getTasaDeServicio() {
		return tasaDeServicio;
	}
	
	private void setTasaDeServicio(int tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public double costo() {
		return this.getTasaDeServicio();
	}	

}

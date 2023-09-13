package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuentoAAplicar;
	
	ProductoPrimeraNecesidad(String nombre, double precio, boolean esProductoCuidado,double descuentoAAplicar) {
		super(nombre, precio, esProductoCuidado);
		this.setDescuentoAAplicar(descuentoAAplicar);
	}

	private double getDescuentoAAplicar() {
		return descuentoAAplicar;
	}

	private void setDescuentoAAplicar(double descuentoAAplicar) {
		this.descuentoAAplicar = descuentoAAplicar;
	}

	@Override
	public double getPrecio() {
		return super.getPrecio()-(super.getPrecio()*this.getDescuentoAAplicar())/100;
	}
	
}

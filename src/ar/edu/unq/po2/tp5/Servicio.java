package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{

	private int costoPorUnidad;
	private int cantidadDeUnidad;
	
	Servicio(int costoPorUnidad, int cantidadDeUnidad) {
		this.setCostoPorUnidad(costoPorUnidad);
		this.setCantidadDeUnidad(cantidadDeUnidad);
	}	
	
	public int getCostoPorUnidad() {
		return costoPorUnidad;
	}

	private void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantidadDeUnidad() {
		return cantidadDeUnidad;
	}

	private void setCantidadDeUnidad(int cantidadDeUnidad) {
		this.cantidadDeUnidad = cantidadDeUnidad;
	}

	@Override
	public double costo() {
		return this.getCostoPorUnidad() * this.getCantidadDeUnidad();
	}

}

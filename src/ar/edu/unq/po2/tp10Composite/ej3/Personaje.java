package ar.edu.unq.po2.tp10Composite.ej3;

public abstract class Personaje {

	private Point ubicacion;

	Personaje() {
		Point point = new Point(0,0);
		this.setUbicacion(point);
	}

	public Point getUbicacion() {
		return ubicacion;
	}

	private void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public abstract void caminar(Point punto);

	public int getUbicacionEnEjeX() {
		return this.getUbicacion().getX();
	}
	
	public int getUbicacionEnEjeY() {
		return this.getUbicacion().getY();
	} 
	
}

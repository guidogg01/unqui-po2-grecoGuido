package ar.edu.unq.po2.tp10Composite.ej3;

public class ingeniero extends Personaje {

	@Override
	public void caminar(Point punto) {
		this.getUbicacion().setX(punto.getX());
		this.getUbicacion().setY(punto.getY());
	}

}

package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point punto;
	private int altura;
	private int ancho;
	
	Rectangulo(Point punto, int altura, int ancho) {
		super();
		this.setPunto(punto);
		this.setAltura(altura);
		new Point(altura, ancho);
		this.setAncho(ancho);
		new Point(altura, ancho);
		this.ubicarEnPuntoFaltante(altura);
		this.setAltura(altura);
		new Point(altura, ancho);
	}

	public Point getPunto() {
		return punto;
	}

	private void setPunto(Point punto1) {
		this.punto = punto1;
	}

	public int getAltura() {
		return altura;
	}

	private void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAncho() {
		return ancho;
	}

	private void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	private void ubicarEnPuntoFaltante(int altura) {
		this.setAltura(altura - altura);
		// Si la altura es, por ej, 2, primero baja, pone el punto en donde corresponde y, para ubicarlo en el punto faltante, se
	    //  resta con la altura para que vuelva en donde arrancó.
	}
	
	public int area() {
		return this.getAltura()*this.getAncho();
	}
	
	public int perimetro() {
		int sumaDeAlto  = this.getAltura()*2;
		int sumaDeLargo = this.getAncho()*2;
		return sumaDeAlto+sumaDeLargo;
	}
	
	// Indica si es horizontal o vertical.
	public String determinadorDeHorizontalOVertical() {
		if(this.getAltura() > this.getAncho()) {
			return "El rectangulo es vertical.";
		} else if (this.getAltura() < this.getAncho()) {
			return "El rectangulo es horizontal.";
		} else {
			return "El rectangulo es igual en ambas partes.";
		}
	}
	
}

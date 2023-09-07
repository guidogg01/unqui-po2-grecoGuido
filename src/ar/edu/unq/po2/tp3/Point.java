package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	Point(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	Point(){
		this.setX(0);
		this.setY(0);
	}

	// Es correcto tener los getters y los setters publicos? En este caso los preciso de esta manera.
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point sumarCon(Point punto) {
		int newX = this.getX() + punto.getX();
		int newY = this.getY() + punto.getY();
		Point newPoint = new Point(newX, newY); //Preguntar.
		return newPoint;
	}
	
}

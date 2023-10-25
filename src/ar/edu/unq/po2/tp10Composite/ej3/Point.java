package ar.edu.unq.po2.tp10Composite.ej3;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	Point(){
		this(0,0); //Llamo al constructor de arriba para no repetir código.
	}
	
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
		Point newPoint = new Point(newX, newY);
		return newPoint;
	}
	
}

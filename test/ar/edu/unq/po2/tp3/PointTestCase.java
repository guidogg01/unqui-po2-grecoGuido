package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	private Point punto0;
	private Point punto1;
	private Point punto2;

	@BeforeEach
	void setUp() {
		
		punto0 = new Point();
		punto1 = new Point(2, 5);
		punto2 = new Point(4, 7);
	}

	@Test
	void testDeInicializaciónDeUnPunto() {
		assertEquals(0, punto0.getX());
		assertEquals(0, punto0.getY());
	}
	
	@Test
	void testDeInicializaciónDeUnPuntoConParametros() {
		assertEquals(2, punto1.getX());
		assertEquals(5, punto1.getY());
	}
	
	@Test
	void testVerificacionDeSumaDePuntos() {
		Point newPunto = punto1.sumarCon(punto2);
		assertEquals(6, newPunto.getX());
		assertEquals(12, newPunto.getY());
	}
	
	

}

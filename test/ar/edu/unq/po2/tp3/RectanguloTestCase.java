package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	private Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() {
		rectangulo = new Rectangulo(new Point(2,5), 3, 7);
	}

	@Test
	void testDeInicializacionDeUnRectangulo() {
		//Inicialización del pto de un rectángulo.
		assertEquals(2, rectangulo.getPunto().getX());
		assertEquals(5, rectangulo.getPunto().getY());
		//Inicialización de la altura de un rectángulo.
		assertEquals(3, rectangulo.getAltura());
		//Inicialización del ancho de un rectángulo.
		assertEquals(7, rectangulo.getAncho());
	}
	
	@Test
	void testDeVerificacionDeAreaDeUnRectangulo() {
		assertEquals(21, this.rectangulo.area());
	}

	@Test
	void testDeVerificacionDelPerímetroDeUnRectangulo() {
		assertEquals(20, this.rectangulo.perimetro());
	}
	
	@Test
	void testDeVerificacionDeQueTipoEsElRectangulo() {
		assertEquals("El rectangulo es horizontal.", this.rectangulo.determinadorDeHorizontalOVertical());
	}
	
}

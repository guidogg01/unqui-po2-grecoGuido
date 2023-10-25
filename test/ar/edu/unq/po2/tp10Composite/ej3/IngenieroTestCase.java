package ar.edu.unq.po2.tp10Composite.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngenieroTestCase {

	private Personaje ingeniero;
	
	private Point punto;
	
	@BeforeEach
	void setUp() {
		
		ingeniero = new ingeniero();
		
		punto = mock(Point.class);
		
	}

	@Test
	void testDeVerificacionDeInicializacionDeUnIngeniero() {
	
		assertEquals(0, this.ingeniero.getUbicacionEnEjeX());
		assertEquals(0, this.ingeniero.getUbicacionEnEjeY());
	
	}
	
	@Test
	void testDeVerificacionCuandoUnIngenieroCamina() {
		
		//Mockeando el punto.
		when(punto.getX()).thenReturn(4);
		when(punto.getY()).thenReturn(7);
		
		//Exercise
		this.ingeniero.caminar(punto);
		
		//Verify
		assertEquals(4, this.ingeniero.getUbicacionEnEjeX());
		assertEquals(7, this.ingeniero.getUbicacionEnEjeY());
	
	}

}

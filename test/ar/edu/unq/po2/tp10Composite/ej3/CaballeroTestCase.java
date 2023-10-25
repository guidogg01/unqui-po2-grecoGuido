package ar.edu.unq.po2.tp10Composite.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaballeroTestCase {

	private Personaje caballero;
	
	private Point punto;
	
	@BeforeEach
	void setUp() {
		
		caballero = new Caballero();
		
		punto = mock(Point.class);
		
	}

	@Test
	void testDeVerificacionDeInicializacionDeUnCaballero() {
	
		assertEquals(0, this.caballero.getUbicacionEnEjeX());
		assertEquals(0, this.caballero.getUbicacionEnEjeY());
	
	}
	
	@Test
	void testDeVerificacionCuandoUnCaballeroCamina() {
		
		//Mockeando el punto.
		when(punto.getX()).thenReturn(4);
		when(punto.getY()).thenReturn(7);
		
		//Exercise
		this.caballero.caminar(punto);
		
		//Verify
		assertEquals(4, this.caballero.getUbicacionEnEjeX());
		assertEquals(7, this.caballero.getUbicacionEnEjeY());
	
	}

}

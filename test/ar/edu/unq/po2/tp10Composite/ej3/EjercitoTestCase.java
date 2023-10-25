package ar.edu.unq.po2.tp10Composite.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjercitoTestCase {

	private Ejercito ejercito1;
	private Ejercito ejercito2;
	
	private Personaje ingeniero;
	
	private Personaje caballero1;
	private Personaje caballero2;
	
	private Point puntoDeDestino;
	
	@BeforeEach
	void setUp() {
	
		ejercito1 = new Ejercito();
		ejercito2 = new Ejercito();
		
		ingeniero = mock(Personaje.class);
		
		caballero1  = mock(Personaje.class);
		caballero2  = mock(Personaje.class);
		
		puntoDeDestino = mock(Point.class);
		
		ejercito1.agregarPersonaje(ingeniero);
		ejercito1.agregarPersonaje(caballero1);
		
		ejercito2.agregarPersonaje(caballero2);
		
	}

	@Test
	void testDeVerificacionDeUnEjercito() {
		
		assertEquals(0, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(0, this.ejercito1.getUbicacionEnEjeY());
		
		assertEquals(2, this.ejercito1.getPersonajes().size());
		
	}
	
	@Test
	void testDeVerificacionCuandoUnEjercitoSimpleCamina() {
		//Mockeando
		when(this.puntoDeDestino.getX()).thenReturn(4);
		when(this.puntoDeDestino.getY()).thenReturn(9);
		
		//Exercise
		this.ejercito1.caminar(puntoDeDestino);
		
		//Verify
		verify(this.caballero1, times(1)).caminar(puntoDeDestino);
		verify(this.ingeniero, times(1)).caminar(puntoDeDestino);
		
		assertEquals(4, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(9, this.ejercito1.getUbicacionEnEjeY());
		
		
	}
	
	@Test
	void testDeVerificacionCuandoUnEjercitoCompuestoCamina() {
		//Mockeando
		when(this.puntoDeDestino.getX()).thenReturn(4);
		when(this.puntoDeDestino.getY()).thenReturn(9);
		
		//setUp
		this.ejercito1.agregarPersonaje(ejercito2);
		
		//Exercise
		this.ejercito1.caminar(puntoDeDestino);
		
		//Verify
		verify(this.caballero1, times(1)).caminar(puntoDeDestino);
		verify(this.ingeniero, times(1)).caminar(puntoDeDestino);
		
		verify(this.caballero2, times(1)).caminar(puntoDeDestino);
		
		assertEquals(4, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(9, this.ejercito1.getUbicacionEnEjeY());
		
		assertEquals(4, this.ejercito2.getUbicacionEnEjeX());
		assertEquals(9, this.ejercito2.getUbicacionEnEjeY());
		
		
	}

}

package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHorasExtrasTestCase {
	
	private IngresoPorHorasExtra ingreso;

	@BeforeEach
	void setUp() {
		
		ingreso = new IngresoPorHorasExtra("Octubre", "Ingreso por sueldo", 150d, 4);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals("Octubre", ingreso.getMesDePercepcion());;
		assertEquals("Ingreso por sueldo", ingreso.getConcepto());;
		assertEquals(600d, ingreso.getMontoPercibido());;
	}

}

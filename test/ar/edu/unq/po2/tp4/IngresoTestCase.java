package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTestCase {

	private Ingreso ingreso;
	
	@BeforeEach
	void setUp(){
		
		ingreso = new Ingreso("Septiembre", "Pago por plan social", 75d);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals("Septiembre", ingreso.getMesDePercepcion());;
		assertEquals("Pago por plan social", ingreso.getConcepto());;
		assertEquals(75d, ingreso.getMontoPercibido());;
	}

}

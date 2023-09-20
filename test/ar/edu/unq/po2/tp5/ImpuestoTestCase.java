package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTestCase {

	private Impuesto impuesto;
	
	@BeforeEach
	void setUp() {
		
		impuesto = new Impuesto(130);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals(130, this.impuesto.costo());
	}

}

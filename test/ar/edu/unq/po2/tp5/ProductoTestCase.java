package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {

	private Producto lataDeTomate;
	
	@BeforeEach
	void setUp() {
		
		lataDeTomate = new Producto(15, 75);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals(15, this.lataDeTomate.getStock());
		assertEquals(75d, this.lataDeTomate.getPrecio());
	}

}

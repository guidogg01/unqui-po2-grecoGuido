package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTestCase {

	private ProductoCooperativa alfombra;
	
	@BeforeEach
	void setUp() {
		
		alfombra = new ProductoCooperativa(6, 150);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals(6, this.alfombra.getStock());
		assertEquals(165d, this.alfombra.getPrecio());
	}

}

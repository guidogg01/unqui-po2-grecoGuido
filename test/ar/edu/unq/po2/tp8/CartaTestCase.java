package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CartaTestCase {

	private Carta carta;
	
	@Test
	void testComprobacionDeInicializacion() {
		carta = new Carta(Valor.CUATRO, Palo.PICAS);
				
		assertEquals(Palo.PICAS, carta.getPalo());
	}

}

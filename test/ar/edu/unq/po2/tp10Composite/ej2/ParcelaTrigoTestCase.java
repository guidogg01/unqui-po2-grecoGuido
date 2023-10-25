package ar.edu.unq.po2.tp10Composite.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10Composite.ej2.ParcelaPura;
import ar.edu.unq.po2.tp10Composite.ej2.ParcelaTrigo;

class ParcelaTrigoTestCase {

	private ParcelaPura parcela;
		
	@BeforeEach
	void setUp() {
			
		parcela = new ParcelaTrigo();
		
	}

	@Test
	void testDeInicializacionDeUnaParcelaDeTrigo() {
		assertEquals(300d, this.parcela.gananciaAnual());
	}

}

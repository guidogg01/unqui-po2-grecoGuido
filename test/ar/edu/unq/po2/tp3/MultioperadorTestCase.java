package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;
	
	@BeforeEach
	void setUp() {
	
		multioperador = new Multioperador();
		
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(3);
		multioperador.agregarNumero(7);
		multioperador.agregarNumero(8);
		multioperador.agregarNumero(-4);
		multioperador.agregarNumero(-6);
		multioperador.agregarNumero(-2);
		
	}
	
	@Test
	void testDeSumadorDeNumeros() {
		Integer resultado = multioperador.sumadorDeNumeros();
		assertEquals(8, resultado);
	}

	@Test
	void testDeRestadorDeNumeros() {
		Integer resultado = multioperador.restadorDeNumeros();
		assertEquals(-4, resultado);
	}
	
	@Test
	void testDeMultiplicadorDeNumeros() {
		Integer resultado = multioperador.multiplicadorDeNumeros();
		assertEquals(-16128, resultado);
	}

}
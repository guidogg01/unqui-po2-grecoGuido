/**
 * 
 */
package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class LesionesDermatologicasTestCase {

	@Test
	void testComprobacionDeInicializacion() {
		System.out.println(LesionesDermatologicas.GRIS);
		System.out.println(LesionesDermatologicas.ROJO.siguienteLesion(LesionesDermatologicas.ROJO));
	}
	
	@Test
	void testCuandoSeLePideAUnaLesionDermatologicaLaSiguienteLesion() {
		
		assertEquals(LesionesDermatologicas.GRIS, LesionesDermatologicas.ROJO.siguienteLesion(LesionesDermatologicas.ROJO));
		
	}

}

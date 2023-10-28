package ar.edu.unq.po2.tp10Composite.ej4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTestCase {

	private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		
		archivo = new Archivo("System 32", 52, LocalDate.of(2023, 10, 25));
		
	}

	@Test
	void testDeVerificacionDeUnArchivo() {
		assertEquals("System 32", this.archivo.getNombre());
		assertEquals(52, this.archivo.totalSize());
		assertEquals(LocalDate.of(2023, 10, 25), this.archivo.getFechaUltimaModificacion());
	}
	
}

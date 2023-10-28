package ar.edu.unq.po2.tp10Composite.ej4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTestCase {

	private Directorio directorio;
	
	private Directorio directorio2;
	private Archivo archivo;
	private Archivo archivo2;
	private Archivo archivo3;
	
	@BeforeEach
	void setUp() {
		
		directorio  = new Directorio("Explorador de Archivos", LocalDate.of(1999, 9, 14));
		directorio2 = new Directorio("Disco Local C", LocalDate.of(1974, 4, 18));
		
		archivo = mock(Archivo.class);
		archivo2 = mock(Archivo.class);
		archivo3 = mock(Archivo.class);
		
		directorio.agregarArchivo(archivo);
		directorio.agregarArchivo(archivo2);
		directorio.agregarArchivo(directorio2);
		
		directorio2.agregarArchivo(archivo3);
		
	}

	@Test
	void testDeVerificacionDeInicializacionDeUnDirectorio() {
		assertEquals("Explorador de Archivos", this.directorio.getNombre());
		assertEquals(LocalDate.of(1999, 9, 14), this.directorio.getFechaDeCreacion());
		assertEquals(archivo, this.directorio.oldestElement());
		assertEquals(directorio2, this.directorio.lastModified());
	}
	
	@Test
	void testDeVerificacionDelTotalDeAlmacenamientoDeUnDirectorio() {
		//Mockeando
		when(this.archivo.totalSize()).thenReturn(52);
		when(this.archivo2.totalSize()).thenReturn(26);
		when(this.archivo3.totalSize()).thenReturn(33);
		
		//Verify
		assertEquals(111, this.directorio.totalSize());
	}

}

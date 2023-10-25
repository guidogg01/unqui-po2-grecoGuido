package ar.edu.unq.po2.tp10Composite.ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10Composite.ej2.ParcelaMixta;
import ar.edu.unq.po2.tp10Composite.ej2.ParcelaPura;
import ar.edu.unq.po2.tp10Composite.ej2.ParcelaSoja;
import ar.edu.unq.po2.tp10Composite.ej2.ParcelaTrigo;

class ParcelaMixtaTestCase {

	private ParcelaMixta parcelaMixta;
	
	private ParcelaPura parcelaSoja1;
	private ParcelaPura parcelaSoja2;
	
	private ParcelaPura parcelaTrigo1;
	private ParcelaPura parcelaTrigo2;
	
	@BeforeEach
	void setUp() {
	
		parcelaMixta = new ParcelaMixta();
		
		parcelaSoja1 = mock(ParcelaSoja.class);
		parcelaSoja2 = mock(ParcelaSoja.class);
		
		parcelaTrigo1 = mock(ParcelaTrigo.class);
		parcelaTrigo2 = mock(ParcelaTrigo.class);
		
		parcelaMixta.agregarParcela(parcelaSoja1);
		parcelaMixta.agregarParcela(parcelaTrigo1);
		parcelaMixta.agregarParcela(parcelaSoja2);
		parcelaMixta.agregarParcela(parcelaTrigo2);
	
	}

	@Test
	void testDeVerificacionDeInisalizacionDeUnaParcelaMixta() {
		
		when(this.parcelaSoja1.gananciaAnual()).thenReturn(500d);
		when(this.parcelaSoja2.gananciaAnual()).thenReturn(500d);
		
		when(this.parcelaTrigo1.gananciaAnual()).thenReturn(300d);
		when(this.parcelaTrigo2.gananciaAnual()).thenReturn(300d);
		
		assertEquals(4, this.parcelaMixta.getParcelas().size());
		assertEquals(400, this.parcelaMixta.gananciaAnual());
	}

}

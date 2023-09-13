package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoPorHorasExtra ingreso3;
	private IngresoPorHorasExtra ingreso4;
	private IngresoPorHorasExtra ingreso5;
	
	@BeforeEach
	void setUp() {
		
		trabajador = new Trabajador();
		
		ingreso1 = new Ingreso("Septiembre", "Pago por plan social", 75d);
		ingreso2 = new Ingreso("Octubre", "Ingreso por sueldo", 45d);
		ingreso3 = new IngresoPorHorasExtra("Marzo", "Pago por la cuota alimentar", 50d, 2);
		ingreso4 = new IngresoPorHorasExtra("Abril", "Pago por la cuota bienestar", 30d, 6);
		ingreso5 = new IngresoPorHorasExtra("Mayo", "Venta de inmuebles", 130d, 5);
		
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		trabajador.agregarIngreso(ingreso4);
		trabajador.agregarIngreso(ingreso5);
	
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals(5, trabajador.getIngresos().size());
		assertEquals("Pago por la cuota bienestar", trabajador.getIngresos().get(3).getConcepto());
	}
	
	@Test
	void testMontoTotalPercibido() {
		assertEquals(1050d, trabajador.getTotalPercibido());
	}
	
	@Test
	void testMontoTotalImponible() {
		assertEquals(120d, trabajador.getMontoImponible());
	}
	
	@Test
	void testImpuestoTotalAPagar() {
		assertEquals(2.4d, trabajador.getImpuestoAPagar());
	}

}

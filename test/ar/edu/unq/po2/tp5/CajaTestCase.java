package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Caja caja;
	private Producto lataDeTomate;
	private Producto lataDeArbejas;
	private Producto lataDeMaiz;
	private ProductoCooperativa alfombra;
	private ProductoCooperativa ventilador;
	
	@BeforeEach
	void setUp() {
		
		caja = new Caja();
		
		lataDeTomate  = new Producto(12, 80);
		lataDeArbejas = new Producto(15, 75);
		lataDeMaiz    = new Producto(5, 105);
		
		alfombra   = new ProductoCooperativa(6, 150);
		ventilador = new ProductoCooperativa(3, 375);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		
		assertEquals(0, this.caja.informarMontoTotal());
		
	}
	
	@Test
	void testDeVerificacionConUnProducto() {
		
		caja.registrarPagoCliente(lataDeTomate);
		
		assertEquals(80, caja.informarMontoTotal());
		assertEquals(11, lataDeTomate.getStock()); //Acá es correcto que pruebe con el producto o al ser el test de caja debería trabajar con caja?
	}
	
	@Test
	void testDeVerificacionConUnProductoCooperativa() {
		
		caja.registrarPagoCliente(ventilador);
		
		assertEquals(412.5d, caja.informarMontoTotal());
		assertEquals(2, ventilador.getStock()); //Acá es correcto que pruebe con el producto o al ser el test de caja debería trabajar con caja?
	}
	
	@Test
	void testDeVerificacionConMuchosProductos() {
		
		caja.registrarPagoCliente(lataDeTomate);
		caja.registrarPagoCliente(lataDeArbejas);
		caja.registrarPagoCliente(lataDeMaiz);
		caja.registrarPagoCliente(alfombra);
		caja.registrarPagoCliente(ventilador);
		
		assertEquals(837.5d, caja.informarMontoTotal());
		assertEquals(11, lataDeTomate.getStock());
		assertEquals(14, lataDeArbejas.getStock());
		assertEquals(4, lataDeMaiz.getStock());
		assertEquals(5, alfombra.getStock());
		assertEquals(2, ventilador.getStock());
	}

}

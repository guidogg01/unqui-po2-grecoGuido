package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private ProductoPrimeraNecesidad polenta;
	private ProductoPrimeraNecesidad leche;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		leche = new ProductoPrimeraNecesidad("Leche", 15d, true, 11d);
		polenta = new ProductoPrimeraNecesidad("Palta", 14d, true, 25d);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(leche);
		supermercado.agregarProducto(polenta);
		supermercado.agregarProducto(detergente);
		assertEquals(4, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(leche);
		supermercado.agregarProducto(polenta);
		supermercado.agregarProducto(detergente);
		assertEquals(117.75d, supermercado.getPrecioTotal());
	}
}

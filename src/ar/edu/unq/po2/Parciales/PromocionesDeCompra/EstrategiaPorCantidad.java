package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

import java.util.Comparator;
import java.util.List;

public class EstrategiaPorCantidad implements EstrategiaDePremio {

	// Precondición: La lista no puede ser vacía.
	@Override
	public Cliente elegirGanador(List<Cliente> clientes) {
	    return clientes.stream()
	            .max(Comparator.comparingInt(Cliente::cantidadDeCompras)).get();
	}
}

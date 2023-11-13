package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

import java.util.List;

public class EstrategiaDeMonto implements EstrategiaDePremio {

	@Override
	public Cliente elegirGanador(List<Cliente> clientes) {
		return clientes.stream()
				       .max((Cliente c1, Cliente c2) -> c1.montoTotalDeCompra().compareTo(c2.montoTotalDeCompra()))
				       .get();
	}
	
}

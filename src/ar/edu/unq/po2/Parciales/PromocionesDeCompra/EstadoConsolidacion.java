package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

public class EstadoConsolidacion implements EstadoDelCliente {

	public EstadoConsolidacion(Cliente cliente) {
	}

	@Override
	public void pagarCompra(Cliente cliente, Compra compra) {
		if (cliente.cantidadDeCompras() > 0 && compra.getMontoDePago() > 50000d) {
			cliente.setCantidadDeCupones(cliente.getCantidadDeCupones() - 1);
			compra.setMontoDePago(compra.getMontoDePago() * 0.6);
		} else {
			cliente.setEstado(new EstadoFidelizado(cliente));
		}
	}

}

package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

public class EstadoBienvenida implements EstadoDelCliente {

	@Override
	public void pagarCompra(Cliente cliente, Compra compra) {
		if (cliente.cantidadDeCompras() <= 10) {
			compra.setMontoDePago(compra.getMontoDePago() * 0.85d);
		} else {
			cliente.setCantidadDeCupones(3);
			cliente.setEstado(new EstadoConsolidacion(cliente));
		}
	}

}

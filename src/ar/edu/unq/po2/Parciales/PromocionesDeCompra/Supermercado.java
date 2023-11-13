package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private List<Cliente> clientes;
	private EstrategiaDePremio estrategia;
	
	Supermercado() {
		this.setClientes(new ArrayList<Cliente>());
	}
	
	public EstrategiaDePremio getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EstrategiaDePremio estrategia) {
		this.estrategia = estrategia;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	private void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Compra> comprasTotales(){
		// Pasa primero a stream, después a flapMap y después a stream y después a list. Esto se hace porque no se puede
		//  pasar directamente de flatMap a list.
		return this.getClientes().stream().flatMap(c -> c.getCompras().stream()).toList();
	}

	public void darPremio() {
		this.getEstrategia().elegirGanador(this.getClientes());
	}
	
}

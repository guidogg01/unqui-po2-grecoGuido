package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

	private List<Compra>     compras;
	private EstadoDelCliente estado;
	private int cantidadDeCupones;
	private String mail;
	
	Cliente(String mail) {
		this.setCompras(new ArrayList<Compra>());
		this.setEstado(new EstadoBienvenida());
		this.setCantidadDeCupones(0);
		this.setMail(mail);
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getCantidadDeCupones() {
		return cantidadDeCupones;
	}

	public void setCantidadDeCupones(int cantidadDeCupones) {
		this.cantidadDeCupones = cantidadDeCupones;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public EstadoDelCliente getEstado() {
		return estado;
	}

	public void setEstado(EstadoDelCliente estado) {
		this.estado = estado;
	}
	
	private void realizarCompra(Compra compra) {
		this.getCompras().add(compra);
	}
	
	public int cantidadDeCompras() {
		return this.getCompras().size();
	}
	
	public void realizarPago(Compra compra) {
		this.getEstado().pagarCompra(this, compra);
		this.realizarCompra(compra);
	}

	public Compra ultimaCompra() {
		return this.getCompras().get(this.getCompras().size() - 1);
	}

	public Double montoTotalDeCompra() {
		return this.getCompras().stream().mapToDouble(c -> c.getMontoDePago()).sum();
	}
	
}

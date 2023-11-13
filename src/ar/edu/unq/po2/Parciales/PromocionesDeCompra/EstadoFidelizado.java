package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

public class EstadoFidelizado implements EstadoDelCliente {

	private MailSender mail;
	
	public EstadoFidelizado(Cliente cliente) {
	}

	public MailSender getMail() {
		return mail;
	}

	public void setMail(MailSender mail) {
		this.mail = mail;
	}

	@Override
	public void pagarCompra(Cliente cliente, Compra compra) {
		if(cliente.ultimaCompra().getFecha() == compra.getFecha().minusDays(1)) {
			this.getMail().enviarMail(cliente.getMail(), "Gracias por elegirnos", "Gracias por permanecer con nosotros, es un orgullo tenerle como cliente");
		}
			
	}

}

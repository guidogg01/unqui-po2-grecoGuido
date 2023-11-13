package ar.edu.unq.po2.Parciales.PromocionesDeCompra;

public interface MailSender {

	public void enviarMail(String mailDestinatario, String titulo, String cuerpo);
	
}

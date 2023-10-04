package ar.edu.unq.po2.tp6.Ej1Arreglado;

public class ServidorPopConeccion {

	private IServidorConeccion servidor;
	
	private IServidorConeccion getServidor() {
		return servidor;
	}

	public void conectar(String user, String pass) {
		this.getServidor().conectar(user, pass);
	}
	
	public void recibirNuevos(String nombreUsuario, String passusuario){
		this.servidor.recibirNuevos(nombreUsuario, passusuario);
	}
	
	public void enviar(Correo correo) {
		this.servidor.enviar(correo);
	}
	
}

package ar.edu.unq.po2.tp11Strategy;

public class EncriptadorNaive {

	private IEncriptadorNaive strategy;

	public IEncriptadorNaive getStrategy() {
		return strategy;
	}

	// Es público para que el cliente elija la estrategia que quiere.
	public void setStrategy(IEncriptadorNaive strategy) {
		this.strategy = strategy;
	}
	
	public String encriptarMensaje(String mensajeAEncriptar) {
		return this.getStrategy().encriptar(mensajeAEncriptar);
	}
	
	public String desencriptarMensaje(String mensajeADesencriptar) {
		return this.getStrategy().desencriptar(mensajeADesencriptar);
	}
	
}

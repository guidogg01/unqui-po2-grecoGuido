package ar.edu.unq.po2.tp11.Strategy.ej1;

public class EncriptadorPorPalabrasAleatorias implements IEncriptadorNaive{

	@Override
	public String encriptar(String mensajeAEncriptar) {
		return new StringBuilder(mensajeAEncriptar).reverse().toString();
	}

	@Override
	public String desencriptar(String mensajeADesencriptar) {
		return this.encriptar(mensajeADesencriptar);
	}

}

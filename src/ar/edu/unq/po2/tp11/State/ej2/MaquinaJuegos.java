package ar.edu.unq.po2.tp11.State.ej2;

public class MaquinaJuegos {

	private int fichas;
	private EstadoMaquinaJuego estadoMaquina;
	
	MaquinaJuegos() {
		this.setFichas(0); // La máquina se inicializa con 0 fichas.
		this.setEstadoMaquina(new EstadoInicial(this));
	}

	public int getFichas() {
		return fichas;
	}

	private void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public EstadoMaquinaJuego getMaquinaJuego() {
		return estadoMaquina;
	}

	// En este caso el set es público debido a que cada IEstadoDeJuego 
	//  puede modificar el estado de juego interno de la maquina de videojuegos.
	public void setEstadoMaquina(EstadoMaquinaJuego maquinaJuego) {
		this.estadoMaquina = maquinaJuego;
	}
	
	public void presionarBoton() {
		this.getMaquinaJuego().empezarJuego();
	}
	
	public void ingresarFichas() {
		this.setFichas(this.getFichas() + 1);
	}
	
}

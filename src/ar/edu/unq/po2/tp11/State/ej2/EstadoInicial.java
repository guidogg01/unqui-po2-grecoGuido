package ar.edu.unq.po2.tp11.State.ej2;

public class EstadoInicial extends EstadoMaquinaJuego {

	EstadoInicial(MaquinaJuegos maquinaJuegos) {
		super(maquinaJuegos);
	}

	//Este mensaje podría devolver un String para poder probar en que estado estoy e ir tanteando.
	@Override
	public void empezarJuego() {
		if (this.getMaquinaJuegos().getFichas() == 1) {
			this.getMaquinaJuegos().setEstadoMaquina(new EstadoUnJugador(this.getMaquinaJuegos()));
			// Acá podría devolver un string "Se inicia el modo un jugador".
		} else {
			this.getMaquinaJuegos().setEstadoMaquina(new EstadoMultijugador(this.getMaquinaJuegos()));
			// Acá podría devolver un string "Se inicia el modo multijugador".
		}

	}

}

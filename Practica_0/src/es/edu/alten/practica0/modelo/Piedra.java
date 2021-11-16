package es.edu.alten.practica0.modelo;

public class Piedra extends PiedraPapelTijeraFactory {

	// Constructores
	public Piedra() {
		this("piedra", PIEDRA);
	}

	public Piedra(String pNom, int pNum) {
		super("piedra", PIEDRA);
	}

	// Métodos de la superclase
	@Override
	public boolean isMe(int pNum) {
		return pNum == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {

		int resultado = 0;

		switch (piedraPapelTijera.getNumero()) {
		case TIJERA:
			resultado = 1;
			this.descripcionResultado = "Piedra le ganó a " + piedraPapelTijera.getNombre();
			break;
		case PAPEL:
			resultado = -1;
			this.descripcionResultado = "Piedra perdió con " + piedraPapelTijera.getNombre();
			break;
		default:
			break;

		}
		return resultado;
	}

}

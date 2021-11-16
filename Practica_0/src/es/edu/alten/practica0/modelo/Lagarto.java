package es.edu.alten.practica0.modelo;

public class Lagarto extends PiedraPapelTijeraFactory {

	// Constructores
	public Lagarto() {
		this("lagarto", LAGARTO);
	}

	public Lagarto(String pNom, int pNum) {
		super("lagarto", LAGARTO);
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == LAGARTO;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {

		int resultado = 0;

		switch (piedraPapelTijera.getNumero()) {
		case SPOCK:
			resultado = 1;
			this.descripcionResultado = "Lagarto ganó a " + piedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			resultado = -1;
			this.descripcionResultado = "Lagarto perdió con " + piedraPapelTijera.getNombre();
			break;
		default:
			this.descripcionResultado = "Lagarto empata con " + piedraPapelTijera.getNombre();
			break;
		}
		return resultado;
	}

}

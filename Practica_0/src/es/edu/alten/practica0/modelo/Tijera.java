package es.edu.alten.practica0.modelo;

public class Tijera extends PiedraPapelTijeraFactory {
	
	// Constructores
		public Tijera() {
			this("tijera", TIJERA);
		}

	public Tijera(String pNom, int pNum) {
		super("tijera", TIJERA);
		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {

		int resultado = 0;

		switch (piedraPapelTijera.getNumero()) {
		case PAPEL:
			resultado = 1;
			this.descripcionResultado = "Tijera le ganó a " + piedraPapelTijera.getNombre();
			break;
		case TIJERA:
			resultado = -1;
			this.descripcionResultado = "Tijera pedió con " + piedraPapelTijera.getNombre();
			break;
		default:
			break;

		}
		return resultado;
	}

}

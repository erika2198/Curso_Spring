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
			this.descripcionResultado = "Tijera ganó a " + piedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			resultado = -1;
			this.descripcionResultado = "Tijera perdió con " + piedraPapelTijera.getNombre();
			break;
		default:
			this.descripcionResultado = "Tijera empata con " + piedraPapelTijera.getNombre();
			break;

		}
		return resultado;
	}

}

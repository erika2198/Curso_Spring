package es.edu.alten.practica0.modelo;

public class Tijera extends PiedraPapelTijeraFactory {

	public Tijera(String pNom, int pNum) {
		super("tijera", TIJERA);
		// TODO Auto-generated constructor stub
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
			System.out.println("Ganador!!");
			break;
		case TIJERA:
			resultado = -1;
			System.out.println("Has perdido!");
			break;
		default:
			break;

		}
		return resultado;
	}

}

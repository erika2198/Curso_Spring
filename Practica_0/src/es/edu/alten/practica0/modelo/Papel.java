package es.edu.alten.practica0.modelo;

public class Papel extends PiedraPapelTijeraFactory{

	public Papel(String pNom, int pNum) {
		//Llama al constructor del padre
		super("papel", PAPEL);
		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {
		
		int resultado = 0;

		switch (piedraPapelTijera.getNumero()) {
		case PIEDRA:
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

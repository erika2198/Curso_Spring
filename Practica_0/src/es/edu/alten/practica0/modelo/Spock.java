package es.edu.alten.practica0.modelo;

public class Spock extends PiedraPapelTijeraFactory{

	//CONSTRUCTORES
	public Spock() {
		this("Spock", SPOCK);
	}
	public Spock(String pNom, int pNum) {
		super("Spock", SPOCK);
		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == SPOCK;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {
		
		int resultado = 0;

		switch (piedraPapelTijera.getNumero()) {
		case TIJERA:
			resultado = 1;
			this.descripcionResultado = "Spock ganó a " + piedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			resultado = 1;
			this.descripcionResultado = "Spock evaporiza la " + piedraPapelTijera.getNombre();
			break;
		case PAPEL:
			resultado = -1;
			this.descripcionResultado = "Spock perdió con " + piedraPapelTijera.getNombre();
			break;
		case LAGARTO:
			resultado = -1;
			this.descripcionResultado = "Spock es devorado por " + piedraPapelTijera.getNombre();
			break;
		
		default:
			this.descripcionResultado = "Spock empata con " + piedraPapelTijera.getNombre();
			break;
		}
		return resultado;
	}

}

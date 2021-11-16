package es.edu.alten.practica0.modelo;

public class Papel extends PiedraPapelTijeraFactory{
	
	// Constructores
		public Papel() {
			this("papel", PAPEL);
		}

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
			this.descripcionResultado = "Papel ganó a " + piedraPapelTijera.getNombre();
			break;
		case TIJERA:
			resultado = -1;
			this.descripcionResultado = "Papel perdió con " + piedraPapelTijera.getNombre();
			break;
		default:
			this.descripcionResultado = "Papel empata con " + piedraPapelTijera.getNombre();
			break;

		}
		return resultado;
	}

}

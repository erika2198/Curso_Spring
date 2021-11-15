package es.edu.alten.practica0;

public class Piedra extends PiedraPapelTijeraFactory{

	public Piedra(String pNom, int pNum) {
		super("piedra", PIEDRA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNum) {	
		
		return pNum == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {
		// TODO Auto-generated method stub
		return 0;
	}

}

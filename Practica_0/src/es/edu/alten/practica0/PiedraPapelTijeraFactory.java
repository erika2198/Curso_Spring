package es.edu.alten.practica0;

import java.util.List;

public abstract class PiedraPapelTijeraFactory {

	//Constantes
	public final static int PIEDRA = 1;
	public final static int PAPEL = 1;
	public final static int TIJERA = 1;
	
	protected String descripcionResultado;
	private static List<PiedraPapelTijeraFactory> elementos;
	protected String nombre;
	protected int numero;
	
	//Constructor
	public PiedraPapelTijeraFactory(String pNom, int pNum) {
		
		nombre = pNom;
		numero = pNum;
	}

	//Getters y Setters
	
	public String getDescripcionResultado() {
		return descripcionResultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//Métodos de negocio
	public abstract boolean isMe(int pNum) {
		
	}
	
	public abstract int comparar(PiedraPapelTijeraFactory piedraPapelTijera) {} 
	
	
	public static PiedraPapelTijeraFactory getInstance(int numero) {
		//El núcleo del factory
		
		return null;
		
	}
}//class

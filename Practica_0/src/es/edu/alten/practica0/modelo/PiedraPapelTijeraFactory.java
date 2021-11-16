package es.edu.alten.practica0.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {

	//Constantes
	public final static int PIEDRA = 1;
	public final static int PAPEL = 2;
	public final static int TIJERA = 3;
	
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
	public abstract boolean isMe(int pNum);
	
	public abstract int comparar(PiedraPapelTijeraFactory piedraPapelTijera); 
	
	public static PiedraPapelTijeraFactory getInstance(int pNumero) {
		//El núcleo del factory	
		//Primero, reconoce a todos sus hijos
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		//Buscar entre los hijos y encontrar el que corresponda
		for(PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if(piedraPapelTijeraFactory.isMe(pNumero));
			return piedraPapelTijeraFactory;
		}
		
		return null;
		
	}
}//class

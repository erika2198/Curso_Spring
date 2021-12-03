package es.edu.alten.practica0.modelo;

import java.util.Date;

public class Auditoria {
	
	private Date fecha;
	private int cantidadJugadas;
	
	//constructores
	public Auditoria() {}
	
	public Auditoria(Date fecha, int cantidadJugadas) {
		super();
		this.fecha = fecha;
		this.cantidadJugadas = cantidadJugadas;
	}
	
	//Getters & setters
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidadJugadas() {
		return cantidadJugadas;
	}
	public void setCantidadJugadas(int cantidadJugadas) {
		this.cantidadJugadas = cantidadJugadas;
	}
	public void contarDespuesDeLaJugada() {
		
		cantidadJugadas++;
	}
		

}

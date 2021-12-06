package es.edu.alten.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona {

	@Id
	@Column(name = "per_codigo")
	private int codigo;
	@Column(name = "per_nombre", length = 50)
	private String nombre;
	
	public Persona() {}
	
	public Persona(int pCod, String pNom) {
		
		this.codigo = pCod;
		this.nombre = pNom;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

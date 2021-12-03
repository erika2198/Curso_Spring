package es.edu.alten.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "per_codigo")
	private int codigo;
	@Column(name = "per_nombre", length = 50)
	private String nombre;
	
	public Persona() {}
	public Persona(int codigo, String nombre) {
		
		this.codigo = codigo;
		this.nombre = nombre;
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

package es.edu.alten.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	public Usuario() {}
	
	public Usuario(int codigo, String nombre, String clave) {
		
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}

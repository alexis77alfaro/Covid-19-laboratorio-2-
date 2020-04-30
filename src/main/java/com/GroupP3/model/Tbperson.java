package com.GroupP3.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbperson database table.
 * 
 */
@Entity
@NamedQuery(name="Tbperson.findAll", query="SELECT t FROM Tbperson t")
public class Tbperson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int cmpId;

	private String cmpApellido;

	private String cmpDui;

	private String cmpNombre;

	public Tbperson() {
	}

	public int getCmpId() {
		return this.cmpId;
	}

	public void setCmpId(int cmpId) {
		this.cmpId = cmpId;
	}

	public String getCmpApellido() {
		return this.cmpApellido;
	}

	public void setCmpApellido(String cmpApellido) {
		this.cmpApellido = cmpApellido;
	}

	public String getCmpDui() {
		return this.cmpDui;
	}

	public void setCmpDui(String cmpDui) {
		this.cmpDui = cmpDui;
	}

	public String getCmpNombre() {
		return this.cmpNombre;
	}

	public void setCmpNombre(String cmpNombre) {
		this.cmpNombre = cmpNombre;
	}

}
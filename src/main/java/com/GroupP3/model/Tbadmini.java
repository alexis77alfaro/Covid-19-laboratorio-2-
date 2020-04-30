package com.GroupP3.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbadminis database table.
 * 
 */
@Entity
@Table(name="tbadminis")
@NamedQuery(name="Tbadmini.findAll", query="SELECT t FROM Tbadmini t")
public class Tbadmini implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int cmpIdAdm;

	private String cmpPass;

	private String cmpUsser;

	public Tbadmini() {
	}

	public int getCmpIdAdm() {
		return this.cmpIdAdm;
	}

	public void setCmpIdAdm(int cmpIdAdm) {
		this.cmpIdAdm = cmpIdAdm;
	}

	public String getCmpPass() {
		return this.cmpPass;
	}

	public void setCmpPass(String cmpPass) {
		this.cmpPass = cmpPass;
	}

	public String getCmpUsser() {
		return this.cmpUsser;
	}

	public void setCmpUsser(String cmpUsser) {
		this.cmpUsser = cmpUsser;
	}

}
package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;

public class Site implements Serializable{

	private String nom;
	private String emplacement;
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	private String type;
	private int hauteur;
	private int idsite;
	
	
	public Site() {
		super();
	}
	public Site(int idsite) {
		super();
		this.idsite = idsite;
	}
	public int getIdsite() {
		return idsite;
	}
	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	

}

package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;

public class Longueur  implements Serializable {
	
	private int idlongueur;
	private Voie voie;
	private String cotation;
	private String nomrelais;
	private int hauteur;
	public Longueur(int idlongueur) {
		super();
		this.idlongueur = idlongueur;
	}
	public Longueur() {
		super();
	}
	public int getIdlongueur() {
		return idlongueur;
	}
	public void setIdlongueur(int idlongueur) {
		this.idlongueur = idlongueur;
	}
	public Voie getVoie() {
		return voie;
	}
	public void setVoie(Voie voie) {
		this.voie = voie;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}
	public String getNomrelais() {
		return nomrelais;
	}
	public void setNomrelais(String nomrelais) {
		this.nomrelais = nomrelais;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	

}

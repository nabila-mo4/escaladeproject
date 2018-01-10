package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;
import java.util.List;


public class Voie implements Serializable{
	
	private Secteur secteur;
	private String nom;
	private int hauteur;
	private String nomhauteurvoie;
	private int nbpoints;
	private String etat;
	private int idvoie;
	
	
	
	
	public Voie() {
		super();
	}
	public Voie(int idvoie) {
		super();
		this.idvoie = idvoie;
	}
	public Secteur getSecteur() {
		return secteur;
	}
	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public String getNomhauteurvoie() {
		return nomhauteurvoie;
	}
	public void setNomhauteurvoie(String nomhauteurvoie) {
		this.nomhauteurvoie = nomhauteurvoie;
	}
	public int getNbpoints() {
		return nbpoints;
	}
	public void setNbpoints(int nbpoints) {
		this.nbpoints = nbpoints;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getIdvoie() {
		return idvoie;
	}
	public void setIdvoie(int idvoie) {
		this.idvoie = idvoie;
	}
	
	

}

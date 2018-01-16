package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Secteur implements Serializable {
	
	private String nom;
	private int hauteur;
	private int idsecteur;
	private Site site;
	
	private List<Voie> voies = new ArrayList<Voie>();;
	
	public List<Voie> getVoies() {
		return voies;
	}
	public void setVoies(List<Voie> voies) {
		this.voies = voies;
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
	public int getIdsecteur() {
		return idsecteur;
	}
	public void setIdsecteur(int idsecteur) {
		this.idsecteur = idsecteur;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public Secteur(int idsecteur) {
		super();
		this.idsecteur = idsecteur;
	}
	public Secteur() {
		super();
	}
	
	
	
	

}

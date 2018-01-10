package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;

public class Commentaire  implements Serializable{
	
	private int idcommentaire;
	private String nomutilisateur;
	private String contenu;
	private Site site;
	public Commentaire(int idcommentaire) {
		super();
		this.idcommentaire = idcommentaire;
	}
	public Commentaire() {
		super();
	}
	public int getIdcommentaire() {
		return idcommentaire;
	}
	public void setIdcommentaire(int idcommentaire) {
		this.idcommentaire = idcommentaire;
	}
	public String getNomutilisateur() {
		return nomutilisateur;
	}
	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	
	
	

}

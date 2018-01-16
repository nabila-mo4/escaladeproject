package org.myprojects.spring.escaladeproject.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;

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
	
	private List<Secteur> secteurs = new ArrayList<Secteur>();
	
	public boolean equals(Object obj) {
	       if (!(obj instanceof Site))
	            return false;
	        if (obj == this)
	            return true;

	        Site site = (Site) obj;
	        return new EqualsBuilder().
	            // if deriving: appendSuper(super.equals(obj)).
	            append(nom, site.nom).
	            append(emplacement, site.emplacement).
	            append(hauteur, site.hauteur).
	            isEquals();
	    }
	
	
	
	
	public List<Secteur> getSecteurs() {
		return secteurs;
	}
	public void setSecteurs(List<Secteur> secteurs) {
		this.secteurs = secteurs;
	}
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

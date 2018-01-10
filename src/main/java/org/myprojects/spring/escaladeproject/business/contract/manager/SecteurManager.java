package org.myprojects.spring.escaladeproject.business.contract.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Secteur;


public interface SecteurManager {
	
	void create(Secteur secteur);
    
    void delete(int idsecteur);
    
    Secteur getById(int idsecteur);
    
    List<Secteur> list();
    
    void update(Secteur secteur);


}

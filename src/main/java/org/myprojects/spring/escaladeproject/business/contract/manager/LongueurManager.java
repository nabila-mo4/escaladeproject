package org.myprojects.spring.escaladeproject.business.contract.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Longueur;

public interface LongueurManager {
	
	void create(Longueur longueur);
    
    void delete(int idlongueur);
    
    Longueur getById(int idlongueur);
    
    List<Longueur> list();
    
    void update(Longueur longueur);


}

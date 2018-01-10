package org.myprojects.spring.escaladeproject.business.contract.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;


public interface CommentaireManager {
	
    void create(Commentaire commentaire);
    
    //void delete(int idsecteur);
    
    //Secteur getById(int idsecteur);
    
    List<Commentaire> list(int idsite);
    
   // void update(Secteur secteur);


}

package org.myprojects.spring.escaladeproject.business.contract.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;


public interface CommentaireManager {
	
    void create(Commentaire commentaire);
    
    void delete(int idcommentaire);
    
    Commentaire getById(int idcommentaire);
    
    List<Commentaire> findAllBySite(int idsite);
    
   void update(Commentaire commentaire);


}

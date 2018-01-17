package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireDao {
	
	void create( Commentaire commentaire);
    
    //void delete(int idsecteur);
    
    //Secteur getById(int idsecteur);
    
    List<Commentaire> findAllBySite(int idsite);
    
    //void update(Secteur secteur);

}

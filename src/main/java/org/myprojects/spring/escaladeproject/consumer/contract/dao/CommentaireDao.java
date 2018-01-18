package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireDao {
	
	void create( Commentaire commentaire);
    
    void delete(int idcommentaire);
    
    Commentaire getById(int idcommentaire);
    
    List<Commentaire> findAllBySite(int idsite);
    
    void update(Commentaire commentaire);

}

package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurDao {
	
	void create( Secteur secteur);
    
    void delete(int idsecteur);
    
    Secteur getById(int idsecteur);
    
    List<Secteur> list();
    
    void update(Secteur secteur);
    
    List<Secteur> findAllBySite(Site site);

}

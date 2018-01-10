package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Longueur;
import org.springframework.stereotype.Repository;

@Repository
public interface LongueurDao {
	
	void create( Longueur longueur);
    
    void delete(int idlongueur);
    
    Longueur getById(int idlongueur);
    
    List<Longueur> list();
    
    void update(Longueur longueur);

}

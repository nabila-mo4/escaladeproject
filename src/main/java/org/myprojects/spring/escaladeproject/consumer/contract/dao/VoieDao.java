package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;


import org.myprojects.spring.escaladeproject.model.Voie;

public interface VoieDao {
	
	void create( Voie voie);
    
    void delete(int idvoie);
    
    Voie getById(int idvoie);
    
    List<Voie> list();
    
    void update(Voie voie);

}

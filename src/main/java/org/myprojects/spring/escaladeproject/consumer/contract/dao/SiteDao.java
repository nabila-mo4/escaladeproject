package org.myprojects.spring.escaladeproject.consumer.contract.dao;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.stereotype.Repository;


@Repository
public interface SiteDao {
	
void create( Site site);
    
    void delete(int idsite);
    
    Site getById(int idsite);
    
    List<Site> list();
    
    void update(Site site);
    
   

}

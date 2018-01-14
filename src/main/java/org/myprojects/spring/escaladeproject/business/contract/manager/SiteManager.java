package org.myprojects.spring.escaladeproject.business.contract.manager;

import java.util.Hashtable;
import java.util.List;

import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.stereotype.Service;



public interface SiteManager {
void create(Site site);
    
    void delete(int id);
    
    Site getById(int id);
    
    List<Site> list();
    
    void update(Site site);
    
    List<Site> search(Hashtable criterias);


}

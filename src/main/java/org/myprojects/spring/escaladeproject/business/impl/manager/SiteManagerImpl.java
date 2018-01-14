package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.*;




import org.myprojects.spring.escaladeproject.business.contract.manager.SiteManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SiteDao;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SiteManagerImpl implements SiteManager {
	
	@Autowired
	SiteDao siteDao;
	
	@Transactional
	public void create(Site site) {
		siteDao.create(site);
		
	}

	public void delete(int id) {
		siteDao.delete(id);
		
	}

	public Site getById(int id) {
		return siteDao.getById(id);
	}
	@Transactional
	public List<Site> list() {
		return siteDao.list();
	}

	public void update(Site site) {
		
		siteDao.update(site);
		
	}
	
	public List<Site> search(Hashtable criterias)
    {
        
            String sqlStatement = "SELECT * FROM site WHERE";
			List<String> sqlCriterias= new ArrayList<>();
            List<Site> sites = new ArrayList<Site>();
            Enumeration enumCriteria = criterias.keys();
			while (enumCriteria.hasMoreElements()) {
                String key = (String) enumCriteria.nextElement();
				if(criterias.containsKey("site-name") && key.equals("site-name") && !criterias.get(key).equals(""))
                {
                    String siteName = (String) criterias.get(key);
                    String siteNameCap = siteName.substring(0, 1).toUpperCase() + siteName.toLowerCase().substring(1);
                    sqlCriterias.add(" nom LIKE '%"+siteName+"%' OR nom LIKE '%"+siteName.toLowerCase()+"%' OR nom LIKE '%"+siteName.toUpperCase()+"%' OR nom LIKE '%"+siteNameCap+"%'") ;
                }
					
					
					
				if(criterias.containsKey("site-emplacement") && key.equals("site-emplacement") && !criterias.get(key).equals(""))
                {
                    String siteEmplacement = (String) criterias.get(key);
                    String siteEmplacementCap = siteEmplacement.substring(0, 1).toUpperCase() + siteEmplacement.toLowerCase().substring(1);
                    sqlCriterias.add(" (emplacementgeo LIKE '%"+siteEmplacement+"%' OR emplacementgeo LIKE '%"+siteEmplacement.toLowerCase()+"%' OR emplacementgeo LIKE '%"+siteEmplacement.toUpperCase()+"%' OR emplacementgeo LIKE '%"+siteEmplacementCap+"%')") ;
                }
				
				
				for(String sqlCriteria : sqlCriterias)
                {
                   // System.out.println(sqlCriteria);
                    sqlStatement = sqlStatement + sqlCriteria;
                    if(!sqlCriteria.equals(sqlCriterias.get(sqlCriterias.size()-1)))
                    {
                        sqlStatement += " AND ";
                    }
                }
				
				sites = siteDao.findAllBySearchCriteria(sqlStatement);
				
				return sites;
			}
			return sites;
    }
}





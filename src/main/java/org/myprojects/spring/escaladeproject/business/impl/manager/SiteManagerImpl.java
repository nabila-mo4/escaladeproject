package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;





import org.myprojects.spring.escaladeproject.business.contract.manager.SiteManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SecteurDao;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SiteDao;
import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SiteManagerImpl implements SiteManager {
	
	@Autowired
	SiteDao siteDao;
	
	@Autowired
	SecteurDao secteurDao;
	
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
	
	public void buildSiteDependencies(Site site)
    {
        
        site.setSecteurs(secteurDao.findAllBySite(site));
        System.out.println("zatouta");
       if(site.getSecteurs().isEmpty()) {System.out.println("an");};
       
       /* for(Secteur secteur : site.getSecteurs())
        {
            sector.setWays(getDaoFactory().getWayDao().findAllBySector(sector));
            for(Way way : sector.getWays())
            {
                way.setLengths(getDaoFactory().getLengthDao().findAllByWay(way));
                for(Length length : way.getLengths())
                {
                    length.setPoints(getDaoFactory().getPointDao().findAllByLength(length));
                }
            }
        }*/
    }
	
	public List<Site> search(Hashtable criterias)
    {
            List<Site> sitees= new ArrayList<Site>();
            String sqlStatement = "SELECT * FROM site WHERE";
			List<String> sqlCriterias= new ArrayList<>();
            List<Site> sites = new ArrayList<Site>();
            
            Enumeration enumCriteria = criterias.keys();
			while (enumCriteria.hasMoreElements())
			{
                String key = (String) enumCriteria.nextElement();
                
                if(criterias.containsKey("site-name") && key.equals("site-name") && !criterias.get(key).equals(""))
                {
                    String siteName = (String) criterias.get(key);
                    String siteNameCap = siteName.substring(0, 1).toUpperCase() + siteName.toLowerCase().substring(1);
                    sqlCriterias.add(" (nomsite LIKE '%"+siteName+"%' OR nomsite LIKE '%"+siteName.toLowerCase()+"%' OR nomsite LIKE '%"+siteName.toUpperCase()+"%' OR nomsite LIKE '%"+siteNameCap+"%' )") ;
                }
					
					
					
				if(criterias.containsKey("site-emplacement") && key.equals("site-emplacement") && !criterias.get(key).equals(""))
                {
                    String siteEmplacement = (String) criterias.get(key);
                    String siteEmplacementCap = siteEmplacement.substring(0, 1).toUpperCase() + siteEmplacement.toLowerCase().substring(1);
                    sqlCriterias.add(" (emplacement LIKE '%"+siteEmplacement+"%' OR emplacement LIKE '%"+siteEmplacement.toLowerCase()+"%' OR emplacement LIKE '%"+siteEmplacement.toUpperCase()+"%' OR emplacement LIKE '%"+siteEmplacementCap+"%')") ;
                }
				
				if(criterias.containsKey("criteria-min") && key.equals("criteria-min") && !criterias.get(key).equals(""))
					
				{
					int hauteursaisiemin= Integer.parseInt((String) criterias.get(key));
					sqlCriterias.add(" (hauteur >="+hauteursaisiemin+")") ;
					Date time= new Date();
					try {
					SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					Date currentTime=new Date();
					String s=df.format(currentTime);
					time=df.parse(s);
					System.out.println(time);}
					catch(ParseException e) {
						e.printStackTrace();
					}
					
				}
				
				if(criterias.containsKey("criteria-max") && key.equals("criteria-max") && !criterias.get(key).equals(""))
					
				{
					int hauteursaisiemax= Integer.parseInt((String) criterias.get(key));
					sqlCriterias.add(" (hauteur <="+hauteursaisiemax+")") ;
				}
				
				
			}
			
			for(String sqlCriteria : sqlCriterias)
            {
                System.out.println(sqlCriteria);
                sqlStatement = sqlStatement + sqlCriteria;
                if(!sqlCriteria.equals(sqlCriterias.get(sqlCriterias.size()-1)))
                {
                    sqlStatement += " AND ";
                }
                System.out.println(sqlCriteria);
            }
			
			sites = siteDao.findAllBySearchCriteria(sqlStatement);
			
			
				
			if (sites.isEmpty()) {System.out.println("pas de sites");}
			//sitees;
			//sites.retainAll(sitees);
			return sites;
		
		//return sites;	
				 
					
			}
				 
				
				

				
				
				
}





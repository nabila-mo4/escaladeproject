package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.List;


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



}

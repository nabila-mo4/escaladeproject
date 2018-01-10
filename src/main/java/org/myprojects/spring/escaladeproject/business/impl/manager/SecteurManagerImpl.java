package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.SecteurManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SecteurDao;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SiteDao;
import org.myprojects.spring.escaladeproject.model.Secteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class SecteurManagerImpl implements SecteurManager {
	
	@Autowired
	SecteurDao secteurDao;

	@Transactional
	public void create(Secteur secteur) {
		secteurDao.create(secteur);
		
		
	}

	public void delete(int idsecteur) {
		secteurDao.delete(idsecteur);
		
	}

	public Secteur getById(int idsecteur) {
		return secteurDao.getById(idsecteur);
	}

	@Transactional
	public List<Secteur> list() {
		return secteurDao.list();
	}

	public void update(Secteur secteur) {
		secteurDao.update(secteur);
		
	}
	

}

package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.LongueurManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.LongueurDao;
import org.myprojects.spring.escaladeproject.model.Longueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LongueurManagerImpl implements LongueurManager {
	
	@Autowired
	LongueurDao longueurDao;
	
	public void create(Longueur longueur) {
		longueurDao.create(longueur);
		
	}

	public void delete(int idlongueur) {
		longueurDao.delete(idlongueur);
		
	}

	public Longueur getById(int idlongueur) {
		return longueurDao.getById(idlongueur);
	}

	public List<Longueur> list() {
		return longueurDao.list();
	}

	public void update(Longueur longueur) {
		longueurDao.update(longueur);
		
	}

}

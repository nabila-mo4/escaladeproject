package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.VoieManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.VoieDao;
import org.myprojects.spring.escaladeproject.model.Voie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoieManagerImpl implements VoieManager {

	
	@Autowired
	VoieDao voieDao;

	public void create(Voie voie) {
		voieDao.create(voie);
		
	}

	public void delete(int idvoie) {
		voieDao.delete(idvoie);
		
	}

	public Voie getById(int idvoie) {
		return voieDao.getById(idvoie);
	}

	public List<Voie> list() {
		return voieDao.list();
	}

	public void update(Voie voie) {
		voieDao.update(voie);
		
	}

}

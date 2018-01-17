package org.myprojects.spring.escaladeproject.business.impl.manager;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.CommentaireManager;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.CommentaireDao;
import org.myprojects.spring.escaladeproject.consumer.contract.dao.SecteurDao;
import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class CommentaireManagerImpl implements CommentaireManager{
	
	@Autowired
	CommentaireDao commentaireDao;

	public void create(Commentaire commentaire) {
		 commentaireDao.create(commentaire);
		
	}

	public List<Commentaire> findAllBySite(int idsite) {
		return commentaireDao.findAllBySite(idsite);
	}


}

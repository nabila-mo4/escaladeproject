package org.myprojects.spring.escaladeproject.controller;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.CommentaireManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.SecteurManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.SiteManager;
import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentaireController {
	
	@Autowired
	CommentaireManager commentaireManager;
	
	@Autowired
	SiteManager siteManager;
	
	
	@RequestMapping(value = "/addcommentaire", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("commentaire/commentaireForm");
		
		Commentaire commentaire = new Commentaire();
		
		
		model.addObject("commentaireForm", commentaire);
		
	
		List<Site> list= siteManager.list();
       
		model.addObject("sites", list);
	
		return model;
	}
	@RequestMapping(value="/savecommentaire", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute ("commentaireForm") Commentaire commentaire,
			BindingResult br, Model model
			){
		/*if(commentaire!=null && commentaire.getIdcommentaire()!=0) {
			commentaireManager.update(commentaire);
		}
		else {*/
		
			commentaireManager.create(commentaire);
			//}
		
		return new ModelAndView("redirect:/listsite");
		
	}
	
	
	/*@RequestMapping(value = "/listsecteur", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("secteur/secteurPage");
		
		List<Secteur> list= secteurManager.list();
		
		model.addObject("secteurs", list);	
		
		
		return model;

		

	}
	
	
	@RequestMapping(value = "/updatesecteur/{idsecteur}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("idsecteur") int idsecteur
			) {
		ModelAndView model = new ModelAndView("secteur/secteurFormMAJ");
		
		
		Secteur secteur = secteurManager.getById(idsecteur);
		
		
		model.addObject("secteurForm", secteur);
		List<Site> list= siteManager.list();
	       
		model.addObject("sites", list);
		
		return model;
	}
	
	
	@RequestMapping(value = "/deletesecteur/{idsecteur}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idsecteur") int idsecteur) {
		secteurManager.delete(idsecteur);
		return new ModelAndView("redirect:/listsecteur");
		
	}
*/
	
	
	
	@RequestMapping(value = "/listsite", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("site/sitePage");
		List<Site> list= siteManager.list();
		model.addObject("sites", list);	
		return model;

		

	}

}

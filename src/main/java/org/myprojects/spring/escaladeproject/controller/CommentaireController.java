package org.myprojects.spring.escaladeproject.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.taglibs.standard.extra.spath.ParseException;
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
			
		
		return new ModelAndView("redirect:/list");
		
	}
	
	
	/*@RequestMapping(value = "/listsecteur", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("secteur/secteurPage");
		
		List<Secteur> list= secteurManager.list();
		
		model.addObject("secteurs", list);	
		
		
		return model;

		

	}*/
	
	
	@RequestMapping(value = "/updatecommentaire/{idcommentaire}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("idcommentaire") int idcommentaire
			
			) {
		ModelAndView model = new ModelAndView("commentaire/commentaireFormMAJ");
		
		
		Commentaire commentaire = commentaireManager.getById(idcommentaire);
		
		
		model.addObject("commentaireForm",commentaire);
		List<Site> list= siteManager.list();
	       
		model.addObject("sites", list);
		
		return model;
	}
	
	
	@RequestMapping(value = "/deletecommentaire/{idcommentaire}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idcommentaire") int idcommentaire
			) {
		commentaireManager.delete(idcommentaire);
		return new ModelAndView("redirect:/list");
		
	}
}

package org.myprojects.spring.escaladeproject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.myprojects.spring.escaladeproject.business.contract.manager.CommentaireManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.SiteManager;
import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class SiteController {
	
	@Autowired
	SiteManager siteManager;
	
	@Autowired
	CommentaireManager commentaireManager;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("site/siteForm");
		Site site = new Site();
		model.addObject("siteForm", site);
	
		return model;
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("siteForm") Site site){
		if(site!=null && site.getIdsite()!=0) {
			siteManager.update(site);
			return new ModelAndView("redirect:/list?successe=true");
			
		}
		else {
			
			siteManager.create(site);
			return new ModelAndView("redirect:/list?success=true");
			
			
		}
	
		
				
	}

	

	@RequestMapping(value = "/list",  method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(required=false) boolean success,
			@RequestParam(required=false) boolean successe,
			@RequestParam(required=false) boolean succes) {
		ModelAndView model = new ModelAndView("site/sitePage");
		List<Site> list= siteManager.list();
		if(success) {
			String msg="Le site est ajouté avec succès !";
			model.addObject("message", msg);	}
		if(successe) {
			String msg="Le site est mis à jour avec succès !";
			model.addObject("message", msg);	}
		if(succes) {
			String msg="Le site est supprimé avec succès !";
			model.addObject("message", msg);	}
		model.addObject("sites", list);	
		return model;

		

	}
	
	
	@RequestMapping(value = "/update/{idsite}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("idsite") int idsite) {
		ModelAndView model = new ModelAndView("site/siteForm");
		Site site = siteManager.getById(idsite);
		model.addObject("siteForm", site);	
		return model;
	}
	
	
	@RequestMapping(value = "/delete/{idsite}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idsite") int idsite) {
		siteManager.delete(idsite);
		return new ModelAndView("redirect:/list?succes=true");
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String accueil() {
		
		return  "ok";
		
	}
	
	@RequestMapping(value = "/view/{idsite}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable("idsite") int idsite) {
		ModelAndView model = new ModelAndView("site/viewSiteForm");
		
		Site site = siteManager.getById(idsite);
		
		List<Commentaire> commentaires= commentaireManager.findAllBySite(idsite);
		
		model.addObject("siteForm", site);	
		
		model.addObject("comments", commentaires);
		
		return model;
	}
	
	

	@RequestMapping(value = "recherchesave", method = RequestMethod.POST)
	public ModelAndView view(@RequestParam("siteName") String siteName,
			@RequestParam("siteEmplacement") String siteEmplacement,
			
			@RequestParam("siteMin") String siteMin,
			@RequestParam("siteMax") String siteMax) {
		Hashtable criterias = new Hashtable();
        criterias.put("site-name",siteName);
        criterias.put("site-emplacement",siteEmplacement);
        criterias.put("criteria-min",siteMin);
        
        criterias.put("criteria-max",siteMax);
		ModelAndView model = new ModelAndView("site/siterecherche");
		List<Site> list= siteManager.search(criterias);
		model.addObject("sites", list);	
		
		return model;
	}
	
	@RequestMapping(value = "nabilaaa", method = RequestMethod.GET)
	public String nbaila() {
		return "nabilasearch";
	}
	
	
	@RequestMapping(value = "never", method = RequestMethod.GET)
	public String nbai() {
		return "searchsnip";
	}
	}
	
	





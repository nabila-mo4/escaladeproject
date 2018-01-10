package org.myprojects.spring.escaladeproject.controller;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.SecteurManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.SiteManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.VoieManager;
import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.myprojects.spring.escaladeproject.model.Voie;
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
public class VoieController {
	
	@Autowired
	VoieManager voieManager;
	
	@Autowired
	SecteurManager secteurManager;
	
	
	@RequestMapping(value = "/addvoie", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("voie/voieForm");
		
		Voie voie = new Voie();
		
		
		model.addObject("voieForm", voie);
		
	
		List<Secteur> list= secteurManager.list();
       
		model.addObject("secteurs", list);
	 
		return model;
	}
	@RequestMapping(value="/savevoie", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute ("voieForm") Voie voie,
			BindingResult br, Model model
			){
		if(voie!=null && voie.getIdvoie()!=0) {
			voieManager.update(voie);
		}
		else {
		
			voieManager.create(voie);}
		
		return new ModelAndView("redirect:/listvoie");
		
	}
	
	
	@RequestMapping(value = "/listvoie", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("voie/voiePage");
		
		List<Voie> list= voieManager.list();
		
		model.addObject("voies", list);	
		
		
		return model;

		

	}
	
	
	@RequestMapping(value = "/updatevoie/{idvoie}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("idvoie") int idvoie
			) {
		ModelAndView model = new ModelAndView("voie/voieFormMAJ");
		
		
		Voie voie = voieManager.getById(idvoie);
		
		
		model.addObject("voieForm", voie);
		List<Secteur> list= secteurManager.list();
	       
		model.addObject("secteurs", list);
		
		return model;
	}
	
	
	@RequestMapping(value = "/deletevoie/{idvoie}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idvoie") int idvoie) {
		voieManager.delete(idvoie);
		return new ModelAndView("redirect:/listvoie");
		
	}


}

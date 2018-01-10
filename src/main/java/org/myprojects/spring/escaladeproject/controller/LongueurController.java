package org.myprojects.spring.escaladeproject.controller;

import java.util.List;

import org.myprojects.spring.escaladeproject.business.contract.manager.LongueurManager;
import org.myprojects.spring.escaladeproject.business.contract.manager.VoieManager;
import org.myprojects.spring.escaladeproject.model.Longueur;
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
public class LongueurController {
	
	@Autowired
	LongueurManager longueurManager;
	
	@Autowired
	VoieManager voieManager;
	
	
	@RequestMapping(value = "/addlongueur", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("longueur/longueurForm");
		
		Longueur longueur = new Longueur();
		
		
		model.addObject("longueurForm", longueur);
		
	
		List<Voie> list= voieManager.list();
       
		model.addObject("voies", list);
	
		return model;
	}
	@RequestMapping(value="/savelongueur", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute ("longueurForm") Longueur longueur,
			BindingResult br, Model model
			){
		if(longueur!=null && longueur.getIdlongueur()!=0) {
			longueurManager.update(longueur);
		}
		else {
		
			longueurManager.create(longueur);}
		
		return new ModelAndView("redirect:/listlongueur");
		
	}
	
	
	@RequestMapping(value = "/listlongueur", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("longueur/longueurPage");
		
		List<Longueur> list= longueurManager.list();
		
		model.addObject("longueurs", list);	
		
		
		return model;

		

	}
	
	
	@RequestMapping(value = "/updatelongueur/{idlongueur}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("idlongueur") int idlongueur
			) {
		ModelAndView model = new ModelAndView("longueur/longueurFormMAJ");
		
		
		Longueur longueur = longueurManager.getById(idlongueur);
		
		
		model.addObject("longueurForm", longueur);
		List<Voie> list= voieManager.list();
	       
		model.addObject("voies", list);
		
		return model;
	}
	
	
	@RequestMapping(value = "/deletelongueur/{idlongueur}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idlongueur") int idlongueur) {
		longueurManager.delete(idlongueur);
		return new ModelAndView("redirect:/listlongueur");
		
	}


}

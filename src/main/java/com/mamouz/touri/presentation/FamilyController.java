package com.mamouz.touri.presentation;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.entity.Pays;
import com.mamouz.touri.dao.entity.f_Famille.Familly_register;
import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;
import com.mamouz.touri.service.interfaces.IContinentService;
import com.mamouz.touri.service.interfaces.IPaysService;
import com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService;
import com.mamouz.touri.service.interfaces.f_familly.IFamilyService;


@Controller
public class FamilyController {
	
	@Resource(name="familyService")
	private IFamilyService familyService;
	
	@Resource(name="paysService")
	private IPaysService paysService;
	
	@Resource(name="continentService")
	private IContinentService continentService;

	@Resource(name="family_RegisterService")
	private IFamillyRegistService famillyService;
	
	private Map<String, Familly_register> familieslogin = null;
	
	public FamilyController(){
		familieslogin = new HashMap<String, Familly_register>();
	}
	
	private static final Logger log = Logger.getLogger(FamilyController.class);
		
	@RequestMapping(value = "/familly/save", method = RequestMethod.GET)
	public String saveFamillyPage(Model model, @Valid Familly_register family) {
		log.info("returning family register page =====> FamilyController saveFamilyPage <===");
		
		 model.addAttribute("familyRegistPage", new Familly_register());
		return "viewsFamily/registerFamilly";
	}
	
	@RequestMapping(value = "/familly/save.do", method = RequestMethod.POST)
	public String saveFamillyAction(@Valid Familly_register family,	BindingResult bindingResult, Model model, HttpServletResponse response) {
		
		if (bindingResult.hasErrors()) {
			log.info("Returning famillySave.jsp page");
			
			return "viewsFamily/registerFamilly";
		}
		
		log.info("Returning pageFamilly.jsp page");
		
		famillyService.addFamilly_register(family);

		model.addAttribute("family", family);
		model.addAttribute("f_Image", family.getImage_F());
		
		//customers.put(customer.getEmail(), family);
		return "viewsFamily/pageFamilly";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/loginFamily", method= RequestMethod.GET)
	public String allFamilies(Locale locale, Model model){
		model.addAttribute("familly", new FamilyAcc() );
		model.addAttribute("families", familyService.findAllFamily());
		model.addAttribute("pays", paysService.findAllPays());
		model.addAttribute("continents", continentService.findAllContinent());
		return "login";
	}
	
	@RequestMapping(value="/saveFamilly")
	public String saveFamily(FamilyAcc family, Pays p,  Continent continent, Model model){

		log.info("\033[43m----------------- IN create FamilyController ----------------\033[0m\n");
		//System.out.println(family.getNom() + " " + family.getPrénom());
		
		//paysService.addPays(p);
		continentService.addContinent(continent);
		//familyService.addFamilyAcc(family);
		
		model.addAttribute("familly", new FamilyAcc());
		
		model.addAttribute("families", familyService.findAllFamily());

		log.info("\033[43m----------------- OUT create FamilyController ----------------\033[0m\n");
		return "login";
	}
	
	@RequestMapping(value="/deleteFamilly")
	public String deleteFamilies(Long id, Model model){
		familyService.removeFamilyAcc(id);
		model.addAttribute("familly", new FamilyAcc());
		model.addAttribute("families", familyService.findAllFamily());
		return "families";
	}
	
	@RequestMapping(value="/updateFamilly")
	public String updateFamilies(Long id, Model model){
		FamilyAcc family = familyService.findFamilyAccById(id);
		
		model.addAttribute("familly", new FamilyAcc());
		model.addAttribute("families", familyService.findAllFamily());
		return "families";
	}
	
	

}

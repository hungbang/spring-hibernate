package springhibernate.core.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springhibernate.core.model.Actor;
import springhibernate.core.service.ActorService;
import springhibernate.core.validator.ActorValidator;

@Controller
public class ActorController {
	
	private static final Logger log = Logger.getLogger(ActorController.class);
	
	@Autowired
	private ActorService actorService;
	
	@Autowired
	@Qualifier("actorValidator")
	private ActorValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder){
		binder.setValidator(validator);
	}
	
	//create modelAttribute
	@ModelAttribute("actor")
	public Actor createActorModel(){
		return new Actor();
	}
	
	@RequestMapping(value = "/actorForm", method = RequestMethod.GET)
	public String viewActor(Model model, @ModelAttribute("actor") Actor actor){
		log.info("view actor");
//		List<Actor> actorLst = actorService.findAll(); 
		model.addAttribute("title", "Input form actor");
		return "actorForm";
	}
	
	@RequestMapping(value = "/saveActor", method = RequestMethod.POST)
	public String saveActor(Model model, @ModelAttribute("actor") @Validated Actor actor, BindingResult bindingResult){
		log.info("saveActor");
//		List<Actor> actorLst = actorService.findAll(); 
		if (bindingResult.hasErrors()) {
			log.info("Returning actorForm.jsp page");
			return "actorForm";
		}
		model.addAttribute("actor", actor);
		model.addAttribute("title", "Save form actor");
		return "actorSaveSuccess";
	}
}

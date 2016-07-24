package springhibernate.core.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springhibernate.core.model.Actor;
import springhibernate.core.service.ActorService;

@Controller
public class ActorController {
	
	private static final Logger log = Logger.getLogger(ActorController.class);
	
	@Autowired
	private ActorService actorService;
	
	@RequestMapping(value = "/viewActor", method = RequestMethod.GET)
	public ModelAndView viewActor(){
		log.info("view actor");
		ModelAndView model = new ModelAndView();
		List<Actor> actorLst = actorService.findAll(); 
		if(!actorLst.isEmpty()){
			log.info("actor first name: "+ actorLst.get(0).getFirstName());
		}
		model.addObject("actorList", actorLst);
		model.setViewName("actor");
		return model;
	}
}

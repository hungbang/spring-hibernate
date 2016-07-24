package springhibernate.core.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{
	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(ModelMap model){
		System.out.println("begin home");
		log.info("log4j running!");
		model.addAttribute("msg", "Spring Hibernate");
		return "index";
	}
}

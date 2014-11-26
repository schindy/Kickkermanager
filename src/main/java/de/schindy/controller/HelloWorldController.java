package de.schindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.schindy.dao.UserDAO;
import de.schindy.model.User;

@Controller
public class HelloWorldController {

	@Autowired
	private UserDAO userDAO;
	@RequestMapping("/helloworld")
	public ModelAndView hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
	  	
        User user = new User();
        user.setId(3l);
        user.setLoginname("schindy23");
        user.setPassword("test23");
        user.setFirstname("Simon23");
        user.setLastname("Schindelmann23");
        user.setEmail("test@test.de23");
        userDAO.insert(user);
 
        User user1 = userDAO.findByCustomerId(1);
        ModelAndView m = new ModelAndView("helloworld");
        m.addObject("name", user1.getLastname());
		return m; 
	}

}

package de.schindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.schindy.dao.UserDAO;
import de.schindy.model.User;

@Controller
@RequestMapping("/usermanagement")
public class UserController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/createuser", method = RequestMethod.GET)
	public String user() {
		return "home";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("id", user.getId());
		model.addAttribute("loginname", user.getLoginname());
		model.addAttribute("loginpassword", user.getPassword());
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("lastname", user.getLastname());
		model.addAttribute("email", user.getEmail());
		return "getuser";
	}

	@RequestMapping(value="/userList")
	public ModelAndView getAllUser() {
		ModelAndView m = new ModelAndView("usermanagement/userList");
		m.addObject("users", userDAO.getAll());
		return m;
	}
	
	@RequestMapping(value="/userDetailInformation")
	public ModelAndView getUser(@RequestParam("username") String loginname) {
		ModelAndView m = new ModelAndView("usermanagement/userDetailInformation");
		m.addObject("user", userDAO.findUserByLoginName(loginname));
		return m;
	}
}

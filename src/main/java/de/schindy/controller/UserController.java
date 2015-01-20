package de.schindy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.schindy.dao.UserDAO;
import de.schindy.image.ImageProperties;
import de.schindy.model.User;

@Controller
@RequestMapping("/usermanagement")
public class UserController implements ImageProperties {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/userList")
	public ModelAndView getAllUser() {
		ModelAndView m = new ModelAndView("usermanagement/userList");
		m.addObject("users", userDAO.getAll());
		return m;
	}

	@RequestMapping(value = "/userDetailInformation")
	public ModelAndView getUser(@RequestParam("loginname") String loginname) {
		return showUserInformation(loginname);
	}

	@RequestMapping(value = "/createUser",  method = RequestMethod.GET)
	public ModelAndView createUser() {
		ModelAndView m = new ModelAndView();
		m.addObject("user", new User());
		m.addObject("roles", userDAO.getRoles());
		m.setViewName("usermanagement/createUser");
		return m;
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ModelAndView addUserFromForm(@Valid User user,
			BindingResult bindingResult) {
		System.out.println("HasErrors?" + bindingResult.hasErrors());
		if (bindingResult.hasErrors()) {
			ModelAndView m = new ModelAndView("usermanagement/createUser");
			m.addObject("roles", userDAO.getRoles());
			return m;
		}
		userDAO.saveUser(user);

		return new ModelAndView("redirect:/usermanagement/userDetailInformation/"
				+ user.getLoginname());
	}

	@RequestMapping(value = "/userDetailInformation/{loginname}", method = RequestMethod.GET)
	public ModelAndView getUserByPathVariable(@PathVariable String loginname) {
		return showUserInformation(loginname);
	}

	private ModelAndView showUserInformation(String loginname) {
		ModelAndView m = new ModelAndView(
				"usermanagement/userDetailInformation");
		m.addObject("user", userDAO.findUserByLoginName(loginname));
		return m;
	}
}

package de.schindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/createUser")
	public ModelAndView createUser() {
		ModelAndView m = new ModelAndView("usermanagement/createUser");
		m.addObject("user", new User());
		return m;
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String addUserFromForm(@Validated User user,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "usermanagement/createUser";
		}
		userDAO.saveUser(user);
		return "redirect:/usermanagement/userDetailInformation/"
				+ user.getLoginname();
	}
	
	@RequestMapping(value="/userDetailInformation/{loginname}", method = RequestMethod.GET)
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

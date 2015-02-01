package de.schindy.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class UserControllerTest {

	@Test
	public void testCreateUser() {
		UserController userController = new UserController();
		ModelAndView viewName = userController.createUser();
		assertEquals(new ModelAndView("createuser"), viewName);
	}
}

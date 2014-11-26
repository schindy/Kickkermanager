package de.schindy.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserControllerTest {

	@Test
	public void testCreateUser() {
		UserController userController = new UserController();
		String viewName = userController.user();
		assertEquals("createuser", viewName);
	}
}

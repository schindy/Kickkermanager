package de.schindy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.schindy.dao.UserDAO;
import de.schindy.model.User;
import de.schindy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User getUserByCustomerId(int id) {
		return userDAO.findByCustomerId(id);
	}

	public List<User> getAllUsers() {
		return userDAO.getAll();
	}

	public List<String> getRoles() {
		return userDAO.getRoles();
	}
	
	public List<String> getAllOtherRoles(User user) {
		List<String> roles = getRoles();
		String userRole = getRoleName(Integer.parseInt(user.getRole()));
		roles.remove(userRole);
		return roles;
	}

	public User getUserByLoginName(String loginname) {
		return userDAO.findUserByLoginName(loginname);
	}

	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
	
	public String getRoleName(int id) {
		return userDAO.findRoleNameById(id);
	}
}

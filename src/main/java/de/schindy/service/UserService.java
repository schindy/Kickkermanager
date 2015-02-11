package de.schindy.service;

import java.util.List;

import de.schindy.model.User;

public interface UserService {
	
	public User getUserByCustomerId(int id);

	public List<User> getAllUsers();
	
	public List<String> getRoles();

	public User getUserByLoginName(String loginname);

	public void saveUser(User user);
	
	public String getRoleName(int id);
	
	public List<String> getAllOtherRoles(User user);
}

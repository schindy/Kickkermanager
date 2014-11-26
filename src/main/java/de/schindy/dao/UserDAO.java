package de.schindy.dao;

import java.util.List;

import de.schindy.model.User;

public interface UserDAO {
	public void insert(User user);

	public User findByCustomerId(int id);

	public List<User> getAll();

	public User findUserByLoginName(String loginname);
}

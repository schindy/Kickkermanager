package de.schindy.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.schindy.model.User;

public class UserMapper implements RowMapper<Object> {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getLong("id"));
		user.setLoginname(rs.getString("login_name"));
		user.setPassword(rs.getString("login_password"));
		user.setLastname(rs.getString("last_name"));
		user.setFirstname(rs.getString("first_name"));
		user.setEmail(rs.getString("email"));
		user.setEnable(rs.getBoolean("enable"));
		user.setRole(rs.getString("role_id"));
		return user;
	}

}

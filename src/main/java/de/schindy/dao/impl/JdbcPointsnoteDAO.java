package de.schindy.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import de.schindy.dao.PointsnoteDAO;
import de.schindy.model.Pointsnote;

public class JdbcPointsnoteDAO implements PointsnoteDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Pointsnote createPointsnote() {
		String pointsnoteSQL = "INSERT INTO pointsnote DEFAULT VALUE";
		jdbcTemplate.update(pointsnoteSQL);
		return null;

	}

}

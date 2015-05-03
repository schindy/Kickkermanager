package de.schindy.dao.impl;

import java.sql.Statement;

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
		int id = jdbcTemplate.update(pointsnoteSQL, Statement.RETURN_GENERATED_KEYS);
		Pointsnote pointsnote = new Pointsnote();
		pointsnote.setId(id);
		return pointsnote;

	}

}

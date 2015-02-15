package de.schindy.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import de.schindy.dao.RoundDAO;
import de.schindy.dao.mapper.RoundMapper;
import de.schindy.dao.mapper.UserMapper;
import de.schindy.model.Cast;
import de.schindy.model.Round;
import de.schindy.model.User;

public class JdbcRoundDAO implements RoundDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Round findRoundById(int roundID) {
		String roundSQL = "SELECT * FROM round WHERE ID = ?";
		Round round = (Round) jdbcTemplate.queryForObject(roundSQL, new Object[]{roundID}, new RoundMapper());
		return round;
	}

	public void setCast(Cast cast) {

	}

}

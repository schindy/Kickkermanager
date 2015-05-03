package de.schindy.dao.impl;

import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import de.schindy.dao.GameDAO;
import de.schindy.dao.mapper.GameMapper;
import de.schindy.model.Game;

public class JdbcGameDAO implements GameDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Game createGame(int userId, int pointsnoteId) {
		String sql = "INSERT INTO game (user_id, pointsnote_id) VALUES (?, ?)";
		int gameId = jdbcTemplate.update(sql, new Object[] { userId,
				pointsnoteId }, Statement.RETURN_GENERATED_KEYS);
		return findGameById(gameId);
	}

	public Game findGameById(int id) {
		String sql = "SELECT * FROM game WHERE id = ?";
		Game game = (Game) jdbcTemplate.queryForObject(sql,
				new Object[] { id }, new GameMapper());
		return game;
	}

}
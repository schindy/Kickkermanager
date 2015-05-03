package de.schindy.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.schindy.model.Game;

public class GameMapper implements RowMapper<Object> {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Game game = new Game();
		game.setId(rs.getInt("id"));
		game.setPointsnoteId(rs.getInt("pointsnote_id"));
		game.setUserId(rs.getInt("user_id"));
		game.setFinished(rs.getBoolean("finished"));
		return game;
	}

}

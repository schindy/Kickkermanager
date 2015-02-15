package de.schindy.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.schindy.model.Round;

public class RoundMapper implements RowMapper<Object> {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Round round = new Round();
		round.setId(rs.getInt("id"));
		round.setSet((rs.getInt("isSet") == 0 ? false : true));
		round.setType(rs.getString("type"));
		round.setGame_id(rs.getInt("game_id"));
		round.setCast1ID(rs.getInt("cast1"));
		round.setCast2ID(rs.getInt("cast2"));
		round.setCast3ID(rs.getInt("cast3"));
		return round;
	}

}

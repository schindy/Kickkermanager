package de.schindy.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.schindy.model.Cast;

public class CastMapper implements RowMapper<Object> {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cast cast = new Cast();
		cast.setDice1(rs.getInt("dice1"));
		cast.setDice2(rs.getInt("dice2"));
		cast.setDice3(rs.getInt("dice3"));
		cast.setDice4(rs.getInt("dice4"));
		cast.setDice5(rs.getInt("dice5"));
		cast.setDice6(rs.getInt("dice6"));
		cast.setId(rs.getInt("id"));
		return cast;
	}
}

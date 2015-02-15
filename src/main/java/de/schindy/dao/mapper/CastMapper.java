package de.schindy.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.schindy.model.Cast;
import de.schindy.model.Dice;

public class CastMapper implements RowMapper<Object> {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cast cast = new Cast();
		Dice dice = new Dice();
		dice.setNumber(rs.getInt("dice1"));
		cast.setDice1(dice);
		dice.setNumber(rs.getInt("dice2"));
		cast.setDice2(dice);
		dice.setNumber(rs.getInt("dice3"));
		cast.setDice3(dice);
		dice.setNumber(rs.getInt("dice4"));
		cast.setDice4(dice);
		dice.setNumber(rs.getInt("dice5"));
		cast.setDice5(dice);
		dice.setNumber(rs.getInt("dice6"));
		cast.setDice6(dice);
		cast.setId(rs.getInt("id"));
		return cast;
	}
}

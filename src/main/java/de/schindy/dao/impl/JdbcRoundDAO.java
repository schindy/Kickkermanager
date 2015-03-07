package de.schindy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import de.schindy.dao.RoundDAO;
import de.schindy.dao.mapper.CastMapper;
import de.schindy.dao.mapper.RoundMapper;
import de.schindy.model.Cast;
import de.schindy.model.Round;

public class JdbcRoundDAO implements RoundDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Round findRoundByGameId(int gameId) {
		String roundSQL = "SELECT * FROM round WHERE game_id = ? order by id desc limit 1";
		Round round = (Round) jdbcTemplate.queryForObject(roundSQL, new Object[]{gameId}, new RoundMapper());
		return round;
	}

	public void setCast(Cast cast) {

	}

	public Cast findCastById(int castID) {
		String castSQL = "SELECT * FROM round WHERE ID = ?";
		Cast cast = (Cast) jdbcTemplate.queryForObject(castSQL, new Object[]{castID}, new CastMapper());
		return cast;
	}

	public int saveCast(final Cast cast) {
		final String saveCastSQL = "INSERT INTO cast "
				+ "(DICE1, DICE2, DICE3, DICE4, DICE5, DICE6) VALUES (?, ?, ?, ?, ?, ?)";
		
		KeyHolder holder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {           

		                public PreparedStatement createPreparedStatement(Connection connection)
		                        throws SQLException {
		                    PreparedStatement ps = connection.prepareStatement(saveCastSQL, Statement.RETURN_GENERATED_KEYS);
		                    ps.setInt(1, cast.getDice1().getNumber());
		                    ps.setInt(2, cast.getDice2().getNumber());
		                    ps.setInt(3, cast.getDice3().getNumber());
		                    ps.setInt(4, cast.getDice4().getNumber());
		                    ps.setInt(5, cast.getDice5().getNumber());
		                    ps.setInt(6, cast.getDice6().getNumber());
		                    return ps;
		                }
		            }, holder);

		return holder.getKey().intValue();
	}
	
	public void updateRound(Round round) {
		String updateSQL = "UPDATE round SET CAST1 = ?, CAST2 = ?, CAST3 = ?, TYPE = ?, ISSET = ?, GAME_ID = ? where id = ?";
		jdbcTemplate.update(updateSQL, round.getCast1ID(), round.getCast2ID(), round.getCast3ID(), round.getType(), round.isSet(), round.getGame_id(), round.getId());
	}

}

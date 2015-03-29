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
		
//		KeyHolder holder = new GeneratedKeyHolder();
//
//		getJdbcTemplate().update(new PreparedStatementCreator() {           
//
//		                @Override
//		                public PreparedStatement createPreparedStatement(Connection connection)
//		                        throws SQLException {
//		                    PreparedStatement ps = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
//		                    ps.setString(1, person.getUsername());
//		                    ps.setString(2, person.getPassword());
//		                    ps.setString(3, person.getEmail());
//		                    ps.setLong(4, person.getRole().getId());
//		                    return ps;
//		                }
//		            }, holder);
//
//		Long newPersonId = holder.getKey().longValue();
		String pointsnoteSQL = "INSERT INTO pointsnote DEFAULT VALUE";
		jdbcTemplate.update(pointsnoteSQL);
		return null;

	}

}

package de.schindy.dao;

import de.schindy.model.Cast;
import de.schindy.model.Round;

public interface RoundDAO {
	
	public Round findRoundByGameId(int gameId);
	
	public void setCast(Cast cast);
	
	public Cast findCastById(int castID);

	public int saveCast(Cast cast);

	public void updateRound(Round round);

}

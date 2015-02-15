package de.schindy.dao;

import de.schindy.model.Cast;
import de.schindy.model.Round;

public interface RoundDAO {
	
	public Round findRoundById(int RoundID);
	
	public void setCast(Cast cast);

}

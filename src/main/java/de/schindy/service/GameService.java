package de.schindy.service;

import de.schindy.model.Cast;
import de.schindy.model.UserCast;



public interface GameService {
	
	public Cast throwDices(UserCast userCast, int gameId);
	
	public void startGame();
	
}

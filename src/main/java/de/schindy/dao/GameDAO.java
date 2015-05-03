package de.schindy.dao;

import de.schindy.model.Game;

public interface GameDAO {
	public Game createGame(int userId, int pointsnoteId);
	
	public Game findGameById(int id);
}
